package io.github.sunxu3074.shoppoingdemo.mvp.presenter;

import java.util.List;

import io.github.sunxu3074.shoppoingdemo.Entity.CategoryEntity;
import io.github.sunxu3074.shoppoingdemo.Entity.weather.WeatherData;
import io.github.sunxu3074.shoppoingdemo.mvp.base.BasePresenter;
import io.github.sunxu3074.shoppoingdemo.mvp.base.ICallBack;
import io.github.sunxu3074.shoppoingdemo.mvp.contract.ProductContract;
import io.github.sunxu3074.shoppoingdemo.mvp.model.ProductModel;
import io.reactivex.Observer;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.Consumer;
import io.reactivex.schedulers.Schedulers;

public class ProductPresenter extends BasePresenter<ProductContract.IProductModel,ProductContract.IProductView> {


    public ProductPresenter(ProductContract.IProductView view) {
        super(new ProductModel(), view);
    }

    public void getProductList(int page){
        mIModel.getProductList(page, new ICallBack<List<CategoryEntity>>() {
            @Override
            public void onCallback(List<CategoryEntity> categoryEntities) {
                mRootView.onProductList(categoryEntities);
            }

            @Override
            public void onError(String errorMessage) {
                mRootView.onError(errorMessage);
            }
        });
    }

    public void getWeatherData(String cityCode){
        mIModel.getWeatherData(cityCode)
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(new Observer<WeatherData>() {
                    @Override
                    public void onSubscribe(Disposable d) {

                    }

                    @Override
                    public void onNext(WeatherData weatherData) {
                        mRootView.onGetWeatherData(weatherData);
                    }

                    @Override
                    public void onError(Throwable e) {
                        mRootView.onError(e.getMessage());
                    }

                    @Override
                    public void onComplete() {

                    }
                });
    }

}
