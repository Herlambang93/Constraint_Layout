package com.example.constraintlayout;

import android.os.Bundle;

import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class Act2 extends AppCompatActivity {
    TextView txemail,txpassword;
    String Name, Password;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.page2);

        txemail = findViewById(R.id.tvEmail);
        txpassword = findViewById(R.id.tvPassword);
        Bundle bl2 = this.getIntent().getExtras();
        Name = bl2.getString("parameter");
        Password = bl2.getString("parameter2");

        txemail.setText(Name);
        txpassword.setText(Password);


    }
}