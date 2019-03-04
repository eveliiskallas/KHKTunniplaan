package com.example.tarviliivak.expandablelistview;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ExpandableListView;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class StudentActivity extends AppCompatActivity {

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

        listDataHeader.add("Õpilane 1");


        List<String> edmtDev = new ArrayList<>();
        edmtDev.add("Info 1");
        edmtDev.add("Info 2");
        edmtDev.add("Info 3");
        edmtDev.add("Info 4");


        listHash.put(listDataHeader.get(0), edmtDev);
    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.navigation_menu, menu);
        return true;
    }
    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle item selection
        switch (item.getItemId()) {
            case R.id.nav_timetable:
                Intent intent = new Intent(StudentActivity.this, MainActivity.class);
                startActivity(intent);
                break;
            case R.id.nav_teachers:
                Intent intent1 = new Intent(StudentActivity.this, TeacherActivity.class);
                startActivity(intent1);
                break;
            case R.id.nav_groups:
                Intent intent2 = new Intent(StudentActivity.this, GroupActivity.class);
                startActivity(intent2);
                break;
            case R.id.nav_rooms:
                Intent intent3 = new Intent(StudentActivity.this, RoomActivity.class);
                startActivity(intent3);
            default:
                return super.onOptionsItemSelected(item);
        }
        return true;
    }
}