package com.example.android.quakereport;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.List;

import static com.example.android.quakereport.EarthquakeActivity.LOG_TAG;

public class EarthquakeAdapter extends ArrayAdapter<Earthquake> {

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View listView = convertView;
        if (listView == null) {
            listView = LayoutInflater.from(getContext()).inflate(R.layout.earthquake_list_item, parent, false);
        }
        Earthquake currentEarthquake = getItem(position);

        TextView magnitudeView = listView.findViewById(R.id.magnitude);
        magnitudeView.setText(currentEarthquake.getmMagnitude());

        TextView dateView = listView.findViewById(R.id.date);
        dateView.setText(currentEarthquake.getmDate());

        TextView timeView = listView.findViewById(R.id.time);
        timeView.setText(currentEarthquake.getmTime());

        TextView locationView = listView.findViewById(R.id.location);




        TextView directionView = listView.findViewById(R.id.direction);
        String direction = currentEarthquake.getmLocation();


        if (direction.contains(" of ")) {

            directionView.setText(direction.substring(0,direction.indexOf(" of")));
            locationView.setText(direction.substring(direction.indexOf(" of ")+4));

        } else {
            directionView.setText("Near the");
            locationView.setText(direction);

        }
        Log.d(LOG_TAG,"direction ch = " + direction.indexOf(" of"));


        return listView;

    }

    public EarthquakeAdapter(@NonNull Context context, @NonNull List<Earthquake> earthquakes) {
        super(context, 0, earthquakes);
    }

    @Override
    public int getCount() {
        return super.getCount();
    }
}
