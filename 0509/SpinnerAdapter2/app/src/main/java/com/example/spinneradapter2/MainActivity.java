package com.example.spinneradapter2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Spinner;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private Spinner drinks,temp;
    private TextView txv;
    private String[] tempSet1 = {"冰","去冰","溫"};
    private String[] tempSet2 = {"冰","去冰"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txv = (TextView) findViewById(R.id.order);
        temp = (Spinner) findViewById(R.id.temp);
        drinks = (Spinner) findViewById(R.id.drink);
    }
}