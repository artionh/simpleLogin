package com.example.artion.hyrnesistem;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

public class ProfileActivity extends AppCompatActivity {
    public TextView t1;
    public TextView t2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);

        Intent in = getIntent();
        Bundle bun = in.getExtras();

        String email = bun.getString("email");
        String password = bun.getString("password");

        t1 = (TextView) findViewById(R.id.profileEmail);
        t1.setText(email);

        t2 = (TextView) findViewById(R.id.profilePassword);
        t2.setText(password);
        /*TextView textEmail = new TextView(this);
        textEmail.setText(email);

        TextView textPassword = new TextView(this);
        textPassword.setText(password);*/
    }

}
