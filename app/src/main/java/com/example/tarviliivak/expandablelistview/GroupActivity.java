package com.example.tarviliivak.expandablelistview;

import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.design.widget.NavigationView;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.security.acl.Group;

public class GroupActivity extends AppCompatActivity {

    private DrawerLayout dl;
    private ActionBarDrawerToggle t;
    private NavigationView nv;

    String items[] = new String [] {"Autoosakond","Äri ja kaubanduse osakond","Ehituse ja puidu osakond","IKT-osakond","Iluteeninduse ja tekstiili osakond","Tehnika osakond","Toitlustuse ja turismi osakond"};

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
                    case R.id.nav_teacher:
                        Intent intent1 = new Intent(GroupActivity.this, TeacherActivity.class);
                        startActivity(intent1);
                        break;
                    case R.id.nav_room:
                        Intent intent3 = new Intent(GroupActivity.this, RoomActivity.class);
                        startActivity(intent3);
                        break;
                    case R.id.action_settings:
                        Intent intent4 = new Intent(GroupActivity.this, Settings.class);
                        startActivity(intent4);
                    default:
                        return true;
                }

                return true;
            }
        });

        ListView listView =(ListView) findViewById(R.id.ListView);
        ArrayAdapter<String> adapter= new ArrayAdapter<String>(this, android.R.layout.simple_expandable_list_item_1, items);
        listView.setAdapter(adapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                if(position==0){
                    Intent myIntent = new Intent(view.getContext(), Auto.class);
                    startActivityForResult(myIntent, 0);
                }
                if(position==1){
                    Intent myIntent = new Intent(view.getContext(), Business.class);
                    startActivityForResult(myIntent, 1);
                }
                if(position==2){
                    Intent myIntent = new Intent(view.getContext(), Construction.class);
                    startActivityForResult(myIntent, 2);
                }
                if(position==3){
                    Intent myIntent = new Intent(view.getContext(), ICT.class);
                    startActivityForResult(myIntent, 3);
                }
                if(position==4){
                    Intent myIntent = new Intent(view.getContext(), Beauty_textile.class);
                    startActivityForResult(myIntent, 4);
                }
                if(position==5){
                    Intent myIntent = new Intent(view.getContext(), Tech.class);
                    startActivityForResult(myIntent, 5);
                }
                if(position==6){
                    Intent myIntent = new Intent(view.getContext(), Food_tourism.class);
                    startActivityForResult(myIntent, 6);
                }



            }
        });
    }
}
