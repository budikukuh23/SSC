package com.qrcode.ssc;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import com.squareup.picasso.Picasso;

public class StartUpValve extends AppCompatActivity {

    private CardView backButton, qrButton;
    ImageView gambarKomponen;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_start_up_valve);

        gambarKomponen = findViewById(R.id.gambarNew);
        backButton = findViewById(R.id.back);
        qrButton = findViewById(R.id.camBtn);

        String urlGambar = "https://firebasestorage.googleapis.com/v0/b/my-thesis-c5a39.appspot.com/o/rev1.2%2FService%20unit%20with%20onoff%20valve.JPG?alt=media&token=5f58fed7-8a13-428c-9ead-6e37fca0e0ae";

        Picasso.get().load(urlGambar).into(gambarKomponen);

        backButton.setOnClickListener(v -> onBackPressed());

        qrButton.setOnClickListener(v -> {
            Intent intent;
            intent = new Intent(StartUpValve.this, MenuScannerActivity.class);
            startActivity(intent);
        });

    }
}