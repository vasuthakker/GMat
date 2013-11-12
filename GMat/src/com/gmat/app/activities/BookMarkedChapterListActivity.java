package com.gmat.app.activities;

import java.util.List;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.ListView;

import com.gmat.app.R;
import com.gmat.app.adapter.ChapterListAdpater;
import com.gmat.app.entity.ChapterEntity;
import com.gmat.app.helper.ChapterEntityHelper;

public class BookMarkedChapterListActivity extends Activity {

	private ListView bookmarkListView;
	private LinearLayout noBookmarkLayout;
	private Button noBookmarkButton;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_book_marked_chapter_list);

		bookmarkListView = (ListView) findViewById(R.id.bookmark_chapter_list_listview);
		noBookmarkLayout = (LinearLayout) findViewById(R.id.no_bookmark_layout);
		noBookmarkButton = (Button) findViewById(R.id.no_bookmark_ok_button);

		noBookmarkButton.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				finish();
			}
		});

	}

	@Override
	public void onResume() {
		super.onResume();

		List<ChapterEntity> bookmarkedChapterList = ChapterEntityHelper
				.fetchChapterList(getApplicationContext(),
						ChapterEntityHelper.KEY_FAV + "=?",
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
	}

}
