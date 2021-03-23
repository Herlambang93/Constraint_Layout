package com.example.constraintlayout;

import androidx.appcompat.app.AppCompatActivity;
import androidx.annotation.NonNull;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;


import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;



public class Daftar extends AppCompatActivity {
    //Deklarasi variabel dengan tipe data EditText
    EditText edtNama, edtAlamat, edtEmail, edtPassword, edtrepass;
    FloatingActionButton fab;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu1);

        edtNama = findViewById(R.id.edNama);
        edtAlamat = findViewById(R.id.edAlamat);
        edtEmail = findViewById(R.id.EdEmail);
        edtPassword = findViewById(R.id.edPass);
        edtrepass = findViewById(R.id.edrepas);
        fab = findViewById(R.id.fabSimpan);

        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Membuat kondisi untuk mengecek apakah EditText kosong atau tidak
                if (edtNama.getText().toString().isEmpty() ||
                        edtAlamat.getText().toString().isEmpty() ||
                        edtEmail.getText().toString().isEmpty() ||
                        edtPassword.getText().toString().isEmpty() ||
                        edtrepass.getText().toString().isEmpty())
                {
                    //Menampilkan pesan notifikasi jika seluruh EditText wajib diisi
                    Snackbar.make(v, "Wajib isi seluruh data !", Snackbar.LENGTH_LONG).show();
                }
                else
                {
                    //Mebuat kondisi unutuk mengecek apakah isi dari EditText password dan EditText repassword
                    //sama atau tidak
                    if (edtPassword.getText().toString().equals(edtrepass.getText().toString()))
                    {
                        Toast.makeText(getApplicationContext(), "Pendaftaran Berhasil",
                                Toast.LENGTH_LONG).show();

                        Intent i = new Intent(getApplicationContext(),MainActivity.class);
                        startActivity(i);
                    }
                    else
                    {
                        Snackbar.make(v, "password Dan Repassword harus sama !",
                                Snackbar.LENGTH_LONG).show();
                    }
                }
            }
        });
    }


}