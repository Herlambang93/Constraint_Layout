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



                Toast t = Toast.makeText(getApplicationContext(),
                        "email anda" + Name + "dan password anda:" +Password+"",Toast.LENGTH_LONG);
                t.show();

            }
            public boolean validasiData(){
                String emailActive = "Lams@gmail.com";
                String passActive = "Wek";

                if(emailActive.equals(editTextTextPersonName.getText().toString()) && passActive.equals(editTextTextPersonName2.getText().toString())){
                    return true;
                }
                return false;
            }

        });

    }
}