package com.example.activity_persistantsave;

import android.os.Bundle;
import android.app.Activity;
import android.content.SharedPreferences;
import android.util.Log;
import android.view.Menu;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends Activity {

	EditText editText;
    @Override
	protected void onPause() {
		super.onPause();
		Log.d("test", "onPause Call");
		SharedPreferences mySharedPreferences=this.getSharedPreferences("test", Activity.MODE_PRIVATE);
		SharedPreferences.Editor editor=mySharedPreferences.edit();
		editor.putString("input",editText.getText().toString());
		editor.commit();
		Toast.makeText(this,"输入文本内容已经保存",Toast.LENGTH_LONG).show();
		
	}

	@Override
	protected void onResume() {
		super.onResume();
		Log.d("test", "onResume Call");
		SharedPreferences mySharedPreferences=this.getSharedPreferences("test", Activity.MODE_PRIVATE);
		String input=mySharedPreferences.getString("input", "");
		editText.setText(input);
		
	}

	@Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        editText=(EditText) this.findViewById(R.id.editText);
        
    }


  
    
}
