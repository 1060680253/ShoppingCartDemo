package io.github.sunxu3074.shoppoingdemo.mvp.base;

public class BasePresenter<M extends IMode, V extends IView> {

    protected M mIModel;

    protected V mRootView;

    private BasePresenter(){

    }

    public BasePresenter(M iMode,V view){
        this.mIModel = iMode;
        this.mRootView = view;
    }




}
