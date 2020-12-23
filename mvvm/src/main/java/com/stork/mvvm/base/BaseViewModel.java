package com.stork.mvvm.base;

import android.app.Application;

import androidx.annotation.NonNull;
import androidx.lifecycle.AndroidViewModel;

/**
 * function:
 * author:xiaojun li
 * data:2020/12/23
 * email:603820467@qq.com
 */
public class BaseViewModel extends AndroidViewModel {

    public BaseViewModel(@NonNull Application application) {
        super(application);
    }

    //初始化
    protected void init(){

    }

    //通过LiveData通知观察者的特性,将公共的对Activity的操作放在这儿处理


}
