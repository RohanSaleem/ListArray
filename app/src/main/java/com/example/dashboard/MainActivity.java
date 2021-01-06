package com.example.dashboard;

import androidx.appcompat.app.AppCompatActivity;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private SharedPreferences Pref;
    private String PrefName = "MyPref";
    private Button  btn_logout;

    private TextView show;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        show = findViewById(R.id.username);
        btn_logout = findViewById(R.id.layout);

        Pref = getSharedPreferences("useremail" "");
        show.setText(PrefName);
        

    }
}