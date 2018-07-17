package com.example.android.tourguide;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.ListView;

import java.util.ArrayList;

/**
 * {@link Fragment} that displays the Food and culture Info of the place
 */
public class ShoppingFragment extends Fragment {

    public ShoppingFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.tour_list, container, false);


        // Create a list of Locations
        final ArrayList<Location> Locations = new ArrayList<Location>();
        Locations.add(new Location(R.string.shop1, R.string.shop1_about,
                R.drawable.shop1, R.string.shop1_time,R.string.shop1_rate));
        Locations.add(new Location(R.string.shop2, R.string.shop2_about,
                R.drawable.shop2, R.string.shop2_time,R.string.shop2_rate));
        Locations.add(new Location(R.string.shop3, R.string.shop3_about,
                R.drawable.shop3, R.string.shop3_time,R.string.shop3_rate));
        Locations.add(new Location(R.string.shop4, R.string.shop4_about,
                R.drawable.shop4, R.string.shop4_time,R.string.shop4_rate));



        // Create an {@link LocationAdapter}, whose data source is a list of {@link Location}s. The
        // adapter knows how to create list items for each item in the list.
        LocationAdapter adapter = new LocationAdapter(getActivity(), Locations, R.color.colorPrimaryDark);

        // Find the {@link ListView} object in the view hierarchy of the {@link Activity}.
        // There should be a {@link ListView} with the view ID called list, which is declared in the
        // Location_list.xml layout file.
        ListView listView = (ListView) rootView.findViewById(R.id.list);

        // Make the {@link ListView} use the {@link LocationAdapter} we created above, so that the
        // {@link ListView} will display list items for each {@link Location} in the list.
        listView.setAdapter(adapter);


        return rootView;
    }



}