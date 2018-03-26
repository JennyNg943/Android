package com.example.petit.shirukiz;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;

/**
 * Created by petit on 25/03/2018.
 */

public class IntroActivity extends AppCompatActivity {

    private ImageView imgAccueil;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.intro);

        imgAccueil = (ImageView)findViewById(R.id.imgAccueil);

        imgAccueil.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent secondeActivite = new Intent(IntroActivity.this, MainActivity.class);
                startActivity(secondeActivite);

            }

        });


    }



}
