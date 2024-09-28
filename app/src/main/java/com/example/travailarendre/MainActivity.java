package com.example.travailarendre;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;

public class MainActivity extends AppCompatActivity {

    // Assurez-vous que ces lignes sont dans votre activité (ex : MainActivity.java)
    EditText Name, Email, Phone, Address;
    Spinner spinnerCity;
    Button btnSend;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Name = findViewById(R.id.name);
        Email = findViewById(R.id.email);
        Phone = findViewById(R.id.phone);
        Address = findViewById(R.id.address);
        spinnerCity = findViewById(R.id.spinner_city);
        btnSend = findViewById(R.id.btn_send);

        btnSend.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String name = Name.getText().toString();
                String email = Email.getText().toString();
                String phone = Phone.getText().toString();
                String address = Address.getText().toString();
                String city = spinnerCity.getSelectedItem().toString();

                Intent intent = new Intent(MainActivity.this, Result.class);


                intent.putExtra("name", name);
                intent.putExtra("email", email);
                intent.putExtra("phone", phone);
                intent.putExtra("address", address);
                intent.putExtra("city", city);

                startActivity(intent);

            }
        });

    }
}