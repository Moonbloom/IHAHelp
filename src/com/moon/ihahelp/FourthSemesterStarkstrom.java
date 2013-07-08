package com.moon.ihahelp;

import android.os.Bundle;
import android.annotation.TargetApi;
import android.content.Intent;
import android.os.Build;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class FourthSemesterStarkstrom extends ExtendsDefault {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_fourth_semester_starkstrom);
		// Show the Up button in the action bar.
		setupActionBar();
		
		Button EP4EEV = (Button) findViewById(R.id.EP4EEV);
		EP4EEV.setOnClickListener(new OnClickListener() 
			{
				public void onClick(View viewName) 
				{
					Intent intentName = new Intent(viewName.getContext(), EP4EEV.class);
					startActivityForResult(intentName, 0); 
				}
			} );
		
		Button EP4IOA = (Button) findViewById(R.id.EP4IOA);
		EP4IOA.setOnClickListener(new OnClickListener() 
			{
				public void onClick(View viewName) 
				{
					Intent intentName = new Intent(viewName.getContext(), EP4IOA.class);
					startActivityForResult(intentName, 0); 
				}
			} );
	}

	/**
	 * Set up the {@link android.app.ActionBar}, if the API is available.
	 */
	@TargetApi(Build.VERSION_CODES.HONEYCOMB)
	private void setupActionBar() {
		if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.HONEYCOMB) {
			getActionBar().setDisplayHomeAsUpEnabled(true);
		}
	}
}
