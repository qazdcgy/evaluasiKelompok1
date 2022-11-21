package com.kelompok1.tubesmobile;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class Hubung2 extends BaseAdapter {
    private Context context;
    private ArrayList<Gambar2> heroes2;
    void setHeroes (ArrayList<Gambar2> heroes2 ) {
        this.heroes2 = heroes2;
    }

    Hubung2(Context context){
        this.context = context;
        heroes2 = new ArrayList<>();
    }

    @Override
    public int getCount() {
        return heroes2.size();
    }

    @Override
    public Object getItem(int i) {
        return heroes2.get(i);
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        if (view == null) {
            view = LayoutInflater.from(context).inflate(R.layout.gambar2, viewGroup, false);
        }
        ViewHolder viewHolder = new ViewHolder(view);
        Gambar2 hero2 = (Gambar2) getItem(i);
        viewHolder.bind(hero2);
        return view;
    }
    private class ViewHolder {
        private ImageView imgPhoto2;
        private TextView txtName2;

        ViewHolder (View view) {
            imgPhoto2 = view.findViewById(R.id.img_photo2);
            txtName2 = view.findViewById(R.id.txt_name2);
        }

        void bind(Gambar2 hero) {
            txtName2.setText(hero.getNama2());
            imgPhoto2.setImageResource(hero.getPhoto2());
        }
    }
}
