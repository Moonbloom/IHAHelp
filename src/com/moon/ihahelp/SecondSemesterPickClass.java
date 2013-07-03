package com.moon.ihahelp;

import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.annotation.TargetApi;
import android.content.Intent;
import android.os.Build;

public class SecondSemesterPickClass extends ExtendsDefault {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_second_semester_pick_class);
		// Show the Up button in the action bar.
		setupActionBar();
		
		Button E2ASB = (Button) findViewById(R.id.E2ASB);
		E2ASB.setOnClickListener(new OnClickListener() 
			{
				public void onClick(View v) 
				{
					Intent intent = new Intent(v.getContext(), E2ASB.class);
					startActivityForResult(intent, 0); 
				}
			} );
		
		Button E2MSA = (Button) findViewById(R.id.E2MSA);
		E2MSA.setOnClickListener(new OnClickListener() 
			{
				public void onClick(View v) 
				{
					Intent intent = new Intent(v.getContext(), E2MSA.class);
					startActivityForResult(intent, 0); 
				}
			} );
	
		Button E2DSD = (Button) findViewById(R.id.E2DSD);
		E2DSD.setOnClickListener(new OnClickListener() 
			{
				public void onClick(View v) 
				{
					Intent intent = new Intent(v.getContext(), E2DSD.class);
					startActivityForResult(intent, 0); 
				}
			} );
	
		Button E2PRJ2 = (Button) findViewById(R.id.E2PRJ2);
		E2PRJ2.setOnClickListener(new OnClickListener() 
			{
				public void onClick(View v) 
				{
					Intent intent = new Intent(v.getContext(), E2PRJ2.class);
					startActivityForResult(intent, 0); 
				}
			} );
		
		Button I2ISE = (Button) findViewById(R.id.I2ISE);
		I2ISE.setOnClickListener(new OnClickListener() 
			{
				public void onClick(View v) 
				{
					Intent intent = new Intent(v.getContext(), I2ISE.class);
					startActivityForResult(intent, 0); 
				}
			} );
		
		Button I2OOP = (Button) findViewById(R.id.I2OOP);
		I2OOP.setOnClickListener(new OnClickListener() 
			{
				public void onClick(View v) 
				{
					Intent intent = new Intent(v.getContext(), I2OOP.class);
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
