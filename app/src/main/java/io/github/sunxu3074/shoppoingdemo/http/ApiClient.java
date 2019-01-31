package io.github.sunxu3074.shoppoingdemo.http;

import okhttp3.OkHttpClient;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class ApiClient {

    private ApiClient(){}
    public static ApiClient client;
    private static  ApiService apiService;
    static {
        Retrofit retrofit = new Retrofit
                .Builder()
                .baseUrl("http://ds.api.jinmigj.com/")
                .client(new OkHttpClient())
                .addConverterFactory( GsonConverterFactory.create())
                .build();
        apiService = retrofit.create(ApiService.class);
    }
    public static ApiService getApiService(){
        if(client==null){
            synchronized (ApiClient.class){
                if(client==null){
                    client = new ApiClient();
                }
            }
        }
        return apiService;
    }

}
