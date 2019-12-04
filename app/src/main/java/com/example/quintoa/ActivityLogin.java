package com.example.quintoa;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class ActivityLogin extends AppCompatActivity implements View.OnClickListener{

    EditText cajaUsuario,cajaPassword;
    Button boton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        cargarComponentes();
    }

    @SuppressLint("WrongViewCast")
    private void cargarComponentes(){
        cajaUsuario = findViewById(R.id.txtUser);
        cajaPassword = findViewById(R.id.txtPassword);
        boton = findViewById(R.id.btnLogin);
        boton.setOnClickListener(this);
    }

    public void onClick(View view){
        Toast.makeText(ActivityLogin.this,"Usuario:"+cajaUsuario.getText()+
                "Clave:"+cajaPassword.getText(), Toast.LENGTH_LONG).show();
    }
}
