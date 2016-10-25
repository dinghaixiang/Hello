package com.example.beck.hello;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private TextView result;
    static {
        System.loadLibrary("hello");
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        result= (TextView) findViewById(R.id.result);
        Hello hello = new Hello();
        Log.d("result--------",hello.getString());
        result.setText(hello.getString());
    }
}
