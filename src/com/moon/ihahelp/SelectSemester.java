package com.moon.ihahelp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class SelectSemester extends ExtendsDefault {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_select_semester);
		
		Button FirstSemester = (Button) findViewById(R.id.FirstSemester);
		FirstSemester.setOnClickListener(new OnClickListener() 
			{
				public void onClick(View viewName) 
				{
					Intent intentName = new Intent(viewName.getContext(), FirstSemesterPickClass.class);
					startActivityForResult(intentName, 0); 
				}
			} );
		
		Button SecondSemester = (Button) findViewById(R.id.SecondSemester);
		SecondSemester.setOnClickListener(new OnClickListener() 
			{
				public void onClick(View viewName) 
				{
					Intent intentName = new Intent(viewName.getContext(), SecondSemesterPickClass.class);
					startActivityForResult(intentName, 0); 
				}
			} );
					 
		Button ThirdSemester = (Button) findViewById(R.id.ThirdSemester);
		ThirdSemester.setOnClickListener(new OnClickListener() 
			{
				public void onClick(View viewName) 
				{
					Intent intentName = new Intent(viewName.getContext(), ThirdSemesterPickClass.class);
					startActivityForResult(intentName, 0); 
				}
			} );
		
		Button FourthSemester = (Button) findViewById(R.id.FourthSemester);
		FourthSemester.setOnClickListener(new OnClickListener() 
			{
				public void onClick(View viewName) 
				{
					Intent intentName = new Intent(viewName.getContext(), FourthSemesterPickLine.class);
					startActivityForResult(intentName, 0); 
				}
			} );
		
		Button FifthSemester = (Button) findViewById(R.id.FifthSemester);
		FifthSemester.setOnClickListener(new OnClickListener() 
			{
				public void onClick(View viewName) 
				{
					Intent intentName = new Intent(viewName.getContext(), FifthSemesterInternship.class);
					startActivityForResult(intentName, 0); 
				}
			} );
		
		Button SixthSemester = (Button) findViewById(R.id.SixthSemester);
		SixthSemester.setOnClickListener(new OnClickListener() 
			{
				public void onClick(View viewName) 
				{
					Intent intentName = new Intent(viewName.getContext(), SixthSemesterPickLine.class);
					startActivityForResult(intentName, 0); 
				}
			} );
		
		Button SeventhSemester = (Button) findViewById(R.id.SeventhSemester);
		SeventhSemester.setOnClickListener(new OnClickListener() 
			{
				public void onClick(View viewName) 
				{
					Intent intentName = new Intent(viewName.getContext(), SeventhSemesterPickLine.class);
					startActivityForResult(intentName, 0); 
				}
			} );
				
	}
}
