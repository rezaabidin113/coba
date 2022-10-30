package com.example.mp;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {


    //BUTTON
    Button btnprofile, btnmateri;

    Button exitButton;
    AlertDialog.Builder builder;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //intent profile
        btnprofile = (Button) findViewById(R.id.btnprofile);
        btnmateri = (Button) findViewById(R.id.btnmateri);

        exitButton = findViewById(R.id.btnexit);
        builder = new AlertDialog.Builder(this);

        exitButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                builder.setMessage(R.string.dialog).setTitle(R.string.dialog_title);

                builder.setMessage("Do Want To Exit ?")
                        .setCancelable(false)
                        .setPositiveButton("Yes", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialogInterface, int i) {
                                finish();
                                Toast.makeText(MainActivity.this, "Anda Telah Keluar", Toast.LENGTH_SHORT).show();
                            }
                        });
                AlertDialog alertDialog = builder.create();
                alertDialog.setTitle("Keluar ?");
                alertDialog.show();
            }
        });
        btnprofile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent BukaActivityProfile = new Intent(getApplicationContext(), ProfileActivity.class);
                startActivity(BukaActivityProfile);
            }
        });
        btnmateri.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                BukaMateri();
            }
        });
        }
        public void BukaMateri(){
            Intent BukaActivitymateri = new Intent(getApplicationContext(), MateriActivity.class);
            startActivity(BukaActivitymateri);
    }





}