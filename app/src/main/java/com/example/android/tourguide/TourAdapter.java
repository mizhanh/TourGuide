package com.example.android.tourguide;

import android.app.Activity;
import android.support.v4.content.ContextCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class TourAdapter extends ArrayAdapter<Tour> {

    public TourAdapter(Activity context, ArrayList<Tour> tours) {
        super(context, 0, tours);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View listItemView = convertView;
        if(listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent, false);
        }

        Tour currentTour = getItem(position);

        // Find the TextView in the list_item.xml layout with the ID version_name
        TextView tourNameTextView = (TextView) listItemView.findViewById(R.id.tourName_text_view);

        tourNameTextView.setText(currentTour.getTourName());

//        TextView tourDescriptionTextView = (TextView) listItemView.findViewById(R.id.tourDescription_text_view);
//
//        tourDescriptionTextView.setText(currentTour.getTourBriefDescription());

        ImageView imageView = (ImageView) listItemView.findViewById(R.id.image);

        if(currentTour.hasImage()) {
            imageView.setImageResource(currentTour.getImageResourceId());
            imageView.setVisibility(View.VISIBLE);
        }
        else {
            imageView.setVisibility(View.GONE);
        }

        return listItemView;
    }
}

