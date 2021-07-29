package com.wparo.core_lib.ui;

import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;

public abstract class BaseBindingActivity extends BaseActivity {
    protected ViewBinding binding;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        try {
            binding = getViewBinding();
            setContentView(binding.getRoot());
        } catch (IllegalArgumentException notABindingLayoutException) {
            //nop
        }
    }
}