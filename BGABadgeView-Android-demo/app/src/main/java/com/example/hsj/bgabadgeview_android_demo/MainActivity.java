package com.example.hsj.bgabadgeview_android_demo;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.allenliu.badgeview.BadgeFactory;
import com.allenliu.badgeview.BadgeView;

import q.rorbin.badgeview.Badge;
import q.rorbin.badgeview.QBadgeView;

public class MainActivity extends AppCompatActivity {
    private TextView tv;
    private ImageView iv;

    private TextView tv_1;
    private ImageView iv_1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tv = findViewById(R.id.textBadge);
        iv = findViewById(R.id.buttonBadge);
        tv_1 = findViewById(R.id.textBadge_1);
        iv_1 = findViewById(R.id.buttonBadge_1);
        BadgeFactory.create(this)
                .setTextColor(Color.WHITE)
                .setWidthAndHeight(25,25)
                .setBadgeBackground(Color.RED)
                .setTextSize(10)
                .setBadgeGravity(Gravity.RIGHT| Gravity.TOP)
                .setBadgeCount(20)
                .setShape(BadgeView.SHAPE_CIRCLE)
                .setSpace(10,10)
                .bind(tv);

        BadgeFactory.create(this)
                .setTextColor(Color.WHITE)
                .setWidthAndHeight(25,25)
                .setBadgeBackground(Color.RED)
                .setTextSize(10)
                .setBadgeGravity(Gravity.RIGHT| Gravity.TOP)
                .setBadgeCount(20)
                .setShape(BadgeView.SHAPE_CIRCLE)
                .setSpace(10,10)
                .bind(iv);

        new QBadgeView(this)
                .bindTarget(tv_1)
                .setBadgeNumber(5)
                .setBadgeGravity(Gravity.END | Gravity.TOP)
                .setGravityOffset(-3,-3,true)
                .setOnDragStateChangedListener(new Badge.OnDragStateChangedListener() {
                        @Override
                        public void onDragStateChanged(int dragState, Badge badge, View targetView) {

                         }
                 });
        new QBadgeView(this)
                .bindTarget(iv_1)
                .setBadgeNumber(5)
                .setBadgeGravity(Gravity.END | Gravity.TOP)
                .setGravityOffset(-3,-3,true)
                .setOnDragStateChangedListener(new Badge.OnDragStateChangedListener() {
                    @Override
                    public void onDragStateChanged(int dragState, Badge badge, View targetView) {

                    }
                });
    }
}
