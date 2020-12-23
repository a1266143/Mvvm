package com.stork.mvvm.command;

/**
 * function:
 * author:xiaojun li
 * data:2020/12/23
 * email:603820467@qq.com
 */
public interface Command<T> {
    void execute(T data);
}
