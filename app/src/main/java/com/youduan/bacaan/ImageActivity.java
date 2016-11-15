package com.youduan.bacaan;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class ImageActivity extends AppCompatActivity {

    Button backBtn;
    Button previousBtn;
    Button nextBtn;
    ImageView us;
    ImageView us2;
    ImageView us3;
    Integer currentImage = 1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_image);

        backBtn = (Button) findViewById(R.id.checkBoxBack);
        previousBtn = (Button) findViewById(R.id.previous);
        nextBtn = (Button) findViewById(R.id.next);
        us = (ImageView) findViewById(R.id.us);
        us2 = (ImageView) findViewById(R.id.us2);
        us3 = (ImageView) findViewById(R.id.us3);

        us.setVisibility(1);

        backBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });

        nextBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                currentImage++;

                if (currentImage > 3){
                    currentImage = 1;
                }

                showCurrentImage(currentImage);
            }
        });

        previousBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                currentImage--;
                if (currentImage < 1){
                    currentImage = 3;
                }

                showCurrentImage(currentImage);
            }
        });

    }

    public void setInVisibility(){
        us.setVisibility(View.GONE);
        us2.setVisibility(View.GONE);
        us3.setVisibility(View.GONE);
    }

    public void showCurrentImage(Integer currentImage){
        setInVisibility();

        switch (currentImage){
            case 1:
                us.setVisibility(View.VISIBLE);
                break;
            case 2:
                us2.setVisibility(View.VISIBLE);
                break;
            case 3:
                us3.setVisibility(View.VISIBLE);
                break;
        }
    }
}
