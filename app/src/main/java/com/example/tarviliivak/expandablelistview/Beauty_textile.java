package com.example.tarviliivak.expandablelistview;

import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.design.widget.NavigationView;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class Beauty_textile extends AppCompatActivity {

    private DrawerLayout drawer;
    private ActionBarDrawerToggle toggle;
    private NavigationView nv;

    String items[] = new String [] {"ILU18","ILU19","ILU218","KRR17","KRR18","KRR19","KR218","KR219","KSM18","KSM19","MRT18","MRT19","NRT19","OM19","PT19","SPA18","SPA19"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);





            drawer =  findViewById(R.id.activity_main);
            toggle = new ActionBarDrawerToggle(this, drawer, R.string.Open, R.string.Close);

            drawer.addDrawerListener(toggle);
            toggle.syncState();

            nv = (NavigationView) findViewById(R.id.nv);
            nv.setNavigationItemSelectedListener(new NavigationView.OnNavigationItemSelectedListener() {
                @Override
                public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                    switch (item.getItemId()) {
                        case R.id.nav_teacher:
                            Intent intent1 = new Intent(Beauty_textile.this, TeacherActivity.class);
                            startActivity(intent1);
                            break;
                        case R.id.nav_group:
                            Intent intent2 = new Intent(Beauty_textile.this, GroupActivity.class);
                            startActivity(intent2);
                            break;
                        case R.id.nav_room:
                            Intent intent3 = new Intent(Beauty_textile.this, RoomActivity.class);
                            startActivity(intent3);
                            break;
                        case R.id.action_settings:
                            Intent intent4 = new Intent(Beauty_textile.this, Settings.class);
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
                    Intent myIntent = new Intent(view.getContext(), ILU18.class);
                    startActivityForResult(myIntent, 0);
                }
                if(position==1){
                    Intent myIntent = new Intent(view.getContext(), ILU19.class);
                    startActivityForResult(myIntent, 1);
                }
                if(position==2){
                    Intent myIntent = new Intent(view.getContext(), ILU218.class);
                    startActivityForResult(myIntent, 2);
                }
                if(position==3){
                    Intent myIntent = new Intent(view.getContext(), KRR17.class);
                    startActivityForResult(myIntent, 3);
                }
                if(position==4){
                    Intent myIntent = new Intent(view.getContext(), KRR18.class);
                    startActivityForResult(myIntent, 4);
                }
                if(position==5){
                    Intent myIntent = new Intent(view.getContext(), KRR19.class);
                    startActivityForResult(myIntent, 5);
                }
                if(position==6){
                    Intent myIntent = new Intent(view.getContext(), KR218.class);
                    startActivityForResult(myIntent, 6);
                }
                if(position==7){
                    Intent myIntent = new Intent(view.getContext(), KR219.class);
                    startActivityForResult(myIntent, 7);
                }
                if(position==8){
                    Intent myIntent = new Intent(view.getContext(), KSM18.class);
                    startActivityForResult(myIntent, 8);
                }
                if(position==9){
                    Intent myIntent = new Intent(view.getContext(), KSM19.class);
                    startActivityForResult(myIntent, 9);
                }
                if(position==10){
                    Intent myIntent = new Intent(view.getContext(), MRT18.class);
                    startActivityForResult(myIntent, 10);
                }
                if(position==11){
                    Intent myIntent = new Intent(view.getContext(), MRT19.class);
                    startActivityForResult(myIntent, 11);
                }
                if(position==12){
                    Intent myIntent = new Intent(view.getContext(), NRT19.class);
                    startActivityForResult(myIntent, 12);
                }
                if(position==13){
                    Intent myIntent = new Intent(view.getContext(), OM19.class);
                    startActivityForResult(myIntent, 13);
                }
                if(position==14){
                    Intent myIntent = new Intent(view.getContext(), PT19.class);
                    startActivityForResult(myIntent, 14);
                }
                if(position==15){
                    Intent myIntent = new Intent(view.getContext(), SPA18.class);
                    startActivityForResult(myIntent, 15);
                }
                if(position==16){
                    Intent myIntent = new Intent(view.getContext(), SPA19.class);
                    startActivityForResult(myIntent, 16);
                }



            }
        });
    }
}
