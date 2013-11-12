package com.gmat.app.activities;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.gmat.app.R;
import com.gmat.app.entity.ChapterEntity;
import com.gmat.app.helper.ChapterEntityHelper;

public class ChapterDetailActivity extends Activity {

	private TextView titleTextView;
	private EditText detailEdittext;
	private ImageView backImageView;
	private ImageView zoomInImageView;
	private ImageView zoomOutImageView;

	private ImageView bookMarkImageView;

	private static final int BOOKMARKED = 1;
	private static final int UNBOOKMARKED = 0;

	private static final String CHAPTER_OBJ = "CHAPTER_OBJ";

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_chapter_detail);

		titleTextView = (TextView) findViewById(R.id.chapter_detail_title_textview);
		detailEdittext = (EditText) findViewById(R.id.chapter_detail_detail_edittext);
		backImageView = (ImageView) findViewById(R.id.chapter_detail_back_imageview);
		zoomInImageView = (ImageView) findViewById(R.id.zoom_in);
		zoomOutImageView = (ImageView) findViewById(R.id.zoom_out);

		bookMarkImageView = (ImageView) findViewById(R.id.bookmark_imageview);

		final ChapterEntity chapter = (ChapterEntity) getIntent()
				.getSerializableExtra(CHAPTER_OBJ);

		if (chapter.getFav() == BOOKMARKED) {
			bookMarkImageView.setImageResource(R.drawable.bookmark_on);
		} else {
			bookMarkImageView.setImageResource(R.drawable.bookmark_off);
		}

		if (chapter != null) {
			titleTextView.setText(chapter.getChaperName());
			detailEdittext.setText(chapter.getChapterDetail());
		}

		backImageView.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				finish();
			}
		});

		zoomInImageView.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {

				float fontSizeSp = pixelsToSp(getApplicationContext(),
						detailEdittext.getTextSize());

				detailEdittext.setTextSize(fontSizeSp + 0.5f);

			}
		});

		zoomOutImageView.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				float fontSizeSp = pixelsToSp(getApplicationContext(),
						detailEdittext.getTextSize());

				detailEdittext.setTextSize(fontSizeSp - 0.5f);

			}
		});

		bookMarkImageView.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {

				String toastMessage;
				if (chapter.getFav() == BOOKMARKED) {
					bookMarkImageView.setImageResource(R.drawable.bookmark_off);
					chapter.setFav(UNBOOKMARKED);
					toastMessage = getString(R.string.removed_from_bookamrk);
				} else {
					bookMarkImageView.setImageResource(R.drawable.bookmark_on);
					chapter.setFav(BOOKMARKED);
					toastMessage = getString(R.string.added_to_bookamrk);
				}

				ChapterEntityHelper.updateChapter(getApplicationContext(),
						chapter);

				Toast.makeText(getApplicationContext(), toastMessage,
						Toast.LENGTH_SHORT).show();

			}
		});
	}

	public static float pixelsToSp(Context context, Float px) {
		float scaledDensity = context.getResources().getDisplayMetrics().scaledDensity;
		return px / scaledDensity;
	}

}
