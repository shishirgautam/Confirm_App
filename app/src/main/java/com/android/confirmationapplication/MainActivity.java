package com.android.confirmationapplication;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import com.smarteist.autoimageslider.SliderView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        SliderView imageSlider = findViewById(R.id.imageslider);

        List<Integer> slideModels = new ArrayList<>();
        slideModels.add(R.drawable.image1);
        slideModels.add(R.drawable.image2);
        MyAdapter myAdapter = new MyAdapter(slideModels);
        imageSlider.setSliderAdapter(myAdapter);

    }
}