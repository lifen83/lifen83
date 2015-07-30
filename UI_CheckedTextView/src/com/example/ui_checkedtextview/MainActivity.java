package com.example.ui_checkedtextview;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.CheckedTextView;

public class MainActivity extends Activity {

	CheckedTextView checkedTextView1, checkedTextView2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        checkedTextView1=(CheckedTextView) this.findViewById(R.id.checkedTextView1);
        checkedTextView2=(CheckedTextView) this.findViewById(R.id.checkedTextView1);
        this.checkedTextView1.setOnClickListener(new ClickDemo());
    }

    class ClickDemo implements OnClickListener{

		@Override
		public void onClick(View arg0) {
			if(arg0.getId()==R.id.checkedTextView1){
				checkedTextView1.toggle();
			}
			
		}
    	
    }
   
}
