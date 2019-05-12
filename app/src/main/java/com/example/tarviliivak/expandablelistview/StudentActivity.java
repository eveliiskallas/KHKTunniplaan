package com.example.tarviliivak.expandablelistview;


import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class StudentActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }
}

/*
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.android.volley.Request;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;
import java.util.List;*/



/*
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

public class StudentActivity extends AppCompatActivity {

    private DrawerLayout dl;
    private ActionBarDrawerToggle t;
    private NavigationView nv;


    */
/*private ExpandableListView listView;
    private ExpandableListAdapter listAdapter;
    private List<String> listDataHeader;
    private HashMap<String, List<String>> listHash;*//*


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
                    case R.id.nav_group:
                        Intent intent = new Intent(StudentActivity.this, GroupActivity.class);
                        startActivity(intent);
                        break;
                    case R.id.nav_teacher:
                        Intent intent1 = new Intent(StudentActivity.this, TeacherActivity.class);
                        startActivity(intent1);
                        break;
                    case R.id.nav_timetable:
                        Intent intent2 = new Intent(StudentActivity.this, MainActivity.class);
                        startActivity(intent2);
                        break;
                    case R.id.nav_room:
                        Intent intent3 = new Intent(StudentActivity.this, RoomActivity.class);
                        startActivity(intent3);
                        break;
                    case R.id.action_settings:
                        Intent intent4 = new Intent(StudentActivity.this, Settings.class);
                        startActivity(intent4);
                    default:
                        return true;
                }

                return true;
            }
        });


       */
/* listView = (ExpandableListView) findViewById(R.id.lvExp);
        *//*
*/
/*initData();*//*
*/
/*
        listAdapter = new ExpandableListAdapter(this, listDataHeader, listHash);
        listView.setAdapter(listAdapter);*//*

    }

//    @Override
//    public boolean onOptionsItemSelected(MenuItem item) {
//        if (t.onOptionsItemSelected(item))
//            return true;
//        return super.onOptionsItemSelected(item);
//    }


    */
/*private void initData() {
        listDataHeader = new ArrayList<>();
        listHash = new HashMap<>();

        listDataHeader.add("Õpilane");

        List<String> edmtDev = new ArrayList<>();
        edmtDev.add("Info 1");
        edmtDev.add("Info 2");
        edmtDev.add("Info 3");
        edmtDev.add("Info 4");


        listHash.put(listDataHeader.get(0), edmtDev);

    }*//*

}

*/
