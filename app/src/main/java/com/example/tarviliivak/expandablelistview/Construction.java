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

public class Construction extends AppCompatActivity {


    private DrawerLayout drawer;
    private ActionBarDrawerToggle toggle;
    private NavigationView nv;


    String items[] = new String [] {"CNC19","CNC219","EV117","EV118","EV119","EV217","EV218","EV219","EVM18","EVM19","KJL19","KJL218","LE17","LE18","LE19","MT117","MT18","MT19","MTK17","MTK18","MTK19","PLA19","PLA219","PPO19","PTS19","PTS219"};

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
                        Intent intent1 = new Intent(Construction.this, TeacherActivity.class);
                        startActivity(intent1);
                        break;
                    case R.id.nav_group:
                        Intent intent2 = new Intent(Construction.this, GroupActivity.class);
                        startActivity(intent2);
                        break;
                    case R.id.nav_room:
                        Intent intent3 = new Intent(Construction.this, RoomActivity.class);
                        startActivity(intent3);
                        break;
                    case R.id.action_settings:
                        Intent intent4 = new Intent(Construction.this, Settings.class);
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
                    Intent myIntent = new Intent(view.getContext(), CNC19.class);
                    startActivityForResult(myIntent, 0);
                }
                if(position==1){
                    Intent myIntent = new Intent(view.getContext(), CNC219.class);
                    startActivityForResult(myIntent, 1);
                }
                if(position==2){
                    Intent myIntent = new Intent(view.getContext(), EV117.class);
                    startActivityForResult(myIntent, 2);
                }
                if(position==3){
                    Intent myIntent = new Intent(view.getContext(), EV118.class);
                    startActivityForResult(myIntent, 3);
                }
                if(position==4){
                    Intent myIntent = new Intent(view.getContext(), EV119.class);
                    startActivityForResult(myIntent, 4);
                }
                if(position==5){
                    Intent myIntent = new Intent(view.getContext(), EV217.class);
                    startActivityForResult(myIntent, 5);
                }
                if(position==6){
                    Intent myIntent = new Intent(view.getContext(), EV218.class);
                    startActivityForResult(myIntent, 6);
                }
                if(position==7){
                    Intent myIntent = new Intent(view.getContext(), EV219.class);
                    startActivityForResult(myIntent, 7);
                }
                if(position==8){
                    Intent myIntent = new Intent(view.getContext(), EVM18.class);
                    startActivityForResult(myIntent, 8);
                }
                if(position==9){
                    Intent myIntent = new Intent(view.getContext(), EVM19.class);
                    startActivityForResult(myIntent, 9);
                }
                if(position==10){
                    Intent myIntent = new Intent(view.getContext(), KJL19.class);
                    startActivityForResult(myIntent, 10);
                }
                if(position==11){
                    Intent myIntent = new Intent(view.getContext(), KJL218.class);
                    startActivityForResult(myIntent, 11);
                }
                if(position==12){
                    Intent myIntent = new Intent(view.getContext(), LE17.class);
                    startActivityForResult(myIntent, 12);
                }
                if(position==13){
                    Intent myIntent = new Intent(view.getContext(), LE18.class);
                    startActivityForResult(myIntent, 13);
                }
                if(position==14){
                    Intent myIntent = new Intent(view.getContext(), LE19.class);
                    startActivityForResult(myIntent, 14);
                }
                if(position==15){
                    Intent myIntent = new Intent(view.getContext(), MT117.class);
                    startActivityForResult(myIntent, 15);
                }
                if(position==16){
                    Intent myIntent = new Intent(view.getContext(), MT18.class);
                    startActivityForResult(myIntent, 16);
                }
                if(position==17){
                    Intent myIntent = new Intent(view.getContext(), MT19.class);
                    startActivityForResult(myIntent, 17);
                }
                if(position==18){
                    Intent myIntent = new Intent(view.getContext(), MTK17.class);
                    startActivityForResult(myIntent, 18);
                }
                if(position==19){
                    Intent myIntent = new Intent(view.getContext(), MTK18.class);
                    startActivityForResult(myIntent, 19);
                }
                if(position==20){
                    Intent myIntent = new Intent(view.getContext(), MTK19.class);
                    startActivityForResult(myIntent, 20);
                }
                if(position==21){
                    Intent myIntent = new Intent(view.getContext(), PLA19.class);
                    startActivityForResult(myIntent, 21);
                }
                if(position==22){
                    Intent myIntent = new Intent(view.getContext(), PLA219.class);
                    startActivityForResult(myIntent, 22);
                }
                if(position==23){
                    Intent myIntent = new Intent(view.getContext(), PPO19.class);
                    startActivityForResult(myIntent, 23);
                }
                if(position==24){
                    Intent myIntent = new Intent(view.getContext(), PTS19.class);
                    startActivityForResult(myIntent, 24);
                }
                if(position==25){
                    Intent myIntent = new Intent(view.getContext(), PTS219.class);
                    startActivityForResult(myIntent, 25);
                }


            }
        });
    }
}

