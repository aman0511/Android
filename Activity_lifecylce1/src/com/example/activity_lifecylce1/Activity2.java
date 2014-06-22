package com.example.activity_lifecylce1;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.widget.TextView;

public class Activity2 extends Activity {

	private TextView moncreate,monstart,monresume,monrestart;
	private int oncrete=0,onstart=0,onresume=0,onrestart=0;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_activity2);
		setContentView(R.layout.activity_main);
		moncreate=(TextView) findViewById(R.id.oncrete);
		monrestart=(TextView) findViewById(R.id.onrestart);
		monresume=(TextView) findViewById(R.id.onresume);
		monstart=(TextView) findViewById(R.id.onstart);
		
		
		oncrete++;
		display();
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.activity2, menu);
		return true;
	}
	private void display() {
		// TODO Auto-generated method stub
		moncreate.setText(getString(R.string.oncreate)+ String.valueOf(oncrete));
		monrestart.setText(getString(R.string.onrestart)+ Integer.toString(onrestart));
		monresume.setText(getString(R.string.onresume)+ Integer.toString(onresume));
		monstart.setText(getString(R.string.onstart)+ Integer.toString(onstart));

	
	}
	@Override
	protected void onPause() {
		// TODO Auto-generated method stub
		super.onPause();
		
		
	}

	@Override
	protected void onRestart() {
		// TODO Auto-generated method stub
		super.onRestart();
		onrestart++;
		display();
	}

	@Override
	protected void onResume() {
		// TODO Auto-generated method stub
		super.onResume();
		onresume++;
		display();
	}

	@Override
	protected void onStart() {
		// TODO Auto-generated method stub
		super.onStart();
		onstart++;
		display();
	}

	@Override
	protected void onStop() {
		// TODO Auto-generated method stub
		super.onStop();
		
	}


}
