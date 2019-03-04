package com.example.tarviliivak.expandablelistview;

import android.content.Intent;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
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

public class RoomActivity extends AppCompatActivity {

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
                        Intent intent = new Intent(RoomActivity.this, StudentActivity.class);
                        startActivity(intent);
                        break;
                    case R.id.nav_teachers:
                        Intent intent1 = new Intent(RoomActivity.this, TeacherActivity.class);
                        startActivity(intent1);
                        break;
                    case R.id.nav_timetable:
                        Intent intent2 = new Intent(RoomActivity.this, MainActivity.class);
                        startActivity(intent2);
                        break;
                    case R.id.nav_groups:
                        Intent intent3 = new Intent(RoomActivity.this, GroupActivity.class);
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

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if (t.onOptionsItemSelected(item))
            return true;
        return super.onOptionsItemSelected(item);
    }


    private void initData() {
        listDataHeader = new ArrayList<>();
        listHash = new HashMap<>();

        listDataHeader.add("Klass");

        List<String> edmtDev = new ArrayList<>();
        edmtDev.add("Info 1");
        edmtDev.add("Info 2");
        edmtDev.add("Info 3");
        edmtDev.add("Info 4");


        listHash.put(listDataHeader.get(0), edmtDev);

    }

//    @Override
//    public boolean onCreateOptionsMenu(Menu menu) {
//        MenuInflater inflater = getMenuInflater();
//        inflater.inflate(R.menu.navigation_menu, menu);
//        return true;
//    }
}

