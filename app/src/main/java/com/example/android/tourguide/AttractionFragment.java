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
public class AttractionFragment extends Fragment {


    public AttractionFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.tour_list, container, false);

        //Create a list of sports team
        final ArrayList<Tour> tours = new ArrayList<Tour>();
        tours.add(new Tour(R.string.rock_n_roll, R.string.rock_n_roll_description, R.drawable.rocknroll1));
        tours.add(new Tour(R.string.science_center, R.string.science_center_description, R.drawable.science));
        tours.add(new Tour(R.string.playhouse, R.string.playhouse_square_description, R.drawable.playhouse1));
        tours.add(new Tour(R.string.market, R.string.market_description, R.drawable.market));
        tours.add(new Tour(R.string.museum, R.string.museum_description, R.drawable.museum));
        tours.add(new Tour(R.string.contemporary_museum, R.string.contemporary_museum_description, R.drawable.moca));
        tours.add(new Tour(R.string.natural_history_museum, R.string.natural_history_museum_description, R.drawable.naturalhistory));
        tours.add(new Tour(R.string.aquarium, R.string.aquarium_description, R.drawable.aquarium));
        tours.add(new Tour(R.string.botanical_garden, R.string.botanical_garden_description, R.drawable.botanical));

        TourAdapter adapter = new TourAdapter(getActivity(), tours);

        ListView listView = (ListView) rootView.findViewById(R.id.list);

        listView.setAdapter(adapter);

        return rootView;

    }

}
