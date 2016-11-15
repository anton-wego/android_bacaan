package com.youduan.bacaan;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class EditTextActivity extends AppCompatActivity {

    EditText name;
    EditText email;
    TextView result;
    Button back;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_edit_text);


        name = (EditText) findViewById(R.id.name);
        email = (EditText) findViewById(R.id.email);
        result = (TextView) findViewById(R.id.result);
        back = (Button) findViewById(R.id.back);

        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });

        name.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
                result.setText(charSequence + "\n" + email.getText().toString());
            }

            @Override
            public void afterTextChanged(Editable editable) {

            }
        });

        email.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
                result.setText(name.getText().toString() + "\n" + charSequence);
            }

            @Override
            public void afterTextChanged(Editable editable) {

            }
        });
    }
}
