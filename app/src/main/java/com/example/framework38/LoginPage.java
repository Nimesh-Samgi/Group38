package com.example.framework38;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class LoginPage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
    }


public void onReg(View view){
    Intent i = new Intent(this, MainActivity.class);
    startActivity(i);
}
    public void onLog(View view){
        Intent i = new Intent(this, Register.class);
        startActivity(i);
    }
}




