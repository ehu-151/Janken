package com.example.ehu.janken;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;

public class ResultActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_resuult);

        Intent intent = getIntent();
        int id = intent.getIntExtra("MY_HAND", 0);
        ImageView myHandImageView = (ImageView) findViewById(R.id.my_hand_image);

        switch (id) {
            case R.id.gu:
                myHandImageView.setImageResource(R.drawable.gu);
                break;
            case R.id.choki:
                myHandImageView.setImageResource(R.drawable.choki);
                break;
            case R.id.pa:
                myHandImageView.setImageResource(R.drawable.pa);
                break;
            default:
                break;

        }
    }
}
