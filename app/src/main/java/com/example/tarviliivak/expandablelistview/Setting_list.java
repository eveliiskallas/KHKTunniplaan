package com.example.tarviliivak.expandablelistview;

import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcelable;
import android.support.annotation.NonNull;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Adapter;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.Spinner;
import android.widget.SpinnerAdapter;
import android.widget.TextView;
import android.widget.Toast;

import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.io.Serializable;
import java.sql.Array;
import java.util.ArrayList;
import java.util.List;

public class Setting_list extends Fragment {

    List<Info> infoList;

    RecyclerView recyclerView;

    InfoAdapter infoAdapter;





    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {


        View view = inflater.inflate(R.layout.fragment_setting_list, container, false);
        Button btnFragment = (Button) view.findViewById(R.id.back);

        btnFragment.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentTransaction fr = getFragmentManager().beginTransaction();
                fr.replace(R.id.container, new Setting_btn());
                fr.commit();
            }
        });




        ListView group = (ListView)view.findViewById(R.id.group_list);
            group.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                @Override
                public void onItemClick(AdapterView<?> parent, final View view, final int position, long id) {
                    if (position == 0) {
                        Intent myIntent = new Intent(view.getContext(), AI18.class);
                        startActivityForResult(myIntent, 0);
                    }


                    if (position == 1) {
                        Intent myIntent = new Intent(view.getContext(), AI19.class);
                        startActivityForResult(myIntent, 1);
                    }

                    if (position == 2) {
                        Intent myIntent = new Intent(view.getContext(), AK18.class);
                        startActivityForResult(myIntent, 2);
                    }

                    if (position == 3) {
                        Intent myIntent = new Intent(view.getContext(), AK19.class);
                        startActivityForResult(myIntent, 3);
                    }

                    if (position == 4) {
                        Intent myIntent = new Intent(view.getContext(), Akt18.class);
                        startActivityForResult(myIntent, 4);

                    }
                    if (position == 5) {
                        Intent myIntent = new Intent(view.getContext(), Akt19.class);
                        startActivityForResult(myIntent, 5);
                    }
                    if (position == 6) {
                        Intent myIntent = new Intent(view.getContext(), AM17.class);
                        startActivityForResult(myIntent, 6);
                    }
                    if (position == 7) {
                        Intent myIntent = new Intent(view.getContext(), AM18.class);
                        startActivityForResult(myIntent, 7);
                    }
                    if (position == 8) {
                        Intent myIntent = new Intent(view.getContext(), AM19.class);
                        startActivityForResult(myIntent, 8);
                    }
                    if (position == 9) {
                        Intent myIntent = new Intent(view.getContext(), AP18.class);
                        startActivityForResult(myIntent, 9);
                    }
                    if (position == 10) {
                        Intent myIntent = new Intent(view.getContext(), AP19.class);
                        startActivityForResult(myIntent, 10);
                    }
                    if (position == 11) {
                        Intent myIntent = new Intent(view.getContext(), APH19.class);
                        startActivityForResult(myIntent, 11);
                    }
                    if (position == 12) {
                        Intent myIntent = new Intent(view.getContext(), APH118.class);
                        startActivityForResult(myIntent, 12);
                    }
                    if (position == 13) {
                        Intent myIntent = new Intent(view.getContext(), APH218.class);
                        startActivityForResult(myIntent, 13);
                    }
                    if (position == 14) {
                        Intent myIntent = new Intent(view.getContext(), APL17.class);
                        startActivityForResult(myIntent, 14);
                    }
                    if (position == 15) {
                        Intent myIntent = new Intent(view.getContext(), APL18.class);
                        startActivityForResult(myIntent, 15);
                    }
                    if (position == 16) {
                        Intent myIntent = new Intent(view.getContext(), APL19.class);
                        startActivityForResult(myIntent, 16);
                    }
                    if (position == 17) {
                        Intent myIntent = new Intent(view.getContext(), ARHt18.class);
                        startActivityForResult(myIntent, 17);
                    }
                    if (position == 18) {
                        Intent myIntent = new Intent(view.getContext(), ARHt19.class);
                        startActivityForResult(myIntent, 18);
                    }
                    if (position == 19) {
                        Intent myIntent = new Intent(view.getContext(), AM17.class);
                        startActivityForResult(myIntent, 19);
                    }
                    if (position == 20) {
                        Intent myIntent = new Intent(view.getContext(), AT117.class);
                        startActivityForResult(myIntent, 20);
                    }
                    if (position == 21) {
                        Intent myIntent = new Intent(view.getContext(), AT118.class);
                        startActivityForResult(myIntent, 21);
                    }
                    if (position == 22) {
                        Intent myIntent = new Intent(view.getContext(), AT119.class);
                        startActivityForResult(myIntent, 22);
                    }
                    if (position == 23) {
                        Intent myIntent = new Intent(view.getContext(), AT217.class);
                        startActivityForResult(myIntent, 23);
                    }
                    if (position == 24) {
                        Intent myIntent = new Intent(view.getContext(), AT218.class);
                        startActivityForResult(myIntent, 24);
                    }
                    if (position == 25) {
                        Intent myIntent = new Intent(view.getContext(), AT219.class);
                        startActivityForResult(myIntent, 25);
                    }
                    if (position == 26) {
                        Intent myIntent = new Intent(view.getContext(), AT318.class);
                        startActivityForResult(myIntent, 26);
                    }
                    if (position == 27) {
                        Intent myIntent = new Intent(view.getContext(), AUD19.class);
                        startActivityForResult(myIntent, 27);
                    }
                    if (position == 28) {
                        Intent myIntent = new Intent(view.getContext(), AUM18.class);
                        startActivityForResult(myIntent, 28);
                    }
                    if (position == 29) {
                        Intent myIntent = new Intent(view.getContext(), AUM19.class);
                        startActivityForResult(myIntent, 29);
                    }
                    if (position == 30) {
                        Intent myIntent = new Intent(view.getContext(), AUT17.class);
                        startActivityForResult(myIntent, 30);
                    }
                    if (position == 31) {
                        Intent myIntent = new Intent(view.getContext(), AUT18.class);
                        startActivityForResult(myIntent, 31);
                    }
                    if (position == 32) {
                        Intent myIntent = new Intent(view.getContext(), BT17.class);
                        startActivityForResult(myIntent, 32);
                    }
                    if (position == 33) {
                        Intent myIntent = new Intent(view.getContext(), BT18.class);
                        startActivityForResult(myIntent, 33);
                    }
                    if (position == 34) {
                        Intent myIntent = new Intent(view.getContext(), BT19.class);
                        startActivityForResult(myIntent, 34);
                    }
                    if (position == 35) {
                        Intent myIntent = new Intent(view.getContext(), CNC19.class);
                        startActivityForResult(myIntent, 35);
                    }
                    if (position == 36) {
                        Intent myIntent = new Intent(view.getContext(), CNC219.class);
                        startActivityForResult(myIntent, 36);
                    }
                    if (position == 37) {
                        Intent myIntent = new Intent(view.getContext(), AM17.class);
                        startActivityForResult(myIntent, 37);
                    }
                    if (position == 38) {
                        Intent myIntent = new Intent(view.getContext(), EH17.class);
                        startActivityForResult(myIntent, 38);
                    }
                    if (position == 39) {
                        Intent myIntent = new Intent(view.getContext(), EH18.class);
                        startActivityForResult(myIntent, 39);
                    }
                    if (position == 40) {
                        Intent myIntent = new Intent(view.getContext(), EH19.class);
                        startActivityForResult(myIntent, 40);
                    }
                    if (position == 41) {
                        Intent myIntent = new Intent(view.getContext(), Eht19.class);
                        startActivityForResult(myIntent, 41);
                    }
                    if (position == 42) {
                        Intent myIntent = new Intent(view.getContext(), EKo19.class);
                        startActivityForResult(myIntent, 42);
                    }
                    if (position == 43) {
                        Intent myIntent = new Intent(view.getContext(), EKt18.class);
                        startActivityForResult(myIntent, 43);
                    }
                    if (position == 44) {
                        Intent myIntent = new Intent(view.getContext(), EV117.class);
                        startActivityForResult(myIntent, 44);
                    }
                    if (position == 45) {
                        Intent myIntent = new Intent(view.getContext(), EV118.class);
                        startActivityForResult(myIntent, 45);
                    }
                    if (position == 46) {
                        Intent myIntent = new Intent(view.getContext(), EV119.class);
                        startActivityForResult(myIntent, 46);
                    }
                    if (position == 47) {
                        Intent myIntent = new Intent(view.getContext(), EV217.class);
                        startActivityForResult(myIntent, 47);
                    }
                    if (position == 48) {
                        Intent myIntent = new Intent(view.getContext(), EV218.class);
                        startActivityForResult(myIntent, 48);
                    }
                    if (position == 49) {
                        Intent myIntent = new Intent(view.getContext(), EV219.class);
                        startActivityForResult(myIntent, 49);
                    }
                    if (position == 50) {
                        Intent myIntent = new Intent(view.getContext(), EVM18.class);
                        startActivityForResult(myIntent, 50);
                    }
                    if (position == 51) {
                        Intent myIntent = new Intent(view.getContext(), EVM19.class);
                        startActivityForResult(myIntent, 51);
                    }
                    if (position == 52) {
                        Intent myIntent = new Intent(view.getContext(), GI18.class);
                        startActivityForResult(myIntent, 52);
                    }
                    if (position == 53) {
                        Intent myIntent = new Intent(view.getContext(), GI19.class);
                        startActivityForResult(myIntent, 53);
                    }
                    if (position == 54) {
                        Intent myIntent = new Intent(view.getContext(), HTS19.class);
                        startActivityForResult(myIntent, 54);
                    }
                    if (position == 55) {
                        Intent myIntent = new Intent(view.getContext(), IS19.class);
                        startActivityForResult(myIntent, 55);
                    }
                    if (position == 56) {
                        Intent myIntent = new Intent(view.getContext(), IS118.class);
                        startActivityForResult(myIntent, 56);
                    }
                    if (position == 57) {
                        Intent myIntent = new Intent(view.getContext(), ISP19.class);
                        startActivityForResult(myIntent, 57);
                    }
                    if (position == 58) {
                        Intent myIntent = new Intent(view.getContext(), ISP117.class);
                        startActivityForResult(myIntent, 58);
                    }
                    if (position == 59) {
                        Intent myIntent = new Intent(view.getContext(), ISP118.class);
                        startActivityForResult(myIntent, 59);
                    }
                    if (position == 60) {
                        Intent myIntent = new Intent(view.getContext(), ISP217.class);
                        startActivityForResult(myIntent, 60);
                    }
                    if (position == 61) {
                        Intent myIntent = new Intent(view.getContext(), ISP218.class);
                        startActivityForResult(myIntent, 61);
                    }
                    if (position == 62) {
                        Intent myIntent = new Intent(view.getContext(), ITA19.class);
                        startActivityForResult(myIntent, 62);
                    }
                    if (position == 63) {
                        Intent myIntent = new Intent(view.getContext(), K117.class);
                        startActivityForResult(myIntent, 63);
                    }
                    if (position == 64) {
                        Intent myIntent = new Intent(view.getContext(), K118.class);
                        startActivityForResult(myIntent, 64);
                    }
                    if (position == 65) {
                        Intent myIntent = new Intent(view.getContext(), K119.class);
                        startActivityForResult(myIntent, 65);
                    }
                    if (position == 66) {
                        Intent myIntent = new Intent(view.getContext(), K217.class);
                        startActivityForResult(myIntent, 66);
                    }
                    if (position == 67) {
                        Intent myIntent = new Intent(view.getContext(), K218.class);
                        startActivityForResult(myIntent, 67);
                    }
                    if (position == 68) {
                        Intent myIntent = new Intent(view.getContext(), K219.class);
                        startActivityForResult(myIntent, 68);
                    }
                    if (position == 69) {
                        Intent myIntent = new Intent(view.getContext(), K318.class);
                        startActivityForResult(myIntent, 69);
                    }
                    if (position == 70) {
                        Intent myIntent = new Intent(view.getContext(), KA18.class);
                        startActivityForResult(myIntent, 70);
                    }
                    if (position == 71) {
                        Intent myIntent = new Intent(view.getContext(), KA19.class);
                        startActivityForResult(myIntent, 71);
                    }
                    if (position == 72) {
                        Intent myIntent = new Intent(view.getContext(), KA218.class);
                        startActivityForResult(myIntent, 72);
                    }
                    if (position == 73) {
                        Intent myIntent = new Intent(view.getContext(), KA219.class);
                        startActivityForResult(myIntent, 73);
                    }
                    if (position == 74) {
                        Intent myIntent = new Intent(view.getContext(), KD18.class);
                        startActivityForResult(myIntent, 74);
                    }
                    if (position == 75) {
                        Intent myIntent = new Intent(view.getContext(), KD19.class);
                        startActivityForResult(myIntent, 75);
                    }
                    if (position == 76) {
                        Intent myIntent = new Intent(view.getContext(), KEo19.class);
                        startActivityForResult(myIntent, 76);
                    }
                    if (position == 77) {
                        Intent myIntent = new Intent(view.getContext(), KEo219.class);
                        startActivityForResult(myIntent, 77);
                    }
                    if (position == 78) {
                        Intent myIntent = new Intent(view.getContext(), KJL19.class);
                        startActivityForResult(myIntent, 78);
                    }
                    if (position == 79) {
                        Intent myIntent = new Intent(view.getContext(), KJL218.class);
                        startActivityForResult(myIntent, 79);
                    }
                    if (position == 80) {
                        Intent myIntent = new Intent(view.getContext(), KK17.class);
                        startActivityForResult(myIntent, 80);
                    }
                    if (position == 81) {
                        Intent myIntent = new Intent(view.getContext(), KK18.class);
                        startActivityForResult(myIntent, 81);
                    }
                    if (position == 82) {
                        Intent myIntent = new Intent(view.getContext(), KK19.class);
                        startActivityForResult(myIntent, 82);
                    }
                    if (position == 83) {
                        Intent myIntent = new Intent(view.getContext(), KKo17.class);
                        startActivityForResult(myIntent, 83);
                    }
                    if (position == 84) {
                        Intent myIntent = new Intent(view.getContext(), KKo18.class);
                        startActivityForResult(myIntent, 84);
                    }
                    if (position == 85) {
                        Intent myIntent = new Intent(view.getContext(), KKo19.class);
                        startActivityForResult(myIntent, 85);
                    }
                    if (position == 86) {
                        Intent myIntent = new Intent(view.getContext(), KO18.class);
                        startActivityForResult(myIntent, 86);
                    }
                    if (position == 87) {
                        Intent myIntent = new Intent(view.getContext(), KO19.class);
                        startActivityForResult(myIntent, 87);
                    }
                    if (position == 88) {
                        Intent myIntent = new Intent(view.getContext(), Kokk19.class);
                        startActivityForResult(myIntent, 88);
                    }
                    if (position == 89) {
                        Intent myIntent = new Intent(view.getContext(), Koo19.class);
                        startActivityForResult(myIntent, 89);
                    }
                    if (position == 90) {
                        Intent myIntent = new Intent(view.getContext(), KPAo18.class);
                        startActivityForResult(myIntent, 90);
                    }
                    if (position == 91) {
                        Intent myIntent = new Intent(view.getContext(), KPAo19.class);
                        startActivityForResult(myIntent, 91);
                    }
                    if (position == 92) {
                        Intent myIntent = new Intent(view.getContext(), KPKo17.class);
                        startActivityForResult(myIntent, 92);
                    }
                    if (position == 93) {
                        Intent myIntent = new Intent(view.getContext(), KPKo18.class);
                        startActivityForResult(myIntent, 93);
                    }
                    if (position == 94) {
                        Intent myIntent = new Intent(view.getContext(), KPKo19.class);
                        startActivityForResult(myIntent, 94);
                    }
                    if (position == 95) {
                        Intent myIntent = new Intent(view.getContext(), KR218.class);
                        startActivityForResult(myIntent, 95);
                    }
                    if (position == 96) {
                        Intent myIntent = new Intent(view.getContext(), KR219.class);
                        startActivityForResult(myIntent, 96);
                    }
                    if (position == 97) {
                        Intent myIntent = new Intent(view.getContext(), KRR17.class);
                        startActivityForResult(myIntent, 97);
                    }
                    if (position == 98) {
                        Intent myIntent = new Intent(view.getContext(), KRR18.class);
                        startActivityForResult(myIntent, 98);
                    }
                    if (position == 99) {
                        Intent myIntent = new Intent(view.getContext(), KRR19.class);
                        startActivityForResult(myIntent, 99);
                    }
                    if (position == 100) {
                        Intent myIntent = new Intent(view.getContext(), KSM18.class);
                        startActivityForResult(myIntent, 100);
                    }
                    if (position == 101) {
                        Intent myIntent = new Intent(view.getContext(), KSM19.class);
                        startActivityForResult(myIntent, 101);
                    }
                    if (position == 102) {
                        Intent myIntent = new Intent(view.getContext(), KV17.class);
                        startActivityForResult(myIntent, 102);
                    }
                    if (position == 103) {
                        Intent myIntent = new Intent(view.getContext(), KV18.class);
                        startActivityForResult(myIntent, 103);
                    }
                    if (position == 104) {
                        Intent myIntent = new Intent(view.getContext(), KV19.class);
                        startActivityForResult(myIntent, 104);
                    }
                    if (position == 105) {
                        Intent myIntent = new Intent(view.getContext(), KVO19.class);
                        startActivityForResult(myIntent, 105);
                    }
                    if (position == 106) {
                        Intent myIntent = new Intent(view.getContext(), LE17.class);
                        startActivityForResult(myIntent, 106);
                    }
                    if (position == 107) {
                        Intent myIntent = new Intent(view.getContext(), LE18.class);
                        startActivityForResult(myIntent, 107);
                    }
                    if (position == 108) {
                        Intent myIntent = new Intent(view.getContext(), LE19.class);
                        startActivityForResult(myIntent, 108);
                    }
                    if (position == 109) {
                        Intent myIntent = new Intent(view.getContext(), LM17.class);
                        startActivityForResult(myIntent, 109);
                    }
                    if (position == 110) {
                        Intent myIntent = new Intent(view.getContext(), LM18.class);
                        startActivityForResult(myIntent, 110);
                    }
                    if (position == 111) {
                        Intent myIntent = new Intent(view.getContext(), LM19.class);
                        startActivityForResult(myIntent, 111);
                    }
                    if (position == 112) {
                        Intent myIntent = new Intent(view.getContext(), LOGo18.class);
                        startActivityForResult(myIntent, 112);
                    }
                    if (position == 113) {
                        Intent myIntent = new Intent(view.getContext(), LS18.class);
                        startActivityForResult(myIntent, 113);
                    }
                    if (position == 114) {
                        Intent myIntent = new Intent(view.getContext(), LSK19.class);
                        startActivityForResult(myIntent, 114);
                    }
                    if (position == 115) {
                        Intent myIntent = new Intent(view.getContext(), LTo19.class);
                        startActivityForResult(myIntent, 115);
                    }
                    if (position == 116) {
                        Intent myIntent = new Intent(view.getContext(), ME17.class);
                        startActivityForResult(myIntent, 116);
                    }
                    if (position == 117) {
                        Intent myIntent = new Intent(view.getContext(), ME19.class);
                        startActivityForResult(myIntent, 117);
                    }
                    if (position == 118) {
                        Intent myIntent = new Intent(view.getContext(), MEP18.class);
                        startActivityForResult(myIntent, 118);
                    }
                    if (position == 119) {
                        Intent myIntent = new Intent(view.getContext(), MEP19.class);
                        startActivityForResult(myIntent, 119);
                    }
                    if (position == 120) {
                        Intent myIntent = new Intent(view.getContext(), MEt19.class);
                        startActivityForResult(myIntent, 120);
                    }
                    if (position == 121) {
                        Intent myIntent = new Intent(view.getContext(), MJ117.class);
                        startActivityForResult(myIntent, 121);
                    }
                    if (position == 122) {
                        Intent myIntent = new Intent(view.getContext(), MJ118.class);
                        startActivityForResult(myIntent, 122);
                    }
                    if (position == 123) {
                        Intent myIntent = new Intent(view.getContext(), MJ119.class);
                        startActivityForResult(myIntent, 123);
                    }
                    if (position == 124) {
                        Intent myIntent = new Intent(view.getContext(), MJ217.class);
                        startActivityForResult(myIntent, 124);
                    }
                    if (position == 125) {
                        Intent myIntent = new Intent(view.getContext(), MJ218.class);
                        startActivityForResult(myIntent, 125);
                    }
                    if (position == 126) {
                        Intent myIntent = new Intent(view.getContext(), MJ219.class);
                        startActivityForResult(myIntent, 126);
                    }
                    if (position == 127) {
                        Intent myIntent = new Intent(view.getContext(), MJK19.class);
                        startActivityForResult(myIntent, 127);
                    }
                    if (position == 128) {
                        Intent myIntent = new Intent(view.getContext(), MK17.class);
                        startActivityForResult(myIntent, 128);
                    }
                    if (position == 129) {
                        Intent myIntent = new Intent(view.getContext(), MKo18.class);
                        startActivityForResult(myIntent, 129);
                    }
                    if (position == 130) {
                        Intent myIntent = new Intent(view.getContext(), MKt19.class);
                        startActivityForResult(myIntent, 130);
                    }
                    if (position == 130) {
                        Intent myIntent = new Intent(view.getContext(), MKt217.class);
                        startActivityForResult(myIntent, 130);
                    }
                    if (position == 131) {
                        Intent myIntent = new Intent(view.getContext(), MRT18.class);
                        startActivityForResult(myIntent, 131);
                    }
                    if (position == 131) {
                        Intent myIntent = new Intent(view.getContext(), MRT19.class);
                        startActivityForResult(myIntent, 131);
                    }
                    if (position == 132) {
                        Intent myIntent = new Intent(view.getContext(), MT18.class);
                        startActivityForResult(myIntent, 132);
                    }
                    if (position == 133) {
                        Intent myIntent = new Intent(view.getContext(), MT19.class);
                        startActivityForResult(myIntent, 133);
                    }
                    if (position == 134) {
                        Intent myIntent = new Intent(view.getContext(), MT117.class);
                        startActivityForResult(myIntent, 134);
                    }
                    if (position == 135) {
                        Intent myIntent = new Intent(view.getContext(), MTK17.class);
                        startActivityForResult(myIntent, 135);
                    }
                    if (position == 136) {
                        Intent myIntent = new Intent(view.getContext(), MTK18.class);
                        startActivityForResult(myIntent, 136);
                    }
                    if (position == 137) {
                        Intent myIntent = new Intent(view.getContext(), MTK19.class);
                        startActivityForResult(myIntent, 137);
                    }
                    if (position == 138) {
                        Intent myIntent = new Intent(view.getContext(), MY17.class);
                        startActivityForResult(myIntent, 138);
                    }
                    if (position == 139) {
                        Intent myIntent = new Intent(view.getContext(), MY18.class);
                        startActivityForResult(myIntent, 139);
                    }
                    if (position == 140) {
                        Intent myIntent = new Intent(view.getContext(), MY19.class);
                        startActivityForResult(myIntent, 140);
                    }
                    if (position == 141) {
                        Intent myIntent = new Intent(view.getContext(), MYEo18.class);
                        startActivityForResult(myIntent, 141);
                    }
                    if (position == 142) {
                        Intent myIntent = new Intent(view.getContext(), MYEo19.class);
                        startActivityForResult(myIntent, 142);
                    }
                    if (position == 143) {
                        Intent myIntent = new Intent(view.getContext(), NRT19.class);
                        startActivityForResult(myIntent, 143);
                    }
                    if (position == 144) {
                        Intent myIntent = new Intent(view.getContext(), OM19.class);
                        startActivityForResult(myIntent, 144);
                    }
                    if (position == 145) {
                        Intent myIntent = new Intent(view.getContext(), PA18.class);
                        startActivityForResult(myIntent, 145);
                    }
                    if (position == 146) {
                        Intent myIntent = new Intent(view.getContext(), PA19.class);
                        startActivityForResult(myIntent, 146);
                    }
                    if (position == 147) {
                        Intent myIntent = new Intent(view.getContext(), PK17.class);
                        startActivityForResult(myIntent, 147);
                    }
                    if (position == 148) {
                        Intent myIntent = new Intent(view.getContext(), PK18.class);
                        startActivityForResult(myIntent, 148);
                    }
                    if (position == 149) {
                        Intent myIntent = new Intent(view.getContext(), PK19.class);
                        startActivityForResult(myIntent, 149);
                    }
                    if (position == 150) {
                        Intent myIntent = new Intent(view.getContext(), PLA19.class);
                        startActivityForResult(myIntent, 150);
                    }
                    if (position == 151) {
                        Intent myIntent = new Intent(view.getContext(), PLA219.class);
                        startActivityForResult(myIntent, 151);
                    }
                    if (position == 152) {
                        Intent myIntent = new Intent(view.getContext(), PT19.class);
                        startActivityForResult(myIntent, 152);
                    }
                    if (position == 153) {
                        Intent myIntent = new Intent(view.getContext(), PTS19.class);
                        startActivityForResult(myIntent, 153);
                    }
                    if (position == 154) {
                        Intent myIntent = new Intent(view.getContext(), PTS219.class);
                        startActivityForResult(myIntent, 154);
                    }
                    if (position == 155) {
                        Intent myIntent = new Intent(view.getContext(), RB18.class);
                        startActivityForResult(myIntent, 155);
                    }
                    if (position == 156) {
                        Intent myIntent = new Intent(view.getContext(), RB19.class);
                        startActivityForResult(myIntent, 156);
                    }
                    if (position == 157) {
                        Intent myIntent = new Intent(view.getContext(), RMo18.class);
                        startActivityForResult(myIntent, 157);
                    }
                    if (position == 158) {
                        Intent myIntent = new Intent(view.getContext(), RMo19.class);
                        startActivityForResult(myIntent, 158);
                    }
                    if (position == 159) {
                        Intent myIntent = new Intent(view.getContext(), RMt19.class);
                        startActivityForResult(myIntent, 159);
                    }
                    if (position == 160) {
                        Intent myIntent = new Intent(view.getContext(), SPA18.class);
                        startActivityForResult(myIntent, 160);
                    }
                    if (position == 161) {
                        Intent myIntent = new Intent(view.getContext(), SRo18.class);
                        startActivityForResult(myIntent, 161);
                    }
                    if (position == 162) {
                        Intent myIntent = new Intent(view.getContext(), SRo19.class);
                        startActivityForResult(myIntent, 162);
                    }
                    if (position == 163) {
                        Intent myIntent = new Intent(view.getContext(), SYS18.class);
                        startActivityForResult(myIntent, 163);
                    }
                    if (position == 164) {
                        Intent myIntent = new Intent(view.getContext(), SYSt19.class);
                        startActivityForResult(myIntent, 164);
                    }
                    if (position == 165) {
                        Intent myIntent = new Intent(view.getContext(), TEP17.class);
                        startActivityForResult(myIntent, 165);
                    }
                    if (position == 166) {
                        Intent myIntent = new Intent(view.getContext(), TEP18.class);
                        startActivityForResult(myIntent, 166);
                    }
                    if (position == 167) {
                        Intent myIntent = new Intent(view.getContext(), TEP19.class);
                        startActivityForResult(myIntent, 167);
                    }
                    if (position == 168) {
                        Intent myIntent = new Intent(view.getContext(), TI18.class);
                        startActivityForResult(myIntent, 168);
                    }
                    if (position == 169) {
                        Intent myIntent = new Intent(view.getContext(), TI19.class);
                        startActivityForResult(myIntent, 169);
                    }
                    if (position == 170) {
                        Intent myIntent = new Intent(view.getContext(), TK18.class);
                        startActivityForResult(myIntent, 170);
                    }
                    if (position == 171) {
                        Intent myIntent = new Intent(view.getContext(), TK19.class);
                        startActivityForResult(myIntent, 171);
                    }
                    if (position == 172) {
                        Intent myIntent = new Intent(view.getContext(), TP17.class);
                        startActivityForResult(myIntent, 172);
                    }
                    if (position == 173) {
                        Intent myIntent = new Intent(view.getContext(), TP19.class);
                        startActivityForResult(myIntent, 173);
                    }
                    if (position == 174) {
                        Intent myIntent = new Intent(view.getContext(), TPK19.class);
                        startActivityForResult(myIntent, 174);
                    }
                    if (position == 175) {
                        Intent myIntent = new Intent(view.getContext(), TSTt19.class);
                        startActivityForResult(myIntent, 175);
                    }
                    if (position == 176) {
                        Intent myIntent = new Intent(view.getContext(), TSTt118.class);
                        startActivityForResult(myIntent, 176);
                    }
                    if (position == 177) {
                        Intent myIntent = new Intent(view.getContext(), TSTt218.class);
                        startActivityForResult(myIntent, 177);
                    }
                    if (position == 178) {
                        Intent myIntent = new Intent(view.getContext(), TTKo19.class);
                        startActivityForResult(myIntent, 178);
                    }
                    if (position == 179) {
                        Intent myIntent = new Intent(view.getContext(), VKO18.class);
                        startActivityForResult(myIntent, 179);
                    }
                    if (position == 180) {
                        Intent myIntent = new Intent(view.getContext(), VS18.class);
                        startActivityForResult(myIntent, 180);
                    }
                    if (position == 181) {
                        Intent myIntent = new Intent(view.getContext(), VS19.class);
                        startActivityForResult(myIntent, 181);
                    }
                    if (position == 182) {
                        Intent myIntent = new Intent(view.getContext(), VSo19.class);
                        startActivityForResult(myIntent, 182);
                    }
                }
            });


        return view;

    }

}