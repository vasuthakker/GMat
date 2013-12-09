package com.gmat.app.activities;

import java.util.ArrayList;
import java.util.List;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.support.v4.view.ViewPager;
import android.support.v4.view.ViewPager.OnPageChangeListener;
import android.util.Log;

import com.gmat.app.R;
import com.gmat.app.adapter.ChaptersPagerAdapter;
import com.gmat.app.entity.ChapterEntity;
import com.gmat.app.helper.ChapterEntityHelper;

public class ChapterDetailActivity extends FragmentActivity {

	private static final String CHAPTER_POS = "CHAPTER_POS";

	private int chapterPos;

	private ViewPager pager;
	private static final String BOOKMARK_VIEW = "BOOKMARK_VIEW";
	private boolean bookMarkChapterShow = false;
	private List<ChapterEntity> chapEntities;

	@SuppressLint("NewApi")
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_chapter_detail);

		pager = (ViewPager) findViewById(R.id.detail_viewpager);

		bookMarkChapterShow = getIntent().getBooleanExtra(BOOKMARK_VIEW, false);

		if (bookMarkChapterShow) {
			chapEntities = ChapterEntityHelper.fetchChapterList(
					getApplicationContext(),
					ChapterEntityHelper.KEY_FAV + "=?",
					new String[] { String.valueOf(1) }, null, null,
					ChapterEntityHelper.KEY_SR + " ASC");

		} else {
			chapEntities = ChapterEntityHelper.fetchChapterList(
					getApplicationContext(), null, null, null, null,
					ChapterEntityHelper.KEY_SR + " ASC");
		}
		ChapterEntity chapter=new ChapterEntity();
		chapEntities.add(0, chapter);
		
		pager.setAdapter(new ChaptersPagerAdapter(this, chapEntities));
		chapterPos = getIntent().getIntExtra(CHAPTER_POS, 0);

		pager.setCurrentItem(chapterPos);

		pager.setOnPageChangeListener(pageChange);

		// pager.setOnTouchListener(new OnTouchListener() {
		//
		// @Override
		// public boolean onTouch(View v, MotionEvent ev) {
		// float x = ev.getX();
		// float mStartDragX;
		// switch (ev.getAction()) {
		// case MotionEvent.ACTION_DOWN:
		// Log.i("ev", "down " + ev.getX());
		// break;
		// case MotionEvent.ACTION_MOVE:
		// Log.i("ev", "move " + ev.getX());
		// break;
		// case MotionEvent.ACTION_UP:
		// Log.i("ev", "up " + ev.getX());
		// break;
		// }
		//
		// return true;
		// }
		// });

	}

	private OnPageChangeListener pageChange = new OnPageChangeListener() {

		@Override
		public void onPageSelected(int currPage) {
		}

		@Override
		public void onPageScrolled(int arg0, float arg1, int page) {
			if (arg0 == 0) {
				finish();
			}
		}

		@Override
		public void onPageScrollStateChanged(int arg0) {
		}
	};

}
