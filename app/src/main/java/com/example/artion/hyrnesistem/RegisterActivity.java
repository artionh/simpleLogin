package com.example.artion.hyrnesistem;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;


public class RegisterActivity extends AppCompatActivity {

    public EditText fullName;
    public String inFullName;
    public EditText email;
    public String inEmail;
    public EditText password;
    public String inPassword;
    public EditText retype;
    public String inRetype;
    public EditText phone;
    public String inPhone;
    public Button register;
    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
        register();
        checkPassword();
    }

    public void init(){
        fullName = (EditText) findViewById(R.id.rFullName);
        email = (EditText) findViewById(R.id.rEmail);
        password = (EditText) findViewById(R.id.rPassword);
        retype = (EditText) findViewById(R.id.rRetypePassword);
        phone = (EditText) findViewById(R.id.rMobile);
        register = (Button) findViewById(R.id.rRegister);
    }

    public void register(){
        init();
        register.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                checkRegister();
            }
        });
    }

    public void checkPassword(){
        init();
        register.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                inPassword = password.getText().toString();
                inRetype = retype.getText().toString();
                if (inPassword.equals(inRetype)) {
                    Toast.makeText(getApplicationContext(),"Fjalekalimet jane njesoj",Toast.LENGTH_SHORT).show();
                    return true;
                }
                else{
                    Toast.makeText(getApplicationContext(),"Fjalekalimet nuk jane njesoj",Toast.LENGTH_SHORT).show();
                    return false;
                }
            }
        });
    }

    public void checkRegister(){
        inFullName = fullName.getText().toString();
        inEmail = email.getText().toString();
        inPassword = password.getText().toString();
        inRetype = retype.getText().toString();
        inPhone = phone.getText().toString();
        String message = " ";
        if(inFullName.isEmpty()){
            message+="Emri ";
        }
        if(inEmail.isEmpty()){
            message+="Email ";
        }
        if(inPassword.isEmpty()){
            message+="Fjalekalimi ";
        }
        if(inRetype.isEmpty()){
            message+="Fjalekalimi ";
        }
        if(inPhone.isEmpty()){
            message+="Numri ";
        }
        message+="nuk mund te jete bosh";
        if(message.equals(" nuk mund te jete bosh")){
            message = "Regjistrimi u krye me sukses!";
            Toast.makeText(getApplicationContext(),message,Toast.LENGTH_SHORT).show();
        }
        else{
            Toast.makeText(getApplicationContext(),message,Toast.LENGTH_SHORT).show();
        }
    }
}
