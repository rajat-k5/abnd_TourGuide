package com.example.android.tourguide;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.support.v4.content.ContextCompat;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

/**
 * {@link LocationAdapter} is an {@link ArrayAdapter} that can provide the layout for each list item
 * based on a data source, which is a list of {@link Location} objects.
 */



public class LocationAdapter extends ArrayAdapter<Location>{




    public Button map_btn;

    /** Resource ID for the background color for this list of Locations */
    private int mColorResourceId;

    /**
     * Create a new {@link LocationAdapter} object.
     *
     * @param context is the current context (i.e. Activity) that the adapter is being created in.
     * @param locations is the list of {@link Location}s to be displayed.
     * @param colorResourceId is the resource ID for the background color for this list of Locations
     */
    public LocationAdapter(Context context, ArrayList<Location> locations, int colorResourceId) {
        super(context, 0, locations);
        mColorResourceId = colorResourceId;
    }

    @Override
    public View getView(final int position, View convertView, ViewGroup parent) {



        // Check if an existing view is being reused, otherwise inflate the view
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent, false);
        }

        // Get the {@link Location} object located at this position in the list
        final Location currentLocation = getItem(position);




        // Find the TextView in the list_item.xml layout with the ID place.
        TextView nameTextView = (TextView) listItemView.findViewById(R.id.place);
        // Get the Miwok translation from the currentLocation object and set this text on
        // the Miwok TextView.
        nameTextView.setText(currentLocation.getNameId());


        // Find the TextView in the list_item.xml layout with the ID about_place.
        TextView descriptionTextView = (TextView) listItemView.findViewById(R.id.about_place);
        // Get the default translation from the currentLocation object and set this text on
        // the default TextView.
        descriptionTextView.setText(currentLocation.getDescriptionId());


        // Find the ImageView in the list_item.xml layout with the ID image.
        ImageView imageView = (ImageView) listItemView.findViewById(R.id.place_image);
        // Check if an image is provided for this Location or not
        if (currentLocation.hasImage()) {
            // If an image is available, display the provided image based on the resource ID
            imageView.setImageResource(currentLocation.getImageResourceId());
            // Make sure the view is visible
            imageView.setVisibility(View.VISIBLE);
        } else {
            // Otherwise hide the ImageView (set visibility to GONE)
            imageView.setVisibility(View.GONE);
        }


        // Find the TextView in the list_item.xml layout with the ID about_place.
        TextView timeTextView = (TextView) listItemView.findViewById(R.id.time_view);
        // Get the default translation from the currentLocation object and set this text on
        // the default TextView.
        timeTextView.setText(currentLocation.getTimeId());

        // Find the TextView in the list_item.xml layout with the ID about_place.
        TextView rateTextView = (TextView) listItemView.findViewById(R.id.rate_btn);
        // Get the default translation from the currentLocation object and set this text on
        // the default TextView.
        rateTextView.setText(currentLocation.getRateId());


        return listItemView;
    }



}