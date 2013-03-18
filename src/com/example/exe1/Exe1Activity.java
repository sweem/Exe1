package com.example.exe1;

import java.util.Vector;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Exe1Activity extends Activity {
	public Integer corr;
	Result res;
	Question que1, que2, que3;
	Question[] arr;
	int index;
	TextView tv1;
	Button bt1, bt2, bt3;
	
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        
        index = 0;
        res = new Result();
        
        arr = new Question[3];       
        que1 = new Question("Vilken stad är huvudstad i Sverige?", "Stockholm", "Göteborg", "Malmö", "Stockholm");
        arr[0] = que1;
        que2 = new Question("Vilken stad är huvudstad i Norge?", "Stavanger", "Oslo", "Kristiansand", "Oslo");
        arr[1] = que2;
        que3 = new Question("Vilken stad är huvudstad i Sverige?", "Helsingör", "Århus", "Köpenhamn", "Köpenhamn");
        arr[2] = que3;
        
        tv1 = (TextView)findViewById(R.id.tv1);
	    tv1.setText(arr[index].getQuestion());
	    bt1 = (Button)findViewById(R.id.bt1);
	    bt1.setText(arr[index].getAnswer1());
	    bt2 = (Button)findViewById(R.id.bt2);
	    bt2.setText(arr[index].getAnswer2());
	    bt3 = (Button)findViewById(R.id.bt3);
	    bt3.setText(arr[index].getAnswer3());      
    }
    
    public void onClick1(View view) {
    	showNextQueOrRes(arr[index].getAnswer1());
    }
    
    public void onClick2(View view) {
      	showNextQueOrRes(arr[index].getAnswer2());
    }
    
    public void onClick3(View view) {
      	showNextQueOrRes(arr[index].getAnswer3());
    }
    
    public void showNextQueOrRes(String ans) {
    	if(arr[index].getResultForQuestion(ans) == true) {
    		res.incCorrAns();
    	}
    	else {
    		res.decCorrAns();
    	}
    	index++;
    	if(index < arr.length) {
    	    tv1.setText(arr[index].getQuestion());
    	    bt1.setText(arr[index].getAnswer1());
    	    bt2.setText(arr[index].getAnswer2());
    	    bt3.setText(arr[index].getAnswer3());
    	}
    	else {
        	Intent i = new Intent(this, ResultActivity.class);
        	i.putExtra("cor", res.getNbrCorrAns());
        	i.putExtra("inc", res.getNbrWroAns());
        	i.putExtra("que", res.getNbrQue());
        	startActivity(i);
        	finish();
    	}
    }
}