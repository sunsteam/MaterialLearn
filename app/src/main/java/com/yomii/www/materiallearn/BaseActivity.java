package com.yomii.www.materiallearn;

import android.content.Intent;
import android.os.Build;
import android.support.annotation.RequiresApi;
import android.support.v4.app.ActivityOptionsCompat;
import android.support.v7.app.AppCompatActivity;
import android.transition.Explode;
import android.transition.Slide;
import android.transition.Visibility;

/**
 * Created by Yomii on 2017/2/7.
 */

public class BaseActivity extends AppCompatActivity {


    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    protected void setupExitAnim() {
        Visibility visibility = new Slide();
        visibility.setDuration(300);
        getWindow().setExitTransition(visibility);
    }

    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    protected void setupEnterAnim() {
        Visibility visibility = new Explode();
        visibility.setDuration(300);
        getWindow().setEnterTransition(visibility);
    }

    protected void transitionTo(Intent intent) {
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.JELLY_BEAN) {
            ActivityOptionsCompat option = ActivityOptionsCompat.makeSceneTransitionAnimation(this);
            startActivity(intent, option.toBundle());
        } else {
            startActivity(intent);
        }
    }
}
