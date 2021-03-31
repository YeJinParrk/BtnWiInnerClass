package com.example.btnwiinnerclass;

import android.view.View;

public class MyOnCilckListener implements View.OnClickListener {
    MainActivity mainActivity;
    public MyOnCilckListener(MainActivity mainActivity) {
        this.mainActivity = mainActivity;
    }

    @Override
    public void onClick(View v) {
        mainActivity.mTextView.setText("You clicked button1");
    }
}
