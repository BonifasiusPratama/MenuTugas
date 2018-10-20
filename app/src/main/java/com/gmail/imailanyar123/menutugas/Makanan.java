package com.gmail.imailanyar123.menutugas;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.ListView;

public class Makanan extends AppCompatActivity {
    ListView simpleList;
    String  Item[] = {"baksopanjang", "lekerbaper", "rujakeskrim", "miayampedas", "tempogelatto", "nagalatte"};
    String  SubItem[] = {"Bakso bulat sudah biasa, di Jogja ada yang namanya bakso panjang.",
            "Leker Baper menyediakan kue leker dengan berbagai toping yang unik dan kekinian, misalnya leker dengan toping Indomie ini.",
            "Kamu bisa mendapatkan Rujak Eskrim Pak Paino ini di Jl. Harjowinatan Pakualaman, Yogjakarta, buka jam 10.00-16.00.",
            "Mie ayam ini dibuat menggunakan buah dan sayur sehingga menghasilkan warna-warni yang menarik perhatian.",
            "Belum lengkap rasanya ke Jogja kalau belum mampir ke Tempo Gelato yang ada di Jl. Prawirotaman dan Jl. Kaliurang. Tentunya, dengan spot yang instagramable di tiap sudutnya.",
            "Kalau kamu ingin menikmati kopi dengan cara yang berbeda, cobalah ke Legend Coffee di Jl. Abubakar Ali 24, Yogyakarta. Di sana kamu bisa memesan Naga Latte."};
    int flags[] = {R.drawable.baksopanjang, R.drawable.lekerbaper, R.drawable.rujakeskrim, R.drawable.mieayampedas, R.drawable.tempogelatto, R.drawable.nagalatte};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_makanan);

        simpleList = (ListView)findViewById(R.id.ListView);
        CustomAdapter customAdapter = new CustomAdapter(getApplicationContext(), Item,SubItem, flags);
        simpleList.setAdapter(customAdapter);
    }
}
