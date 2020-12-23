package com.stork.mvvm.base;

import android.os.Bundle;

import androidx.annotation.LayoutRes;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;

/**
 * function:
 * author:xiaojun li
 * data:2020/12/23
 * email:603820467@qq.com
 */
public abstract class BaseMvvmActivity<T extends ViewDataBinding,VM extends BaseViewModel> extends AppCompatActivity {

    protected T binding;
    protected VM viewModel;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = DataBindingUtil.setContentView(this,getLayoutID());
        setLiveDataScope();
        //设置本身View的ViewModel
        viewModel = getViewModel();
        //将ViewModel设置到本数据绑定类
        binding.setVariable(getBRviewmodelID(),viewModel);
        //调用model的初始化
        viewModel.init();
        init();
    }

    protected void init(){

    }

    private void setLiveDataScope(){
        binding.setLifecycleOwner(this);
    }

    protected abstract int getBRviewmodelID();

    protected abstract VM getViewModel();

    @LayoutRes
    protected abstract int getLayoutID();



}
