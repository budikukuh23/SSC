package com.qrcode.ssc;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.WindowManager;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import com.squareup.picasso.Picasso;

public class MenuTentangActivity extends AppCompatActivity {

    ImageView imagetentang2, imagetentang3;
    CardView backButton;
    TextView developer, dosBing;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_tentang);

        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);

        imagetentang2 = findViewById(R.id.imageinfo2);
        imagetentang3 = findViewById(R.id.imageinfo3);
        backButton = findViewById(R.id.backBtn);
        developer = findViewById(R.id.dev);
        dosBing = findViewById(R.id.dosbing);

        String urlimage2 = "https://firebasestorage.googleapis.com/v0/b/my-thesis-c5a39.appspot.com/o/ASRS%2Fpersonal_growth_100px.png?alt=media&token=f25ebde7-f905-418c-a7f0-75ad2d587ef5";
        String urlimage3 = "https://firebasestorage.googleapis.com/v0/b/my-thesis-c5a39.appspot.com/o/ASRS%2Feasy_100px.png?alt=media&token=1d90dabb-3ffe-4498-b623-d488ea1cfd69";

        Picasso.get().load(urlimage2).into(imagetentang2);
        Picasso.get().load(urlimage3).into(imagetentang3);

        developer.setOnClickListener(v -> {
            Intent intent = new Intent(MenuTentangActivity.this, Pengembang.class);
            startActivity(intent);
        });
        dosBing.setOnClickListener(v -> {
            Intent intent = new Intent(MenuTentangActivity.this, Pembimbing.class);
            startActivity(intent);
        });
        backButton.setOnClickListener(v -> onBackPressed());

    }

    private void gotoUrl(String s) {
        Uri uri = Uri.parse(s);
        startActivity(new Intent(Intent.ACTION_VIEW,uri));
    }
}