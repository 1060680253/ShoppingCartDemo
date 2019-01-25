package io.github.sunxu3074.shoppoingdemo.mvp.model;

import java.util.ArrayList;
import java.util.List;

import io.github.sunxu3074.shoppoingdemo.Entity.CategoryEntity;
import io.github.sunxu3074.shoppoingdemo.mvp.base.ICallBack;
import io.github.sunxu3074.shoppoingdemo.mvp.contract.ProductContract;

public class ProductModel implements ProductContract.IProductModel {

    @Override
    public void getProductList(int page, ICallBack<List<CategoryEntity>> callBack) {
        try {
            List<CategoryEntity> mDatas = new ArrayList<>();
            mDatas.add(new CategoryEntity("保健产品", "1",
                    "作用范围：失眠，神经衰弱，神经紧张的人，气血循环不良，体虚呆滞者，四肢麻痹，腰酸背痛之人士，肠胃功能不佳，消化不良之人士，运动不足，年长体弱，手脚冰冷者",
                    "000001", 1000, 159));
            mDatas.add(new CategoryEntity("丸剂", "2",
                    "免疫调节作用，延缓衰老作用，改变记忆作用，促进生长发育作用，抗疲劳作用，减肥作用，抑制肿瘤作用", "000002", 1000, 159));
            mDatas.add(new CategoryEntity("书籍", "3",
                    "八卦象素的配方及应用、拔罐疗法，不生病的智慧，科普从头到脚说健康，养心的妙药", "000003", 1000, 159));
            callBack.onCallback(mDatas);
        }catch (Exception e){
            callBack.onError(e.getMessage());
        }
    }
}
