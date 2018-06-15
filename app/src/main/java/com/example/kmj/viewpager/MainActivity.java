package com.example.kmj.viewpager;

import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {
ViewPager pager;
pageAdapter mAdapter;
TabLayout tab;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        pager = findViewById(R.id.pager);
        mAdapter = new pageAdapter(getSupportFragmentManager());
        pager.setAdapter(mAdapter);
        tab= findViewById(R.id.tab);
        mAdapter=new pageAdapter(getSupportFragmentManager());
        pager.setAdapter(mAdapter);

        tab.addTab(tab.newTab().setText("1"));
        tab.addTab(tab.newTab().setText("2"));
        tab.addTab(tab.newTab().setText("3"));

        pager.addOnPageChangeListener(new TabLayout.TabLayoutOnPageChangeListener(tab));
        tab.setOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {
                pager.setCurrentItem(tab.getPosition());
            }

            @Override
            public void onTabUnselected(TabLayout.Tab tab) {

            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {

            }
        });
    }
}
