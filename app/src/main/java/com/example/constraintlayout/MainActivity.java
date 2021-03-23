package com.example.constraintlayout;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button button;
    EditText editTextTextPersonName, editTextTextPersonName2;
    String Name,Password;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button = findViewById(R.id.button);
        editTextTextPersonName= findViewById(R.id.editTextTextPersonName);
        editTextTextPersonName2 = findViewById(R.id.editTextTextPersonName2);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Name = editTextTextPersonName.getText().toString();
                Password = editTextTextPersonName2.getText().toString();

                if(Name.equals("lams@gmail.com") && Password.equals("wek")) {
                    Toast t = Toast.makeText(getApplicationContext(),
                            "email dan password benar", Toast.LENGTH_LONG);
                    t.show();


                    Bundle bl = new Bundle();
                    bl.putString("parameter", Name.trim());
                    bl.putString("parameter2", Password.trim());

                    Intent IntBaru = new Intent(MainActivity.this, Act2.class);
                    IntBaru.putExtras(bl);

                    startActivity(IntBaru);
                }
                else if(!Name.equals("lams@gmail.com") && Password.equals("wek")) {
                    Toast t = Toast.makeText(getApplicationContext(),
                            "email salah", Toast.LENGTH_LONG);
                    t.show();
                }
                else if(Name.equals("lams@gmail.com") && !Password.equals("wek")) {
                    Toast t = Toast.makeText(getApplicationContext(),
                            "password salah", Toast.LENGTH_LONG);
                    t.show();
                }
                else {
                    Toast t = Toast.makeText(getApplicationContext(),
                            "email dan password salah", Toast.LENGTH_LONG);
                    t.show();
                }
            }
        });
    }
    //menu(actHasil)
    //menu1(actDaftar)

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        //Method untuk menampilkan menu.
        getMenuInflater().inflate(R.menu.menu1, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        //membuat kondisi jika yang dipilih adalah id mnDaftar
        if (item.getItemId() == R.id.mnDaftar)
        {
            Intent i = new Intent(getApplicationContext(), Daftar.class);
            startActivity(i);
        }

        return super.onOptionsItemSelected(item);
    }
}