package com.Muh_Iqbal_F52124089.aplikasi_uts;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import java.util.ArrayList;

public class OrangAdapter extends ArrayAdapter<Orang> {

    public OrangAdapter(Context context, ArrayList<Orang> listOrang) {
        super(context, 0, listOrang);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.list_item, parent, false);
        }

        Orang orangSaatIni = getItem(position);

        ImageView imgFoto = listItemView.findViewById(R.id.imgFoto);
        TextView tvNama = listItemView.findViewById(R.id.tvNama);
        TextView tvStatus = listItemView.findViewById(R.id.tvStatus);
        TextView tvJurusan = listItemView.findViewById(R.id.tvJurusan);
        TextView tvAngkatan = listItemView.findViewById(R.id.tvAngkatan);

        if (orangSaatIni != null) {
            imgFoto.setImageResource(orangSaatIni.getGambar());
            tvNama.setText(orangSaatIni.getNama());
            tvStatus.setText(orangSaatIni.getStatus());
            tvJurusan.setText("Jurusan: " + orangSaatIni.getJurusan());
            tvAngkatan.setText("Angkatan: " + orangSaatIni.getAngkatan());
        }

        return listItemView;
    }
}