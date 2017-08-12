package com.example.android.amaghtour;

import java.util.ArrayList;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

public class EventFragment extends Fragment {
    public EventFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.word_list, container, false);
        // Create a list of words
        final ArrayList<Location> locations = new ArrayList<Location>();
        locations.add(new Location(getString(R.string.caterham_name), getString(R.string.catar_statement) +
                getString(R.string.cater_address), R.drawable.caterham));
        locations.add(new Location(getString(R.string.artist_name), getString(R.string.artist_work) +
                getString(R.string.performing_address), R.drawable.glen));
        locations.add(new Location(getString(R.string.Jazz_name), getString(R.string.jazz_work) +
                getString(R.string.jazz_address), R.drawable.jazz));
        locations.add(new Location(getString(R.string.open_name), getString(R.string.info_work) +
                getString(R.string.open_address), R.drawable.openrace));
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