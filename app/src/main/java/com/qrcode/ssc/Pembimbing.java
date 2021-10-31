package com.qrcode.ssc;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.WindowManager;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import com.squareup.picasso.Picasso;

public class Pembimbing extends AppCompatActivity {

    ImageView fotProf, dosMail, dosFb;
    CardView backButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pembimbing);

        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);

        fotProf = findViewById(R.id.pembimbing);
        dosMail = findViewById(R.id.dosmail);
        dosFb = findViewById(R.id.dosfb);
        backButton = findViewById(R.id.backBtn);

        String urlFot = "https://firebasestorage.googleapis.com/v0/b/my-thesis-c5a39.appspot.com/o/image%2Frev%2FTotok-Maryadi.jpg?alt=media&token=8bcae062-d3eb-43bd-9ad6-e5bc263ebc73";
        Picasso.get().load(urlFot).into(fotProf);

        dosMail.setOnClickListener(v -> gotoUrl("mailto:totokheru@uny.ac.id"));
        dosFb.setOnClickListener(v -> gotoUrl("https://www.facebook.com/totok.ygy"));
        backButton.setOnClickListener(v -> onBackPressed());

    }

    private void gotoUrl(String s) {
        Uri uri = Uri.parse(s);
        startActivity(new Intent(Intent.ACTION_VIEW,uri));
    }
}