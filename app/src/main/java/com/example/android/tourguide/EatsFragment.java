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
public class EatsFragment extends Fragment {


    public EatsFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.tour_list, container, false);

        //Create a list of sports team
        final ArrayList<Tour> tours = new ArrayList<Tour>();
        tours.add(new Tour(R.string.little_Italy, R.string.little_Italy_description, R.drawable.little_italy));
        tours.add(new Tour(R.string.east_4th_street, R.string.east_4th_description, R.drawable.east_fourth));
        tours.add(new Tour(R.string.ohio_city, R.string.ohio_city_description, R.drawable.ohiocity));
        tours.add(new Tour(R.string.tremont, R.string.tremont_description, R.drawable.tremont));
        tours.add(new Tour(R.string.flats, R.string.flats_description, R.drawable.flats));

        TourAdapter adapter = new TourAdapter(getActivity(), tours);

        ListView listView = (ListView) rootView.findViewById(R.id.list);

        listView.setAdapter(adapter);

        return rootView;
    }
}
