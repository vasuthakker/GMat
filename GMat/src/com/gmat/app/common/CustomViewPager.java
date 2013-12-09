package com.gmat.app.common;

import android.content.Context;
import android.support.v4.view.ViewPager;
import android.util.Log;
import android.view.MotionEvent;

public class CustomViewPager extends ViewPager {
	private Context activity;

	public CustomViewPager(Context activity) {
		super(activity);
		this.activity = activity;
	}

	float mStartDragX;
	OnSwipeOutListener mListener;

	public void setOnSwipeOutListener(OnSwipeOutListener listener) {
		mListener = listener;
	}

	@Override
	public boolean onInterceptTouchEvent(MotionEvent ev) {
		float x = ev.getX();
		switch (ev.getAction()) {
		case MotionEvent.ACTION_DOWN:
			mStartDragX = x;
			break;
		case MotionEvent.ACTION_MOVE:
			Log.i("ads", " " + getCurrentItem());
			Log.i("ads", " " + getAdapter().getCount());
			if (mStartDragX < x && getCurrentItem() == 0) {
				mListener.onSwipeOutAtStart();
				Log.i("ads", " " + getCurrentItem());
			} else if (mStartDragX > x
					&& getCurrentItem() == getAdapter().getCount() - 1) {
				mListener.onSwipeOutAtEnd();
			}
			break;
		}
		return super.onInterceptTouchEvent(ev);
	}

	public interface OnSwipeOutListener {
		public void onSwipeOutAtStart();

		public void onSwipeOutAtEnd();
	}

}