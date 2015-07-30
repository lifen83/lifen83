package com.example.startactivityforresultdemo;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends Activity {

	protected static final int REQUEST_CODE = 1;
	Button btnButton1;
	TextView showTextView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnButton1=(Button) this.findViewById(R.id.btnButton1);
        showTextView=(TextView) this.findViewById(R.id.showTextView);
        
        btnButton1.setOnClickListener(new OnClickListener(){

			@Override
			public void onClick(View arg0) {
				Intent intent=new Intent();
				intent.setClass(MainActivity.this, AnotherActivity.class);
				MainActivity.this.startActivityForResult(intent, REQUEST_CODE);
			}
        	
        });
        
    }
    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
    	// TODO Auto-generated method stub
    	super.onActivityResult(requestCode, resultCode, data);
    	if(requestCode==REQUEST_CODE&&resultCode==this.RESULT_OK){
    		showTextView.setText(this.getString(R.string.showTextView)+":"+data.getStringExtra("name"));
    	}
    	
   
    	
    }
    


}
