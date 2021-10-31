package com.qrcode.ssc;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.WindowManager;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import com.squareup.picasso.Picasso;

public class Pengembang extends AppCompatActivity {

    ImageView fotProf, myInstagram, myFb, myEmail;
    CardView backButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pengembang);

        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);

        fotProf = findViewById(R.id.pengembang);
        myInstagram = findViewById(R.id.myinstagram);
        myFb = findViewById(R.id.myfb);
        myEmail = findViewById(R.id.myemail);
        backButton = findViewById(R.id.backBtn);

        String urlFot = "https://firebasestorage.googleapis.com/v0/b/my-thesis-c5a39.appspot.com/o/ASRS%2Ffoto.png?alt=media&token=d21e40ef-1912-4a11-be48-2652cc901139";
        Picasso.get().load(urlFot).into(fotProf);

        myInstagram.setOnClickListener(v -> gotoUrl("https://www.instagram.com/abistamaksum/"));
        myFb.setOnClickListener(v -> gotoUrl("https://www.facebook.com/abistamaksum11"));
        myEmail.setOnClickListener(v -> gotoUrl("mailto:abistamaksum.2017@student.uny.ac.id"));
        backButton.setOnClickListener(v -> onBackPressed());

    }

    private void gotoUrl(String s) {
        Uri uri = Uri.parse(s);
        startActivity(new Intent(Intent.ACTION_VIEW,uri));
    }
}