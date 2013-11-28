package com.gmat.app.adapter;

import android.app.Activity;
import android.content.Context;
import android.graphics.Color;
import android.os.Parcelable;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

import com.gmat.app.R;
import com.gmat.app.entity.ChapterEntity;
import com.gmat.app.helper.ChapterEntityHelper;

public class ChaptersPagerAdapter extends PagerAdapter {

	TextView titleTextView;

	private LayoutInflater inflater;

	private static final int BOOKMARKED = 1;
	private static final int UNBOOKMARKED = 0;

	private static final int TOTAL_CHAPTERS = 19;
	private Activity activity;
	private RelativeLayout backLayout;

	public ChaptersPagerAdapter(Activity context) {
		this.activity = context;
		inflater = (LayoutInflater) context
				.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
	}

	@Override
	public int getCount() {
		return TOTAL_CHAPTERS;
	}

	@Override
	public Object instantiateItem(View collection, int position) {
		View view = inflater.inflate(R.layout.chapter_detail_item, null);

		if (view != null) {

			// UI
			titleTextView = (TextView) view
					.findViewById(R.id.chapter_detail_title_textview);
			backLayout = (RelativeLayout) view
					.findViewById(R.id.back_image_layout);
			final ImageView backImageView = (ImageView) view
					.findViewById(R.id.chapter_detail_back_imageview);
			final ImageView zoomInImageView = (ImageView) view
					.findViewById(R.id.zoom_in);
			final ImageView zoomOutImageView = (ImageView) view
					.findViewById(R.id.zoom_out);
			final ImageView bookMarkImageView = (ImageView) view
					.findViewById(R.id.bookmark_imageview);

			final RelativeLayout bookMarkLayout = (RelativeLayout) view
					.findViewById(R.id.bookmark_layout);

			final EditText detailEditText = (EditText) view
					.findViewById(R.id.chapter_detail_detail_edittext);

			detailEditText.setTextColor(Color.BLACK);

			final ChapterEntity chapter = ChapterEntityHelper.fetchChapter(
					activity, position + 1);

			if (chapter != null) {
				titleTextView.setText(chapter.getChapterName());

				detailEditText.setText(chapter.getChapterDetail());

				if (chapter.getFav() == BOOKMARKED) {
					bookMarkImageView.setImageResource(R.drawable.bookmark_on);
				} else {
					bookMarkImageView.setImageResource(R.drawable.bookmark_off);
				}

				// listener
				bookMarkLayout.setOnClickListener(new OnClickListener() {

					@Override
					public void onClick(View v) {

						String toastMessage;
						if (chapter.getFav() == BOOKMARKED) {
							bookMarkImageView
									.setImageResource(R.drawable.bookmark_off);
							chapter.setFav(UNBOOKMARKED);
							toastMessage = activity
									.getString(R.string.removed_from_bookamrk);
						} else {
							bookMarkImageView
									.setImageResource(R.drawable.bookmark_on);
							chapter.setFav(BOOKMARKED);
							toastMessage = activity
									.getString(R.string.added_to_bookamrk);
						}

						ChapterEntityHelper.updateChapter(activity, chapter);

						Toast.makeText(activity, toastMessage,
								Toast.LENGTH_SHORT).show();

					}
				});

				zoomInImageView.setOnClickListener(new OnClickListener() {

					@Override
					public void onClick(View v) {

						float fontSizeSp = pixelsToSp(activity,
								detailEditText.getTextSize());

						detailEditText.setTextSize(fontSizeSp + 0.5f);

					}
				});

				zoomOutImageView.setOnClickListener(new OnClickListener() {

					@Override
					public void onClick(View v) {
						// TODO Auto-generated method stub
						float fontSizeSp = pixelsToSp(activity,
								detailEditText.getTextSize());
						detailEditText.setTextSize(fontSizeSp - 0.5f);
					}
				});

				backLayout.setOnClickListener(new OnClickListener() {

					@Override
					public void onClick(View v) {
						activity.finish();

					}
				});
			}
		}

		((ViewPager) collection).addView(view, 0);

		return view;
	}

	// @Override
	public boolean isViewFromObject(View view, Object object) {
		return view == ((View) object);
	}

	@Override
	public Parcelable saveState() {
		return null;
	}

	@Override
	public void destroyItem(View collection, int position, Object view) {
		((ViewPager) collection).removeView((View) view);
	}

	private float pixelsToSp(Context context, Float px) {
		float scaledDensity = context.getResources().getDisplayMetrics().scaledDensity;
		return px / scaledDensity;
	}

}
