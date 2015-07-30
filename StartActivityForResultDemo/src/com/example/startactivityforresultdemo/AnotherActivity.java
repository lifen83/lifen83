package com.example.startactivityforresultdemo;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class AnotherActivity extends Activity {

	
	Button btnButton2;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		this.setContentView(R.layout.activity_another);
		btnButton2 = (Button) this.findViewById(R.id.btnButton2);

		btnButton2.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View arg0) {
				Intent intent = new Intent();
				intent.putExtra("name", "tom");
				AnotherActivity.this.setResult(RESULT_OK, intent);
				AnotherActivity.this.finish();//销毁当前界面Activity，通知系统回调OnActivityResult方法
			}

		});
	}

}
