package com.example.travailarendre;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class Result extends AppCompatActivity {

    TextView textViewDisplay;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);

        textViewDisplay = findViewById(R.id.text_view_display);

        // Récupérer les données envoyées via l'Intent
        String name = getIntent().getStringExtra("name");
        String email = getIntent().getStringExtra("email");
        String phone = getIntent().getStringExtra("phone");
        String address = getIntent().getStringExtra("address");
        String city = getIntent().getStringExtra("city");

        // Afficher les données dans le TextView
        textViewDisplay.setText("Name: " + name + "\nEmail: " + email + "\nPhone: " + phone +
                "\nAddress: " + address + "\nCity: " + city);
    }
}
