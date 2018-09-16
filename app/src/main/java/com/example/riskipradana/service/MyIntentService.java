package com.example.riskipradana.service;

import android.app.IntentService;
import android.content.Intent;
import android.util.Log;

public class MyIntentService extends IntentService {

    public static String EXTRA_DURATION = "extra_duration";
    public static final String TAG = "MyIntentService";

    public MyIntentService() {
        super("MyIntentService");
    }

    //the following method started on separated Thread and Asynchronous
    @Override
    protected void onHandleIntent(Intent intent) {

        Log.d(TAG, "onHandleIntent()");

        if (intent != null) {
           int duration = intent.getIntExtra(EXTRA_DURATION, 0);
           try {
               Thread.sleep(duration);
           }catch (InterruptedException e){
               e.printStackTrace();
           }
        }
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        Log.d(TAG, "onDestroy()");
    }
}
