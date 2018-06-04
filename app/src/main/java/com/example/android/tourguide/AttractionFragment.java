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
public class AttractionFragment extends Fragment {


    public AttractionFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.tour_list, container, false);

        //Create a list of sports team
        final ArrayList<Tour> tours = new ArrayList<Tour>();
        tours.add(new Tour(getString(R.string.rock_n_roll), getString(R.string.rock_n_roll_description), R.drawable.rocknroll1));
        tours.add(new Tour(getString(R.string.science_center), getString(R.string.science_center_description), R.drawable.science));
        tours.add(new Tour(getString(R.string.playhouse), getString(R.string.playhouse_square_description), R.drawable.playhouse1));
        tours.add(new Tour(getString(R.string.market), getString(R.string.market_description), R.drawable.market));
        tours.add(new Tour(getString(R.string.museum), getString(R.string.museum_description), R.drawable.museum));
        tours.add(new Tour(getString(R.string.contemporary_museum), getString(R.string.contemporary_museum_description), R.drawable.moca));
        tours.add(new Tour(getString(R.string.natural_history_museum), getString(R.string.natural_history_museum_description), R.drawable.naturalhistory));
        tours.add(new Tour(getString(R.string.aquarium), getString(R.string.aquarium_description), R.drawable.aquarium));
        tours.add(new Tour(getString(R.string.botanical_garden), getString(R.string.botanical_garden_description), R.drawable.botanical));

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
