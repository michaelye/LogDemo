package com.michael.debugdemo;

import com.michael.debug.MyLog;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class MainActivity extends BaseActivity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        
//    	private String TAG = "MainActivity";//这句可以不用了
    	super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        Button btn = (Button)findViewById(R.id.btn_to_another_activity);
        btn.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {

				MyLog.d(TAG, "jump to another activity!");//这里的TAG就不需要再进行定义了
				
				Intent intent = new Intent();
		        intent.setClass(MainActivity.this, AnotherActivity.class);
		        startActivity(intent);
			}
		});
        
        
    }

    
}
