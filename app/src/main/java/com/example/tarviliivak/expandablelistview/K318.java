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

import com.android.volley.Request;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;
import java.util.List;

public class K318 extends AppCompatActivity {

    //this is the JSON Data URL
    //make sure you are using the correct ip else it will not work
    private static final String URL_Info = "http://khktunniplaan.ikt.khk.ee/TUNNIPLAAN/Grupid/K318.php";

    //a list to store all the products
    List<Info> infoList;

    //the recyclerview
    RecyclerView recyclerView;

    private DrawerLayout drawer;
    private ActionBarDrawerToggle toggle;
    private NavigationView nv;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //getting the recyclerview from xml
        recyclerView = findViewById(R.id.recylcerView);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        //initializing the productlist
        infoList = new ArrayList<>();

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
                        Intent intent1 = new Intent(K318.this, TeacherActivity.class);
                        startActivity(intent1);
                        break;
                    case R.id.nav_group:
                        Intent intent2 = new Intent(K318.this, GroupActivity.class);
                        startActivity(intent2);
                        break;
                    case R.id.nav_room:
                        Intent intent3 = new Intent(K318.this, RoomActivity.class);
                        startActivity(intent3);
                        break;
                    case R.id.action_settings:
                        Intent intent4 = new Intent(K318.this, Settings.class);
                        startActivity(intent4);
                    default:
                        return true;
                }

                return true;
            }
        });
        loadInfo();
    }

    private void loadInfo() {

        /*
         * Creating a String Request
         * The request type is GET defined by first parameter
         * The URL is defined in the second parameter
         * Then we have a Response Listener and a Error Listener
         * In response listener we will get the JSON response as a String
         * */
        StringRequest stringRequest = new StringRequest(Request.Method.GET, URL_Info,
                new Response.Listener<String>() {
                    @Override
                    public void onResponse(String response) {
                        try {
                            //converting the string to json array object
                            JSONArray array = new JSONArray(response);

                            //traversing through all the object
                            for (int i = 0; i < array.length(); i++) {

                                //getting product object from json array
                                JSONObject product = array.getJSONObject(i);

                                //adding the product to product list
                                infoList.add(new Info(
                                        product.getString("kuupaev"),
                                        product.getString("aeg"),
                                        product.getString("aine"),
                                        product.getString("ruum"),
                                        product.getString("opetaja")
                                ));
                            }

                            //creating adapter object and setting it to recyclerview
                            InfoAdapter adapter = new InfoAdapter(K318.this, infoList);
                            recyclerView.setAdapter(adapter);
                        } catch (JSONException e) {
                            e.printStackTrace();
                        }
                    }
                },
                new Response.ErrorListener() {
                    @Override
                    public void onErrorResponse(VolleyError error) {

                    }
                });

        //adding our stringrequest to queue
        Volley.newRequestQueue(this).add(stringRequest);
    }
}
