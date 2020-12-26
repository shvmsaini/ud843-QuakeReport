package com.example.android.quakereport;

import android.content.Context;
import android.graphics.drawable.GradientDrawable;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.content.ContextCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.List;

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

        GradientDrawable magnitudeCircle = (GradientDrawable) magnitudeView.getBackground();
        int magnitudeColor = getMagnitudeColor(currentEarthquake.getmMagnitude());
        magnitudeCircle.setColor(magnitudeColor);

        TextView dateView = listView.findViewById(R.id.date);
        dateView.setText(currentEarthquake.getmDate());

        TextView timeView = listView.findViewById(R.id.time);
        timeView.setText(currentEarthquake.getmTime());

        TextView locationView = listView.findViewById(R.id.location);

        TextView directionView = listView.findViewById(R.id.direction);

        String direction = currentEarthquake.getmLocation();


        if (direction.contains(" of ")) {

            directionView.setText(direction.substring(0,direction.indexOf(" of")+4));
            locationView.setText(direction.substring(direction.indexOf(" of ")+4));

        } else {
            directionView.setText(R.string.near_the);
            locationView.setText(direction);

        }

        return listView;

    }

    public EarthquakeAdapter(@NonNull Context context, @NonNull List<Earthquake> earthquakes) {
        super(context, 0, earthquakes);
    }
    public int getMagnitudeColor(String col){
        float color = Float.parseFloat(col);

        if (color<2 && color>=0) {
            return ContextCompat.getColor(getContext(),R.color.magnitude1);
        }
        if (color<3 && color>=2) {
            return ContextCompat.getColor(getContext(),R.color.magnitude2);
        }
        if (color<4 && color>=3) {
            return ContextCompat.getColor(getContext(),R.color.magnitude3);
        }
        if (color<5 && color>=4) {
            return ContextCompat.getColor(getContext(),R.color.magnitude4);
        }
        if (color<6 && color>=5) {
            return ContextCompat.getColor(getContext(),R.color.magnitude5);
        }
        if (color<7 && color>=6) {
            return ContextCompat.getColor(getContext(),R.color.magnitude6);
        }
        if (color<8 && color>=7) {
            return ContextCompat.getColor(getContext(),R.color.magnitude7);
        }
        if (color<9 && color>=8) {
            return ContextCompat.getColor(getContext(),R.color.magnitude8);
        }
        if (color<10 && color>=9) {
            return ContextCompat.getColor(getContext(),R.color.magnitude9);
        }
        if (color>=10) {
            return ContextCompat.getColor(getContext(),R.color.magnitude10plus);
        }

        return R.color.colorAccent;
    }


    @Override
    public int getCount() {
        return super.getCount();
    }
}
