package io.github.sunxu3074.shoppoingdemo.mvp.base;

public interface ICallBack<T> {

    void onCallback(T t);

    void onError(String errorMessage);

}
