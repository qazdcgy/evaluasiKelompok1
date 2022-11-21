package com.kelompok1.tubesmobile;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.res.TypedArray;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

public class WisataActivity extends AppCompatActivity {
    private String[] dataName2;
    private TypedArray datapoto2;
    private Hubung2 hubung2;
    private ArrayList<Gambar2> heroes2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_wisata);

        hubung2 = new Hubung2(this);
        ListView listView = findViewById(R.id.B);
        listView.setAdapter(hubung2);

        prepare2();
        additem2();

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long l) {
                if (position == 0) {
                    //museum
                    startActivity(new Intent(WisataActivity.this, Museum.class));
                } else if (position == 1) {
                    //Danau
                    startActivity(new Intent(WisataActivity.this, DanauLewuto.class));
                } else if (position == 2) {
                    //Sou Raja
                    startActivity(new Intent(WisataActivity.this, SouRaja.class));
                }
                else if (position == 3) {
                    //Talise
                    startActivity(new Intent(WisataActivity.this, PantaiTalise.class));
                }
                else if (position == 4) {
                    //Hutkot
                    startActivity(new Intent(WisataActivity.this, Hutkot.class));
                }

            }
        });
    }
    private void additem2() {
        heroes2 = new ArrayList<>();
        for (int i = 0; i < dataName2.length; i++) {
            Gambar2 hero2 = new Gambar2();
            hero2.setPhoto2(datapoto2.getResourceId(i, -1));
            hero2.setNama2(dataName2[i]);
            heroes2.add(hero2);
        }
        hubung2.setHeroes(heroes2);
    }
    private void prepare2() {
        dataName2 = getResources().getStringArray(R.array.data_name2);
        datapoto2 = getResources().obtainTypedArray(R.array.datapoto2);
    }
}