package com.example.btnwiinnerclass;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    Button mbutton1;
    TextView mTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mbutton1 = findViewById(R.id.button1);
        mTextView = findViewById(R.id.textView1);


        mbutton1.setOnClickListener(new MyOnCilckListener());
    }
    private class MyOnCilckListener implements View.OnClickListener {
        @Override
        public void onClick(View v) {
            mTextView.setText("You Clickes button 1");
        }
    }
}