package com.moon.ihahelp;

import android.annotation.TargetApi;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class FirstSemesterPickClass extends ExtendsDefault {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_first_semester_pick_class);
		// Show the Up button in the action bar.
		setupActionBar();
		
		Button E1IDE = (Button) findViewById(R.id.E1IDE);
		E1IDE.setOnClickListener(new OnClickListener() 
			{
				public void onClick(View v) 
				{
					Intent intent = new Intent(v.getContext(), E1IDE.class);
					startActivityForResult(intent, 0); 
				}
			} );
		
		Button E1IKLT = (Button) findViewById(R.id.E1IKLT);
		E1IKLT.setOnClickListener(new OnClickListener() 
			{
				public void onClick(View v) 
				{
					Intent intent = new Intent(v.getContext(), E1IKLT.class);
					startActivityForResult(intent, 0); 
				}
			} );
		
		Button E1MMLS = (Button) findViewById(R.id.E1MMLS);
		E1MMLS.setOnClickListener(new OnClickListener() 
			{
				public void onClick(View v) 
				{
					Intent intent = new Intent(v.getContext(), E1MMLS.class);
					startActivityForResult(intent, 0); 
				}
			} );
		
		Button E1PRJ1 = (Button) findViewById(R.id.E1PRJ1);
		E1PRJ1.setOnClickListener(new OnClickListener() 
			{
				public void onClick(View v) 
				{
					Intent intent = new Intent(v.getContext(), E1PRJ1.class);
					startActivityForResult(intent, 0); 
				}
			} );
		
		Button E1VPR1 = (Button) findViewById(R.id.E1VPR1);
		E1VPR1.setOnClickListener(new OnClickListener() 
			{
				public void onClick(View v) 
				{
					Intent intent = new Intent(v.getContext(), E1VPR1.class);
					startActivityForResult(intent, 0); 
				}
			} );
		
		Button I1MSYS = (Button) findViewById(R.id.I1MSYS);
		I1MSYS.setOnClickListener(new OnClickListener() 
			{
				public void onClick(View v) 
				{
					Intent intent = new Intent(v.getContext(), I1MSYS.class);
					startActivityForResult(intent, 0); 
				}
			} );
		
		Button I1OPRG = (Button) findViewById(R.id.I1OPRG);
		I1OPRG.setOnClickListener(new OnClickListener() 
			{
				public void onClick(View v) 
				{
					Intent intent = new Intent(v.getContext(), I1OPRG.class);
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
