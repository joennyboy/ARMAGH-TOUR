package com.example.android.amaghtour;
import java.util.ArrayList;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
public class HistoryFragment extends Fragment {
    public HistoryFragment() {
        // Required empty public constructor
    }
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.word_list, container, false);
        // Create a list of words
        final ArrayList<Location> locations = new ArrayList<Location>();
        locations.add(new Location(getString(R.string.parish_name), getString(R.string.parish_info), R.drawable.stjohnmoira));
        locations.add(new Location(getString(R.string.quaker_name), getString(R.string.quaker_info), R.drawable.quakermeeting));
        locations.add(new Location(getString(R.string.moira_church), getString(R.string.moira_info) +
                getString(R.string.moira_churchaddress), R.drawable.methodist));
        locations.add(new Location(getString(R.string.pres_name), getString(R.string.pres_info), R.drawable.presby));
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