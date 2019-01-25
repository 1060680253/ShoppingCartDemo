package io.github.sunxu3074.shoppoingdemo.mvp.presenter;

import java.util.List;

import io.github.sunxu3074.shoppoingdemo.Entity.CategoryEntity;
import io.github.sunxu3074.shoppoingdemo.mvp.base.BasePresenter;
import io.github.sunxu3074.shoppoingdemo.mvp.base.ICallBack;
import io.github.sunxu3074.shoppoingdemo.mvp.contract.ProductContract;
import io.github.sunxu3074.shoppoingdemo.mvp.model.ProductModel;

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

}
