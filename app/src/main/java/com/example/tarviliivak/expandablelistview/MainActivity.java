package com.example.tarviliivak.expandablelistview;

import android.content.Intent;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ExpandableListView;
import android.support.annotation.NonNull;
import android.support.design.widget.NavigationView;
import android.support.v7.app.ActionBarDrawerToggle;
import android.widget.Toast;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private DrawerLayout dl;
    private ActionBarDrawerToggle t;
    private NavigationView nv;


    private ExpandableListView listView;
    private ExpandableListAdapter listAdapter;
    private List<String> listDataHeader;
    private HashMap<String, List<String>> listHash;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        dl = (DrawerLayout) findViewById(R.id.activity_main);
        t = new ActionBarDrawerToggle(this, dl, R.string.Open, R.string.Close);

        dl.addDrawerListener(t);
        t.syncState();

        nv = (NavigationView) findViewById(R.id.nv);
        nv.setNavigationItemSelectedListener(new NavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                switch (item.getItemId()) {
                    case R.id.nav_student:
                        Intent intent = new Intent(MainActivity.this, StudentActivity.class);
                        startActivity(intent);
                        break;
                    case R.id.nav_teachers:
                        Intent intent1 = new Intent(MainActivity.this, TeacherActivity.class);
                        startActivity(intent1);
                        break;
                    case R.id.nav_groups:
                        Intent intent2 = new Intent(MainActivity.this, GroupActivity.class);
                        startActivity(intent2);
                        break;
                    case R.id.nav_rooms:
                        Intent intent3 = new Intent(MainActivity.this, RoomActivity.class);
                        startActivity(intent3);
                    default:
                        return true;
                }

                return true;
            }
        });


        listView = (ExpandableListView) findViewById(R.id.lvExp);
        initData();
        listAdapter = new ExpandableListAdapter(this, listDataHeader, listHash);
        listView.setAdapter(listAdapter);
    }


//    @Override
//    public boolean onOptionsItemSelected(MenuItem item) {
//        if (t.onOptionsItemSelected(item))
//            return true;
//            return super.onOptionsItemSelected(item);
//    }


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

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.settings, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.action_settings: {
                Intent i = new Intent(MainActivity.this, Settings.class);
                startActivity(i);
            }
        }
        return true;
    }
}




