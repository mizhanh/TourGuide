package com.example.android.tourguide;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
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
        tours.add(new Tour(R.string.national_park, R.string.national_park_description, R.drawable.nationalpark));
        tours.add(new Tour(R.string.edgewater_park, R.string.edgewater_park_description, R.drawable.edgewater1));
        tours.add(new Tour(R.string.cultural_garden, R.string.cultural_garden_description, R.drawable.culturalgarden));
        tours.add(new Tour(R.string.shaker_lakes, R.string.shaker_lakes_description, R.drawable.shakerlakes));
        tours.add(new Tour(R.string.zoo, R.string.zoo_description, R.drawable.zoo));
        tours.add(new Tour(R.string.tow_path, R.string.tow_path_description, R.drawable.towpath));

        TourAdapter adapter = new TourAdapter(getActivity(), tours);

        ListView listView = (ListView) rootView.findViewById(R.id.list);

        listView.setAdapter(adapter);

        return rootView;
    }

}
