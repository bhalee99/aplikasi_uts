package com.Muh_Iqbal_F52124089.aplikasi_uts;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;
import android.widget.SearchView;
import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ListView listView;
    SearchView searchView;
    ArrayList<Orang> listTimKrai;
    OrangAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listView = findViewById(R.id.listView);
        searchView = findViewById(R.id.searchView);

        listTimKrai = new ArrayList<>();


        listTimKrai.add(new Orang(R.drawable.foto_iqbal, "Muh Iqbal", "Tim Leader & Software", "Sistem Informasi", "2024"));
        listTimKrai.add(new Orang(R.drawable.foto_ardin, "Ardiansyah", "Elektronika", "Teknik Elektro", "2023"));
        listTimKrai.add(new Orang(R.drawable.foto_aril, "Moh Aril", "Elektronika", "Teknik Elektro", "2023"));
        listTimKrai.add(new Orang(R.drawable.foto_lubis, "Arilubis", "Mekanik", "Pendidikan Matematika", "2024"));
        listTimKrai.add(new Orang(R.drawable.foto_bintang, "Bintang Adiarta", "Mekanik", "Teknik Informatika", "2021"));
        listTimKrai.add(new Orang(R.drawable.foto_nabil, "Nabil Syaputra", "Mekanik", "Teknik Informatika", "2024"));
        listTimKrai.add(new Orang(R.drawable.foto_almadina, "Almadina", "Mekanik", "Teknik Sipil", "2023"));
        listTimKrai.add(new Orang(R.drawable.foto_putri, "Putri", "Mekanik", "Angribisnis", "2023"));
        listTimKrai.add(new Orang(R.drawable.foto_qhiran, "Muh Qhiran", "Program", "Teknik Informatika", "2023"));
        adapter = new OrangAdapter(this, listTimKrai);
        listView.setAdapter(adapter);

        searchView.setOnQueryTextListener(new SearchView.OnQueryTextListener() {
            @Override
            public boolean onQueryTextSubmit(String query) { return false; }

            @Override
            public boolean onQueryTextChange(String newText) {
                filterPencarian(newText);
                return true;
            }
        });
    }

    private void filterPencarian(String text) {
        ArrayList<Orang> listHasilFilter = new ArrayList<>();
        for (Orang anggota : listTimKrai) {
            if (anggota.getNama().toLowerCase().contains(text.toLowerCase()) ||
                    anggota.getStatus().toLowerCase().contains(text.toLowerCase())) {
                listHasilFilter.add(anggota);
            }
        }
        adapter = new OrangAdapter(this, listHasilFilter);
        listView.setAdapter(adapter);
    }
}