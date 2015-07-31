package com.example.ui_radiobutton;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.widget.CompoundButton;
import android.widget.CompoundButton.OnCheckedChangeListener;
import android.widget.RadioButton;
import android.widget.Toast;

public class MainActivity extends Activity {

	
	RadioButton radioButton1;
	RadioButton radioButton2;
	RadioButton radioButton3;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		radioButton1=(RadioButton) this.findViewById(R.id.radioButton1);
		radioButton2=(RadioButton) this.findViewById(R.id.radioButton2);
		radioButton3=(RadioButton) this.findViewById(R.id.radioButton3);
		
		this.radioButton1.setOnCheckedChangeListener(new OnCheckedChangeListenerDemo() );
		this.radioButton2.setOnCheckedChangeListener(new OnCheckedChangeListenerDemo() );
		this.radioButton3.setOnCheckedChangeListener(new OnCheckedChangeListenerDemo() );
	}

	class OnCheckedChangeListenerDemo implements OnCheckedChangeListener{

		@Override
		public void onCheckedChanged(CompoundButton arg0, boolean arg1) {
			switch (arg0.getId()) {
            case R.id.radioButton1:
                Toast.makeText(MainActivity.this,
                        "单选按钮1", Toast.LENGTH_SHORT)
                        .show();
                break;
            case R.id.radioButton2:
                Toast.makeText(MainActivity.this,
                		"单选按钮2", Toast.LENGTH_SHORT)
                        .show();
                break;
            case R.id.radioButton3:
                Toast.makeText(MainActivity.this,
                		"单选按钮3", Toast.LENGTH_SHORT)
                        .show();
                break;
            default:
                break;

			
		}
		
	}
	}
}
