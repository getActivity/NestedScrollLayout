package com.hjq.nested.scroll.demo;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;

import com.aurelhubert.ahbottomnavigation.AHBottomNavigation;
import com.aurelhubert.ahbottomnavigation.AHBottomNavigationItem;
import com.hjq.nested.scroll.demo.fragment.FrameLayoutFragment;
import com.hjq.nested.scroll.demo.fragment.LinearLayoutFragment;
import com.hjq.nested.scroll.demo.fragment.RelativeLayoutFragment;
import com.hjq.nested.scroll.demo.fragment.WebViewFragment;
import com.hjq.nested.scroll.layout.NestedScrollFrameLayout;
import com.hjq.nested.scroll.layout.NestedScrollLinearLayout;
import com.hjq.nested.scroll.layout.NestedScrollRelativeLayout;
import com.hjq.nested.scroll.layout.NestedScrollWebView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private Toolbar mToolbar;
    private AHBottomNavigation mBottomNavigationView;
    private ViewPager mViewPager;

    private final List<Fragment> mFragmentSet = new ArrayList<>();
    private final List<String> mFragmentTitleSet = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mToolbar = findViewById(R.id.tb_main_toolbar);
        mViewPager = findViewById(R.id.ahb_main_pager);
        mBottomNavigationView = findViewById(R.id.ahb_main_navigation);

        mBottomNavigationView.addItem(new AHBottomNavigationItem("WebView", R.drawable.ic_android));
        mBottomNavigationView.addItem(new AHBottomNavigationItem("LinearLayout", R.drawable.ic_android));
        mBottomNavigationView.addItem(new AHBottomNavigationItem("FrameLayout", R.drawable.ic_android));
        mBottomNavigationView.addItem(new AHBottomNavigationItem("RelativeLayout", R.drawable.ic_android));

        mFragmentSet.add(new WebViewFragment());
        mFragmentTitleSet.add(NestedScrollWebView.class.getSimpleName());
        mFragmentSet.add(new LinearLayoutFragment());
        mFragmentTitleSet.add(NestedScrollLinearLayout.class.getSimpleName());
        mFragmentSet.add(new FrameLayoutFragment());
        mFragmentTitleSet.add(NestedScrollFrameLayout.class.getSimpleName());
        mFragmentSet.add(new RelativeLayoutFragment());
        mFragmentTitleSet.add(NestedScrollRelativeLayout.class.getSimpleName());

        mViewPager.setOffscreenPageLimit(mFragmentSet.size());
        mViewPager.setAdapter(new FragmentPagerAdapter(getSupportFragmentManager()) {
            @Override
            public Fragment getItem(int position) {
                return mFragmentSet.get(position);
            }

            @Override
            public int getCount() {
                return mFragmentSet.size();
            }
        });

        mViewPager.addOnPageChangeListener(new ViewPager.OnPageChangeListener() {

            @Override
            public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {}

            @Override
            public void onPageSelected(int position) {
                mBottomNavigationView.setCurrentItem(position, false);
                mToolbar.setTitle(mFragmentTitleSet.get(position));
            }

            @Override
            public void onPageScrollStateChanged(int state) {}
        });

        mBottomNavigationView.setOnTabSelectedListener(new AHBottomNavigation.OnTabSelectedListener() {
            @Override
            public boolean onTabSelected(int position, boolean wasSelected) {
                mViewPager.setCurrentItem(position);
                return true;
            }
        });
    }
}