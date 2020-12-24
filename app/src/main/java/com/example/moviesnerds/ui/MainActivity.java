package com.example.moviesnerds.ui;

import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;
import androidx.lifecycle.ViewModelProvider;

import com.example.moviesnerds.R;
import com.example.moviesnerds.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    MovieViewModel movieViewModel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        ActivityMainBinding binding = DataBindingUtil.setContentView(this, R.layout.activity_main);

        movieViewModel = new ViewModelProvider(this).get(MovieViewModel.class);

        binding.setViewModel(movieViewModel);
        binding.setLifecycleOwner(this);
    }
}