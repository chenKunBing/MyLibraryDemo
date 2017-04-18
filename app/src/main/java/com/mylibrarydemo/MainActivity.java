package com.mylibrarydemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.ckb_test_library.LibraryUtil;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        LibraryUtil.testString();
    }
}
