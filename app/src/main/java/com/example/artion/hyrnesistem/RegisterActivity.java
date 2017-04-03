package com.example.artion.hyrnesistem;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;


public class RegisterActivity extends AppCompatActivity {

    public Button register;
    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
        register();
    }

    public void register(){
        register = (Button) findViewById(R.id.rRegister);
        register.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                String done = "Regjistrimi u krye me sukses";
                Toast.makeText(RegisterActivity.this, done, Toast.LENGTH_SHORT).show();
            }
        });
    }
}
