package com.example.helloapp;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class implicit_explicit_activity extends AppCompatActivity {
    private EditText editangka1, editangka2;
    private Button btntambah, buttonmove, buttonshare;
    private TextView texthasil;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.impli_explisit);

        editangka1 = findViewById(R.id.editangka1);
        editangka2 = findViewById(R.id.editangka2);
        btntambah = findViewById(R.id.btntambah);
        texthasil = findViewById(R.id.texthasil);
        buttonmove = findViewById(R.id.buttonmove);
        buttonshare = findViewById(R.id.buttonshare);

        btntambah.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String angka1 = editangka1.getText().toString().trim();
                String angka2 = editangka2.getText().toString().trim();

                int hasil = Integer.parseInt(angka1) + Integer.parseInt(angka2);

                texthasil.setText("Hasilnya adalah = " + hasil);
            }
        });
    }

    public implicit_explicit_activity(EditText editangka1) {
        this.editangka1 = editangka1;
    }
}
