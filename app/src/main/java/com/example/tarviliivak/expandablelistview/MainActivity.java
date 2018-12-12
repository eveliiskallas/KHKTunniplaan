package com.example.tarviliivak.expandablelistview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
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

        listDataHeader.add("Esmaspäev");
        listDataHeader.add("Teisipäev");
        listDataHeader.add("Kolmapäev");
        listDataHeader.add("Neljapäev");
        listDataHeader.add("Reede");

        List<String> edmtDev = new ArrayList<>();
        edmtDev.add("Tund 1");
        edmtDev.add("Tund 2");
        edmtDev.add("Tund 3");
        edmtDev.add("Tund 4");

        List<String> androidStudio = new ArrayList<>();
        androidStudio.add("Tund 1");
        androidStudio.add("Tund 2");
        androidStudio.add("Tund 3");
        androidStudio.add("Tund 4");

        List<String> xamarin = new ArrayList<>();
        xamarin.add("Tund 1");
        xamarin.add("Tund 2");
        xamarin.add("Tund 3");

        List<String> uwp = new ArrayList<>();
        uwp.add("Tund 1");
        uwp.add("Tund 2");

        List<String> tund = new ArrayList<>();
        tund.add("Tund 1");
        tund.add("Tund 2");
        tund.add("Tund 3");
        tund.add("Tund 4");

        listHash.put(listDataHeader.get(0), edmtDev);
        listHash.put(listDataHeader.get(1), androidStudio);
        listHash.put(listDataHeader.get(2), xamarin);
        listHash.put(listDataHeader.get(3), uwp);
        listHash.put(listDataHeader.get(4), tund);
    }
}
