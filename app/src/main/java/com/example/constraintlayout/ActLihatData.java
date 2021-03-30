package com.example.constraintlayout;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class ActLihatData extends AppCompatActivity {
    TextView tvnama,tvnomor;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_act_lihat_data);

        Bundle bundle = getIntent().getExtras();
        String nama = bundle.getString("a");
        switch (nama)
        {
            case "Inayah":
                tvnama.setText("Inayah M");
                tvnomor.setText("0812");
            case "Ilham":
                tvnama.setText("Ilham R");
                tvnomor.setText("0813");
            case "Eris":
                tvnama.setText("Eris J");
                tvnomor.setText("0814");
            case "Fikri":
                tvnama.setText("M Fikri");
                tvnomor.setText("0815");
            case "Maul":
                tvnama.setText("Maul M");
                tvnomor.setText("0816");
            case "Intan":
                tvnama.setText("Intan M");
                tvnomor.setText("0817");
            case "Vina":
                tvnama.setText("Vina R");
                tvnomor.setText("0818");
            case "Gita":
                tvnama.setText("Gita s");
                tvnomor.setText("0819");
            case "Lutfi":
                tvnama.setText("Lutfi M");
                tvnomor.setText("0820");
            case "Vian":
                tvnama.setText("Vian M");
                tvnomor.setText("0821");
        }
    }
}