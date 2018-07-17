package com.example.android.tourguide;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class MyAdapter extends ArrayAdapter {


    private static final String LOG_TAG = MyAdapter.class.getSimpleName();

    /**
     * This is our own custom constructor (it doesn't mirror a superclass constructor).
     * The context is used to inflate the layout file, and the list is the data we want
     * to populate into the lists.
     *
     * @param context  The current context. Used to inflate the layout file.
     * @param cityList List of MusicLIst objects to display in a list
     */
    public MyAdapter(Activity context, ArrayList<Item> cityList) {
        // Here, we initialize the ArrayAdapter's internal storage for the context and the list.
        // the second argument is used when the ArrayAdapter is populating a single TextView.
        // Because this is a custom adapter for two TextViews and an ImageView, the adapter is not
        // going to use this second argument, so it can be any value. Here, we used 0.
        super(context, 0, cityList);
    }


    @Override
    public int getCount() {
        return super.getCount();
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        // Check if the existing view is being reused, otherwise inflate the view
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.gridview_item, parent, false);
        }

        // Get the {@link CityList} object located at this position in the list
        Item currentCity = (Item) getItem(position);

        // Find the TextView in gridgiew_item.xml layout with the City Name

        TextView nameTextView = (TextView) listItemView.findViewById(R.id.grid_text);
        // Get the City name from the current CityList object and
        // set this text on the name TextView
        nameTextView.setText(currentCity.getCityName());


        // Find the ImageView in the gridview_item.xml layout with the ID list_item_icon
        ImageView iconView = (ImageView) listItemView.findViewById(R.id.grid_image);
        // Get the image resource ID from the current cityList object and
        // set the image to iconView
        iconView.setImageResource(currentCity.getImageResourceId());

        // Return the whole list item layout (containing a TextView and an ImageView)
        // so that it can be shown in the ListView
        return listItemView;
    }

}