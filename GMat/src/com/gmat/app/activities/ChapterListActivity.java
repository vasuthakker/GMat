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
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ListView;
import android.widget.RelativeLayout;

import com.gmat.app.R;
import com.gmat.app.adapter.ChapterListAdpater;
import com.gmat.app.entity.ChapterEntity;
import com.gmat.app.helper.ChapterEntityHelper;

/**
 * Activity for displaying chapter list
 * 
 * @author Vasu
 * 
 */
public class ChapterListActivity extends Activity {

	protected static final String CHAPTER_POS = "CHAPTER_POS";
	private ListView chapterListView;
	private RelativeLayout screen;
	private RelativeLayout bookmarkLayout;
	protected static final String BOOKMARK_VIEW = "BOOKMARK_VIEW";

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_chapter_list);

		chapterListView = (ListView) findViewById(R.id.chapter_list_listview);

		screen = (RelativeLayout) findViewById(R.id.screen);

		bookmarkLayout = (RelativeLayout) findViewById(R.id.list_bookmark_layout);

		bookmarkLayout.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				Intent intent = new Intent(getApplicationContext(),
						BookMarkedChapterListActivity.class);
				startActivity(intent);

			}
		});

	}

	@Override
	public void onResume() {
		super.onResume();

		final List<ChapterEntity> chapterList = ChapterEntityHelper
				.fetchChapterList(getApplicationContext(), null, null, null,
						null, ChapterEntityHelper.KEY_SR + " ASC");
		if (chapterList != null && !chapterList.isEmpty()) {

			chapterListView
					.setAdapter(new ChapterListAdpater(this, chapterList));

			chapterListView.setOnItemClickListener(new OnItemClickListener() {

				@Override
				public void onItemClick(AdapterView<?> arg0, View arg1,
						int position, long arg3) {
					Intent intent = new Intent(getApplicationContext(),
							ChapterDetailActivity.class);
					intent.putExtra(CHAPTER_POS, position + 1);
					intent.putExtra(BOOKMARK_VIEW, false);
					Animation animRightIn = AnimationUtils.loadAnimation(
							getApplicationContext(), R.anim.slide_out_left);

					screen.startAnimation(animRightIn);
					startActivity(intent);
				}
			});

			Animation animRightIn = AnimationUtils.loadAnimation(this,
					R.anim.slide_in_right);

			screen.startAnimation(animRightIn);
		}
	}

	@Override
	protected void onActivityResult(int requestCode, int resultCode, Intent data) {
		overridePendingTransition(R.anim.slide_in_left, R.anim.slide_out_right);
	}

}
