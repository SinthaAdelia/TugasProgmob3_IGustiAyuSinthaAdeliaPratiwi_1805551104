package com.example.rekomendasidramakoreaterbaru2020;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

import java.util.ArrayList;

public class detailActivity extends AppCompatActivity {

    ImageView imageViewFotoDrakor;
    TextView textViewNamaDrakor, textViewInfoDrakor;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        imageViewFotoDrakor = findViewById(R.id.imageViewFotoDrakor);
        textViewNamaDrakor = findViewById(R.id.textViewNamaDrakor);
        textViewInfoDrakor = findViewById(R.id.textViewInfoDrakor);

        getIncomingExtra();
    }

    private void getIncomingExtra(){
        if(getIntent().hasExtra("foto_drakor") && getIntent().hasExtra("nama_drakor") && getIntent().hasExtra("info_drakor")){

            String fotoDrakor = getIntent().getStringExtra("foto_drakor");
            String namaDrakor = getIntent().getStringExtra("nama_drakor");
            String infoDrakor = getIntent().getStringExtra("info_drakor");

            setDataActivity(fotoDrakor, namaDrakor, infoDrakor);
        }
    }

    private void setDataActivity(String fotoDrakor, String namaDrakor, String infoDrakor){

        Glide.with(this).asBitmap().load(fotoDrakor).into(imageViewFotoDrakor);

        textViewNamaDrakor.setText(namaDrakor);
        textViewInfoDrakor.setText(infoDrakor);

    }
}
