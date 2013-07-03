package com.moon.ihahelp;

import android.app.Activity;
import android.view.Menu;

public class ExtendsDefault extends Activity {
	@Override
	public boolean onCreateOptionsMenu(Menu menuName) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.select_semester, menuName);
		return true;
	}
}
