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
public class EatsFragment extends Fragment {


    public EatsFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.tour_list, container, false);

        //Create a list of sports team
        final ArrayList<Tour> tours = new ArrayList<Tour>();
        tours.add(new Tour(getString(R.string.little_Italy), getString(R.string.little_Italy_description), R.drawable.little_italy));
        tours.add(new Tour(getString(R.string.east_4th_street), getString(R.string.east_4th_description), R.drawable.east_fourth));
        tours.add(new Tour(getString(R.string.ohio_city), getString(R.string.ohio_city_description), R.drawable.ohiocity));
        tours.add(new Tour(getString(R.string.tremont), getString(R.string.tremont_description), R.drawable.tremont));
        tours.add(new Tour(getString(R.string.flats), getString(R.string.flats_description), R.drawable.flats));

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
