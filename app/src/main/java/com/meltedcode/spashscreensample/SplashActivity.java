package com.meltedcode.spashscreensample;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class SplashActivity extends AppCompatActivity {

    private Handler handler = null;
    private long SPLASH_TIMEOUT = 5000;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
        handler = new Handler();
    }

    private Runnable splashRunnable = new Runnable() {
        @Override
        public void run() {
            Intent mySuperIntent = new Intent(SplashActivity.this, SplashActivity1.class);
            startActivity(mySuperIntent);
            finish();
        }
    };

    @Override
    protected void onPause() {
        super.onPause();
        handler.removeCallbacks(splashRunnable);
    }

    @Override
    protected void onResume() {
        super.onResume();
        handler.postDelayed(splashRunnable, SPLASH_TIMEOUT);

    }
}
