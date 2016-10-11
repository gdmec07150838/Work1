package com.example.wengzipeng.work1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d("work1","我启动了");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d("work2","麻痹，有人加塞");
    }

    @Override
    protected void onPostResume() {
        super.onPostResume();
        Log.d("work2","我要现身了");
    }
    @Override
    protected void onPause() {
        super.onPause();
        Log.d("work2","onPause任务执行");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d("work2","onRestart任务执行");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
    Log.d("work","onDestory任务执行");
    }

}
