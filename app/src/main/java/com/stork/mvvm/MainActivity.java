package com.stork.mvvm;

import androidx.lifecycle.ViewModelProvider;


import com.stork.mvvm.base.BaseMvvmActivity;
import com.stork.mvvm.databinding.ActivityMainBinding;
import com.stork.mvvm.viewmodel.MainViewModel;


public class MainActivity extends BaseMvvmActivity<ActivityMainBinding, MainViewModel> {

    @Override
    protected int getBRviewmodelID() {
        return BR.viewmodel;
    }

    @Override
    protected MainViewModel getViewModel() {
        return new ViewModelProvider.AndroidViewModelFactory(getApplication()).create(MainViewModel.class);
    }

    @Override
    protected int getLayoutID() {
        return R.layout.activity_main;
    }
}