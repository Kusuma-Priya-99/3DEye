package com.trebuchet.a3deye;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    FragmentPagerAdapter adapterViewPager;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    ViewPager viewPager = findViewById(R.id.viewPager);

    adapterViewPager = new MyPageAdapter(getSupportFragmentManager());
    viewPager.setAdapter(adapterViewPager);
    viewPager.setCurrentItem(1);

    }

    public static class MyPageAdapter extends FragmentPagerAdapter {
        public MyPageAdapter(@NonNull FragmentManager fm) {
            super(fm);
        }

        @Override
        public Fragment getItem(int position){
                return CameraFragment.newInstance();
        }

        @Override
        public int getCount(){
            return 1;
        }
    }
}