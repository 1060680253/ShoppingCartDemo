package io.github.sunxu3074.shoppoingdemo.http;

import io.github.sunxu3074.shoppoingdemo.Entity.weather.WeatherData;
import io.reactivex.Observable;
import retrofit2.http.GET;
import retrofit2.http.Path;

public interface ApiService {

    @GET("http://t.weather.sojson.com/api/weather/city/{cityCode}")
    Observable<WeatherData> getRecentFiveDayWeatherData(@Path("cityCode") String code);
}
