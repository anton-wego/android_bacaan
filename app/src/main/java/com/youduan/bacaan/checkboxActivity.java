package com.youduan.bacaan;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.Toast;

public class checkboxActivity extends AppCompatActivity {

    Button jawabBtn;
    Button backBtn;
    CheckBox opsiOne;
    CheckBox opsiTwo;
    CheckBox opsiThree;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_checkbox);

        jawabBtn = (Button) findViewById(R.id.checkBoxJawab);
        opsiOne = (CheckBox) findViewById(R.id.checkBox1);
        opsiTwo = (CheckBox) findViewById(R.id.checkBox2);
        opsiThree = (CheckBox) findViewById(R.id.checkBox3);
        backBtn = (Button) findViewById(R.id.checkBoxBack);


        jawabBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (opsiOne.isChecked() && !opsiTwo.isChecked() && opsiThree.isChecked()){
                    Toast.makeText(getApplicationContext(), "Selamat Jawaban Anda benar", Toast.LENGTH_SHORT).show();
                } else {
                    Toast.makeText(getApplicationContext(), "Jawaban Anda masih salah", Toast.LENGTH_SHORT).show();
                }
            }
        });

        backBtn.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                finish();
            }
        });

    }

}
