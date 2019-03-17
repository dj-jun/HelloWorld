package com.example.administrator.helloworld;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {
    private static final String TAG = "MainActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.i(TAG,"调用onCreate()");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.i(TAG,"调用onStart()");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.i(TAG,"调用onResume()");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.i(TAG,"调用onRestart()");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.i(TAG,"调用onPause()");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.i(TAG,"调用onStop()");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.i(TAG,"调用onDestroy()");
    }


}
