package com.qrcode.ssc;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import com.squareup.picasso.Picasso;

public class DaftarVideo extends AppCompatActivity implements View.OnClickListener {

    private CardView backbutton, cVid1, cVid2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_daftar_video);

        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);

        ImageView imVid1 = findViewById(R.id.gVid1);
        ImageView imVid2 = findViewById(R.id.gVid2);

        String urlIm1 = "https://firebasestorage.googleapis.com/v0/b/my-thesis-c5a39.appspot.com/o/ASRS%2FScreenshot%20(59).png?alt=media&token=be0257d3-1906-4de7-8705-0ac628ad0825";
        String urlIm2 = "https://firebasestorage.googleapis.com/v0/b/my-thesis-c5a39.appspot.com/o/rev1.2%2Fthumbnail2.jpg?alt=media&token=b3f5510e-ac4d-4bcb-90df-110579ee0ccb";

        Picasso.get().load(urlIm1).into(imVid1);
        Picasso.get().load(urlIm2).into(imVid2);

        cVid1 = findViewById(R.id.vid1);
        cVid2 = findViewById(R.id.vid2);
        backbutton = findViewById(R.id.backBtn);

        cVid1.setOnClickListener(this);
        cVid2.setOnClickListener(this);
        backbutton.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        Intent i;

        switch (v.getId()) {
            case R.id.vid1:
                i = new Intent(this, Video1Activity.class);
                startActivity(i);
                break;
            case R.id.vid2:
                i = new Intent(this, Video2Activity.class);
                startActivity(i);
                break;
            case R.id.backBtn:
                onBackPressed();
                break;
            default:
                break;
        }
    }
}