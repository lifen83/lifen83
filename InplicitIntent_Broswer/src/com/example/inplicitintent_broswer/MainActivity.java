package com.example.inplicitintent_broswer;

import android.net.Uri;
import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class MainActivity extends Activity {

	Button btnButton1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnButton1=(Button) this.findViewById(R.id.btnButton1);
        
        btnButton1.setOnClickListener(new OnClickListener(){

			@Override
			public void onClick(View arg0) {
				Intent intent=new Intent();
				intent.setAction(Intent.ACTION_VIEW);
				intent.setData(Uri.parse("http://www.baidu.com"));
				if(intent.resolveActivity(getPackageManager())!=null){
					MainActivity.this.startActivity(Intent.createChooser(intent, "请选择一个浏览器"));
				}
				
			}
        	
        });
    }


    
}
