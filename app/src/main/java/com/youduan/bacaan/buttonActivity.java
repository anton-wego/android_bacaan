package com.youduan.bacaan;

import android.content.DialogInterface;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class buttonActivity extends AppCompatActivity {

    Button rubyonrails;
    Button java;
    Button php;
    Button backBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_button);


        rubyonrails = (Button) findViewById(R.id.button1);
        java = (Button) findViewById(R.id.button2);
        php = (Button) findViewById(R.id.button3);
        backBtn = (Button) findViewById(R.id.buttonBack);

        backBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });

        rubyonrails.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                displayDialog("Ruby on Rails");
            }
        });
        java.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                displayDialog("Java");
            }
        });
        php.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                displayDialog("Php");
            }
        });
    }

    public void displayDialog(final String jawaban){
        final AlertDialog.Builder alert = new AlertDialog.Builder(this);
        alert.setTitle("Jawab Anda");
        alert.setMessage("Apakah Anda yakin dengan jawaban : " + jawaban);
        alert.setPositiveButton("Yes", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                if (jawaban == "Ruby on Rails"){
                    Toast.makeText(getApplicationContext(), "Selamat Jawaban Anda benar", Toast.LENGTH_SHORT).show();
                } else {
                    Toast.makeText(getApplicationContext(), "Maap jawaban nya salah.", Toast.LENGTH_SHORT).show();
                }
            }
        });
        alert.setNegativeButton("No", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                dialogInterface.dismiss();
            }
        });
        alert.show();
    }
}
