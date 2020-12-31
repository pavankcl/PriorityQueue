package com.example.priorityqueue;

import android.os.Bundle;
import android.util.Log;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
     private static String a = "list";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        PriorQueue p = new PriorQueue();
        p.push(2,5);
        p.push(1,6);
        p.push(3,9);
        p.pop();
        //p.list();
       Log.d(a, "list"+p.list());
    }
}