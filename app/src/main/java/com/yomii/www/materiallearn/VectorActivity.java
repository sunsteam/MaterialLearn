package com.yomii.www.materiallearn;

import android.os.Build;
import android.os.Bundle;
import android.support.annotation.Nullable;

/**
 * Created by Yomii on 2017/2/7.
 */

public class VectorActivity extends BaseActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_vector);
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
            setupEnterAnim();
        }
    }
}
