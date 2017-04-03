package com.example.artion.hyrnesistem;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
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
        register();
    }

    public void init(){
        email = (EditText) findViewById(R.id.email);
        password = (EditText) findViewById(R.id.password);
        login = (Button) findViewById(R.id.hyr);
        register = (Button) findViewById(R.id.regjistrohu);
    }

    public void checkLogin(){
        inEmail = email.getText().toString();
        inPassword = password.getText().toString();
        String message;
        if(inEmail.isEmpty() && inPassword.isEmpty()){
            message = "Fushat nuk mund te jene bosh!";
            Toast.makeText(getApplicationContext(),message,Toast.LENGTH_SHORT).show();
        }
        else if(!(inEmail.isEmpty()) && inPassword.isEmpty()){
            message = "Fjalekalimi nuk mund te jete bosh!";
            Toast.makeText(getApplicationContext(),message,Toast.LENGTH_SHORT).show();
        }
        else if(inEmail.isEmpty() && !(inPassword.isEmpty())){
            message = "E-mail nuk mund te jete bosh!";
            Toast.makeText(getApplicationContext(),message,Toast.LENGTH_SHORT).show();
        }
        else{
            message = "Ju futet: "+inEmail+" dhe: "+inPassword;
            Toast.makeText(getApplicationContext(),message,Toast.LENGTH_SHORT).show();
            Intent i = new Intent(getApplicationContext(),ProfileActivity.class);
            Bundle b = new Bundle();
            b.putString("email",inEmail);
            b.putString("password",inPassword);
            i.putExtras(b);
            startActivity(i);
        }
    }

    public void login(){
        init();
        login.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                checkLogin();
            }
        });

    }

    public void register(){
        register.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                startActivity(new Intent(getApplicationContext(), RegisterActivity.class));
            }
        });
    }
}
