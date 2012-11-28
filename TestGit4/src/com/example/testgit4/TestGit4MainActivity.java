package com.example.testgit4;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;

public class TestGit4MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_test_git4_main);
		setContentView(R.layout.activity_test_git4_main);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.activity_test_git4_main, menu);
		return true;
	}

}
