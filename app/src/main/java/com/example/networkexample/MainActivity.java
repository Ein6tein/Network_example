package com.example.networkexample;

import android.os.Bundle;

import com.example.networkexample.viewmodel.MyViewModelFactory;

import javax.inject.Inject;

import dagger.android.AndroidInjection;
import dagger.android.support.DaggerAppCompatActivity;

public class MainActivity extends DaggerAppCompatActivity {

    @Inject MyViewModelFactory mViewModelFactory;

    @Override protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        AndroidInjection.inject(this);
    }
}
