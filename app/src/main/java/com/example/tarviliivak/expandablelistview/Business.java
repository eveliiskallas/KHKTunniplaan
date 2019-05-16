package com.example.tarviliivak.expandablelistview;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class Business extends AppCompatActivity {

    String items[] = new String [] {"Akt18","AK18","AK19","Akt19","ARHt18","ARHt19","BT17","BT18","BT19","EKo19","EKt18","LM17","LM18","LM19","LOGo18","MK17","MKo18","MKt19","MKt217","MY17","MY18","MY19","MYEo18","MYEo19","RMo18","RMo19","RMt19","SRo18","SRo19"};

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
                    Intent myIntent = new Intent(view.getContext(), Akt18.class);
                    startActivityForResult(myIntent, 0);
                }
                if(position==1){
                    Intent myIntent = new Intent(view.getContext(), AK18.class);
                    startActivityForResult(myIntent, 1);
                }
                if(position==2){
                    Intent myIntent = new Intent(view.getContext(), AK19.class);
                    startActivityForResult(myIntent, 2);
                }
                if(position==3){
                    Intent myIntent = new Intent(view.getContext(), Akt19.class);
                    startActivityForResult(myIntent, 3);
                }
                if(position==4){
                    Intent myIntent = new Intent(view.getContext(), ARHt18.class);
                    startActivityForResult(myIntent, 4);
                }
                if(position==5){
                    Intent myIntent = new Intent(view.getContext(), ARHt19.class);
                    startActivityForResult(myIntent, 5);
                }
                if(position==6){
                    Intent myIntent = new Intent(view.getContext(), BT17.class);
                    startActivityForResult(myIntent, 6);
                }
                if(position==7){
                    Intent myIntent = new Intent(view.getContext(), BT18.class);
                    startActivityForResult(myIntent, 8);
                }
                if(position==8){
                    Intent myIntent = new Intent(view.getContext(), BT19.class);
                    startActivityForResult(myIntent, 8);
                }
                if(position==9){
                    Intent myIntent = new Intent(view.getContext(), EKo19.class);
                    startActivityForResult(myIntent, 9);
                }
                if(position==10){
                    Intent myIntent = new Intent(view.getContext(), EKt18.class);
                    startActivityForResult(myIntent, 10);
                }
                if(position==11){
                    Intent myIntent = new Intent(view.getContext(), LM17.class);
                    startActivityForResult(myIntent, 11);
                }
                if(position==12){
                    Intent myIntent = new Intent(view.getContext(), LM18.class);
                    startActivityForResult(myIntent, 12);
                }
                if(position==13){
                    Intent myIntent = new Intent(view.getContext(), LM19.class);
                    startActivityForResult(myIntent, 13);
                }
                if(position==14){
                    Intent myIntent = new Intent(view.getContext(), LOGo18.class);
                    startActivityForResult(myIntent, 14);
                }
                if(position==15){
                    Intent myIntent = new Intent(view.getContext(), MK17.class);
                    startActivityForResult(myIntent, 15);
                }
                if(position==16){
                    Intent myIntent = new Intent(view.getContext(), MKo18.class);
                    startActivityForResult(myIntent, 16);
                }
                if(position==17){
                    Intent myIntent = new Intent(view.getContext(), MKt19.class);
                    startActivityForResult(myIntent, 17);
                }
                if(position==18){
                    Intent myIntent = new Intent(view.getContext(), MKt217.class);
                    startActivityForResult(myIntent, 18);
                }
                if(position==19){
                    Intent myIntent = new Intent(view.getContext(), MY17.class);
                    startActivityForResult(myIntent, 19);
                }
                if(position==20){
                    Intent myIntent = new Intent(view.getContext(), MY18.class);
                    startActivityForResult(myIntent, 20);
                }
                if(position==21){
                    Intent myIntent = new Intent(view.getContext(), MY19.class);
                    startActivityForResult(myIntent, 21);
                }
                if(position==22){
                    Intent myIntent = new Intent(view.getContext(), MYEo18.class);
                    startActivityForResult(myIntent, 22);
                }
                if(position==23){
                    Intent myIntent = new Intent(view.getContext(), MYEo19.class);
                    startActivityForResult(myIntent, 23);
                }
                if(position==24){
                    Intent myIntent = new Intent(view.getContext(), RMo18.class);
                    startActivityForResult(myIntent, 24);
                }
                if(position==25){
                    Intent myIntent = new Intent(view.getContext(), RMo19.class);
                    startActivityForResult(myIntent, 25);
                }
                if(position==26){
                    Intent myIntent = new Intent(view.getContext(), RMt19.class);
                    startActivityForResult(myIntent, 26);
                }
                if(position==27){
                    Intent myIntent = new Intent(view.getContext(), SRo18.class);
                    startActivityForResult(myIntent, 27);
                }
                if(position==28){
                    Intent myIntent = new Intent(view.getContext(), SRo19.class);
                    startActivityForResult(myIntent, 28);
                }



            }
        });
    }
}