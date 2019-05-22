package com.example.tarviliivak.expandablelistview;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
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

import java.util.ArrayList;

public class Setting_list2 extends Fragment {

    Spinner spinner2;
    boolean isSpinnerTouched = false;
    Button submit2;


    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_setting_list2, container, false);
        Button btnFragment=(Button)view.findViewById(R.id.back2);

        btnFragment.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                FragmentTransaction fr =getFragmentManager().beginTransaction();
                fr.replace(R.id.container, new Setting_btn());
                fr.commit();
            }
        });

        submit2 = (Button) view.findViewById(R.id.submit2);

        spinner2 = (Spinner) view.findViewById(R.id.teach_spinner);
        // Create an ArrayAdapter using the string array and a default spinner layout
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(getActivity().getApplicationContext(),
                R.array.teacher_arrays, android.R.layout.simple_spinner_item);
        // Specify the layout to use when the list of choices appears
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        // Apply the adapter to the spinner
        spinner2.setAdapter(adapter);

        spinner2.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                isSpinnerTouched = true;
                return false;
            }
        });

        spinner2.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                if(!isSpinnerTouched) return;

                if (position == 0) {
                    submit2.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            Intent i = new Intent(getActivity(), MainActivity.class);
                            i.putExtra("layout", R.layout.activity_aile__laats);
                            getActivity().startActivity(i);
                        }
                    });
                }
                if (position == 1) {
                    submit2.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            Intent intent = new Intent(getActivity(), Ain_Veskivali.class);
                            getActivity().startActivity(intent);
                        }
                    });
                }
                if (position == 2) {
                    submit2.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            Intent intent = new Intent(getActivity(), Aina_Ruutel.class);
                            getActivity().startActivity(intent);
                        }
                    });
                }
                if (position == 3) {
                    submit2.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            Intent intent = new Intent(getActivity(), Airi_Auser.class);
                            getActivity().startActivity(intent);
                        }
                    });
                }
                if (position == 4) {
                    submit2.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            Intent intent = new Intent(getActivity(), Aivar_Krull.class);
                            getActivity().startActivity(intent);
                        }
                    });;
                }
                if (position == 5) {
                    submit2.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            Intent intent = new Intent(getActivity(), Aivar_Lippmaa.class);
                            getActivity().startActivity(intent);
                        }
                    });
                }
                if (position == 6) {
                    submit2.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            Intent intent = new Intent(getActivity(), Alina_Orlova.class);
                            getActivity().startActivity(intent);
                        }
                    });
                }
                if (position == 7) {
                    submit2.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            Intent intent = new Intent(getActivity(), Allan_Patska.class);
                            getActivity().startActivity(intent);
                        }
                    });
                }
                if (position == 8) {
                    submit2.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            Intent intent = new Intent(getActivity(), Andreas_Sester.class);
                            getActivity().startActivity(intent);
                        }
                    });
                }
                if (position == 9) {
                    submit2.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            Intent intent = new Intent(getActivity(), Andrus_Kolonistov.class);
                            getActivity().startActivity(intent);

                        }
                    });
                }
                if (position == 10) {
                    submit2.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            Intent intent = new Intent(getActivity(), Anna_Karutina.class);
                            getActivity().startActivity(intent);
                        }
                    });
                }
                if (position == 11) {
                    Intent myIntent = new Intent(view.getContext(), Anne_Krull.class);
                    startActivityForResult(myIntent, 11);
                }
                if (position == 12) {
                    Intent myIntent = new Intent(view.getContext(), Anne_Mootse.class);
                    startActivityForResult(myIntent, 12);
                }
                if (position == 13) {
                    Intent myIntent = new Intent(view.getContext(), Annereet_Paatsi.class);
                    startActivityForResult(myIntent, 13);
                }
                if (position == 14) {
                    Intent myIntent = new Intent(view.getContext(), Anti_Kustassoo.class);
                    startActivityForResult(myIntent, 14);
                }
                if (position == 15) {
                    Intent myIntent = new Intent(view.getContext(), Anu_Tintera.class);
                    startActivityForResult(myIntent, 15);
                }
                if (position == 16) {
                    Intent myIntent = new Intent(view.getContext(), Arno_Ratas.class);
                    startActivityForResult(myIntent, 16);
                }
                if (position == 17) {
                    Intent myIntent = new Intent(view.getContext(), Astra_Pintson.class);
                    startActivityForResult(myIntent, 17);
                }
                if (position == 18) {
                    Intent myIntent = new Intent(view.getContext(), Berit_Hipponen.class);
                    startActivityForResult(myIntent, 18);
                }
                if (position == 19) {
                    Intent myIntent = new Intent(view.getContext(), Bianka_Makoid.class);
                    startActivityForResult(myIntent, 19);
                }
                if (position == 20) {
                    Intent myIntent = new Intent(view.getContext(), Diana_Eller.class);
                    startActivityForResult(myIntent, 20);
                }
                if (position == 21) {
                    Intent myIntent = new Intent(view.getContext(), Edda_Sooru.class);
                    startActivityForResult(myIntent, 21);
                }
                if (position == 22) {
                    Intent myIntent = new Intent(view.getContext(), Edvard_Lohmus.class);
                    startActivityForResult(myIntent, 22);
                }
                if (position == 23) {
                    Intent myIntent = new Intent(view.getContext(), Ele_Nurk.class);
                    startActivityForResult(myIntent, 23);
                }
                if (position == 24) {
                    Intent myIntent = new Intent(view.getContext(), Elen_Nurm.class);
                    startActivityForResult(myIntent, 24);
                }
                if (position == 25) {
                    Intent myIntent = new Intent(view.getContext(), Elika_Raal_Kikas.class);
                    startActivityForResult(myIntent, 25);
                }
                if (position == 26) {
                    Intent myIntent = new Intent(view.getContext(), Elis_Liblik.class);
                    startActivityForResult(myIntent, 26);
                }
                if (position == 27) {
                    Intent myIntent = new Intent(view.getContext(), Eliseta_Talviste.class);
                    startActivityForResult(myIntent, 27);
                }
                if (position == 28) {
                    Intent myIntent = new Intent(view.getContext(), Ellen_Aunin.class);
                    startActivityForResult(myIntent, 28);
                }
                if (position == 29) {
                    Intent myIntent = new Intent(view.getContext(), Elme_Salik.class);
                    startActivityForResult(myIntent, 29);
                }
                if (position == 30) {
                    Intent myIntent = new Intent(view.getContext(), Elo_Oun.class);
                    startActivityForResult(myIntent, 30);
                }
                if (position == 31) {
                    Intent myIntent = new Intent(view.getContext(), Ene_Joeveer.class);
                    startActivityForResult(myIntent, 31);
                }
                if (position == 32) {
                    Intent myIntent = new Intent(view.getContext(), Erna_Urm.class);
                    startActivityForResult(myIntent, 32);
                }
                if (position == 33) {
                    Intent myIntent = new Intent(view.getContext(), Eve_Maeorg.class);
                    startActivityForResult(myIntent, 33);
                }
                if (position == 34) {
                    Intent myIntent = new Intent(view.getContext(), Eve_Siimus.class);
                    startActivityForResult(myIntent, 34);
                }
                if (position == 35) {
                    Intent myIntent = new Intent(view.getContext(), Evely_Vutt.class);
                    startActivityForResult(myIntent, 35);
                }
                if (position == 36) {
                    Intent myIntent = new Intent(view.getContext(), Gen_Lee.class);
                    startActivityForResult(myIntent, 36);
                }
                if (position == 37) {
                    Intent myIntent = new Intent(view.getContext(), Gerda_Ode.class);
                    startActivityForResult(myIntent, 37);
                }
                if (position == 38) {
                    Intent myIntent = new Intent(view.getContext(), Gerly_Sepping.class);
                    startActivityForResult(myIntent, 38);
                }
                if (position == 39) {
                    Intent myIntent = new Intent(view.getContext(), Harri_Laustam.class);
                    startActivityForResult(myIntent, 39);
                }
                if (position == 40) {
                    Intent myIntent = new Intent(view.getContext(), Hedi_Manni.class);
                    startActivityForResult(myIntent, 40);
                }
                if (position == 41) {
                    Intent myIntent = new Intent(view.getContext(), Heigo_Lipp.class);
                    startActivityForResult(myIntent, 41);
                }
                if (position == 42) {
                    Intent myIntent = new Intent(view.getContext(), Heiki_Keem.class);
                    startActivityForResult(myIntent, 42);
                }
                if (position == 43) {
                    Intent myIntent = new Intent(view.getContext(), Hele_Moor.class);
                    startActivityForResult(myIntent, 43);
                }
                if (position == 44) {
                    Intent myIntent = new Intent(view.getContext(), Helin_Liiv.class);
                    startActivityForResult(myIntent, 44);
                }
                if (position == 45) {
                    Intent myIntent = new Intent(view.getContext(), Helina_Esnar.class);
                    startActivityForResult(myIntent, 45);
                }
                if (position == 46) {
                    Intent myIntent = new Intent(view.getContext(), Hellika_Ivanov_Simson.class);
                    startActivityForResult(myIntent, 46);
                }
                if (position == 47) {
                    Intent myIntent = new Intent(view.getContext(), Helver_Kooser.class);
                    startActivityForResult(myIntent, 47);
                }
                if (position == 48) {
                    Intent myIntent = new Intent(view.getContext(), Helvi_Teigar.class);
                    startActivityForResult(myIntent, 48);
                }
                if (position == 49) {
                    Intent myIntent = new Intent(view.getContext(), Henno_Taht.class);
                    startActivityForResult(myIntent, 49);
                }
                if (position == 50) {
                    Intent myIntent = new Intent(view.getContext(), Hille_Alberg.class);
                    startActivityForResult(myIntent, 50);
                }
                if (position == 51) {
                    Intent myIntent = new Intent(view.getContext(), Hindrek_Sokk.class);
                    startActivityForResult(myIntent, 51);
                }
                if (position == 52) {
                    Intent myIntent = new Intent(view.getContext(), Ilvi_Palu.class);
                    startActivityForResult(myIntent, 52);
                }
                if (position == 53) {
                    Intent myIntent = new Intent(view.getContext(), Inga_Ilves.class);
                    startActivityForResult(myIntent, 53);
                }
                if (position == 54) {
                    Intent myIntent = new Intent(view.getContext(), Ingrid_Soot.class);
                    startActivityForResult(myIntent, 54);
                }
                if (position == 55) {
                    Intent myIntent = new Intent(view.getContext(), Iolanda_Partmaa.class);
                    startActivityForResult(myIntent, 55);
                }
                if (position == 56) {
                    Intent myIntent = new Intent(view.getContext(), Iraida_Krivoguzova.class);
                    startActivityForResult(myIntent, 56);
                }
                if (position == 57) {
                    Intent myIntent = new Intent(view.getContext(), Irina_Vosar.class);
                    startActivityForResult(myIntent, 57);
                }
                if (position == 58) {
                    Intent myIntent = new Intent(view.getContext(), Ismail_Mirzojev.class);
                    startActivityForResult(myIntent, 58);
                }
                if (position == 59) {
                    Intent myIntent = new Intent(view.getContext(), Ivar_Kaine.class);
                    startActivityForResult(myIntent, 59);
                }
                if (position == 60) {
                    Intent myIntent = new Intent(view.getContext(), Jaan_Peetso.class);
                    startActivityForResult(myIntent, 60);
                }
                if (position == 61) {
                    Intent myIntent = new Intent(view.getContext(), Janari_Zirk.class);
                    startActivityForResult(myIntent, 61);
                }
                if (position == 62) {
                    Intent myIntent = new Intent(view.getContext(), Jelena_Kutsmuk.class);
                    startActivityForResult(myIntent, 62);
                }
                if (position == 63) {
                    Intent myIntent = new Intent(view.getContext(), Johannes_Soobik.class);
                    startActivityForResult(myIntent, 63);
                }
                if (position == 64) {
                    Intent myIntent = new Intent(view.getContext(), Julia_Kovalenko.class);
                    startActivityForResult(myIntent, 64);
                }
                if (position == 65) {
                    Intent myIntent = new Intent(view.getContext(), Kaarel_Rodima.class);
                    startActivityForResult(myIntent, 65);
                }
                if (position == 66) {
                    Intent myIntent = new Intent(view.getContext(), Kadri_Meesak.class);
                    startActivityForResult(myIntent, 66);
                }
                if (position == 67) {
                    Intent myIntent = new Intent(view.getContext(), Kaido_Tammepold.class);
                    startActivityForResult(myIntent, 67);
                }
                if (position == 68) {
                    Intent myIntent = new Intent(view.getContext(), Kaido_Toobal.class);
                    startActivityForResult(myIntent, 68);
                }
                if (position == 69) {
                    Intent myIntent = new Intent(view.getContext(), Kaido_Voitra.class);
                    startActivityForResult(myIntent, 69);
                }
                if (position == 70) {
                    Intent myIntent = new Intent(view.getContext(), Kaire_Jogi.class);
                    startActivityForResult(myIntent, 70);
                }
                if (position == 71) {
                    Intent myIntent = new Intent(view.getContext(), Kaire_Valb.class);
                    startActivityForResult(myIntent, 71);
                }
                if (position == 72) {
                    Intent myIntent = new Intent(view.getContext(), Kairi_Timusk.class);
                    startActivityForResult(myIntent, 72);
                }
                if (position == 73) {
                    Intent myIntent = new Intent(view.getContext(), Kalle_Viira.class);
                    startActivityForResult(myIntent, 73);
                }
                if (position == 74) {
                    Intent myIntent = new Intent(view.getContext(), Kalmer_Kollom.class);
                    startActivityForResult(myIntent, 74);
                }
                if (position == 75) {
                    Intent myIntent = new Intent(view.getContext(), Kamilla_Ludikainen.class);
                    startActivityForResult(myIntent, 75);
                }
                if (position == 76) {
                    Intent myIntent = new Intent(view.getContext(), Karin_Lindmagi.class);
                    startActivityForResult(myIntent, 76);
                }
                if (position == 77) {
                    Intent myIntent = new Intent(view.getContext(), Karin_Roosipuu.class);
                    startActivityForResult(myIntent, 77);
                }
                if (position == 78) {
                    Intent myIntent = new Intent(view.getContext(), Karin_Traks.class);
                    startActivityForResult(myIntent, 78);
                }
                if (position == 79) {
                    Intent myIntent = new Intent(view.getContext(), Katrin_Jurs.class);
                    startActivityForResult(myIntent, 79);
                }
                if (position == 80) {
                    Intent myIntent = new Intent(view.getContext(), Katrin_Kont.class);
                    startActivityForResult(myIntent, 80);
                }
                if (position == 81) {
                    Intent myIntent = new Intent(view.getContext(), Katrin_Krunvald.class);
                    startActivityForResult(myIntent, 81);
                }
                if (position == 82) {
                    Intent myIntent = new Intent(view.getContext(), Katrin_Pohako.class);
                    startActivityForResult(myIntent, 82);
                }
                if (position == 83) {
                    Intent myIntent = new Intent(view.getContext(), Kersti_Poska.class);
                    startActivityForResult(myIntent, 83);
                }
                if (position == 84) {
                    Intent myIntent = new Intent(view.getContext(), Ksenia_George.class);
                    startActivityForResult(myIntent, 84);
                }
                if (position == 85) {
                    Intent myIntent = new Intent(view.getContext(), Katlin_Kask.class);
                    startActivityForResult(myIntent, 78);
                }
                if (position == 86) {
                    Intent myIntent = new Intent(view.getContext(), Kulliki_Vaske.class);
                    startActivityForResult(myIntent, 86);
                }
                if (position == 87) {
                    Intent myIntent = new Intent(view.getContext(), Laili_Kannel.class);
                    startActivityForResult(myIntent, 87);
                }
                if (position == 88) {
                    Intent myIntent = new Intent(view.getContext(), Larissa_Sidoruk.class);
                    startActivityForResult(myIntent, 88);
                }
                if (position == 89) {
                    Intent myIntent = new Intent(view.getContext(), Lauri_Maran.class);
                    startActivityForResult(myIntent, 89);
                }
                if (position == 90) {
                    Intent myIntent = new Intent(view.getContext(), Lehte_Teern.class);
                    startActivityForResult(myIntent, 90);
                }
                if (position == 91) {
                    Intent myIntent = new Intent(view.getContext(), Lembit_Arus.class);
                    startActivityForResult(myIntent, 91);
                }
                if (position == 92) {
                    Intent myIntent = new Intent(view.getContext(), Liia_Sinivee.class);
                    startActivityForResult(myIntent, 92);
                }
                if (position == 93) {
                    Intent myIntent = new Intent(view.getContext(), Liis_Jurjev.class);
                    startActivityForResult(myIntent, 93);
                }
                if (position == 94) {
                    Intent myIntent = new Intent(view.getContext(), Liivi_Albre.class);
                    startActivityForResult(myIntent, 95);
                }
                if (position == 95) {
                    Intent myIntent = new Intent(view.getContext(), Liivi_Raudsepp.class);
                    startActivityForResult(myIntent, 95);
                }
                if (position == 96) {
                    Intent myIntent = new Intent(view.getContext(), Lili_Kangsepp.class);
                    startActivityForResult(myIntent, 96);
                }
                if (position == 97) {
                    Intent myIntent = new Intent(view.getContext(), Lilija_Suburg.class);
                    startActivityForResult(myIntent, 97);
                }
                if (position == 98) {
                    Intent myIntent = new Intent(view.getContext(), Ljudmila_Klotsko.class);
                    startActivityForResult(myIntent, 98);
                }
                if (position == 99) {
                    Intent myIntent = new Intent(view.getContext(), Ly_Otsa.class);
                    startActivityForResult(myIntent, 99);
                }
                if (position == 100) {
                    Intent myIntent = new Intent(view.getContext(), Maarja_Lebedev.class);
                    startActivityForResult(myIntent, 100);
                }
                if (position == 101) {
                    Intent myIntent = new Intent(view.getContext(), Maarja_Tsimmer.class);
                    startActivityForResult(myIntent, 101);
                }
                if (position == 102) {
                    Intent myIntent = new Intent(view.getContext(), Madli_Roopmann.class);
                    startActivityForResult(myIntent, 102);
                }
                if (position == 103) {
                    Intent myIntent = new Intent(view.getContext(), Maicel_Putt.class);
                    startActivityForResult(myIntent, 103);
                }
                if (position == 104) {
                    Intent myIntent = new Intent(view.getContext(), Maigi_Lepik.class);
                    startActivityForResult(myIntent, 104);
                }
                if (position == 105) {
                    Intent myIntent = new Intent(view.getContext(), Maire_Kask.class);
                    startActivityForResult(myIntent, 105);
                }
                if (position == 106) {
                    Intent myIntent = new Intent(view.getContext(), Maire_Linsi.class);
                    startActivityForResult(myIntent, 106);
                }
                if (position == 107) {
                    Intent myIntent = new Intent(view.getContext(), Maire_Merits.class);
                    startActivityForResult(myIntent, 107);
                }
                if (position == 108) {
                    Intent myIntent = new Intent(view.getContext(), Maiu_Praakli.class);
                    startActivityForResult(myIntent, 108);
                }
                if (position == 109) {
                    Intent myIntent = new Intent(view.getContext(), Maksim_Tjukin.class);
                    startActivityForResult(myIntent, 109);
                }
                if (position == 110) {
                    Intent myIntent = new Intent(view.getContext(), Malle_Kalmus.class);
                    startActivityForResult(myIntent, 110);
                }
                if (position == 111) {
                    Intent myIntent = new Intent(view.getContext(), Maret_Mannik.class);
                    startActivityForResult(myIntent, 111);
                }
                if (position == 112) {
                    Intent myIntent = new Intent(view.getContext(), Maret_Vorno.class);
                    startActivityForResult(myIntent, 112);
                }
                if (position == 113) {
                    Intent myIntent = new Intent(view.getContext(), Marge_Kuslap.class);
                    startActivityForResult(myIntent, 113);
                }
                if (position == 114) {
                    Intent myIntent = new Intent(view.getContext(), Margit_Poldmaa.class);
                    startActivityForResult(myIntent, 114);
                }
                if (position == 115) {
                    Intent myIntent = new Intent(view.getContext(), Margus_Ainsalu.class);
                    startActivityForResult(myIntent, 115);
                }
                if (position == 116) {
                    Intent myIntent = new Intent(view.getContext(), Mariana_Rand.class);
                    startActivityForResult(myIntent, 116);
                }
                if (position == 117) {
                    Intent myIntent = new Intent(view.getContext(), Marika_Paulus.class);
                    startActivityForResult(myIntent, 117);
                }
                if (position == 118) {
                    Intent myIntent = new Intent(view.getContext(), Maris_Tigas.class);
                    startActivityForResult(myIntent, 118);
                }
                if (position == 119) {
                    Intent myIntent = new Intent(view.getContext(), Marju_Bergmann.class);
                    startActivityForResult(myIntent, 119);
                }
                if (position == 120) {
                    Intent myIntent = new Intent(view.getContext(), Marko_Mumm.class);
                    startActivityForResult(myIntent, 120);
                }
                if (position == 121) {
                    Intent myIntent = new Intent(view.getContext(), Marlene_Altmae.class);
                    startActivityForResult(myIntent, 121);
                }
                if (position == 122) {
                    Intent myIntent = new Intent(view.getContext(), Martin_Hanson.class);
                    startActivityForResult(myIntent, 122);
                }
                if (position == 123) {
                    Intent myIntent = new Intent(view.getContext(), Mati_Malm.class);
                    startActivityForResult(myIntent, 123);
                }
                if (position == 124) {
                    Intent myIntent = new Intent(view.getContext(), Meelis_Vaher.class);
                    startActivityForResult(myIntent, 124);
                }
                if (position == 125) {
                    Intent myIntent = new Intent(view.getContext(), Meida_Veskus.class);
                    startActivityForResult(myIntent, 125);
                }
                if (position == 126) {
                    Intent myIntent = new Intent(view.getContext(), Merike_Kangro.class);
                    startActivityForResult(myIntent, 126);
                }
                if (position == 127) {
                    Intent myIntent = new Intent(view.getContext(), Merle_Truupold.class);
                    startActivityForResult(myIntent, 127);
                }
                if (position == 128) {
                    Intent myIntent = new Intent(view.getContext(), Mihhail_Karutin.class);
                    startActivityForResult(myIntent, 128);
                }
                if (position == 129) {
                    Intent myIntent = new Intent(view.getContext(), Mirjam_Merike_Somer.class);
                    startActivityForResult(myIntent, 129);
                }
                if (position == 130) {
                    Intent myIntent = new Intent(view.getContext(), Monika_Lattik.class);
                    startActivityForResult(myIntent, 130);
                }
                if (position == 131) {
                    Intent myIntent = new Intent(view.getContext(), Nikolai_Jukin.class);
                    startActivityForResult(myIntent, 131);
                }
                if (position == 132) {
                    Intent myIntent = new Intent(view.getContext(), Olga_Lugina.class);
                    startActivityForResult(myIntent, 132);
                }
                if (position == 133) {
                    Intent myIntent = new Intent(view.getContext(), Oskar_Hint.class);
                    startActivityForResult(myIntent, 133);
                }
                if (position == 134) {
                    Intent myIntent = new Intent(view.getContext(), Paula_Mall_Pedmanson.class);
                    startActivityForResult(myIntent, 134);
                }
                if (position == 135) {
                    Intent myIntent = new Intent(view.getContext(), Pille_Kessel.class);
                    startActivityForResult(myIntent, 135);
                }
                if (position == 136) {
                    Intent myIntent = new Intent(view.getContext(), Piret_Neihaus.class);
                    startActivityForResult(myIntent, 136);
                }
                if (position == 137) {
                    Intent myIntent = new Intent(view.getContext(), Piret_Tamm.class);
                    startActivityForResult(myIntent, 137);
                }
                if (position == 138) {
                    Intent myIntent = new Intent(view.getContext(), Part_Blank.class);
                    startActivityForResult(myIntent, 138);
                }
                if (position == 139) {
                    Intent myIntent = new Intent(view.getContext(), Raissa_Orlova.class);
                    startActivityForResult(myIntent, 139);
                }
                if (position == 140) {
                    Intent myIntent = new Intent(view.getContext(), Rait_Koort.class);
                    startActivityForResult(myIntent, 140);
                }
                if (position == 141) {
                    Intent myIntent = new Intent(view.getContext(), Rando_Koks.class);
                    startActivityForResult(myIntent, 141);
                }
                if (position == 142) {
                    Intent myIntent = new Intent(view.getContext(), Reeli_Engelbrecht.class);
                    startActivityForResult(myIntent, 142);
                }
                if (position == 143) {
                    Intent myIntent = new Intent(view.getContext(), Reet_Saarep.class);
                    startActivityForResult(myIntent, 143);
                }
                if (position == 144) {
                    Intent myIntent = new Intent(view.getContext(), Reido_Orov.class);
                    startActivityForResult(myIntent, 144);
                }
                if (position == 145) {
                    Intent myIntent = new Intent(view.getContext(), Rene_Lukk.class);
                    startActivityForResult(myIntent, 145);
                }
                if (position == 146) {
                    Intent myIntent = new Intent(view.getContext(), Riina_Mandla.class);
                    startActivityForResult(myIntent, 146);
                }
                if (position == 147) {
                    Intent myIntent = new Intent(view.getContext(), Riivo_Rivimets.class);
                    startActivityForResult(myIntent, 147);
                }
                if (position == 148) {
                    Intent myIntent = new Intent(view.getContext(), Risto_Asso.class);
                    startActivityForResult(myIntent, 148);
                }
                if (position == 149) {
                    Intent myIntent = new Intent(view.getContext(), Signe_Vedler.class);
                    startActivityForResult(myIntent, 149);
                }
                if (position == 150) {
                    Intent myIntent = new Intent(view.getContext(), Sigrid_Ester_Tani.class);
                    startActivityForResult(myIntent, 150);
                }
                if (position == 151) {
                    Intent myIntent = new Intent(view.getContext(), Siiri_Kutt.class);
                    startActivityForResult(myIntent, 151);
                }
                if (position == 152) {
                    Intent myIntent = new Intent(view.getContext(), Sille_Eero.class);
                    startActivityForResult(myIntent, 152);
                }
                if (position == 153) {
                    Intent myIntent = new Intent(view.getContext(), Sille_Lillestik.class);
                    startActivityForResult(myIntent, 153);
                }
                if (position == 154) {
                    Intent myIntent = new Intent(view.getContext(), Silvia_Pihu.class);
                    startActivityForResult(myIntent, 154);
                }
                if (position == 155) {
                    Intent myIntent = new Intent(view.getContext(), Siret_Zirk.class);
                    startActivityForResult(myIntent, 155);
                }
                if (position == 156) {
                    Intent myIntent = new Intent(view.getContext(), Sirje_Jaar.class);
                    startActivityForResult(myIntent, 156);
                }
                if (position == 157) {
                    Intent myIntent = new Intent(view.getContext(), Sirje_Kikas.class);
                    startActivityForResult(myIntent, 157);
                }
                if (position == 158) {
                    Intent myIntent = new Intent(view.getContext(), Sulev_Kiivit.class);
                    startActivityForResult(myIntent, 158);
                }
                if (position == 159) {
                    Intent myIntent = new Intent(view.getContext(), Taissa_Sulajeva.class);
                    startActivityForResult(myIntent, 159);
                }
                if (position == 160) {
                    Intent myIntent = new Intent(view.getContext(), Tanel_Plovits.class);
                    startActivityForResult(myIntent, 160);
                }
                if (position == 161) {
                    Intent myIntent = new Intent(view.getContext(), Tarmo_Rand.class);
                    startActivityForResult(myIntent, 161);
                }
                if (position == 162) {
                    Intent myIntent = new Intent(view.getContext(), Tarmo_Teekivi.class);
                    startActivityForResult(myIntent, 162);
                }
                if (position == 163) {
                    Intent myIntent = new Intent(view.getContext(), Tauri_Moones.class);
                    startActivityForResult(myIntent, 163);
                }
                if (position == 164) {
                    Intent myIntent = new Intent(view.getContext(), Tauris_Vijar.class);
                    startActivityForResult(myIntent, 164);
                }
                if (position == 165) {
                    Intent myIntent = new Intent(view.getContext(), Tiina_Aidnik.class);
                    startActivityForResult(myIntent, 165);
                }
                if (position == 166) {
                    Intent myIntent = new Intent(view.getContext(), Tiina_Friedrichson.class);
                    startActivityForResult(myIntent, 166);
                }
                if (position == 167) {
                    Intent myIntent = new Intent(view.getContext(), Tiina_Hintser.class);
                    startActivityForResult(myIntent, 167);
                }
                if (position == 168) {
                    Intent myIntent = new Intent(view.getContext(), Tiina_Ilus.class);
                    startActivityForResult(myIntent, 168);
                }
                if (position == 169) {
                    Intent myIntent = new Intent(view.getContext(), Tiina_Kraav.class);
                    startActivityForResult(myIntent, 169);
                }
                if (position == 170) {
                    Intent myIntent = new Intent(view.getContext(), Tiina_Karner.class);
                    startActivityForResult(myIntent, 170);
                }
                if (position == 171) {
                    Intent myIntent = new Intent(view.getContext(), Tiiu_Kruusmaa.class);
                    startActivityForResult(myIntent, 171);
                }
                if (position == 172) {
                    Intent myIntent = new Intent(view.getContext(), Tiiu_Vellevoog.class);
                    startActivityForResult(myIntent, 172);
                }
                if (position == 173) {
                    Intent myIntent = new Intent(view.getContext(), Timo_Puistaja.class);
                    startActivityForResult(myIntent, 173);
                }
                if (position == 174) {
                    Intent myIntent = new Intent(view.getContext(), Toomas_Sommer.class);
                    startActivityForResult(myIntent, 174);
                }
                if (position == 175) {
                    Intent myIntent = new Intent(view.getContext(), Tonu_Mustjogi.class);
                    startActivityForResult(myIntent, 175);
                }
                if (position == 176) {
                    Intent myIntent = new Intent(view.getContext(), Urmas_Treier.class);
                    startActivityForResult(myIntent, 176);
                }
                if (position == 177) {
                    Intent myIntent = new Intent(view.getContext(), Vaike_Vetka.class);
                    startActivityForResult(myIntent, 177);
                }
                if (position == 178) {
                    Intent myIntent = new Intent(view.getContext(), Valdur_Leppik.class);
                    startActivityForResult(myIntent, 178);
                }
                if (position == 179) {
                    Intent myIntent = new Intent(view.getContext(), Valdo_Abel.class);
                    startActivityForResult(myIntent, 179);
                }
                if (position == 180) {
                    Intent myIntent = new Intent(view.getContext(), Veronica_Reimaa.class);
                    startActivityForResult(myIntent, 180);
                }
                if (position == 181) {
                    Intent myIntent = new Intent(view.getContext(), Viktoria_Anusova.class);
                    startActivityForResult(myIntent, 181);
                }
                if (position == 182) {
                    Intent myIntent = new Intent(view.getContext(), Villu_Repan.class);
                    startActivityForResult(myIntent, 182);
                }
                if (position == 183) {
                    Intent myIntent = new Intent(view.getContext(), Vilve_Pohla.class);
                    startActivityForResult(myIntent, 183);
                }
                if (position == 184) {
                    Intent myIntent = new Intent(view.getContext(), Vladislav_Tsaregordtsev.class);
                    startActivityForResult(myIntent, 184);
                }
                if (position == 185) {
                    Intent myIntent = new Intent(view.getContext(), Onnela_Muuga.class);
                    startActivityForResult(myIntent, 185);
                }
                if (position == 186) {
                    Intent myIntent = new Intent(view.getContext(), Ulle_Antson.class);
                    startActivityForResult(myIntent, 186);
                }
                if (position == 187) {
                    Intent myIntent = new Intent(view.getContext(), Ulle_Kruuda.class);
                    startActivityForResult(myIntent, 187);
                }
                if (position == 188) {
                    Intent myIntent = new Intent(view.getContext(), Ulle_Soeson.class);
                    startActivityForResult(myIntent, 188);
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });

        return view;

    }
}
