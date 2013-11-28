package com.gmat.app.helper;

import java.util.ArrayList;
import java.util.List;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import android.util.Log;

import com.gmat.app.common.DataBaseHelper;
import com.gmat.app.entity.ChapterEntity;

public class ChapterEntityHelper {

	private static final String tableName = "gmat_data";

	private static final String TAG = "ChpaterEntityHelper";

	public static final String KEY_SR = "_ID";
	public static final String KEY_CHAPTER_NAME = "CHAPTER_NAME";
	public static final String KEY_CHAPTER_DETAIL = "CHAPTER_DETAIL";
	public static final String KEY_FAV = "FAV";

	/**
	 * Fetch all the chapters
	 * 
	 * @param context
	 * @return
	 */
	public static List<ChapterEntity> fetchChapterList(Context context,
			String selection, String[] selectionArgs, String groupBy,
			String having, String orderBy) {
		List<ChapterEntity> chapterList = new ArrayList<ChapterEntity>();

		DataBaseHelper dbHelper = new DataBaseHelper(context);
		SQLiteDatabase db = dbHelper.getReadableDatabase();
		Cursor cursor = dbHelper.readValues(db, tableName, null, selection,
				selectionArgs, groupBy, having, orderBy);

		try {
			ChapterEntity chapter;
			if (cursor != null && cursor.getCount() > 0) {
				while (cursor.moveToNext()) {
					chapter = new ChapterEntity();
					chapter = setEntityFromCursor(cursor);
					chapterList.add(chapter);
				}
				cursor.close();
			}
		} catch (IllegalStateException e) {
			Log.e(TAG, "IllegalStateException", e);
		} finally {
			if (db != null) {
				db.close();
			}
			if (dbHelper != null) {
				dbHelper.close();
			}
		}

		return chapterList;
	}

	/**
	 * Fetch all the chapters
	 * 
	 * @param context
	 * @return
	 */
	public static ChapterEntity fetchChapter(Context context, int chapterPos) {

		ChapterEntity chapter = null;
		DataBaseHelper dbHelper = new DataBaseHelper(context);
		SQLiteDatabase db = dbHelper.getReadableDatabase();
		Cursor cursor = dbHelper.readValues(db, tableName, null, KEY_SR + "=?",
				new String[] { String.valueOf(chapterPos) }, null, null, null);

		try {

			if (cursor != null && cursor.getCount() > 0) {
				if (cursor.moveToNext()) {
					chapter = new ChapterEntity();
					chapter = setEntityFromCursor(cursor);
				}
				cursor.close();
			}
		} catch (IllegalStateException e) {
			Log.e(TAG, "IllegalStateException", e);
		} finally {
			if (db != null) {
				db.close();
			}
			if (dbHelper != null) {
				dbHelper.close();
			}
		}
		return chapter;
	}

	// Method for setting entity from cursor
	private static ChapterEntity setEntityFromCursor(Cursor cursor) {
		ChapterEntity chatper = new ChapterEntity();

		chatper.setChapterName(cursor.getString(cursor
				.getColumnIndex(KEY_CHAPTER_NAME)));
		chatper.setChapterDetail(cursor.getString(cursor
				.getColumnIndex(KEY_CHAPTER_DETAIL)));
		chatper.setSr(cursor.getInt(cursor.getColumnIndex(KEY_SR)));
		chatper.setFav(cursor.getInt(cursor.getColumnIndex(KEY_FAV)));
		return chatper;
	}

	// insert values
	public static void insertChapters(Context context,
			List<ChapterEntity> chapterList) {

		DataBaseHelper db = new DataBaseHelper(context);
		SQLiteDatabase database = db.getWritableDatabase();

		try {
			ContentValues cv;
			for (ChapterEntity chapter : chapterList) {
				cv = new ContentValues();
				cv.put(KEY_CHAPTER_DETAIL, chapter.getChapterDetail());
				cv.put(KEY_CHAPTER_NAME, chapter.getChapterName());
				cv.put(KEY_FAV, chapter.getFav());
				database.insert(tableName, null, cv);
			}
		} catch (SQLException e) {
			Log.e(TAG, "SQLException", e);
		} catch (IllegalStateException e) {
			Log.e(TAG, "IllegalStateException", e);
		} finally {
			database.close();
		}

	}

	public static void updateChapter(Context context, ChapterEntity chapter) {

		DataBaseHelper db = new DataBaseHelper(context);
		SQLiteDatabase database = db.getWritableDatabase();

		try {
			ContentValues cv = new ContentValues();
			cv.put(KEY_SR, chapter.getSr());
			cv.put(KEY_FAV, chapter.getFav());
			cv.put(KEY_CHAPTER_NAME, chapter.getChapterName());
			cv.put(KEY_CHAPTER_DETAIL, chapter.getChapterDetail());
			database.update(tableName, cv, KEY_SR + "=?",
					new String[] { String.valueOf(chapter.getSr()) });

		} catch (SQLException e) {
			Log.e(TAG, "SQLException", e);
		} catch (IllegalStateException e) {
			Log.e(TAG, "IllegalStateException", e);
		} finally {
			database.close();
		}

	}

}
