package com.example.tarviliivak.expandablelistview;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class Food_tourism extends AppCompatActivity {

    String items[] = new String [] {"AP18","AP19","AI18","AI19","GI18","GI19","HTS19","K117",
            "K118","K119","K217","K218","K219","K318","KA18","KA19","KA218","KA219","KEo19",
            "KEo219","KK17","KK18","KK19","KKo17","KKo18","KKo19","KO18","KO19","KOo19",
            "KPAo18","KPAo19","KPKo17","KPKo18","KPKo19","LTo19","MJ117","MJ118","MJ119",
            "MJ217","MJ218","MJ219","MJK19","PA18","PA19","PK17","PK18","PK19","RB18",
            "RB19","TEP17","TEP18","TEP19","TK18","TK19","TSTt118","TSTt19","TSTt218","TTKo19"};

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
                    Intent myIntent = new Intent(view.getContext(), AP18.class);
                    startActivityForResult(myIntent, 0);
                }
                if(position==1){
                    Intent myIntent = new Intent(view.getContext(), AP19.class);
                    startActivityForResult(myIntent, 1);
                }
                if(position==2){
                    Intent myIntent = new Intent(view.getContext(), AI18.class);
                    startActivityForResult(myIntent, 2);
                }
                if(position==3){
                    Intent myIntent = new Intent(view.getContext(), AI19.class);
                    startActivityForResult(myIntent, 3);
                }
                if(position==4){
                    Intent myIntent = new Intent(view.getContext(), GI18.class);
                    startActivityForResult(myIntent, 4);
                }
                if(position==5){
                    Intent myIntent = new Intent(view.getContext(), GI19.class);
                    startActivityForResult(myIntent, 5);
                }
                if(position==6){
                    Intent myIntent = new Intent(view.getContext(), HTS19.class);
                    startActivityForResult(myIntent, 6);
                }
                if(position==7){
                    Intent myIntent = new Intent(view.getContext(), K117.class);
                    startActivityForResult(myIntent, 7);
                }
                if(position==8){
                    Intent myIntent = new Intent(view.getContext(), K118.class);
                    startActivityForResult(myIntent, 8);
                }
                if(position==9){
                    Intent myIntent = new Intent(view.getContext(), K119.class);
                    startActivityForResult(myIntent, 9);
                }
                if(position==10){
                    Intent myIntent = new Intent(view.getContext(), K217.class);
                    startActivityForResult(myIntent, 10);
                }
                if(position==11){
                    Intent myIntent = new Intent(view.getContext(), K218.class);
                    startActivityForResult(myIntent, 11);
                }
                if(position==12){
                    Intent myIntent = new Intent(view.getContext(), K219.class);
                    startActivityForResult(myIntent, 12);
                }
                if(position==13){
                    Intent myIntent = new Intent(view.getContext(), K318.class);
                    startActivityForResult(myIntent, 13);
                }
                if(position==14){
                    Intent myIntent = new Intent(view.getContext(), KA18.class);
                    startActivityForResult(myIntent, 14);
                }
                if(position==15){
                    Intent myIntent = new Intent(view.getContext(), KA19.class);
                    startActivityForResult(myIntent, 15);
                }
                if(position==16){
                    Intent myIntent = new Intent(view.getContext(), KA218.class);
                    startActivityForResult(myIntent, 16);
                }
                if(position==17){
                    Intent myIntent = new Intent(view.getContext(), KA219.class);
                    startActivityForResult(myIntent, 17);
                }
                if(position==18){
                    Intent myIntent = new Intent(view.getContext(), KEo19.class);
                    startActivityForResult(myIntent, 18);
                }
                if(position==19){
                    Intent myIntent = new Intent(view.getContext(), KEo219.class);
                    startActivityForResult(myIntent, 19);
                }
                if(position==20){
                    Intent myIntent = new Intent(view.getContext(), KK17.class);
                    startActivityForResult(myIntent, 20);
                }
                if(position==21){
                    Intent myIntent = new Intent(view.getContext(), KK18.class);
                    startActivityForResult(myIntent, 21);
                }
                if(position==22){
                    Intent myIntent = new Intent(view.getContext(), KK19.class);
                    startActivityForResult(myIntent, 22);
                }
                if(position==23){
                    Intent myIntent = new Intent(view.getContext(), KKo17.class);
                    startActivityForResult(myIntent, 23);
                }
                if(position==24){
                    Intent myIntent = new Intent(view.getContext(), KKo18.class);
                    startActivityForResult(myIntent, 24);
                }
                if(position==25){
                    Intent myIntent = new Intent(view.getContext(), KKo19.class);
                    startActivityForResult(myIntent, 25);
                }
                if(position==26){
                    Intent myIntent = new Intent(view.getContext(), KO18.class);
                    startActivityForResult(myIntent, 26);
                }
                if(position==27){
                    Intent myIntent = new Intent(view.getContext(), KO19.class);
                    startActivityForResult(myIntent, 27);
                }
                if(position==28){
                    Intent myIntent = new Intent(view.getContext(), Kokk19.class);
                    startActivityForResult(myIntent, 28);
                }
                if(position==29){
                    Intent myIntent = new Intent(view.getContext(), KPAo18.class);
                    startActivityForResult(myIntent, 29);
                }
                if(position==30){
                    Intent myIntent = new Intent(view.getContext(), KPAo19.class);
                    startActivityForResult(myIntent, 30);
                }
                if(position==31){
                    Intent myIntent = new Intent(view.getContext(), KPKo17.class);
                    startActivityForResult(myIntent, 31);
                }
                if(position==32){
                    Intent myIntent = new Intent(view.getContext(), KPKo18.class);
                    startActivityForResult(myIntent, 32);
                }
                if(position==33){
                    Intent myIntent = new Intent(view.getContext(), KPKo19.class);
                    startActivityForResult(myIntent, 33);
                }
                if(position==34){
                    Intent myIntent = new Intent(view.getContext(), LTo19.class);
                    startActivityForResult(myIntent, 34);
                }
                if(position==35){
                    Intent myIntent = new Intent(view.getContext(), MJ117.class);
                    startActivityForResult(myIntent, 35);
                }
                if(position==36){
                    Intent myIntent = new Intent(view.getContext(), MJ118.class);
                    startActivityForResult(myIntent, 36);
                }
                if(position==37){
                    Intent myIntent = new Intent(view.getContext(), MJ119.class);
                    startActivityForResult(myIntent, 37);
                }
                if(position==38){
                    Intent myIntent = new Intent(view.getContext(), MJ217.class);
                    startActivityForResult(myIntent, 38);
                }
                if(position==39){
                    Intent myIntent = new Intent(view.getContext(), MJ218.class);
                    startActivityForResult(myIntent, 39);
                }
                if(position==40){
                    Intent myIntent = new Intent(view.getContext(), MJ219.class);
                    startActivityForResult(myIntent, 40);
                }
                if(position==41){
                    Intent myIntent = new Intent(view.getContext(), MJK19.class);
                    startActivityForResult(myIntent, 41);
                }
                if(position==42){
                    Intent myIntent = new Intent(view.getContext(), PA18.class);
                    startActivityForResult(myIntent, 42);
                }
                if(position==43){
                    Intent myIntent = new Intent(view.getContext(), PA19.class);
                    startActivityForResult(myIntent, 43);
                }
                if(position==44){
                    Intent myIntent = new Intent(view.getContext(), PK17.class);
                    startActivityForResult(myIntent, 44);
                }
                if(position==45){
                    Intent myIntent = new Intent(view.getContext(), PK18.class);
                    startActivityForResult(myIntent, 45);
                }
                if(position==46){
                    Intent myIntent = new Intent(view.getContext(), PK19.class);
                    startActivityForResult(myIntent, 46);
                }
                if(position==47){
                    Intent myIntent = new Intent(view.getContext(), RB18.class);
                    startActivityForResult(myIntent, 47);
                }
                if(position==48){
                    Intent myIntent = new Intent(view.getContext(), RB19.class);
                    startActivityForResult(myIntent, 48);
                }
                if(position==49){
                    Intent myIntent = new Intent(view.getContext(), TEP17.class);
                    startActivityForResult(myIntent, 49);
                }
                if(position==50){
                    Intent myIntent = new Intent(view.getContext(), TEP18.class);
                    startActivityForResult(myIntent, 50);
                }
                if(position==51){
                    Intent myIntent = new Intent(view.getContext(), TEP19.class);
                    startActivityForResult(myIntent, 51);
                }
                if(position==52){
                    Intent myIntent = new Intent(view.getContext(), TK18.class);
                    startActivityForResult(myIntent, 52);
                }
                if(position==53){
                    Intent myIntent = new Intent(view.getContext(), TK19.class);
                    startActivityForResult(myIntent, 53);
                }
                if(position==54){
                    Intent myIntent = new Intent(view.getContext(), TSTt118.class);
                    startActivityForResult(myIntent, 54);
                }
                if(position==55){
                    Intent myIntent = new Intent(view.getContext(), TSTt19.class);
                    startActivityForResult(myIntent, 55);
                }
                if(position==56){
                    Intent myIntent = new Intent(view.getContext(), TSTt218.class);
                    startActivityForResult(myIntent, 56);
                }
                if(position==57){
                    Intent myIntent = new Intent(view.getContext(), TTKo19.class);
                    startActivityForResult(myIntent, 57);
                }


            }
        });
    }
}

