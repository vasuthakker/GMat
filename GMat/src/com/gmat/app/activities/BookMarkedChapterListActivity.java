package com.gmat.app.activities;

import java.util.List;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.RelativeLayout;
import android.widget.AdapterView.OnItemClickListener;

import com.gmat.app.R;
import com.gmat.app.adapter.ChapterListAdpater;
import com.gmat.app.entity.ChapterEntity;
import com.gmat.app.helper.ChapterEntityHelper;

public class BookMarkedChapterListActivity extends Activity {

	protected static final String CHAPTER_POS = "CHAPTER_POS";
	protected static final String BOOKMARK_VIEW = "BOOKMARK_VIEW";
	private ListView bookmarkListView;
	private LinearLayout noBookmarkLayout;
	private Button noBookmarkButton;
	private RelativeLayout backLayout;
	private RelativeLayout screen;
	private List<ChapterEntity> bookmarkedChapterList;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_book_marked_chapter_list);

		bookmarkListView = (ListView) findViewById(R.id.bookmark_chapter_list_listview);
		noBookmarkLayout = (LinearLayout) findViewById(R.id.no_bookmark_layout);
		noBookmarkButton = (Button) findViewById(R.id.no_bookmark_ok_button);
		backLayout = (RelativeLayout) findViewById(R.id.bookmark_back_image_layout);
		screen = (RelativeLayout) findViewById(R.id.bookmark_base_layout);
		noBookmarkButton.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				finish();
			}
		});
		backLayout.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				finish();
			}
		});

	}

	@Override
	public void onResume() {
		super.onResume();

		bookmarkedChapterList = ChapterEntityHelper.fetchChapterList(
				getApplicationContext(), ChapterEntityHelper.KEY_FAV + "=?",
				new String[] { String.valueOf(1) }, null, null,
				ChapterEntityHelper.KEY_SR + " ASC");

		if (bookmarkedChapterList == null || bookmarkedChapterList.isEmpty()) {
			noBookmarkLayout.setVisibility(View.VISIBLE);
			bookmarkListView.setVisibility(View.GONE);
		} else {
			noBookmarkLayout.setVisibility(View.GONE);
			bookmarkListView.setVisibility(View.VISIBLE);
			bookmarkListView.setAdapter(new ChapterListAdpater(this,
					bookmarkedChapterList));
		}

		bookmarkListView.setOnItemClickListener(new OnItemClickListener() {

			@Override
			public void onItemClick(AdapterView<?> arg0, View arg1,
					int position, long arg3) {
				Intent intent = new Intent(getApplicationContext(),
						ChapterDetailActivity.class);
				intent.putExtra(CHAPTER_POS, position + 1);
				intent.putExtra(BOOKMARK_VIEW, true);

				Animation animRightIn = AnimationUtils.loadAnimation(
						getApplicationContext(), R.anim.slide_out_left);

				screen.startAnimation(animRightIn);
				startActivity(intent);
			}
		});
	}

}
