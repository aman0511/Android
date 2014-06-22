package com.example.activity_lifecylce1;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.TextView;

public class MainActivity extends Activity {

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

	private TextView moncreate,monstart,monresume,monrestart;
	private int oncrete=0,onstart=0,onresume=0,onrestart=0;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		moncreate=(TextView) findViewById(R.id.oncrete);
		monrestart=(TextView) findViewById(R.id.onrestart);
		monresume=(TextView) findViewById(R.id.onresume);
		monstart=(TextView) findViewById(R.id.onstart);
		Button button=(Button) findViewById(R.id.activity2);
		
		button.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				 Intent itent=new Intent(MainActivity.this,Activity2.class);
				startActivity(itent);
			}
		});
		
		
		oncrete++;
		display();
		
	}

	private void display() {
		// TODO Auto-generated method stub
		moncreate.setText(getString(R.string.oncreate)+ String.valueOf(oncrete));
		monrestart.setText(getString(R.string.onrestart)+ Integer.toString(onrestart));
		monresume.setText(getString(R.string.onresume)+ Integer.toString(onresume));
		monstart.setText(getString(R.string.onstart)+ Integer.toString(onstart));

	
	}
	

}
