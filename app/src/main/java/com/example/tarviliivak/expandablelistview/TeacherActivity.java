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

public class TeacherActivity extends AppCompatActivity {

    private DrawerLayout dl;
    private ActionBarDrawerToggle t;
    private NavigationView nv;

    String items[] = new String [] {"Aile Laats","Ain Veskiväli","Aina Rüütel","Airi Auser","Aivar Krull","Aivar Lippmaa","Alina Orlova","Allan Patska","Andreas Sester","Andrus Kolonistov","Anna Karutina","Anne Krull","Anne Mootse","Annereet Paatsi","Anti Kustassoo",
            "Anu Tintera","Arno Ratas","Astra Pintson-Käo","Berit Hipponen","Bianka Makoid","Diana Eller","Edda Sõõru","Edvard Lõhmus","Ele Nurk","Elen Nurm","Elika Raal-Kikas","Elis Liblik","Eliseta Talviste","Ellen Aunin","Elme Sälik","Elo Õun","Ene Jõeveer","Erna Urm","Eve Mäeorg",
            "Eve Siimus","Evely Vutt","Gen Lee","Gerda Ode","Gerly Sepping","Harri Laustam","Hedi Männi","Heigo Lipp","Heiki Keem","Hele Moor","Helin Liiv","Helina Esnar","Hellika Ivanov-Simson","Helver Kooser","Helvi Teigar","Henno Täht","Hille Alberg","Hindrek Sokk","Ilvi Palu","Inga Ilves","Ingrid Sööt","Iolanda Pärtmaa",
            "Iraida Krivoguzova","Irina Võsar","Ismail Mirzojev","Ivar Kaine","Jaan Peetso","Janari Zirk","Jelena Kutšmuk","Johannes Soobik","Julia  Kovalenko","Kaarel Rodima","Kadri Meesak","Kaido Tammepõld","Kaido Toobal","Kaido Voitra","Kaire Jõgi","Kaire Välb","Kairi Timusk","Kalle Viira","Kalmer Kollom",
            "Kamilla Lüdikainen","Karin Lindmägi","Karin Roosipuu","Karin Traks","Katrin Jurs","Katrin Kont","Katrin Krünvald","Katrin Põhako","Kersti Poska","Ksenia George","Kätlin Kask","Külliki Vaske","Laili Kannel","Larissa Sidoruk","Lauri Maran","Lehte Teern","Lembit Arus","Liia Sinivee","Liis Jurjev",
            "Liivi Albre","Liivi Raudsepp","Lili Kängsepp","Lilija Suburg","Ljudmila Klotško","Ly Otsa","Maarja Lebedev","Maarja Tsimmer","Madli Rööpmann","Maicel Pütt","Maigi Lepik","Maire Kask","Maire Linsi","Maire Merits","Maiu Praakli","Maksim Tjukin","Malle Kalmus","Maret Männik","Maret Võrno",
            "Marge Kusplap","Margit Põldmaa","Margus Ainsalu","Mariana Rand","Marika Paulus","Maris Tigas","Marju Bergmann","Marko Mumm","Marlene Altmäe","Martin Hanson","Mati Malm","Meelis Vaher","Meida Veskus","Merike Kangro","Merle Truupõld","Mihhail Karutin","Mirjam-Merike Sõmer","Monika Lattik","Nikolai Jukin",
            "Olga Lugina","Oskar Hint","Paula Mall Pedmanson","Pille Kessel","Piret Neihaus","Piret Tamm","Pärt Blank","Raissa Orlova","Rait Koort","Rando Koks","Reeli Engelbrecht","Reet Saarep","Reido Orov","Rene Lukk","Riina Mändla","Riivo Rivimets",
            "Risto Asso","Signe Vedler","Sigrid Ester Tani","Siiri Kütt","Sille Eero","Sille Lillestik","Silvia Pihu","Siret Zirk","Sirje Jäär","Sirje Kikas","Sulev Kiivit","Taissa Sulajeva","Tanel Plovits","Tarmo Rand","Tarmo Teekivi","Tauri Moones","Tauris Viljar","Tiina Aidnik","Tiina Friedrichson",
            "Tiina Hintser","Tiina Ilus","Tiina Kraav","Tiina Kärner","Tiiu Kruusmaa","Tiiu Vellevoog","Timo Puistaja","Toomas Sommer","Tõnu Mustjõgi","Urmas Treier","Vaike Vetka","Valdur Leppik","Valdo Abel","Veronica Reimaa","Viktoria Anušova","Villu Repän","Vilve Pohla","Vladislav Tsaregordtsev","Õnnela Muuga",
            "Ülle Antson","Ülle Kruuda","Ülle Soeson"};

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
                         Intent intent1 = new Intent(TeacherActivity.this, GroupActivity.class);
                         startActivity(intent1);
                         break;
                     case R.id.nav_timetable:
                         Intent intent2 = new Intent(TeacherActivity.this, MainActivity.class);
                         startActivity(intent2);
                         break;
                     case R.id.nav_room:
                         Intent intent3 = new Intent(TeacherActivity.this, RoomActivity.class);
                         startActivity(intent3);
                         break;
                     case R.id.action_settings:
                         Intent intent4 = new Intent(TeacherActivity.this, Settings.class);
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

