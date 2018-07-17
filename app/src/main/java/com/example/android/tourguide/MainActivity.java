package com.example.android.tourguide;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Adapter;
import android.widget.AdapterView;
import android.widget.GridView;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {


    GridView simpleGrid;
    ArrayList cityList=new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Setting up for the Grid View
        simpleGrid = (GridView) findViewById(R.id.simpleGridView);
        cityList.add(new Item("Jaipur",R.drawable.tour_jaipur));
        cityList.add(new Item("Ladakh",R.drawable.tour_ladakh));
        cityList.add(new Item("Jodhpur",R.drawable.tour_jodhpur));
        cityList.add(new Item("Delhi",R.drawable.tour_delhi));
        cityList.add(new Item("Darjeeling",R.drawable.tour_darjeeling));
        cityList.add(new Item("Udaipur",R.drawable.tour_udaipur));
        cityList.add(new Item("Lucknow",R.drawable.tour_lucknow));

        MyAdapter myAdapter = new MyAdapter(this,cityList);

        final GridView listView = (GridView) findViewById(R.id.simpleGridView);

        simpleGrid.setAdapter(myAdapter);


        // Onclick Listener for the GridView
        simpleGrid.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                if (position == 0) {

                    Intent intent = new Intent(MainActivity.this, TourActivity.class);
                    startActivity(intent); // start Intent

                }
            }
        });

    }
}