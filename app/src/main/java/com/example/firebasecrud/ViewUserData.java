package com.example.firebasecrud;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class ViewUserData extends AppCompatActivity {

    private TextView name, email, contact, city, lang;

    private static final String NAME_KEY = "com.example.firebasecrud.NAME_";
    private static final String EMAIL_KEY = "com.example.firebasecrud.EMAIL_";
    private static final String CONTAT_KEY = "com.example.firebasecrud.CONTACT_";
    private static final String CITY_KEY = "com.example.firebasecrud.CITY_";
    private static final String LANG_KEY = "com.example.firebasecrud.LANG_";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view_user_data);

        name = findViewById(R.id.view_name);
        email = findViewById(R.id.view_email);
        contact = findViewById(R.id.view_contact);
        city = findViewById(R.id.view_city);
        lang = findViewById(R.id.view_lang);

        Intent intent = getIntent();

        String NAME = intent.getStringExtra(NAME_KEY);
        String EMAIl = intent.getStringExtra(EMAIL_KEY);
        String CONTACT = intent.getStringExtra(CONTAT_KEY);
        String CITY = intent.getStringExtra(CITY_KEY);
        String LANG = intent.getStringExtra(LANG_KEY);

        name.setText(NAME);
        email.setText(EMAIl);
        contact.setText(CONTACT);
        city.setText(CITY);
        lang.setText(LANG);
    }
}
