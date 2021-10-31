package com.qrcode.ssc;

import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import com.squareup.picasso.Picasso;

public class MenuMpsActivity extends AppCompatActivity implements View.OnClickListener {

    private CardView backbutton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_mps);

        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);

        ImageView imageView1 = findViewById(R.id.imageMps1);
        ImageView imageView2 = findViewById(R.id.imageMps2);

        String urlimage1 = "https://firebasestorage.googleapis.com/v0/b/my-thesis-c5a39.appspot.com/o/image%2Fslider%2Fimage1.JPG?alt=media&token=33176062-a9d7-4db4-8093-79d3134aaeaf";
        String urlimage2 = "https://firebasestorage.googleapis.com/v0/b/my-thesis-c5a39.appspot.com/o/image%2Fslider%2Fimage2.JPG?alt=media&token=90b7bdfc-97a1-470e-bae9-092d70fcf260";

        Picasso.get().load(urlimage1).into(imageView1);
        Picasso.get().load(urlimage2).into(imageView2);

        backbutton = findViewById(R.id.backBtn);

        backbutton.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {

        switch (v.getId()){
            case R.id.backBtn: onBackPressed(); break;
            default:break;
        }
    }
}