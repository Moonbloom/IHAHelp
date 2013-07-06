package com.moon.ihahelp;

import android.os.Bundle;
import android.annotation.TargetApi;
import android.content.Intent;
import android.os.Build;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class FourthSemesterPickLine extends ExtendsDefault {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_fourth_semester_pick_line);
		// Show the Up button in the action bar.
		setupActionBar();
		
		Button IKT = (Button) findViewById(R.id.IKT);
		IKT.setOnClickListener(new OnClickListener() 
			{
				public void onClick(View viewName) 
				{
					Intent intentName = new Intent(viewName.getContext(), FourthSemesterIKT.class);
					startActivityForResult(intentName, 0); 
				}
			} );
		
		Button Starkstrom = (Button) findViewById(R.id.Starkstrom);
		Starkstrom.setOnClickListener(new OnClickListener() 
			{
				public void onClick(View viewName) 
				{
					Intent intentName = new Intent(viewName.getContext(), FourthSemesterStarkstrom.class);
					startActivityForResult(intentName, 0); 
				}
			} );
		
		Button Elektro = (Button) findViewById(R.id.Elektro);
		Elektro.setOnClickListener(new OnClickListener() 
			{
				public void onClick(View viewName) 
				{
					Intent intentName = new Intent(viewName.getContext(), FourthSemesterElektro.class);
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
