package com.example.tarviliivak.expandablelistview;


import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class RoomActivity extends AppCompatActivity {

    String items[] = new String [] {"KPL-A032A","KPL-A032B","KPL-A050","KPL-A116","KPL-A118","KPL-A119","KPL-A121","KPL-A138","KPL-A139","KPL-A160A/B","KPL-A169","KPL-A171","KPL-A173A","KPL-A175","KPL-A180","KPL-A182",
            "KPL-A183","KPL-A184","KPL-A204","KPL-A205","KPL-A206","KPL-A207","KPL-A208","KPL-A209","KPL-A211","KPL-A213","KPL-A220","KPL-A227","KPL-A228","KPL-A229","KPL-A301","KPL-A303","KPL-A304","KPL-A305","KPL-A306","KPL-A307","KPL-A308",
            "KPL-A310","KPL-A312","KPL-A313","KPL-A314","KPL-A315","KPL-A316","KPL-A317","KPL-A318","KPL-A319","KPL-A320","KPL-A401","KPL-A403","KPL-A404","KPL-A406","KPL-A407","KPL-A409","KPL-A411","KPL-A412","KPL-A413","KPL-A415","KPL-A417",
            "KPL-A418","KPL-A419","KPL-A420","KPL-A421","KPL-B101","KPL-B102a","KPL-B104","KPL-B105","KPL-B112","KPL-B114","KPL-B115","KPL-B120","KPL-B121","KPL-B145","KPL-B158","KPL-B159","KPL-B162","KPL-B165","KPL-B171","KPL-B201","KPL-B202","KPL-B204",
            "KPL-B205","KPL-B206","KPL-B207","KPL-B208","KPL-B209","KPL-B210","KPL-B211","KPL-B213","KPL-B214","KPL-B215","KPL-B226","KPL-B227","KPL-B228","KPL-B229","KPL-B230","KPL-B301","KPL-B302","KPL-B305","KPL-B306","KPL-B307","KPL-B308",
            "KPL-B309","KPL-B310","KPL-B311","KPL-B312","KPL-B313","KPL-B314","KPL-B315","KPL-B316","KPL-B317","KPL-C115","KPL-C116","KPL-C124","KPL-C125","KPL-C140","KPL-C146","KPL-C202","POL-A036","POL-A118","POL-A119","POL-A121","POL-A134",
            "POL-A145","POL-A146","POL-A209","POL-A214","POL-A215a","POL-A216","POL-A217","POL-A218","POL-A221","POL-A227","POL-A306","POL-A307","POL-A308","POL-A309","POL-A310","POL-A313","POL-A314","POL-B114","POL-B230",
            "POL-B233","POL-B235","POL-B238","POL-B239","POL-B244","POL-C105","POL-C106","POL-E103","POL-F110","POL-F124","POL-F128","POL-F133A","POL-F133B","POL-F136","POL-F210","POL-F221","POL-F320","POL-F322","POL-F326",
            "POL-F327","POL-F328","POL-F329","POL-F332","STR2-BO2"};

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
                    Intent myIntent = new Intent(view.getContext(), KPL_A032A.class);
                    startActivityForResult(myIntent, 0);
                }
                if(position==1){
                    Intent myIntent = new Intent(view.getContext(), KPL_A032B.class);
                    startActivityForResult(myIntent, 1);
                }
                if(position==2){
                    Intent myIntent = new Intent(view.getContext(), KPL_A050.class);
                    startActivityForResult(myIntent, 2);
                }
                if(position==3){
                    Intent myIntent = new Intent(view.getContext(), KPL_A116.class);
                    startActivityForResult(myIntent, 3);
                }
                if(position==4){
                    Intent myIntent = new Intent(view.getContext(), KPL_A118.class);
                    startActivityForResult(myIntent, 4);
                }
                if(position==5){
                    Intent myIntent = new Intent(view.getContext(), KPL_A119.class);
                    startActivityForResult(myIntent, 5);
                }
                if(position==6){
                    Intent myIntent = new Intent(view.getContext(), KPL_A121.class);
                    startActivityForResult(myIntent, 6);
                }
                if(position==7){
                    Intent myIntent = new Intent(view.getContext(), KPL_A138.class);
                    startActivityForResult(myIntent, 7);
                }
                if(position==8){
                    Intent myIntent = new Intent(view.getContext(), KPL_A139.class);
                    startActivityForResult(myIntent, 8);
                }
                if(position==9){
                    Intent myIntent = new Intent(view.getContext(), KPL_A160A_B.class);
                    startActivityForResult(myIntent, 9);
                }
                if(position==10){
                    Intent myIntent = new Intent(view.getContext(), KPL_A169.class);
                    startActivityForResult(myIntent, 10);
                }
                if(position==11){
                    Intent myIntent = new Intent(view.getContext(), KPL_A171.class);
                    startActivityForResult(myIntent, 11);
                }
                if(position==12){
                    Intent myIntent = new Intent(view.getContext(), KPL_A173A.class);
                    startActivityForResult(myIntent, 12);
                }
                if(position==13){
                    Intent myIntent = new Intent(view.getContext(), KPL_A175.class);
                    startActivityForResult(myIntent, 13);
                }
                if(position==14){
                    Intent myIntent = new Intent(view.getContext(), KPL_A180.class);
                    startActivityForResult(myIntent, 14);
                }
                if(position==15){
                    Intent myIntent = new Intent(view.getContext(), KPL_A182.class);
                    startActivityForResult(myIntent, 15);
                }
                if(position==16){
                    Intent myIntent = new Intent(view.getContext(), KPL_A183.class);
                    startActivityForResult(myIntent, 16);
                }
                if(position==17){
                    Intent myIntent = new Intent(view.getContext(), KPL_A184.class);
                    startActivityForResult(myIntent, 17);
                }
                if(position==18){
                    Intent myIntent = new Intent(view.getContext(), KPL_A204.class);
                    startActivityForResult(myIntent, 18);
                }
                if(position==19){
                    Intent myIntent = new Intent(view.getContext(), KPL_A205.class);
                    startActivityForResult(myIntent, 19);
                }
                if(position==20){
                    Intent myIntent = new Intent(view.getContext(), KPL_A206.class);
                    startActivityForResult(myIntent, 20);
                }
                if(position==21){
                    Intent myIntent = new Intent(view.getContext(), KPL_A207.class);
                    startActivityForResult(myIntent, 21);
                }
                if(position==22){
                    Intent myIntent = new Intent(view.getContext(), KPL_A208.class);
                    startActivityForResult(myIntent, 22);
                }
                if(position==23){
                    Intent myIntent = new Intent(view.getContext(), KPL_A209.class);
                    startActivityForResult(myIntent, 23);
                }
                if(position==24){
                    Intent myIntent = new Intent(view.getContext(), KPL_A211.class);
                    startActivityForResult(myIntent, 24);
                }
                if(position==25){
                    Intent myIntent = new Intent(view.getContext(), KPL_A213.class);
                    startActivityForResult(myIntent, 25);
                }
                if(position==26){
                    Intent myIntent = new Intent(view.getContext(), KPL_A220.class);
                    startActivityForResult(myIntent, 26);
                }
                if(position==27){
                    Intent myIntent = new Intent(view.getContext(), KPL_A227.class);
                    startActivityForResult(myIntent, 27);
                }
                if(position==28){
                    Intent myIntent = new Intent(view.getContext(), KPL_A228.class);
                    startActivityForResult(myIntent, 28);
                }
                if(position==29){
                    Intent myIntent = new Intent(view.getContext(), KPL_A229.class);
                    startActivityForResult(myIntent, 29);
                }
                if(position==30){
                    Intent myIntent = new Intent(view.getContext(), KPL_A301.class);
                    startActivityForResult(myIntent, 30);
                }
                if(position==31){
                    Intent myIntent = new Intent(view.getContext(), KPL_A303.class);
                    startActivityForResult(myIntent, 31);
                }
                if(position==32){
                    Intent myIntent = new Intent(view.getContext(), KPL_A304.class);
                    startActivityForResult(myIntent, 32);
                }
                if(position==33){
                    Intent myIntent = new Intent(view.getContext(), KPL_A305.class);
                    startActivityForResult(myIntent, 33);
                }
                if(position==34){
                    Intent myIntent = new Intent(view.getContext(), KPL_A306.class);
                    startActivityForResult(myIntent, 34);
                }
                if(position==35){
                    Intent myIntent = new Intent(view.getContext(), KPL_A307.class);
                    startActivityForResult(myIntent, 35);
                }
                if(position==36){
                    Intent myIntent = new Intent(view.getContext(), KPL_A308.class);
                    startActivityForResult(myIntent, 36);
                }
                if(position==37){
                    Intent myIntent = new Intent(view.getContext(), KPL_A310.class);
                    startActivityForResult(myIntent, 37);
                }
                if(position==38){
                    Intent myIntent = new Intent(view.getContext(), KPL_A312.class);
                    startActivityForResult(myIntent, 38);
                }
                if(position==39){
                    Intent myIntent = new Intent(view.getContext(), KPL_A313.class);
                    startActivityForResult(myIntent, 39);
                }
                if(position==40){
                    Intent myIntent = new Intent(view.getContext(), KPL_A314.class);
                    startActivityForResult(myIntent, 40);
                }
                if(position==41){
                    Intent myIntent = new Intent(view.getContext(), KPL_A315.class);
                    startActivityForResult(myIntent, 41);
                }
                if(position==42){
                    Intent myIntent = new Intent(view.getContext(), KPL_A316.class);
                    startActivityForResult(myIntent, 42);
                }
                if(position==43){
                    Intent myIntent = new Intent(view.getContext(), KPL_A317.class);
                    startActivityForResult(myIntent, 43);
                }
                if(position==44){
                    Intent myIntent = new Intent(view.getContext(), KPL_A318.class);
                    startActivityForResult(myIntent, 44);
                }
                if(position==45){
                    Intent myIntent = new Intent(view.getContext(), KPL_A319.class);
                    startActivityForResult(myIntent, 45);
                }
                if(position==46){
                    Intent myIntent = new Intent(view.getContext(), KPL_A320.class);
                    startActivityForResult(myIntent, 46);
                }
                if(position==47){
                    Intent myIntent = new Intent(view.getContext(), KPL_A401.class);
                    startActivityForResult(myIntent, 47);
                }
                if(position==48){
                    Intent myIntent = new Intent(view.getContext(), KPL_A403.class);
                    startActivityForResult(myIntent, 48);
                }
                if(position==49){
                    Intent myIntent = new Intent(view.getContext(), KPL_A404.class);
                    startActivityForResult(myIntent, 49);
                }
                if(position==50){
                    Intent myIntent = new Intent(view.getContext(), KPL_A406.class);
                    startActivityForResult(myIntent, 50);
                }if(position==51){
                    Intent myIntent = new Intent(view.getContext(), KPL_A407.class);
                    startActivityForResult(myIntent, 51);
                }
                if(position==52){
                    Intent myIntent = new Intent(view.getContext(), KPL_A409.class);
                    startActivityForResult(myIntent, 52);
                }
                if(position==53){
                    Intent myIntent = new Intent(view.getContext(), KPL_A411.class);
                    startActivityForResult(myIntent, 53);
                }
                if(position==54){
                    Intent myIntent = new Intent(view.getContext(), KPL_A412.class);
                    startActivityForResult(myIntent, 54);
                }
                if(position==55){
                    Intent myIntent = new Intent(view.getContext(), KPL_A413.class);
                    startActivityForResult(myIntent, 55);
                }
                if(position==56){
                    Intent myIntent = new Intent(view.getContext(), KPL_A415.class);
                    startActivityForResult(myIntent, 56);
                }
                if(position==57){
                    Intent myIntent = new Intent(view.getContext(), KPL_A417.class);
                    startActivityForResult(myIntent, 57);
                }
                if(position==58){
                    Intent myIntent = new Intent(view.getContext(), KPL_A418.class);
                    startActivityForResult(myIntent, 58);
                }
                if(position==59){
                    Intent myIntent = new Intent(view.getContext(), KPL_A419.class);
                    startActivityForResult(myIntent, 59);
                }
                if(position==60){
                    Intent myIntent = new Intent(view.getContext(), KPL_A420.class);
                    startActivityForResult(myIntent, 60);
                }
                if(position==61){
                    Intent myIntent = new Intent(view.getContext(), KPL_A421.class);
                    startActivityForResult(myIntent, 61);
                }
                if(position==62){
                    Intent myIntent = new Intent(view.getContext(), KPL_B101.class);
                    startActivityForResult(myIntent, 62);
                }
                if(position==63){
                    Intent myIntent = new Intent(view.getContext(), KPL_B102a.class);
                    startActivityForResult(myIntent, 63);
                }
                if(position==64){
                    Intent myIntent = new Intent(view.getContext(), KPL_B104.class);
                    startActivityForResult(myIntent, 64);
                }
                if(position==65){
                    Intent myIntent = new Intent(view.getContext(), KPL_B105.class);
                    startActivityForResult(myIntent, 65);
                }
                if(position==66){
                    Intent myIntent = new Intent(view.getContext(), KPL_B112.class);
                    startActivityForResult(myIntent, 66);
                }
                if(position==67){
                    Intent myIntent = new Intent(view.getContext(), KPL_B114.class);
                    startActivityForResult(myIntent, 67);
                }
                if(position==68){
                    Intent myIntent = new Intent(view.getContext(), KPL_B115.class);
                    startActivityForResult(myIntent, 68);
                }
                if(position==69){
                    Intent myIntent = new Intent(view.getContext(), KPL_B120.class);
                    startActivityForResult(myIntent, 69);
                }
                if(position==70){
                    Intent myIntent = new Intent(view.getContext(), KPL_B121.class);
                    startActivityForResult(myIntent, 70);
                }
                if(position==71){
                    Intent myIntent = new Intent(view.getContext(), KPL_B145.class);
                    startActivityForResult(myIntent, 71);
                }
                if(position==72){
                    Intent myIntent = new Intent(view.getContext(), KPL_B158.class);
                    startActivityForResult(myIntent, 72);
                }
                if(position==73){
                    Intent myIntent = new Intent(view.getContext(), KPL_B159.class);
                    startActivityForResult(myIntent, 73);
                }
                if(position==74){
                    Intent myIntent = new Intent(view.getContext(), KPL_B162.class);
                    startActivityForResult(myIntent, 74);
                }
                if(position==75){
                    Intent myIntent = new Intent(view.getContext(), KPL_B165.class);
                    startActivityForResult(myIntent, 75);
                }
                if(position==76){
                    Intent myIntent = new Intent(view.getContext(), KPL_B171.class);
                    startActivityForResult(myIntent, 76);
                }
                if(position==77){
                    Intent myIntent = new Intent(view.getContext(), KPL_B201.class);
                    startActivityForResult(myIntent, 77);
                }
                if(position==78){
                    Intent myIntent = new Intent(view.getContext(), KPL_B202.class);
                    startActivityForResult(myIntent, 78);
                }
                if(position==79){
                    Intent myIntent = new Intent(view.getContext(), KPL_B204.class);
                    startActivityForResult(myIntent, 79);
                }
                if(position==80){
                    Intent myIntent = new Intent(view.getContext(), KPL_B205.class);
                    startActivityForResult(myIntent, 80);
                }
                if(position==81){
                    Intent myIntent = new Intent(view.getContext(), KPL_B206.class);
                    startActivityForResult(myIntent, 81);
                }
                if(position==82){
                    Intent myIntent = new Intent(view.getContext(), KPL_B207.class);
                    startActivityForResult(myIntent, 82);
                }
                if(position==83){
                    Intent myIntent = new Intent(view.getContext(), KPL_B208.class);
                    startActivityForResult(myIntent, 83);
                }
                if(position==84){
                    Intent myIntent = new Intent(view.getContext(), KPL_B209.class);
                    startActivityForResult(myIntent, 84);
                }
                if(position==85){
                    Intent myIntent = new Intent(view.getContext(), KPL_B210.class);
                    startActivityForResult(myIntent, 85);
                }
                if(position==86){
                    Intent myIntent = new Intent(view.getContext(), KPL_B211.class);
                    startActivityForResult(myIntent, 86);
                }
                if(position==87){
                    Intent myIntent = new Intent(view.getContext(), KPL_B213.class);
                    startActivityForResult(myIntent, 87);
                }
                if(position==88){
                    Intent myIntent = new Intent(view.getContext(), KPL_B214.class);
                    startActivityForResult(myIntent, 88);
                }
                if(position==89){
                    Intent myIntent = new Intent(view.getContext(), KPL_B215.class);
                    startActivityForResult(myIntent, 89);
                }
                if(position==90){
                    Intent myIntent = new Intent(view.getContext(), KPL_B226.class);
                    startActivityForResult(myIntent, 90);
                }
                if(position==91){
                    Intent myIntent = new Intent(view.getContext(), KPL_B227.class);
                    startActivityForResult(myIntent, 91);
                }
                if(position==92){
                    Intent myIntent = new Intent(view.getContext(), KPL_B228.class);
                    startActivityForResult(myIntent, 92);
                }
                if(position==93){
                    Intent myIntent = new Intent(view.getContext(), KPL_B229.class);
                    startActivityForResult(myIntent, 93);
                }
                if(position==94){
                    Intent myIntent = new Intent(view.getContext(), KPL_B230.class);
                    startActivityForResult(myIntent, 94);
                }
                if(position==95){
                    Intent myIntent = new Intent(view.getContext(), KPL_B301.class);
                    startActivityForResult(myIntent, 95);
                }
                if(position==96){
                    Intent myIntent = new Intent(view.getContext(), KPL_B302.class);
                    startActivityForResult(myIntent, 96);
                }
                if(position==97){
                    Intent myIntent = new Intent(view.getContext(), KPL_B305.class);
                    startActivityForResult(myIntent, 97);
                }
                if(position==98){
                    Intent myIntent = new Intent(view.getContext(), KPL_B306.class);
                    startActivityForResult(myIntent, 98);
                }
                if(position==99){
                    Intent myIntent = new Intent(view.getContext(), KPL_B307.class);
                    startActivityForResult(myIntent, 9);
                }
                if(position==100){
                    Intent myIntent = new Intent(view.getContext(), KPL_B308.class);
                    startActivityForResult(myIntent, 100);
                }
                if(position==101){
                    Intent myIntent = new Intent(view.getContext(), KPL_B309.class);
                    startActivityForResult(myIntent, 101);
                }
                if(position==102){
                    Intent myIntent = new Intent(view.getContext(), KPL_B310.class);
                    startActivityForResult(myIntent, 102);
                }
                if(position==103){
                    Intent myIntent = new Intent(view.getContext(), KPL_B311.class);
                    startActivityForResult(myIntent, 103);
                }
                if(position==104){
                    Intent myIntent = new Intent(view.getContext(), KPL_B312.class);
                    startActivityForResult(myIntent, 104);
                }
                if(position==105){
                    Intent myIntent = new Intent(view.getContext(), KPL_B313.class);
                    startActivityForResult(myIntent, 105);
                }
                if(position==106){
                    Intent myIntent = new Intent(view.getContext(), KPL_B314.class);
                    startActivityForResult(myIntent, 106);
                }
                if(position==107){
                    Intent myIntent = new Intent(view.getContext(), KPL_B315.class);
                    startActivityForResult(myIntent, 107);
                }
                if(position==108){
                    Intent myIntent = new Intent(view.getContext(), KPL_B316.class);
                    startActivityForResult(myIntent, 108);
                }
                if(position==109){
                    Intent myIntent = new Intent(view.getContext(), KPL_B317.class);
                    startActivityForResult(myIntent, 109);
                }
                if(position==110){
                    Intent myIntent = new Intent(view.getContext(), KPL_C115.class);
                    startActivityForResult(myIntent, 110);
                }
                if(position==111){
                    Intent myIntent = new Intent(view.getContext(), KPL_C116.class);
                    startActivityForResult(myIntent, 111);
                }
                if(position==112){
                    Intent myIntent = new Intent(view.getContext(), KPL_C124.class);
                    startActivityForResult(myIntent, 112);
                }
                if(position==113){
                    Intent myIntent = new Intent(view.getContext(), KPL_C125.class);
                    startActivityForResult(myIntent, 113);
                }
                if(position==114){
                    Intent myIntent = new Intent(view.getContext(), KPL_C140.class);
                    startActivityForResult(myIntent, 114);
                }
                if(position==115){
                    Intent myIntent = new Intent(view.getContext(), KPL_C146.class);
                    startActivityForResult(myIntent, 115);
                }
                if(position==116){
                    Intent myIntent = new Intent(view.getContext(), KPL_C202.class);
                    startActivityForResult(myIntent, 116);
                }
                if(position==117){
                    Intent myIntent = new Intent(view.getContext(), POL_A036.class);
                    startActivityForResult(myIntent, 117);
                }
                if(position==118){
                    Intent myIntent = new Intent(view.getContext(), POL_A118.class);
                    startActivityForResult(myIntent, 118);
                }
                if(position==119){
                    Intent myIntent = new Intent(view.getContext(), POL_A119.class);
                    startActivityForResult(myIntent, 119);
                }
                if(position==120){
                    Intent myIntent = new Intent(view.getContext(), POL_A121.class);
                    startActivityForResult(myIntent, 120);
                }
                if(position==121){
                    Intent myIntent = new Intent(view.getContext(), POL_A134.class);
                    startActivityForResult(myIntent, 121);
                }
                if(position==122){
                    Intent myIntent = new Intent(view.getContext(), POL_A145.class);
                    startActivityForResult(myIntent, 122);
                }
                if(position==123){
                    Intent myIntent = new Intent(view.getContext(), POL_A146.class);
                    startActivityForResult(myIntent, 123);
                }
                if(position==124){
                    Intent myIntent = new Intent(view.getContext(), POL_A209.class);
                    startActivityForResult(myIntent, 124);
                }
                if(position==125){
                    Intent myIntent = new Intent(view.getContext(), POL_A214.class);
                    startActivityForResult(myIntent, 125);
                }
                if(position==126){
                    Intent myIntent = new Intent(view.getContext(), POL_A215a.class);
                    startActivityForResult(myIntent, 126);
                }
                if(position==127){
                    Intent myIntent = new Intent(view.getContext(), POL_A216.class);
                    startActivityForResult(myIntent, 127);
                }
                if(position==128){
                    Intent myIntent = new Intent(view.getContext(), POL_A217.class);
                    startActivityForResult(myIntent, 128);
                }
                if(position==129){
                    Intent myIntent = new Intent(view.getContext(), POL_A218.class);
                    startActivityForResult(myIntent, 129);
                }
                if(position==130){
                    Intent myIntent = new Intent(view.getContext(), POL_A221.class);
                    startActivityForResult(myIntent, 130);
                }
                if(position==131){
                    Intent myIntent = new Intent(view.getContext(), POL_A227.class);
                    startActivityForResult(myIntent, 131);
                }
                if(position==132){
                    Intent myIntent = new Intent(view.getContext(), POL_A306.class);
                    startActivityForResult(myIntent, 132);
                }
                if(position==133){
                    Intent myIntent = new Intent(view.getContext(), POL_A307.class);
                    startActivityForResult(myIntent, 133);
                }
                if(position==134){
                    Intent myIntent = new Intent(view.getContext(), POL_A308.class);
                    startActivityForResult(myIntent, 134);
                }
                if(position==135){
                    Intent myIntent = new Intent(view.getContext(), POL_A309.class);
                    startActivityForResult(myIntent, 135);
                }
                if(position==136){
                    Intent myIntent = new Intent(view.getContext(), POL_A310.class);
                    startActivityForResult(myIntent, 136);
                }
                if(position==137){
                    Intent myIntent = new Intent(view.getContext(), POL_A313.class);
                    startActivityForResult(myIntent, 137);
                }
                if(position==138){
                    Intent myIntent = new Intent(view.getContext(), POL_A314.class);
                    startActivityForResult(myIntent, 138);
                }
                if(position==139){
                    Intent myIntent = new Intent(view.getContext(), POL_B114.class);
                    startActivityForResult(myIntent, 139);
                }
                if(position==140){
                    Intent myIntent = new Intent(view.getContext(), POL_B230.class);
                    startActivityForResult(myIntent, 140);
                }
                if(position==141){
                    Intent myIntent = new Intent(view.getContext(), POL_B233.class);
                    startActivityForResult(myIntent, 141);
                }
                if(position==142){
                    Intent myIntent = new Intent(view.getContext(), POL_B235.class);
                    startActivityForResult(myIntent, 142);
                }
                if(position==143){
                    Intent myIntent = new Intent(view.getContext(), POL_B238.class);
                    startActivityForResult(myIntent, 143);
                }
                if(position==144){
                    Intent myIntent = new Intent(view.getContext(), POL_B239.class);
                    startActivityForResult(myIntent, 144);
                }
                if(position==145){
                    Intent myIntent = new Intent(view.getContext(), POL_B244.class);
                    startActivityForResult(myIntent, 145);
                }
                if(position==146){
                    Intent myIntent = new Intent(view.getContext(), POL_C105.class);
                    startActivityForResult(myIntent, 146);
                }
                if(position==147){
                    Intent myIntent = new Intent(view.getContext(), POL_C106.class);
                    startActivityForResult(myIntent, 147);
                }
                if(position==148){
                    Intent myIntent = new Intent(view.getContext(), POL_E103.class);
                    startActivityForResult(myIntent, 148);
                }
                if(position==149){
                    Intent myIntent = new Intent(view.getContext(), POL_F110.class);
                    startActivityForResult(myIntent, 149);
                }
                if(position==150){
                    Intent myIntent = new Intent(view.getContext(), POL_F124.class);
                    startActivityForResult(myIntent, 150);
                }
                if(position==151){
                    Intent myIntent = new Intent(view.getContext(), POL_F128.class);
                    startActivityForResult(myIntent, 151);
                }
                if(position==152){
                    Intent myIntent = new Intent(view.getContext(), POL_F133A.class);
                    startActivityForResult(myIntent, 152);
                }
                if(position==153){
                    Intent myIntent = new Intent(view.getContext(), POL_F133B.class);
                    startActivityForResult(myIntent, 153);
                }
                if(position==154){
                    Intent myIntent = new Intent(view.getContext(), POL_F136.class);
                    startActivityForResult(myIntent, 154);
                }
                if(position==155){
                    Intent myIntent = new Intent(view.getContext(), POL_F210.class);
                    startActivityForResult(myIntent, 155);
                }
                if(position==156){
                    Intent myIntent = new Intent(view.getContext(), POL_F221.class);
                    startActivityForResult(myIntent, 156);
                }
                if(position==157){
                    Intent myIntent = new Intent(view.getContext(), POL_F320.class);
                    startActivityForResult(myIntent, 157);
                }
                if(position==158){
                    Intent myIntent = new Intent(view.getContext(), POL_F322.class);
                    startActivityForResult(myIntent, 158);
                }
                if(position==159){
                    Intent myIntent = new Intent(view.getContext(), POL_F326.class);
                    startActivityForResult(myIntent, 159);
                }
                if(position==160){
                    Intent myIntent = new Intent(view.getContext(), POL_F327.class);
                    startActivityForResult(myIntent, 160);
                }
                if(position==161){
                    Intent myIntent = new Intent(view.getContext(), POL_F328.class);
                    startActivityForResult(myIntent, 161);
                }
                if(position==162){
                    Intent myIntent = new Intent(view.getContext(), POL_F329.class);
                    startActivityForResult(myIntent, 162);
                }
                if(position==163){
                    Intent myIntent = new Intent(view.getContext(), POL_F332.class);
                    startActivityForResult(myIntent, 163);
                }
                if(position==164){
                    Intent myIntent = new Intent(view.getContext(), STR2_B02.class);
                    startActivityForResult(myIntent, 164);
                }






            }
        });
    }
}


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

public class RoomActivity extends AppCompatActivity {

    private DrawerLayout dl;
    private ActionBarDrawerToggle t;
    private NavigationView nv;


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
                    case R.id.nav_student:
                        Intent intent = new Intent(RoomActivity.this, StudentActivity.class);
                        startActivity(intent);
                        break;
                    case R.id.nav_teacher:
                        Intent intent1 = new Intent(RoomActivity.this, TeacherActivity.class);
                        startActivity(intent1);
                        break;
                    case R.id.nav_timetable:
                        Intent intent2 = new Intent(RoomActivity.this, MainActivity.class);
                        startActivity(intent2);
                        break;
                    case R.id.nav_group:
                        Intent intent3 = new Intent(RoomActivity.this, GroupActivity.class);
                        startActivity(intent3);
                        break;
                    case R.id.action_settings:
                        Intent intent4 = new Intent(RoomActivity.this, Settings.class);
                        startActivity(intent4);
                    default:
                        return true;
                }

                return true;
            }
        });



    }

//    @Override
//    public boolean onOptionsItemSelected(MenuItem item) {
//        if (t.onOptionsItemSelected(item))
//            return true;
//        return super.onOptionsItemSelected(item);
//    }


}

*/
