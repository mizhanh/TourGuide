package com.example.android.tourguide;


import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 */
public class ParksFragment extends Fragment {


    public ParksFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.tour_list, container, false);

        //Create a list of sports team
        final ArrayList<Tour> tours = new ArrayList<Tour>();
        tours.add(new Tour(getString(R.string.national_park), getString(R.string.national_park_description), R.drawable.nationalpark));
        tours.add(new Tour(getString(R.string.edgewater_park), getString(R.string.edgewater_park_description), R.drawable.edgewater1));
        tours.add(new Tour(getString(R.string.cultural_garden), getString(R.string.cultural_garden_description), R.drawable.culturalgarden));
        tours.add(new Tour(getString(R.string.shaker_lakes), getString(R.string.shaker_lakes_description), R.drawable.shakerlakes));
        tours.add(new Tour(getString(R.string.zoo), getString(R.string.zoo_description), R.drawable.zoo));
        tours.add(new Tour(getString(R.string.tow_path), getString(R.string.tow_path_description), R.drawable.towpath));

        TourAdapter tourAdapter = new TourAdapter(getActivity(), tours);

        final ListView listView = (ListView) rootView.findViewById(R.id.list);

        listView.setAdapter(tourAdapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long l) {
                Tour tour = tours.get(position);
                Intent intent = new Intent(getActivity(), TourDetails.class);

                intent.putExtra("tourName", tour.getTourName());
                intent.putExtra("tourNameDescription", tour.getTourBriefDescription());
                intent.putExtra("imageResourceId", tour.getImageResourceId());

                startActivity(intent);
            }
        });
        return rootView;
    }

}
