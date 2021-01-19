package com.example.androiddasarlayout;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MenuActivity extends AppCompatActivity {

    // Create variable untuk button
    Button btnLinear, btnRelative, btnConstrain, btnFrame, btnScroll, btnToast, btnAlertDialog;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);

        // inisialisai pemanggilan button dari xml

        btnLinear       = findViewById(R.id.btn_Linear);
        btnRelative     = findViewById(R.id.btn_Relative);
        btnConstrain    = findViewById(R.id.btn_Constrain);
        btnFrame        = findViewById(R.id.btn_Frame);
        btnScroll       = findViewById(R.id.btn_Scroll);
        btnToast        = findViewById(R.id.btn_Toast);
        btnAlertDialog  = findViewById(R.id.btn_AlertDialog);

        // Set Event Button


        btnLinear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent panggil = new Intent(MenuActivity.this, LinearActivity.class); // Object memanggil class | class ini, class yang dipanggil
                startActivity(panggil);
            }
        });

        btnRelative.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent panggil = new Intent(MenuActivity.this, RelativeActivity.class); // Object memanggil class | class ini, class yang dipanggil
                startActivity(panggil);
            }
        });

        btnFrame.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent panggil = new Intent(MenuActivity.this, FrameActivity.class); // Object memanggil class | class ini, class yang dipanggil
                startActivity(panggil);
            }
        });

        btnConstrain.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent panggil = new Intent(MenuActivity.this, ConstrainActivity.class); // Object memanggil class | class ini, class yang dipanggil
                startActivity(panggil);
            }
        });

        btnScroll.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent panggil = new Intent(MenuActivity.this, ScrollActivity.class); // Object memanggil class | class ini, class yang dipanggil
                startActivity(panggil);
            }
        });


        btnToast.setOnClickListener(new View.OnClickListener() { // set onclick
            @Override
            public void onClick(View v) {
                //Toast
                Toast.makeText(MenuActivity.this, "ini Button Toast", Toast.LENGTH_SHORT).show();
            }
        });

        btnAlertDialog.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Alert Dialog
                AlertDialog.Builder pesan = new AlertDialog.Builder(MenuActivity.this); //membuat object
                pesan.setTitle("Relative");
                pesan.setMessage("ini button Alert Dialog");

                //Button Dalam Alert
                pesan.setPositiveButton("YES", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        Toast.makeText(MenuActivity.this, "Anda memilik OK", Toast.LENGTH_SHORT).show();
                    }
                });
                pesan.setNegativeButton("NO", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        Toast.makeText(MenuActivity.this, "Anda memilik NO", Toast.LENGTH_SHORT).show();
                    }
                });

                pesan.show();

            }
        });

    }
}