package com.gmat.app.activities;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.os.Bundle;
import android.os.Handler;

import com.gmat.app.R;
import com.gmat.app.utils.Utils;

public class SplashActivity extends Activity {

	private static final int SPLASH_TIMER = 1000;

	private String inserted;

	private static final String KEY_INSERTED = "KEY_INSERTED";

	SharedPreferences preferences;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_splash);

		preferences = getApplicationContext().getSharedPreferences("gmat_pref",
				Context.MODE_PRIVATE);
		Handler handler = new Handler();
		handler.postDelayed(new Runnable() {

			@Override
			public void run() {

				inserted = preferences.getString(KEY_INSERTED, null);
				if (inserted == null) {
					Utils.prepareData(getApplicationContext());
					Editor editor = preferences.edit();
					editor.putString(KEY_INSERTED, "Y");
					editor.commit();
				}
				Intent intent = new Intent(getApplicationContext(),
						ChapterListActivity.class);
				startActivity(intent);
				finish();
			}
		}, SPLASH_TIMER);
	}
}
