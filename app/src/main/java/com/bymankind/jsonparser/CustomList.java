package com.bymankind.jsonparser;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

/**
 * Created by Server-Panduit on 7/26/2016.
 */
public class CustomList  extends ArrayAdapter<String>{

    public static String[] id_posisi;
    public static String[] posisi;
    public static String[] password;

    private Activity context;

    public CustomList(Activity context, String[] id_posisi, String[] posisi, String[] password) {
        super(context, R.layout.list_view_layout, id_posisi);
        this.context = context;
        this.id_posisi = id_posisi;
        this.posisi = posisi;
        this.password = password;
    }

    @Override
    public View getView(int position,View convertView, ViewGroup parent){
        LayoutInflater inflater = context.getLayoutInflater();
        View listViewItem = inflater.inflate(R.layout.list_view_layout, null, true);
        TextView textViewId = (TextView) listViewItem.findViewById(R.id.textViewId);
        TextView textViewPosisi = (TextView) listViewItem.findViewById(R.id.textViewPosisi);
        TextView textViewPassword = (TextView) listViewItem.findViewById(R.id.textViewPassword);

        textViewId.setText(id_posisi[position]);
        textViewPosisi.setText(posisi[position]);
        textViewPassword.setText(password[position]);

        return listViewItem;
    }

}
