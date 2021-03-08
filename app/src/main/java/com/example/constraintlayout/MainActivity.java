package com.example.constraintlayout;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
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
}