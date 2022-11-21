package com.kelompok1.tubesmobile;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.res.TypedArray;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

public class MakananActivity extends AppCompatActivity {
    private String[] dataName1;
    private TypedArray datapoto1;
    private Hubung1 hubung1;
    private ArrayList<Gambar1> heroes1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_makanan);

        hubung1 = new Hubung1(this);
        ListView listView = findViewById(R.id.A);
        listView.setAdapter(hubung1);

        prepare1();
        additem1();

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long l) {
                if (position == 0) {
                    //kaledo
                    startActivity(new Intent(MakananActivity.this, Kaledo.class));
                } else if (position == 1) {
                    //uta kelo
                    startActivity(new Intent(MakananActivity.this, UtaKelo.class));
                } else if (position == 2) {
                    //dou sole
                    startActivity(new Intent(MakananActivity.this, DuoSole.class));
                }
                else if (position == 3) {
                    //labia dange
                    startActivity(new Intent(MakananActivity.this, LabiaDange.class));
                }
                else if (position == 4) {
                    //lalampa
                    startActivity(new Intent(MakananActivity.this, Lalampa.class));
                }

            }
        });
    }
    private void additem1() {
        heroes1 = new ArrayList<>();
        for (int i = 0; i < dataName1.length; i++) {
            Gambar1 hero1 = new Gambar1();
            hero1.setPhoto1(datapoto1.getResourceId(i, -1));
            hero1.setNama1(dataName1[i]);
            heroes1.add(hero1);
        }
        hubung1.setHeroes(heroes1);
    }
    private void prepare1() {
        dataName1 = getResources().getStringArray(R.array.data_name1);
        datapoto1 = getResources().obtainTypedArray(R.array.datapoto1);
    }
}