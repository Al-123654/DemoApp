package com.example.user.demoapp;

import android.content.Intent;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.ImageButton;

public class HomeActivity extends AppCompatActivity {

    private ImageButton mAboutButton;
    private ViewPager mViewPager;
    private int images[] = {
        R.drawable.one, R.drawable.two, R.drawable.three
    };
    private CustomPagerAdapter mCustomPagerAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        Toolbar myToolbar = (Toolbar) findViewById(R.id.home_toolbar);
        setSupportActionBar(myToolbar);

        mAboutButton = findViewById(R.id.home_left_button);
        mAboutButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent myIntent = new Intent(HomeActivity.this, AboutActivity.class);
                startActivity(myIntent);
            }
        });

        mViewPager = findViewById(R.id.home_image_slider);

        mCustomPagerAdapter = new CustomPagerAdapter(HomeActivity.this, images);
        mViewPager.setAdapter(mCustomPagerAdapter);
    }
}
