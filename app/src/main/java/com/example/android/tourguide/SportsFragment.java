package com.example.android.tourguide;


import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 */
public class SportsFragment extends Fragment {

    public SportsFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.tour_list, container, false);

        //Create a list of sports team
        final ArrayList <Tour> tours = new ArrayList<Tour>();
        tours.add(new Tour(getString(R.string.baseball), getString(R.string.baseball_description), R.drawable.baseball2));
        tours.add(new Tour(getString(R.string.basketball), getString(R.string.basketball_description), R.drawable.cavs));
        tours.add(new Tour(getString(R.string.football), getString(R.string.football_description), R.drawable.browns));
        tours.add(new Tour(getString(R.string.hockey), getString(R.string.hockey_description), R.drawable.monsters));
        tours.add(new Tour(getString(R.string.soccer), getString(R.string.soccer_description), R.drawable.soccer));

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
