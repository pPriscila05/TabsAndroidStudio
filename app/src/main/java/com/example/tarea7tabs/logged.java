package com.example.tarea7tabs;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class logged extends AppCompatActivity {
    TextView textView;
    Bundle data;
    String user;
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.screen);
        data = getIntent().getExtras();
        user = data.getString("usuario");

        textView = findViewById(R.id.textView2);
        textView.setText("Bienvenido " + user);
    }

    public void Volver(View view){
        Intent volver = new Intent(logged.this, MainActivity.class);
        startActivity(volver);
    }
}
