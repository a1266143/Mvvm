package com.stork.mvvm.viewmodel;

import android.app.Application;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.lifecycle.MutableLiveData;

import com.stork.mvvm.base.BaseViewModel;
import com.stork.mvvm.command.Command;

/**
 * function:
 * author:xiaojun li
 * data:2020/12/23
 * email:603820467@qq.com
 */
public class MainViewModel extends BaseViewModel {

    //标题
    public MutableLiveData<String> title = new MutableLiveData<>();

    public MainViewModel(@NonNull Application application) {
        super(application);
    }

    @Override
    protected void init() {
//        title.setValue("初始化的时候设置文本");
    }

    //按钮1点击
    public void btn1(){
        Toast.makeText(getApplication(),"点击了按钮1",Toast.LENGTH_SHORT).show();
    }
    //EditText改变
    public Command<String> commandEdt = new Command<String>() {
        @Override
        public void execute(String data) {
            title.setValue(data);
        }
    };

}
