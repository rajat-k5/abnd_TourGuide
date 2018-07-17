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
public class SightSeeingFragment extends Fragment {

    public SightSeeingFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.tour_list, container, false);


        // Create a list of Locations
        final ArrayList<Location> Locations = new ArrayList<Location>();
        Locations.add(new Location(R.string.sight1, R.string.sight1_about,
                R.drawable.sight1,R.string.sight1_time, R.string.sight1_rate));

        Locations.add(new Location(R.string.sight2, R.string.sight2_about,
                R.drawable.sight2,R.string.sight2_time, R.string.sight2_rate));

        Locations.add(new Location(R.string.sight3, R.string.sight3_about,
                R.drawable.sight3,R.string.sight3_time, R.string.sight3_rate));

        Locations.add(new Location(R.string.sight4, R.string.sight4_about,
                R.drawable.sight4,R.string.sight4_time, R.string.sight4_rate));

        Locations.add(new Location(R.string.sight5, R.string.sight5_about,
                R.drawable.sight5,R.string.sight5_time, R.string.sight5_rate));




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

        // Set a click listener to play the audio when the list item is clicked on
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {

                // Get the {@link Location} object at the given position the user clicked on
                Location Location = Locations.get(position);

            }
        });



        return rootView;
    }


}