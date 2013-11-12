package com.gmat.app.adapter;

import java.util.List;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.gmat.app.R;
import com.gmat.app.activities.ChapterDetailActivity;
import com.gmat.app.entity.ChapterEntity;

public class ChapterListAdpater extends BaseAdapter {

	private Activity activity;
	private LayoutInflater inflater;
	private List<ChapterEntity> chapterList;

	private static final String CHAPTER_OBJ = "CHAPTER_OBJ";

	public ChapterListAdpater(Activity activity, List<ChapterEntity> chapterList) {
		this.activity = activity;
		this.chapterList = chapterList;
		this.inflater = (LayoutInflater) activity
				.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
	}

	@Override
	public int getCount() {
		return chapterList.size();
	}

	@Override
	public Object getItem(int position) {
		return position;
	}

	@Override
	public long getItemId(int position) {
		return position;
	}

	@Override
	public View getView(int position, View convertView, ViewGroup parent) {

		if (convertView == null) {
			convertView = inflater.inflate(R.layout.chapter_list_item_layout,
					null);
		}

		final ChapterEntity chapter = chapterList.get(position);

		if (chapter != null) {
			TextView chapterTitleTextView = (TextView) convertView
					.findViewById(R.id.chapter_list_item_chpater_title);
			RelativeLayout chapterLayout = (RelativeLayout) convertView
					.findViewById(R.id.chapter_list_item_layout);

			chapterTitleTextView.setText(chapter.getChaperName());

			chapterLayout.setOnClickListener(new OnClickListener() {

				@Override
				public void onClick(View v) {
					Intent intent = new Intent(activity,
							ChapterDetailActivity.class);
					intent.putExtra(CHAPTER_OBJ, chapter);
					activity.startActivity(intent);
				}
			});
		}
		return convertView;
	}

}
