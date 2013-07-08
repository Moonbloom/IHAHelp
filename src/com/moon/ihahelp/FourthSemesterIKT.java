package com.moon.ihahelp;

import android.os.Bundle;
import android.annotation.TargetApi;
import android.content.Intent;
import android.os.Build;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class FourthSemesterIKT extends ExtendsDefault {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_fourth_semester_ikt);
		// Show the Up button in the action bar.
		setupActionBar();
		
		Button I4DAB = (Button) findViewById(R.id.I4DAB);
		I4DAB.setOnClickListener(new OnClickListener() 
			{
				public void onClick(View viewName) 
				{
					Intent intentName = new Intent(viewName.getContext(), I4DAB.class);
					startActivityForResult(intentName, 0); 
				}
			} );
		
		Button I4GUI = (Button) findViewById(R.id.I4GUI);
		I4GUI.setOnClickListener(new OnClickListener() 
			{
				public void onClick(View viewName) 
				{
					Intent intentName = new Intent(viewName.getContext(), I4GUI.class);
					startActivityForResult(intentName, 0); 
				}
			} );
		
		Button I4IKN = (Button) findViewById(R.id.I4IKN);
		I4IKN.setOnClickListener(new OnClickListener() 
			{
				public void onClick(View viewName) 
				{
					Intent intentName = new Intent(viewName.getContext(), I4IKN.class);
					startActivityForResult(intentName, 0); 
				}
			} );
		
		Button I4SWD = (Button) findViewById(R.id.I4SWD);
		I4SWD.setOnClickListener(new OnClickListener() 
			{
				public void onClick(View viewName) 
				{
					Intent intentName = new Intent(viewName.getContext(), I4SWD.class);
					startActivityForResult(intentName, 0); 
				}
			} );
		
		Button I4SWT = (Button) findViewById(R.id.I4SWT);
		I4SWT.setOnClickListener(new OnClickListener() 
			{
				public void onClick(View viewName) 
				{
					Intent intentName = new Intent(viewName.getContext(), I4SWT.class);
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
