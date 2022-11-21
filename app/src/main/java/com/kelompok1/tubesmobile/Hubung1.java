package com.kelompok1.tubesmobile;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class Hubung1 extends BaseAdapter {
    private Context context;
    private ArrayList<Gambar1> heroes1;
    void setHeroes (ArrayList<Gambar1> heroes1 ) {
        this.heroes1 = heroes1;
    }

    Hubung1(Context context){
        this.context = context;
        heroes1 = new ArrayList<>();
    }

    @Override
    public int getCount() {
        return heroes1.size();
    }

    @Override
    public Object getItem(int i) {
        return heroes1.get(i);
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        if (view == null) {
            view = LayoutInflater.from(context).inflate(R.layout.gambar1, viewGroup, false);
        }
        ViewHolder viewHolder = new ViewHolder(view);
        Gambar1 hero1 = (Gambar1) getItem(i);
        viewHolder.bind(hero1);
        return view;
    }
    private class ViewHolder {
        private ImageView imgPhoto1;
        private TextView txtName1;

        ViewHolder (View view) {
            imgPhoto1 = view.findViewById(R.id.img_photo1);
            txtName1 = view.findViewById(R.id.txt_name1);
        }

        void bind(Gambar1 hero) {
            txtName1.setText(hero.getNama1());
            imgPhoto1.setImageResource(hero.getPhoto1());
        }
    }
}
