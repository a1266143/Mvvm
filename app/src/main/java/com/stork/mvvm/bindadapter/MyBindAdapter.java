package com.stork.mvvm.bindadapter;

import android.text.Editable;
import android.text.TextWatcher;
import android.widget.EditText;

import androidx.databinding.BindingAdapter;

import com.stork.mvvm.command.Command;

/**
 * function:
 * author:xiaojun li
 * data:2020/12/23
 * email:603820467@qq.com
 */
public class MyBindAdapter {

    @BindingAdapter("textWatcher")
    public static void textWatcher(EditText editText, Command<String> command){
        if (command == null)
            return;
        editText.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {

            }

            @Override
            public void afterTextChanged(Editable s) {
                command.execute(s.toString());
            }
        });
    }

}
