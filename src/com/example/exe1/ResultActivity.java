package com.example.exe1;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class ResultActivity extends Activity {
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.resultactivity); 
		TextView tv1 = (TextView)findViewById(R.id.tv1);
		tv1.setText("Antal besvarade frågor: " + Integer.toString(getIntent().getExtras().getInt("que")));
		TextView tv2 = (TextView)findViewById(R.id.tv2);
		tv2.setText("Antal rätta svar: " + Integer.toString(getIntent().getExtras().getInt("cor")));
		TextView tv3 = (TextView)findViewById(R.id.tv3);
		tv3.setText("Antal felaktiga svar: " + Integer.toString(getIntent().getExtras().getInt("inc")));
	}
	
	public void onClick(View view) {
		startActivity(new Intent(this, Exe1Activity.class));
		finish();
	}
}
