package com.example.tarviliivak.expandablelistview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ExpandableListView;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private ExpandableListView listView;
    private ExpandableListAdapter listAdapter;
    private List<String> listDataHeader;
    private HashMap<String,List<String>> listHash;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listView = (ExpandableListView)findViewById(R.id.lvExp);
        initData();
        listAdapter = new ExpandableListAdapter(this, listDataHeader, listHash);
        listView.setAdapter(listAdapter);
    }

    private void initData() {
        listDataHeader = new ArrayList<>();
        listHash = new HashMap<>();

        listDataHeader.add("EDMTDev");
        listDataHeader.add("Android");
        listDataHeader.add("XAMARIN");
        listDataHeader.add("UWP");

        List<String> edmtDev = new ArrayList<>();
        edmtDev.add("This is Expandable Listview");

        List<String> androidStudio = new ArrayList<>();
        androidStudio.add("Expandable ListView");
        androidStudio.add("Google Map");
        androidStudio.add("Chat App");
        androidStudio.add("Firebase");

        List<String> xamarin = new ArrayList<>();
        xamarin.add("Xamarin Expandable ListView");
        xamarin.add("Xamarin Google Map");
        xamarin.add("Xamarin Chat App");
        xamarin.add("Xamarin Firebase");

        List<String> uwp = new ArrayList<>();
        uwp.add("Uwp Expandable ListView");
        uwp.add("Uwp Google Map");
        uwp.add("Uwp Chat App");
        uwp.add("Uwp Firebase");

        listHash.put(listDataHeader.get(0), edmtDev);
        listHash.put(listDataHeader.get(1), androidStudio);
        listHash.put(listDataHeader.get(2), xamarin);
        listHash.put(listDataHeader.get(3), uwp);
    }
}
