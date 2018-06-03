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
public class SportsFragment extends Fragment {

    public SportsFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.tour_list, container, false);

        //Create a list of sports team
        final ArrayList <Tour> tours = new ArrayList<Tour>();
        tours.add(new Tour(R.string.baseball, R.string.baseball_description, R.drawable.baseball2));
        tours.add(new Tour(R.string.basketball, R.string.basketball_description, R.drawable.cavs));
        tours.add(new Tour(R.string.football, R.string.football_description, R.drawable.browns));
        tours.add(new Tour(R.string.hockey, R.string.hockey_description, R.drawable.monsters));
        tours.add(new Tour(R.string.soccer, R.string.soccer_description, R.drawable.soccer));

        TourAdapter adapter = new TourAdapter(getActivity(), tours);

        ListView listView = (ListView) rootView.findViewById(R.id.list);

        listView.setAdapter(adapter);

        return rootView;
    }

}
