package com.segmentfault.hackathon;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.huahuacaocao.hhcc_common.base.BaseActivity;

public class MainActivity extends BaseActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_aaa);
        initTitleBar();
        initView();
        initEvent();
        initData();
    }

    /**
     * 初始化titlebar
     */
    private void initTitleBar() {
        setTitleBarPadding(findViewById(R.id.title_bar));
        // 设置返回按钮
        findViewById(R.id.title_bar_return).setOnClickListener(
                new View.OnClickListener() {

                    @Override
                    public void onClick(View v) {
                        finish();
                    }
                });
        // 设置Title
        ((TextView) findViewById(R.id.title_bar_title)).setText("title");

        // 设置返回按钮
        ImageView titlebar_iv_more= (ImageView) findViewById(R.id.title_bar_more);
        titlebar_iv_more.setVisibility(View.VISIBLE);
        titlebar_iv_more.setOnClickListener(
                new View.OnClickListener() {

                    @Override
                    public void onClick(View v) {
                        finish();
                    }
                });
    }

    /**
     * 初始化view
     */
    private void initView() {

    }

    /**
     * 初始化事件
     */
    private void initEvent() {

    }

    /**
     *  初始化数据
     */
    private void initData() {

    }



}
