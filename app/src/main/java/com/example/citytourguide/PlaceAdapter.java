package com.example.citytourguide;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

class PlaceAdapter extends ArrayAdapter<Place> {

    public PlaceAdapter(Activity context, ArrayList<Place> places) {

        super(context, 0, places);
    }

    public View getView(int position, View convertView, ViewGroup parent) {
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.placeinfo, parent, false);
        }

        Place currentWord = getItem(position);

       // TextView placeNameTextView = (TextView) listItemView.findViewById(R.id.placeName);
      //  placeNameTextView.setText(currentWord.getPlaceName());

        TextView cityNameTextView = (TextView) listItemView.findViewById(R.id.placeinfo);
        cityNameTextView.setText(currentWord.getplaceInfo());


        // ImageView img = (ImageView) listItemView.findViewById(R.id.resimg);
      /*  if (currentWord.hasImage()) {
            // If an image is available, display the provided image based on the resource ID
            img.setImageResource(currentWord.getmImageResourceId());
            // Make sure the view is visible
            img.setVisibility(View.VISIBLE);
        } else {
            // Otherwise hide the ImageView (set visibility to GONE)
            img.setVisibility(View.GONE);
        }

       */


        return listItemView;
    }

}

