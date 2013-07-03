package com.moon.ihahelp;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.annotation.TargetApi;
import android.content.Intent;
import android.os.Build;

public class ThirdSemesterPickClass extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_third_semester_pick_class);
		// Show the Up button in the action bar.
		setupActionBar();
		
		Button E3DSB = (Button) findViewById(R.id.E3DSB);
		E3DSB.setOnClickListener(new OnClickListener() 
			{
				public void onClick(View v) 
				{
					Intent intent = new Intent(v.getContext(), E3DSB.class);
					startActivityForResult(intent, 0); 
				}
			} );
		
		Button E3MSE = (Button) findViewById(R.id.E3MSE);
		E3MSE.setOnClickListener(new OnClickListener() 
			{
				public void onClick(View v) 
				{
					Intent intent = new Intent(v.getContext(), E3MSE.class);
					startActivityForResult(intent, 0); 
				}
			} );
		
		Button E3PRJ3 = (Button) findViewById(R.id.E3PRJ3);
		E3PRJ3.setOnClickListener(new OnClickListener() 
			{
				public void onClick(View v) 
				{
					Intent intent = new Intent(v.getContext(), E3PRJ3.class);
					startActivityForResult(intent, 0); 
				}
			} );
	
		Button I3GFV = (Button) findViewById(R.id.I3GFV);
		I3GFV.setOnClickListener(new OnClickListener() 
			{
				public void onClick(View v) 
				{
					Intent intent = new Intent(v.getContext(), I3GFV.class);
					startActivityForResult(intent, 0); 
				}
			} );
		
		Button I3ISU = (Button) findViewById(R.id.I3ISU);
		I3ISU.setOnClickListener(new OnClickListener() 
			{
				public void onClick(View v) 
				{
					Intent intent = new Intent(v.getContext(), I3ISU.class);
					startActivityForResult(intent, 0); 
				}
			} );
		
		Button I3MPS = (Button) findViewById(R.id.I3MPS);
		I3MPS.setOnClickListener(new OnClickListener() 
			{
				public void onClick(View v) 
				{
					Intent intent = new Intent(v.getContext(), I3MPS.class);
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

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.third_semester_pick_class, menu);
		return true;
	}
}
