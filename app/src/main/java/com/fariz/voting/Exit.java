package com.fariz.voting;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

public class Exit extends AppCompatActivity {

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        finish();
        System.exit(0);
    }
}
