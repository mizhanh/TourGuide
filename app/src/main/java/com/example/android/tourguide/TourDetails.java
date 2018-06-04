package com.example.android.tourguide;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class TourDetails extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tour_details);

        String tourName = getIntent().getStringExtra("tourName");
        String tourDescription = getIntent().getStringExtra("tourNameDescription");
        int imageResourceId = getIntent().getIntExtra("imageResourceId", 0);

        TextView tourNameTextView = (TextView) findViewById(R.id.tourName_text_view);
        tourNameTextView.setText(tourName);

        TextView tourDescriptionTextView = (TextView) findViewById(R.id.tourDescription_text_view);
        tourDescriptionTextView.setText(tourDescription);

        ImageView imageView = (ImageView) findViewById(R.id.image);
        imageView.setImageResource(imageResourceId);

        }
    }

