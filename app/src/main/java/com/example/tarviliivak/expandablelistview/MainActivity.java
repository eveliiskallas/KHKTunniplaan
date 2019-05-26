package com.example.tarviliivak.expandablelistview;

import android.content.Intent;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
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
import android.widget.TextView;
import android.widget.Toast;


import org.json.JSONArray;
import org.json.JSONException;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private DrawerLayout drawer;
    private ActionBarDrawerToggle toggle;
    private NavigationView nv;

    RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.content);

        Boolean isFirstRun = getSharedPreferences("PREFERENCE", MODE_PRIVATE)
                .getBoolean("isFirstRun", true);

        if (isFirstRun) {
            //show sign up activity
            startActivity(new Intent(MainActivity.this, Settings.class));
            Toast.makeText(MainActivity.this, "Run only once", Toast.LENGTH_LONG)
                    .show();
        }

        getSharedPreferences("PREFERENCE", MODE_PRIVATE).edit()
                .putBoolean("isFirstRun", false).apply();




        Intent intent = getIntent();
        String kuupaev = intent.getStringExtra("kuupaev");
        String aeg = intent.getStringExtra("aeg");
        String aine = intent.getStringExtra("aine");
//        String grupp = intent.getStringExtra("grupp");
//        String opetaja = intent.getStringExtra("opetaja");

        TextView date = findViewById(R.id.textDate);
        TextView time = findViewById(R.id.textTime);
        TextView subject = findViewById(R.id.textSubject);
//        TextView group = findViewById(R.id.textGroup);
//        TextView teacher = findViewById(R.id.textTeacher);

        date.setText(kuupaev);
        time.setText(aeg);
        subject.setText(aine);
//        group.setText(grupp);
//        teacher.setText(opetaja);




        drawer =  findViewById(R.id.content);
        toggle = new ActionBarDrawerToggle(this, drawer, R.string.Open, R.string.Close);

        drawer.addDrawerListener(toggle);
        toggle.syncState();

        nv = (NavigationView) findViewById(R.id.nv);
        nv.setNavigationItemSelectedListener(new NavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                switch (item.getItemId()) {
                    case R.id.nav_teacher:
                        Intent intent1 = new Intent(MainActivity.this, TeacherActivity.class);
                        startActivity(intent1);
                        break;
                    case R.id.nav_group:
                        Intent intent2 = new Intent(MainActivity.this, GroupActivity.class);
                        startActivity(intent2);
                        break;
                    case R.id.nav_room:
                        Intent intent3 = new Intent(MainActivity.this, RoomActivity.class);
                        startActivity(intent3);
                        break;
                    case R.id.action_settings:
                        Intent intent4 = new Intent(MainActivity.this, Settings.class);
                        startActivity(intent4);
                    default:
                        return true;
                }

                return true;
            }
        });


    }
}




