package com.example.android.tourguide;

import android.app.SearchManager;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;


/**
 * {@link Fragment} that displays the basic info of the place
 *
 *
 */



public class InfoFragment extends Fragment {



    public InfoFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.info, container, false);

        Button bt1 = rootView.findViewById(R.id.flight);
        Button bt2 = rootView.findViewById(R.id.hotel);

        bt1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                searchWeb("Book Hotel Jaipur");
            }
        });


        bt2.setOnClickListener(new View.OnClickListener() {
            @Override
                public void onClick(View v) {
                    searchWeb("Book Flight Jaipur");
            }
        });


        return rootView;
    }
    public void searchWeb(String query) {
        Intent intent = new Intent(Intent.ACTION_WEB_SEARCH);
        intent.putExtra(SearchManager.QUERY, query);
        if (intent.resolveActivity(getActivity().getPackageManager()) != null) {
            startActivity(intent);
        }
    }

}