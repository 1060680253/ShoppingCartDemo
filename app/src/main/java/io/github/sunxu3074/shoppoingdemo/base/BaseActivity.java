package io.github.sunxu3074.shoppoingdemo.base;

import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.support.v7.app.ActionBar;
import android.support.v7.app.ActionBarActivity;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;

import io.github.sunxu3074.shoppoingdemo.R;
import io.github.sunxu3074.shoppoingdemo.mvp.base.BasePresenter;

public abstract class BaseActivity<P extends BasePresenter> extends AppCompatActivity {

    private static final int ACTIONBAR_BACKGROUND = R.color.actionbar_background;

    protected P mPresenter;

    protected P createPresenter(){
        return null;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mPresenter = createPresenter();
        if (mPresenter == null) {
            throw new NullPointerException("Presenter is null! Do you return null in createPresenter()?");
        }
        setContentView(R.layout.activity_base);

        initActionBar();

    }

    private void initActionBar() {

        ActionBar actionBar = getSupportActionBar();
        actionBar.setBackgroundDrawable(new ColorDrawable(ACTIONBAR_BACKGROUND));
        //google的actionbar是分为上下两栏显示的，上面的代码只能设置顶部actionbar的背景色，
        //为了让下面的背景色一致，还需要添加一行代码：
        actionBar.setSplitBackgroundDrawable(new ColorDrawable(ACTIONBAR_BACKGROUND));
    }


}
