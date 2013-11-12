package com.gmat.app.activities;

import java.util.List;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageView;
import android.widget.ListView;

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

	private ListView chapterListView;
	private ImageView bookmarkImageView;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_chapter_list);

		chapterListView = (ListView) findViewById(R.id.chapter_list_listview);

		bookmarkImageView = (ImageView) findViewById(R.id.chapter_list_bookmark_imageview);

		bookmarkImageView.setOnClickListener(new OnClickListener() {

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

		List<ChapterEntity> chapterList = ChapterEntityHelper.fetchChapterList(
				getApplicationContext(), null, null, null, null,
				ChapterEntityHelper.KEY_SR + " ASC");
		if (chapterList != null && !chapterList.isEmpty()) {

			chapterListView
					.setAdapter(new ChapterListAdpater(this, chapterList));
		}
	}

}
