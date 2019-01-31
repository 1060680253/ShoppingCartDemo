package io.github.sunxu3074.shoppoingdemo.mvp.contract;

import java.util.List;

import io.github.sunxu3074.shoppoingdemo.Entity.CategoryEntity;
import io.github.sunxu3074.shoppoingdemo.Entity.weather.WeatherData;
import io.github.sunxu3074.shoppoingdemo.mvp.base.ICallBack;
import io.github.sunxu3074.shoppoingdemo.mvp.base.IMode;
import io.github.sunxu3074.shoppoingdemo.mvp.base.IView;
import io.reactivex.Observable;

public interface ProductContract {

    interface IProductView extends IView{
        void onProductList(List<CategoryEntity> categoryEntities);

        void onError(String message);

        void onGetWeatherData(WeatherData weatherData);
    }

    interface IProductModel extends IMode{
        void getProductList(int page, ICallBack<List<CategoryEntity>> callBack);

        Observable<WeatherData> getWeatherData(String cityCode);
    }

}