                /*if(position==0){
                    Intent myIntent = new Intent(view.getContext(), Aile_Laats.class);
                    startActivityForResult(myIntent, 0);
                }*/
                if(position==0){
                    Intent myIntent = new Intent(view.getContext(), Aile_Laats.class);
                    startActivityForResult(myIntent, 1);
                }
                if(position==1){
                    Intent myIntent = new Intent(view.getContext(), Ain_Veskivali.class);
                    startActivityForResult(myIntent, 1);
                }
                if(position==2){
                    Intent myIntent = new Intent(view.getContext(), Aina_Ruutel.class);
                    startActivityForResult(myIntent, 2);
                }
                if(position==3){
                    Intent myIntent = new Intent(view.getContext(), Airi_Auser.class);
                    startActivityForResult(myIntent, 3);
                }
                if(position==4){
                    Intent myIntent = new Intent(view.getContext(), Aivar_Krull.class);
                    startActivityForResult(myIntent, 4);
                }
                if(position==5){
                    Intent myIntent = new Intent(view.getContext(), Aivar_Lippmaa.class);
                    startActivityForResult(myIntent, 5);
                }
                if(position==6){
                    Intent myIntent = new Intent(view.getContext(), Alina_Orlova.class);
                    startActivityForResult(myIntent, 6);
                }
                if(position==7){
                    Intent myIntent = new Intent(view.getContext(), Allan_Patska.class);
                    startActivityForResult(myIntent, 7);
                }
                if(position==8){
                    Intent myIntent = new Intent(view.getContext(), Andreas_Sester.class);
                    startActivityForResult(myIntent, 8);
                }
                if(position==9){
                    Intent myIntent = new Intent(view.getContext(), Andrus_Kolonistov.class);
                    startActivityForResult(myIntent, 9);
                }
                if(position==10){
                    Intent myIntent = new Intent(view.getContext(), Anna_Karutina.class);
                    startActivityForResult(myIntent, 10);
                }
                if(position==11){
                    Intent myIntent = new Intent(view.getContext(), Anne_Krull.class);
                    startActivityForResult(myIntent, 11);
                }
                if(position==12){
                    Intent myIntent = new Intent(view.getContext(), Anne_Mootse.class);
                    startActivityForResult(myIntent, 12);
                }
                if(position==13){
                    Intent myIntent = new Intent(view.getContext(), Annereet_Paatsi.class);
                    startActivityForResult(myIntent, 13);
                }
                if(position==14){
                    Intent myIntent = new Intent(view.getContext(), Anti_Kustassoo.class);
                    startActivityForResult(myIntent, 14);
                }
                if(position==15){
                    Intent myIntent = new Intent(view.getContext(), Anu_Tintera.class);
                    startActivityForResult(myIntent, 15);
                }
                if(position==16){
                    Intent myIntent = new Intent(view.getContext(), Arno_Ratas.class);
                    startActivityForResult(myIntent, 16);
                }
                if(position==17){
                    Intent myIntent = new Intent(view.getContext(), Astra_Pintson.class);
                    startActivityForResult(myIntent, 17);
                }
                if(position==18){
                    Intent myIntent = new Intent(view.getContext(), Berit_Hipponen.class);
                    startActivityForResult(myIntent, 18);
                }
                if(position==19){
                    Intent myIntent = new Intent(view.getContext(), Bianka_Makoid.class);
                    startActivityForResult(myIntent, 19);
                }
                if(position==20){
                    Intent myIntent = new Intent(view.getContext(), Diana_Eller.class);
                    startActivityForResult(myIntent, 20);
                }
                if(position==21){
                    Intent myIntent = new Intent(view.getContext(), Edda_Sooru.class);
                    startActivityForResult(myIntent, 21);
                }
                if(position==22){
                    Intent myIntent = new Intent(view.getContext(), Edvard_Lohmus.class);
                    startActivityForResult(myIntent, 22);
                }
                if(position==23){
                    Intent myIntent = new Intent(view.getContext(), Ele_Nurk.class);
                    startActivityForResult(myIntent, 23);
                }
                if(position==24){
                    Intent myIntent = new Intent(view.getContext(), Elen_Nurm.class);
                    startActivityForResult(myIntent, 24);
                }
                if(position==25){
                    Intent myIntent = new Intent(view.getContext(), Elika_Raal_Kikas.class);
                    startActivityForResult(myIntent, 25);
                }
                if(position==26){
                    Intent myIntent = new Intent(view.getContext(), Elis_Liblik.class);
                    startActivityForResult(myIntent, 26);
                }
                if(position==27){
                    Intent myIntent = new Intent(view.getContext(), Eliseta_Talviste.class);
                    startActivityForResult(myIntent, 27);
                }
                if(position==28){
                    Intent myIntent = new Intent(view.getContext(), Ellen_Aunin.class);
                    startActivityForResult(myIntent, 28);
                }
                if(position==29){
                    Intent myIntent = new Intent(view.getContext(), Elme_Salik.class);
                    startActivityForResult(myIntent, 29);
                }
                if(position==30){
                    Intent myIntent = new Intent(view.getContext(), Elo_Oun.class);
                    startActivityForResult(myIntent, 30);
                }
                if(position==31){
                    Intent myIntent = new Intent(view.getContext(), Ene_Joeveer.class);
                    startActivityForResult(myIntent, 31);
                }
                if(position==32){
                    Intent myIntent = new Intent(view.getContext(), Erna_Urm.class);
                    startActivityForResult(myIntent, 32);
                }
                if(position==33){
                    Intent myIntent = new Intent(view.getContext(), Eve_Maeorg.class);
                    startActivityForResult(myIntent, 33);
                }
                if(position==34){
                    Intent myIntent = new Intent(view.getContext(), Eve_Siimus.class);
                    startActivityForResult(myIntent, 34);
                }
                if(position==35){
                    Intent myIntent = new Intent(view.getContext(), Evely_Vutt.class);
                    startActivityForResult(myIntent, 35);
                }
                if(position==36){
                    Intent myIntent = new Intent(view.getContext(), Gen_Lee.class);
                    startActivityForResult(myIntent, 36);
                }
                if(position==37){
                    Intent myIntent = new Intent(view.getContext(), Gerda_Ode.class);
                    startActivityForResult(myIntent, 37);
                }
                if(position==38){
                    Intent myIntent = new Intent(view.getContext(), Gerly_Sepping.class);
                    startActivityForResult(myIntent, 38);
                }
                if(position==39){
                    Intent myIntent = new Intent(view.getContext(), Harri_Laustam.class);
                    startActivityForResult(myIntent, 39);
                }
                if(position==40){
                    Intent myIntent = new Intent(view.getContext(), Hedi_Manni.class);
                    startActivityForResult(myIntent, 40);
                }
                if(position==41){
                    Intent myIntent = new Intent(view.getContext(), Heigo_Lipp.class);
                    startActivityForResult(myIntent, 41);
                }
                if(position==42){
                    Intent myIntent = new Intent(view.getContext(), Heiki_Keem.class);
                    startActivityForResult(myIntent, 42);
                }
                if(position==43){
                    Intent myIntent = new Intent(view.getContext(), Hele_Moor.class);
                    startActivityForResult(myIntent, 43);
                }
                if(position==44){
                    Intent myIntent = new Intent(view.getContext(), Helin_Liiv.class);
                    startActivityForResult(myIntent, 44);
                }
                if(position==45){
                    Intent myIntent = new Intent(view.getContext(), Helina_Esnar.class);
                    startActivityForResult(myIntent, 45);
                }
                if(position==46){
                    Intent myIntent = new Intent(view.getContext(), Hellika_Ivanov_Simson.class);
                    startActivityForResult(myIntent, 46);
                }
                if(position==47){
                    Intent myIntent = new Intent(view.getContext(), Helver_Kooser.class);
                    startActivityForResult(myIntent, 47);
                }
                if(position==48){
                    Intent myIntent = new Intent(view.getContext(), Helvi_Teigar.class);
                    startActivityForResult(myIntent, 48);
                }
                if(position==49){
                    Intent myIntent = new Intent(view.getContext(), Henno_Taht.class);
                    startActivityForResult(myIntent, 49);
                }
                if(position==50){
                    Intent myIntent = new Intent(view.getContext(), Hille_Alberg.class);
                    startActivityForResult(myIntent, 50);
                }
                if(position==51){
                    Intent myIntent = new Intent(view.getContext(), Hindrek_Sokk.class);
                    startActivityForResult(myIntent, 51);
                }
                if(position==52){
                    Intent myIntent = new Intent(view.getContext(), Ilvi_Palu.class);
                    startActivityForResult(myIntent, 52);
                }
                if(position==53){
                    Intent myIntent = new Intent(view.getContext(), Inga_Ilves.class);
                    startActivityForResult(myIntent, 53);
                }
                if(position==54){
                    Intent myIntent = new Intent(view.getContext(), Ingrid_Soot.class);
                    startActivityForResult(myIntent, 54);
                }
                if(position==55){
                    Intent myIntent = new Intent(view.getContext(), Iolanda_Partmaa.class);
                    startActivityForResult(myIntent, 55);
                }
                if(position==56){
                    Intent myIntent = new Intent(view.getContext(), Iraida_Krivoguzova.class);
                    startActivityForResult(myIntent, 56);
                }
                if(position==57){
                    Intent myIntent = new Intent(view.getContext(), Irina_Vosar.class);
                    startActivityForResult(myIntent, 57);
                }
                if(position==58){
                    Intent myIntent = new Intent(view.getContext(), Ismail_Mirzojev.class);
                    startActivityForResult(myIntent, 58);
                }
                if(position==59){
                    Intent myIntent = new Intent(view.getContext(), Ivar_Kaine.class);
                    startActivityForResult(myIntent, 59);
                }
                if(position==60){
                    Intent myIntent = new Intent(view.getContext(), Jaan_Peetso.class);
                    startActivityForResult(myIntent, 60);
                }
                if(position==61){
                    Intent myIntent = new Intent(view.getContext(), Janari_Zirk.class);
                    startActivityForResult(myIntent, 61);
                }
                if(position==62){
                    Intent myIntent = new Intent(view.getContext(), Jelena_Kutsmuk.class);
                    startActivityForResult(myIntent, 62);
                }
                if(position==63){
                    Intent myIntent = new Intent(view.getContext(), Johannes_Soobik.class);
                    startActivityForResult(myIntent, 63);
                }
                if(position==64){
                    Intent myIntent = new Intent(view.getContext(), Julia_Kovalenko.class);
                    startActivityForResult(myIntent, 64);
                }
                if(position==65){
                    Intent myIntent = new Intent(view.getContext(), Kaarel_Rodima.class);
                    startActivityForResult(myIntent, 65);
                }
                if(position==66){
                    Intent myIntent = new Intent(view.getContext(), Kadri_Meesak.class);
                    startActivityForResult(myIntent, 66);
                }
                if(position==67){
                    Intent myIntent = new Intent(view.getContext(), Kaido_Tammepold.class);
                    startActivityForResult(myIntent, 67);
                }
                if(position==68){
                    Intent myIntent = new Intent(view.getContext(), Kaido_Toobal.class);
                    startActivityForResult(myIntent, 68);
                }
                if(position==69){
                    Intent myIntent = new Intent(view.getContext(), Kaido_Voitra.class);
                    startActivityForResult(myIntent, 69);
                }
                if(position==70){
                    Intent myIntent = new Intent(view.getContext(), Kaire_Jogi.class);
                    startActivityForResult(myIntent, 70);
                }
                if(position==71){
                    Intent myIntent = new Intent(view.getContext(), Kaire_Valb.class);
                    startActivityForResult(myIntent, 71);
                }
                if(position==72){
                    Intent myIntent = new Intent(view.getContext(), Kairi_Timusk.class);
                    startActivityForResult(myIntent, 72);
                }
                if(position==73){
                    Intent myIntent = new Intent(view.getContext(), Kalle_Viira.class);
                    startActivityForResult(myIntent, 73);
                }
                if(position==74){
                    Intent myIntent = new Intent(view.getContext(), Kalmer_Kollom.class);
                    startActivityForResult(myIntent, 74);
                }
                if(position==75){
                    Intent myIntent = new Intent(view.getContext(), Kamilla_Ludikainen.class);
                    startActivityForResult(myIntent, 75);
                }
                if(position==76){
                    Intent myIntent = new Intent(view.getContext(), Karin_Lindmagi.class);
                    startActivityForResult(myIntent, 76);
                }
                if(position==77){
                    Intent myIntent = new Intent(view.getContext(), Karin_Roosipuu.class);
                    startActivityForResult(myIntent, 77);
                }
                if(position==78){
                    Intent myIntent = new Intent(view.getContext(), Karin_Traks.class);
                    startActivityForResult(myIntent, 78);
                }
                if(position==79){
                    Intent myIntent = new Intent(view.getContext(), Katrin_Jurs.class);
                    startActivityForResult(myIntent, 79);
                }
                if(position==80){
                    Intent myIntent = new Intent(view.getContext(), Katrin_Kont.class);
                    startActivityForResult(myIntent, 80);
                }
                if(position==81){
                    Intent myIntent = new Intent(view.getContext(), Katrin_Krunvald.class);
                    startActivityForResult(myIntent, 81);
                }
                if(position==82){
                    Intent myIntent = new Intent(view.getContext(), Katrin_Pohako.class);
                    startActivityForResult(myIntent, 82);
                }
                if(position==83){
                    Intent myIntent = new Intent(view.getContext(), Kersti_Poska.class);
                    startActivityForResult(myIntent, 83);
                }
                if(position==84){
                    Intent myIntent = new Intent(view.getContext(), Ksenia_George.class);
                    startActivityForResult(myIntent, 84);
                }
                if(position==85){
                    Intent myIntent = new Intent(view.getContext(), Katlin_Kask.class);
                    startActivityForResult(myIntent, 78);
                }
                if(position==86){
                    Intent myIntent = new Intent(view.getContext(), Kulliki_Vaske.class);
                    startActivityForResult(myIntent, 86);
                }
                if(position==87){
                    Intent myIntent = new Intent(view.getContext(), Laili_Kannel.class);
                    startActivityForResult(myIntent, 87);
                }
                if(position==88){
                    Intent myIntent = new Intent(view.getContext(), Larissa_Sidoruk.class);
                    startActivityForResult(myIntent, 88);
                }
                if(position==89){
                    Intent myIntent = new Intent(view.getContext(), Lauri_Maran.class);
                    startActivityForResult(myIntent, 89);
                }
                if(position==90){
                    Intent myIntent = new Intent(view.getContext(), Lehte_Teern.class);
                    startActivityForResult(myIntent, 90);
                }
                if(position==91){
                    Intent myIntent = new Intent(view.getContext(), Lembit_Arus.class);
                    startActivityForResult(myIntent, 91);
                }
                if(position==92){
                    Intent myIntent = new Intent(view.getContext(), Liia_Sinivee.class);
                    startActivityForResult(myIntent, 92);
                }
                if(position==93){
                    Intent myIntent = new Intent(view.getContext(), Liis_Jurjev.class);
                    startActivityForResult(myIntent, 93);
                }
                if(position==94){
                    Intent myIntent = new Intent(view.getContext(), Liivi_Albre.class);
                    startActivityForResult(myIntent, 95);
                }
                if(position==95){
                    Intent myIntent = new Intent(view.getContext(), Liivi_Raudsepp.class);
                    startActivityForResult(myIntent, 95);
                }
                if(position==96){
                    Intent myIntent = new Intent(view.getContext(), Lili_Kangsepp.class);
                    startActivityForResult(myIntent, 96);
                }
                if(position==97){
                    Intent myIntent = new Intent(view.getContext(), Lilija_Suburg.class);
                    startActivityForResult(myIntent, 97);
                }
                if(position==98){
                    Intent myIntent = new Intent(view.getContext(), Ljudmila_Klotsko.class);
                    startActivityForResult(myIntent, 98);
                }
                if(position==99){
                    Intent myIntent = new Intent(view.getContext(), Ly_Otsa.class);
                    startActivityForResult(myIntent, 99);
                }
                if(position==100){
                    Intent myIntent = new Intent(view.getContext(), Maarja_Lebedev.class);
                    startActivityForResult(myIntent, 100);
                }
                if(position==101){
                    Intent myIntent = new Intent(view.getContext(), Maarja_Tsimmer.class);
                    startActivityForResult(myIntent, 101);
                }
                if(position==102){
                    Intent myIntent = new Intent(view.getContext(), Madli_Roopmann.class);
                    startActivityForResult(myIntent, 102);
                }
                if(position==103){
                    Intent myIntent = new Intent(view.getContext(), Maicel_Putt.class);
                    startActivityForResult(myIntent, 103);
                }
                if(position==104){
                    Intent myIntent = new Intent(view.getContext(), Maigi_Lepik.class);
                    startActivityForResult(myIntent, 104);
                }
                if(position==105){
                    Intent myIntent = new Intent(view.getContext(), Maire_Kask.class);
                    startActivityForResult(myIntent, 105);
                }
                if(position==106){
                    Intent myIntent = new Intent(view.getContext(), Maire_Linsi.class);
                    startActivityForResult(myIntent, 106);
                }
                if(position==107){
                    Intent myIntent = new Intent(view.getContext(), Maire_Merits.class);
                    startActivityForResult(myIntent, 107);
                }
                if(position==108){
                    Intent myIntent = new Intent(view.getContext(), Maiu_Praakli.class);
                    startActivityForResult(myIntent, 108);
                }
                if(position==109){
                    Intent myIntent = new Intent(view.getContext(), Maksim_Tjukin.class);
                    startActivityForResult(myIntent, 109);
                }
                if(position==110){
                    Intent myIntent = new Intent(view.getContext(), Malle_Kalmus.class);
                    startActivityForResult(myIntent, 110);
                }
                if(position==111){
                    Intent myIntent = new Intent(view.getContext(), Maret_Mannik.class);
                    startActivityForResult(myIntent, 111);
                }
                if(position==112){
                    Intent myIntent = new Intent(view.getContext(), Maret_Vorno.class);
                    startActivityForResult(myIntent, 112);
                }
                if(position==113){
                    Intent myIntent = new Intent(view.getContext(), Marge_Kuslap.class);
                    startActivityForResult(myIntent, 113);
                }
                if(position==114){
                    Intent myIntent = new Intent(view.getContext(), Margit_Poldmaa.class);
                    startActivityForResult(myIntent, 114);
                }
                if(position==115){
                    Intent myIntent = new Intent(view.getContext(), Margus_Ainsalu.class);
                    startActivityForResult(myIntent, 115);
                }
                if(position==116){
                    Intent myIntent = new Intent(view.getContext(), Mariana_Rand.class);
                    startActivityForResult(myIntent, 116);
                }
                if(position==117){
                    Intent myIntent = new Intent(view.getContext(), Marika_Paulus.class);
                    startActivityForResult(myIntent, 117);
                }
                if(position==118){
                    Intent myIntent = new Intent(view.getContext(), Maris_Tigas.class);
                    startActivityForResult(myIntent, 118);
                }
                if(position==119){
                    Intent myIntent = new Intent(view.getContext(), Marju_Bergmann.class);
                    startActivityForResult(myIntent, 119);
                }
                if(position==120){
                    Intent myIntent = new Intent(view.getContext(), Marko_Mumm.class);
                    startActivityForResult(myIntent, 120);
                }
                if(position==121){
                    Intent myIntent = new Intent(view.getContext(), Marlene_Altmae.class);
                    startActivityForResult(myIntent, 121);
                }
                if(position==122){
                    Intent myIntent = new Intent(view.getContext(), Martin_Hanson.class);
                    startActivityForResult(myIntent, 122);
                }
                if(position==123){
                    Intent myIntent = new Intent(view.getContext(), Mati_Malm.class);
                    startActivityForResult(myIntent, 123);
                }
                if(position==124){
                    Intent myIntent = new Intent(view.getContext(), Meelis_Vaher.class);
                    startActivityForResult(myIntent, 124);
                }
                if(position==125){
                    Intent myIntent = new Intent(view.getContext(), Meida_Veskus.class);
                    startActivityForResult(myIntent, 125);
                }
                if(position==126){
                    Intent myIntent = new Intent(view.getContext(), Merike_Kangro.class);
                    startActivityForResult(myIntent, 126);
                }
                if(position==127){
                    Intent myIntent = new Intent(view.getContext(), Merle_Truupold.class);
                    startActivityForResult(myIntent, 127);
                }
                if(position==128){
                    Intent myIntent = new Intent(view.getContext(), Mihhail_Karutin.class);
                    startActivityForResult(myIntent, 128);
                }
                if(position==129){
                    Intent myIntent = new Intent(view.getContext(), Mirjam_Merike_Somer.class);
                    startActivityForResult(myIntent, 129);
                }
                if(position==130){
                    Intent myIntent = new Intent(view.getContext(), Monika_Lattik.class);
                    startActivityForResult(myIntent, 130);
                }
                if(position==131){
                    Intent myIntent = new Intent(view.getContext(), Nikolai_Jukin.class);
                    startActivityForResult(myIntent, 131);
                }
                if(position==132){
                    Intent myIntent = new Intent(view.getContext(), Olga_Lugina.class);
                    startActivityForResult(myIntent, 132);
                }
                if(position==133){
                    Intent myIntent = new Intent(view.getContext(), Oskar_Hint.class);
                    startActivityForResult(myIntent, 133);
                }
                if(position==134){
                    Intent myIntent = new Intent(view.getContext(), Paula_Mall_Pedmanson.class);
                    startActivityForResult(myIntent, 134);
                }
                if(position==135){
                    Intent myIntent = new Intent(view.getContext(), Pille_Kessel.class);
                    startActivityForResult(myIntent, 135);
                }
                if(position==136){
                    Intent myIntent = new Intent(view.getContext(), Piret_Neihaus.class);
                    startActivityForResult(myIntent, 136);
                }
                if(position==137){
                    Intent myIntent = new Intent(view.getContext(), Piret_Tamm.class);
                    startActivityForResult(myIntent, 137);
                }
                if(position==138){
                    Intent myIntent = new Intent(view.getContext(), Part_Blank.class);
                    startActivityForResult(myIntent, 138);
                }
                if(position==139){
                    Intent myIntent = new Intent(view.getContext(), Raissa_Orlova.class);
                    startActivityForResult(myIntent, 139);
                }
                if(position==140){
                    Intent myIntent = new Intent(view.getContext(), Rait_Koort.class);
                    startActivityForResult(myIntent, 140);
                }
                if(position==141){
                    Intent myIntent = new Intent(view.getContext(), Rando_Koks.class);
                    startActivityForResult(myIntent, 141);
                }
                if(position==142){
                    Intent myIntent = new Intent(view.getContext(), Reeli_Engelbrecht.class);
                    startActivityForResult(myIntent, 142);
                }
                if(position==143){
                    Intent myIntent = new Intent(view.getContext(), Reet_Saarep.class);
                    startActivityForResult(myIntent, 143);
                }
                if(position==144){
                    Intent myIntent = new Intent(view.getContext(), Reido_Orov.class);
                    startActivityForResult(myIntent, 144);
                }
                if(position==145){
                    Intent myIntent = new Intent(view.getContext(), Rene_Lukk.class);
                    startActivityForResult(myIntent, 145);
                }
                if(position==146){
                    Intent myIntent = new Intent(view.getContext(), Riina_Mandla.class);
                    startActivityForResult(myIntent, 146);
                }
                if(position==147){
                    Intent myIntent = new Intent(view.getContext(), Riivo_Rivimets.class);
                    startActivityForResult(myIntent, 147);
                }
                if(position==148){
                    Intent myIntent = new Intent(view.getContext(), Risto_Asso.class);
                    startActivityForResult(myIntent, 148);
                }
                if(position==149){
                    Intent myIntent = new Intent(view.getContext(), Signe_Vedler.class);
                    startActivityForResult(myIntent, 149);
                }
                if(position==150){
                    Intent myIntent = new Intent(view.getContext(), Sigrid_Ester_Tani.class);
                    startActivityForResult(myIntent, 150);
                }
                if(position==151){
                    Intent myIntent = new Intent(view.getContext(), Siiri_Kutt.class);
                    startActivityForResult(myIntent, 151);
                }
                if(position==152){
                    Intent myIntent = new Intent(view.getContext(), Sille_Eero.class);
                    startActivityForResult(myIntent, 152);
                }
                if(position==153){
                    Intent myIntent = new Intent(view.getContext(), Sille_Lillestik.class);
                    startActivityForResult(myIntent, 153);
                }
                if(position==154){
                    Intent myIntent = new Intent(view.getContext(), Silvia_Pihu.class);
                    startActivityForResult(myIntent, 154);
                }
                if(position==155){
                    Intent myIntent = new Intent(view.getContext(), Siret_Zirk.class);
                    startActivityForResult(myIntent, 155);
                }
                if(position==156){
                    Intent myIntent = new Intent(view.getContext(), Sirje_Jaar.class);
                    startActivityForResult(myIntent, 156);
                }
                if(position==157){
                    Intent myIntent = new Intent(view.getContext(), Sirje_Kikas.class);
                    startActivityForResult(myIntent, 157);
                }
                if(position==158){
                    Intent myIntent = new Intent(view.getContext(), Sulev_Kiivit.class);
                    startActivityForResult(myIntent, 158);
                }
                if(position==159){
                    Intent myIntent = new Intent(view.getContext(), Taissa_Sulajeva.class);
                    startActivityForResult(myIntent, 159);
                }
                if(position==160){
                    Intent myIntent = new Intent(view.getContext(), Tanel_Plovits.class);
                    startActivityForResult(myIntent, 160);
                }
                if(position==161){
                    Intent myIntent = new Intent(view.getContext(), Tarmo_Rand.class);
                    startActivityForResult(myIntent, 161);
                }
                if(position==162){
                    Intent myIntent = new Intent(view.getContext(), Tarmo_Teekivi.class);
                    startActivityForResult(myIntent, 162);
                }
                if(position==163){
                    Intent myIntent = new Intent(view.getContext(), Tauri_Moones.class);
                    startActivityForResult(myIntent, 163);
                }
                if(position==164){
                    Intent myIntent = new Intent(view.getContext(), Tauris_Viljar.class);
                    startActivityForResult(myIntent, 164);
                }
                if(position==165){
                    Intent myIntent = new Intent(view.getContext(), Tiina_Aidnik.class);
                    startActivityForResult(myIntent, 165);
                }
                if(position==166){
                    Intent myIntent = new Intent(view.getContext(), Tiina_Friedrichson.class);
                    startActivityForResult(myIntent, 166);
                }
                if(position==167){
                    Intent myIntent = new Intent(view.getContext(), Tiina_Hintser.class);
                    startActivityForResult(myIntent, 167);
                }
                if(position==168){
                    Intent myIntent = new Intent(view.getContext(), Tiina_Ilus.class);
                    startActivityForResult(myIntent, 168);
                }
                if(position==169){
                    Intent myIntent = new Intent(view.getContext(), Tiina_Kraav.class);
                    startActivityForResult(myIntent, 169);
                }
                if(position==170){
                    Intent myIntent = new Intent(view.getContext(), Tiina_Karner.class);
                    startActivityForResult(myIntent, 170);
                }
                if(position==171){
                    Intent myIntent = new Intent(view.getContext(), Tiiu_Kruusmaa.class);
                    startActivityForResult(myIntent, 171);
                }
                if(position==172){
                    Intent myIntent = new Intent(view.getContext(), Tiiu_Vellevoog.class);
                    startActivityForResult(myIntent, 172);
                }
                if(position==173){
                    Intent myIntent = new Intent(view.getContext(), Timo_Puistaja.class);
                    startActivityForResult(myIntent, 173);
                }
                if(position==174){
                    Intent myIntent = new Intent(view.getContext(), Toomas_Sommer.class);
                    startActivityForResult(myIntent, 174);
                }
                if(position==175){
                    Intent myIntent = new Intent(view.getContext(), Tonu_Mustjogi.class);
                    startActivityForResult(myIntent, 175);
                }
                if(position==176){
                    Intent myIntent = new Intent(view.getContext(), Urmas_Treier.class);
                    startActivityForResult(myIntent, 176);
                }
                if(position==177){
                    Intent myIntent = new Intent(view.getContext(), Vaike_Vetka.class);
                    startActivityForResult(myIntent, 177);
                }
                if(position==178){
                    Intent myIntent = new Intent(view.getContext(), Valdur_Leppik.class);
                    startActivityForResult(myIntent, 178);
                }
                if(position==179){
                    Intent myIntent = new Intent(view.getContext(), Valdo_Abel.class);
                    startActivityForResult(myIntent, 179);
                }
                if(position==180){
                    Intent myIntent = new Intent(view.getContext(), Veronica_Reimaa.class);
                    startActivityForResult(myIntent, 180);
                }
                if(position==181){
                    Intent myIntent = new Intent(view.getContext(), Viktoria_Anusova.class);
                    startActivityForResult(myIntent, 181);
                }
                if(position==182){
                    Intent myIntent = new Intent(view.getContext(), Villu_Repan.class);
                    startActivityForResult(myIntent, 182);
                }
                if(position==183){
                    Intent myIntent = new Intent(view.getContext(), Vilve_Pohla.class);
                    startActivityForResult(myIntent, 183);
                }
                if(position==184){
                    Intent myIntent = new Intent(view.getContext(), Vladislav_Tsaregordtsev.class);
                    startActivityForResult(myIntent, 184);
                }
                if(position==185){
                    Intent myIntent = new Intent(view.getContext(), Onnela_Muuga.class);
                    startActivityForResult(myIntent, 185);
                }
                if(position==186){
                    Intent myIntent = new Intent(view.getContext(), Ulle_Antson.class);
                    startActivityForResult(myIntent, 186);
                }
                if(position==187){
                    Intent myIntent = new Intent(view.getContext(), Ulle_Kruuda.class);
                    startActivityForResult(myIntent, 187);
                }
                if(position==188){
                    Intent myIntent = new Intent(view.getContext(), Ulle_Soeson.class);
                    startActivityForResult(myIntent, 188);
                }
            }
        });
    }
}

