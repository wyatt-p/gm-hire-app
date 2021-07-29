package com.wparo.gmhireapp;

import androidx.viewbinding.ViewBinding;

import android.os.Bundle;

import com.wparo.core_lib.ui.BaseBindingActivity;
import com.wparo.gmhireapp.databinding.ActivityMainBinding;

public class MainActivity extends BaseBindingActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    protected ViewBinding getViewBinding() {
        return ActivityMainBinding.inflate(getLayoutInflater());
    }
}