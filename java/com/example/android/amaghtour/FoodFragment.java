package com.example.android.amaghtour;
import java.util.ArrayList;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
public class FoodFragment extends Fragment {
    public FoodFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.word_list, container, false);
        // Create a list of words
        final ArrayList<Location> locations = new ArrayList<Location>();
        locations.add(new Location(getString(R.string.Food_wine),getString(R.string.food_wineinfo) +
                getString(R.string.food_wineaddress),R.drawable.wineandbrine));
        locations.add(new Location(getString(R.string.mary_name),getString(R.string.mary_info) +
                getString(R.string.mary_address), R.drawable.prettymary));
        locations.add(new Location(getString(R.string.midnightname), getString(R.string.midnight_address) +
                getString(R.string.midnight_info), R.drawable.midnight));
        locations.add(new Location(getString(R.string.ten_name), getString(R.string.tan_info) +
                getString(R.string.tan_address), R.drawable.tennery));
        // Create an {@link LocationAdapter}, whose data source is a list of {@link Word}s. The
        // adapter knows how to create list items for each item in the list.
        LocationAdapter adapter = new LocationAdapter(getActivity(), locations, R.color.colorPrimaryDark);
        // Find the {@link ListView} object in the view hierarchy of the {@link Activity}.
        // There should be a {@link ListView} with the view ID called list, which is declared in the
        // word_list.xml layout file.
        ListView listView = (ListView) rootView.findViewById(R.id.list);
        // Make the {@link ListView} use the {@link LocationAdapter} we created above, so that the
        // {@link ListView} will display list items for each {@link Word} in the list.
        listView.setAdapter(adapter);
        return rootView;
    }
}