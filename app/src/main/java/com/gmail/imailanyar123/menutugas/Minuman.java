package com.gmail.imailanyar123.menutugas;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.ListView;

public class Minuman extends AppCompatActivity {

    ListView simpleList2;
    String  Item2[] = {"wedangronde", "wedanguwuh", " essemlo", "birpletok"};
    String  SubItem2[] = {"Minuman yang terbuat dari air jahe yang dicampur gula dan diberi isian berupa bola-bola kacang tanah giling yang sudah dicampur gula sehingga memiliki rasa manis.",
            "Wedang uwuh memiliki rasa merah karena pengaruh kayu secang yang dimasukkan ke dalamnya.",
            "Es semlo sendiri merupakan minuman khas Kraton Yogyakarta dan konon merupakan kesukaan Sultan Hamengkubuwono IX.",
            "Minuman ini terbuat dari berbagai jenis rempah seperti kayu secang, kapulaga, pandan, serai, dan juga cengkeh. "};
    int flags2[] = {R.drawable.wedangronde, R.drawable.wedanguwuh, R.drawable.essemlo, R.drawable.birpletok};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_minuman);

        simpleList2 = (ListView)findViewById(R.id.ListView);
        CustomAdapter customAdapter = new CustomAdapter(getApplicationContext(), Item2,SubItem2, flags2);
        simpleList2.setAdapter(customAdapter);
    }
}

