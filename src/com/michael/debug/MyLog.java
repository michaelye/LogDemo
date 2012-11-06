package com.michael.debug;

import android.util.Log;

/**
 * 自定义的Log类
 * API地址：
 * http://developer.android.com/reference/android/util/Log.html
 * 
 * 
 * 
 */

public class MyLog {

	public static final boolean isDebug = true;//这里控制所有Log的显示情况

	public static void e(String tag, String message) {
		e(tag, message, null);
	}

	public static void e(String tag, String message, Throwable t) {
		if (isDebug)
			Log.e(tag, message, t);
	}

	public static void v(String tag, String message) {
		v(tag, message, null);
	}

	public static void v(String tag, String message, Throwable t) {
		if (isDebug)
			Log.v(tag, message, t);
	}

	public static void i(String tag, String message) {
		i(tag, message, null);
	}

	public static void i(String tag, String message, Throwable t) {
		if (isDebug)
			Log.i(tag, message, t);
	}

	public static void d(String tag, String message) {
		d(tag, message, null);
	}

	public static void d(String tag, String message, Throwable t) {
		if (isDebug)
			Log.d(tag, message, t);
	}

	public static void w(String tag, String message) {
		w(tag, message, null);
	}

	public static void w(String tag, String message, Throwable t) {
		if (isDebug)
			Log.w(tag, message, t);
	}
}
