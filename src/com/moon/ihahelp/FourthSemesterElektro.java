package com.moon.ihahelp;

import android.os.Bundle;
import android.annotation.TargetApi;
import android.content.Intent;
import android.os.Build;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class FourthSemesterElektro extends ExtendsDefault {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_fourth_semester_elektro);
		// Show the Up button in the action bar.
		setupActionBar();
		
		Button E4ASD = (Button) findViewById(R.id.E4ASD);
		E4ASD.setOnClickListener(new OnClickListener() 
			{
				public void onClick(View v) 
				{
					Intent intent = new Intent(v.getContext(), E4ASD.class);
					startActivityForResult(intent, 0); 
				}
			} );
		
		Button E4DSA = (Button) findViewById(R.id.E4DSA);
		E4DSA.setOnClickListener(new OnClickListener() 
			{
				public void onClick(View v) 
				{
					Intent intent = new Intent(v.getContext(), E4DSA.class);
					startActivityForResult(intent, 0); 
				}
			} );
		
		Button E4EFYS = (Button) findViewById(R.id.E4EFYS);
		E4EFYS.setOnClickListener(new OnClickListener() 
			{
				public void onClick(View v) 
				{
					Intent intent = new Intent(v.getContext(), E4EFYS.class);
					startActivityForResult(intent, 0); 
				}
			} );
		
		Button E4IRT = (Button) findViewById(R.id.E4IRT);
		E4IRT.setOnClickListener(new OnClickListener() 
			{
				public void onClick(View v) 
				{
					Intent intent = new Intent(v.getContext(), E4IRT.class);
					startActivityForResult(intent, 0); 
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
