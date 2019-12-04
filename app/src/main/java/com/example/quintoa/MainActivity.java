package com.example.quintoa;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    Button botonLogin, botonSumar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        cargarComponentes();
    }

    private void cargarComponentes(){
        botonSumar = findViewById(R.id.btnIrSuma);
        botonLogin = findViewById(R.id.btnIrLogin);
        botonLogin.setOnClickListener(this);
        botonSumar.setOnClickListener(this);
    }

    @Override
    public void onClick (View view){
        Intent intent = null;
        switch (view.getId()){
            case R.id.btnIrLogin:
                intent = new Intent(MainActivity.this,ActivityLogin.class);
                startActivity(intent);
                break;
            case R.id.btnIrSuma:
                intent = new Intent(MainActivity.this,ActivitySuma.class);
                startActivity(intent);
                break;
        }
    }
}