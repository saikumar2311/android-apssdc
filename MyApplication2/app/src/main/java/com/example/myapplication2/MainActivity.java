package com.example.myapplication2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onStart() {
        super.onStart();
        Log.i("APSSDC","First Activity Started");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.i("APSSDC","First Activity Resumed");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.i("APSSDC","First Activity Paused");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.i("APSSDC","First Activity Stopped");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.i("APSSDC","First Activity Restarted");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();

        Log.i("APSSDC","First Activity Destroyed");
    }

    public void save(View view) {
    }
}