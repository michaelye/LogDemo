package com.michael.debugdemo;

import com.michael.debug.MyLog;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;


/**
 * 基类
 * 
 * 
 * */
public class BaseActivity extends Activity{

	protected String TAG = BaseActivity.this.getClass().getName();
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {

		super.onCreate(savedInstanceState);

//		requestWindowFeature(Window.FEATURE_NO_TITLE);//设置无标题
		MyLog.v(TAG, "onCreate");
		
	}
	
	@Override
	public void onStart() {
		super.onStart();

		MyLog.v(TAG, "onStart");

	}

	@Override
	protected void onResume() {

		super.onResume();
		MyLog.v(TAG, "onResume");

	}
	
	@Override
	public void onAttachedToWindow() {
		super.onAttachedToWindow();

		MyLog.v(TAG, "onAttachedToWindow");

	}
	
	@Override
	protected void onPause() {
		super.onPause();

		MyLog.v(TAG, "onPause");

	}
	
	@Override
	public void onStop() {
		super.onStart();

		MyLog.v(TAG, "onStop");

	}
	
	@Override
	protected void onDestroy() {
		// TODO Auto-generated method stub
		super.onDestroy();

		MyLog.v(TAG, "onDestroy");
	}

	
	@Override
	protected void onActivityResult(int requestCode, int resultCode, Intent data) {
		super.onActivityResult(requestCode, resultCode, data);
		MyLog.v(TAG, "requestCode:" + requestCode + ",resultCode:"
				+ resultCode + ",data:" + data);
	}

	@Override
	protected void onRestoreInstanceState(Bundle inState) {
		MyLog.v(TAG, "onRestoreInstanceState");
		super.onRestoreInstanceState(inState);

	}

	@Override
	protected void onSaveInstanceState(Bundle outState) {
		MyLog.v(TAG, "onSaveInstanceState");
		super.onSaveInstanceState(outState);

	}
	
	
}
