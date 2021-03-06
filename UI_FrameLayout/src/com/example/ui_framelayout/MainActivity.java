package com.example.ui_framelayout;

import android.os.Bundle;
import android.os.Handler;
import android.app.Activity;
import android.view.Menu;
import android.view.View;

public class MainActivity extends Activity implements Runnable{

	private View[] views;
	private int colorPointer=0;
	private Handler handler;
	private int[] colors=new int[]{0xffff0000,0xff00ff00,0xff0000ff,0xffff00ff,0xff00ffff};
	private int[] nextColorPointers=new int[]{1,2,3,4,0};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_frame);
        views=new View[]{this.findViewById(R.id.textview5),this.findViewById(R.id.textview4),
        		this.findViewById(R.id.textview3),this.findViewById(R.id.textview2),
        		this.findViewById(R.id.textview1)};
        handler=new Handler();
        handler.postDelayed(this, 300);
        
        
        
        
    }
	@Override
	public void run() {
		int nextColorPointer=this.colorPointer;
		for(int i=views.length-1;i>=0;i--){
			views[i].setBackgroundColor(this.colors[nextColorPointer]);
			nextColorPointer=nextColorPointers[nextColorPointer];
			
		}
		this.colorPointer++;
		if(this.colorPointer==5)
			this.colorPointer=0;
		handler.postDelayed(this, 300);
		
	}


  
    
}
