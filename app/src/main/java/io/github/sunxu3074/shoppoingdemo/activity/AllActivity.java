package io.github.sunxu3074.shoppoingdemo.activity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

import io.github.sunxu3074.shoppoingdemo.Entity.CategoryEntity;
import io.github.sunxu3074.shoppoingdemo.Entity.weather.WeatherData;
import io.github.sunxu3074.shoppoingdemo.R;
import io.github.sunxu3074.shoppoingdemo.adapter.CategoryAdapter;
import io.github.sunxu3074.shoppoingdemo.base.BaseActivity;
import io.github.sunxu3074.shoppoingdemo.consts.ConstUtils;
import io.github.sunxu3074.shoppoingdemo.mvp.base.BasePresenter;
import io.github.sunxu3074.shoppoingdemo.mvp.contract.ProductContract;
import io.github.sunxu3074.shoppoingdemo.mvp.presenter.ProductPresenter;

public class AllActivity extends BaseActivity<ProductPresenter> implements ProductContract.IProductView {

    private ListView mListView;
    private List<CategoryEntity> mDatas = new ArrayList<>();
    private CategoryAdapter mAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_all);

        initViews();
        initData();
        addListeners();
        mPresenter.getWeatherData("101030100");
    }

    @Override
    public void onGetWeatherData(WeatherData weatherData) {
        Toast.makeText(this,weatherData.getGanmao(),Toast.LENGTH_SHORT).show();
    }

    private void addListeners() {

        mListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent intent = new Intent(AllActivity.this, CategoryDetailsActivity.class);
                intent.putExtra(ConstUtils.ALLACTIVITY_KEY_POSITION, position);
                startActivity(intent);
            }
        });
    }

    private void initData() { /* 构造假数据*/
//        mDatas.add(new CategoryEntity("保健产品", "1",
//                "作用范围：失眠，神经衰弱，神经紧张的人，气血循环不良，体虚呆滞者，四肢麻痹，腰酸背痛之人士，肠胃功能不佳，消化不良之人士，运动不足，年长体弱，手脚冰冷者",
//                "000001", 1000, 159));
//        mDatas.add(new CategoryEntity("丸剂", "2",
//                "免疫调节作用，延缓衰老作用，改变记忆作用，促进生长发育作用，抗疲劳作用，减肥作用，抑制肿瘤作用", "000002", 1000, 159));
//        mDatas.add(new CategoryEntity("书籍", "3",
//                "八卦象素的配方及应用、拔罐疗法，不生病的智慧，科普从头到脚说健康，养心的妙药", "000003", 1000, 159));
//
//
//        mAdapter = new CategoryAdapter(this, mDatas);
        mAdapter = new CategoryAdapter(this);
        mListView.setAdapter(mAdapter);
        mPresenter.getProductList(0);

    }

    @Override
    public void onProductList(List<CategoryEntity> categoryEntities) {
        mAdapter.setNewData(categoryEntities);
    }

    @Override
    protected ProductPresenter createPresenter() {
        return new ProductPresenter(this);
    }

    @Override
    public void onError(String message) {

    }

    private void initViews() {

        mListView = (ListView) findViewById(R.id.all_lv);
    }

}
