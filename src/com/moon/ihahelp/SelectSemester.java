package com.moon.ihahelp;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class SelectSemester extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_select_semester);

		
		Button FirstSemester = (Button) findViewById(R.id.FirstSemester);
		FirstSemester.setOnClickListener(new OnClickListener() 
			{
				public void onClick(View v) 
				{
					Intent intent = new Intent(v.getContext(), FirstSemesterPickClass.class);
					startActivityForResult(intent, 0); 
				}
			} );
		
		Button SecondSemester = (Button) findViewById(R.id.SecondSemester);
		SecondSemester.setOnClickListener(new OnClickListener() 
			{
				public void onClick(View v) 
				{
					Intent intent = new Intent(v.getContext(), SecondSemesterPickClass.class);
					startActivityForResult(intent, 0); 
				}
			} );
					
		Button ThirdSemester = (Button) findViewById(R.id.ThirdSemester);
		ThirdSemester.setOnClickListener(new OnClickListener() 
			{
				public void onClick(View v) 
				{
					Intent intent = new Intent(v.getContext(), ThirdSemesterPickClass.class);
					startActivityForResult(intent, 0); 
				}
			} );
		
		Button FourthSemester = (Button) findViewById(R.id.FourthSemester);
		FourthSemester.setOnClickListener(new OnClickListener() 
			{
				public void onClick(View v) 
				{
					Intent intent = new Intent(v.getContext(), FourthSemesterPickClass.class);
					startActivityForResult(intent, 0); 
				}
			} );
		
		Button FifthSemester = (Button) findViewById(R.id.FifthSemester);
		FifthSemester.setOnClickListener(new OnClickListener() 
			{
				public void onClick(View v) 
				{
					Intent intent = new Intent(v.getContext(), FifthSemesterPickClass.class);
					startActivityForResult(intent, 0); 
				}
			} );
		
		Button SixthSemester = (Button) findViewById(R.id.SixthSemester);
		SixthSemester.setOnClickListener(new OnClickListener() 
			{
				public void onClick(View v) 
				{
					Intent intent = new Intent(v.getContext(), SixthSemesterPickClass.class);
					startActivityForResult(intent, 0); 
				}
			} );
		
		Button SeventhSemester = (Button) findViewById(R.id.SeventhSemester);
		SeventhSemester.setOnClickListener(new OnClickListener() 
			{
				public void onClick(View v) 
				{
					Intent intent = new Intent(v.getContext(), SeventhSemesterPickClass.class);
					startActivityForResult(intent, 0); 
				}
			} );
				
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.select_semester, menu);
		return true;
	}

}
