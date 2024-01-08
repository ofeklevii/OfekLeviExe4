package com.example.ofekleviexe4;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    private Button btn;
    int sum = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void exe4(View view) {
        sum++;
        btn.setText("This is a click number:" + sum);
        if (sum%7==0)
            btn.setText("BOOM!");
    }
}