package com.example.tarviliivak.expandablelistview;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class Auto extends AppCompatActivity {

    String items[] = new String [] {"AM17","AM18","AM19","APH118","APH19","APH218","APL17","APL18","APL19","AT117","AT118","AT119","AT217","AT218","AT219","AT318","AUD19","AUM18","AUM19","AUT17","AUT18"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ListView listView =(ListView) findViewById(R.id.ListView);
        ArrayAdapter<String> adapter= new ArrayAdapter<String>(this, android.R.layout.simple_expandable_list_item_1, items);
        listView.setAdapter(adapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                if(position==0){
                    Intent myIntent = new Intent(view.getContext(), AM17.class);
                    startActivityForResult(myIntent, 0);
                }
                if(position==1){
                    Intent myIntent = new Intent(view.getContext(), AM18.class);
                    startActivityForResult(myIntent, 1);
                }
                if(position==2){
                    Intent myIntent = new Intent(view.getContext(), AM19.class);
                    startActivityForResult(myIntent, 2);
                }
                if(position==3){
                    Intent myIntent = new Intent(view.getContext(), APH118.class);
                    startActivityForResult(myIntent, 3);
                }
                if(position==4){
                    Intent myIntent = new Intent(view.getContext(), APH19.class);
                    startActivityForResult(myIntent, 4);
                }
                if(position==5){
                    Intent myIntent = new Intent(view.getContext(), APH218.class);
                    startActivityForResult(myIntent, 5);
                }
                if(position==6){
                    Intent myIntent = new Intent(view.getContext(), APL17.class);
                    startActivityForResult(myIntent, 6);
                }
                if(position==7){
                    Intent myIntent = new Intent(view.getContext(), APL18.class);
                    startActivityForResult(myIntent, 7);
                }
                if(position==8){
                    Intent myIntent = new Intent(view.getContext(), APL19.class);
                    startActivityForResult(myIntent, 8);
                }
                if(position==9){
                    Intent myIntent = new Intent(view.getContext(), AT117.class);
                    startActivityForResult(myIntent, 9);
                }
                if(position==10){
                    Intent myIntent = new Intent(view.getContext(), AT118.class);
                    startActivityForResult(myIntent, 10);
                }
                if(position==11){
                    Intent myIntent = new Intent(view.getContext(), AT119.class);
                    startActivityForResult(myIntent, 11);
                }
                if(position==12){
                    Intent myIntent = new Intent(view.getContext(), AT217.class);
                    startActivityForResult(myIntent, 12);
                }
                if(position==13){
                    Intent myIntent = new Intent(view.getContext(), AT218.class);
                    startActivityForResult(myIntent, 13);
                }
                if(position==14){
                    Intent myIntent = new Intent(view.getContext(), AT219.class);
                    startActivityForResult(myIntent, 14);
                }
                if(position==15){
                    Intent myIntent = new Intent(view.getContext(), AT318.class);
                    startActivityForResult(myIntent, 15);
                }
                if(position==16){
                    Intent myIntent = new Intent(view.getContext(), AUD19.class);
                    startActivityForResult(myIntent, 16);
                }
                if(position==17){
                    Intent myIntent = new Intent(view.getContext(), AUM18.class);
                    startActivityForResult(myIntent, 17);
                }
                if(position==18){
                    Intent myIntent = new Intent(view.getContext(), AUM19.class);
                    startActivityForResult(myIntent, 18);
                }
                if(position==19){
                    Intent myIntent = new Intent(view.getContext(), AUT17.class);
                    startActivityForResult(myIntent, 19);
                }
                if(position==20){
                    Intent myIntent = new Intent(view.getContext(), AUT18.class);
                    startActivityForResult(myIntent, 20);
                }



            }
        });
    }
}

