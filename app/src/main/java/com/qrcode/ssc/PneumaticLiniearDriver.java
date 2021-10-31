package com.qrcode.ssc;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;

import com.squareup.picasso.Picasso;

public class PneumaticLiniearDriver extends AppCompatActivity {

    private CardView backButton, qrButton;
    ImageView gambarKomponen;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pneumatic_liniear_driver);

        gambarKomponen = findViewById(R.id.gambarNew);
        backButton = findViewById(R.id.back);
        qrButton = findViewById(R.id.camBtn);

        String urlGambar = "https://firebasestorage.googleapis.com/v0/b/my-thesis-c5a39.appspot.com/o/ASRS%2FPneumatic%20Liniear%20Drive2.png?alt=media&token=1daff691-34db-4218-9772-a29645717c41";

        Picasso.get().load(urlGambar).into(gambarKomponen);

        backButton.setOnClickListener(v -> onBackPressed());

        qrButton.setOnClickListener(v -> {
            Intent intent;
            intent = new Intent(PneumaticLiniearDriver.this, MenuScannerActivity.class);
            startActivity(intent);
        });
    }
}