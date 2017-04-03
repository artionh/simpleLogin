package com.example.artion.hyrnesistem;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class LoginActivity extends AppCompatActivity {

    public EditText email;
    public EditText password;
    public Button login;
    public Button register;
    public String inEmail;
    public String inPassword;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        login();
    }

    public void login(){
        email = (EditText) findViewById(R.id.email);
        password = (EditText) findViewById(R.id.password);
        inEmail = email.toString();
        inPassword = password.toString();
        login = (Button) findViewById(R.id.hyr);
        register = (Button) findViewById(R.id.regjistrohu);
        login.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                String success = "Login u krye me sukses";
                Toast.makeText(LoginActivity.this, success, Toast.LENGTH_SHORT).show();
            }
        });
        register.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                startActivity(new Intent(getApplicationContext(), RegisterActivity.class));
            }
        });
    }
}
