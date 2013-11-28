package com.gmat.app.activities;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.support.v4.view.ViewPager;

import com.gmat.app.R;
import com.gmat.app.adapter.ChaptersPagerAdapter;

public class ChapterDetailActivity extends FragmentActivity {

	private static final String CHAPTER_POS = "CHAPTER_POS";

	private int chapterPos;

	private ViewPager pager;

	@SuppressLint("NewApi")
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_chapter_detail);

		pager = (ViewPager) findViewById(R.id.detail_viewpager);

		pager.setAdapter(new ChaptersPagerAdapter(this));
		chapterPos = getIntent().getIntExtra(CHAPTER_POS, 0);

		pager.setCurrentItem(chapterPos);

	}

	// private class Chapters extends FragmentStatePagerAdapter {
	//
	// public Chapters(FragmentManager fm) {
	// super(fm);
	//
	// }
	//
	// @Override
	// public Fragment getItem(int position) {
	// Fragment fragment = new ChapterDetailFragment();
	// Bundle bundle = new Bundle();
	// bundle.putInt(CHAPTER_POS, position);
	// fragment.setArguments(bundle);
	// return fragment;
	// }
	//
	// @Override
	// public int getCount() {
	// return TOTAL_CHAPTERS;
	// }
	//
	// }

}
