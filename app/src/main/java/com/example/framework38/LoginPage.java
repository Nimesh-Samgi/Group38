package com.example.framework38;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.util.jar.Attributes;

public class LoginPage extends AppCompatActivity {

    private EditText Username;
    private EditText Password;
    private TextView Info;
    private Button Login;
    private int Counter = 5;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_loginpage);

        Username = (EditText)findViewById(R.id.UsernameBox);
        Password = (EditText)findViewById(R.id.PasswordBox);
        Info = (TextView)findViewById(R.id.IncorrectAttempts);
        Login = (Button)findViewById(R.id.LoginBtn);

        Info.setText("No of attempts remaining: 5");

        Login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Validate(Username.getText().toString(), Password.getText().toString());
            }
        });
    }

    private void Validate(String UserName, String UserPassword){
        if ((UserName.equals("Group38")) && (UserPassword.equals("123456"))){
            Intent intent = new Intent(LoginPage.this, MainActivity.class);
            startActivity(intent);
        }else{
            Counter --;

            Info.setText("No of attempts remaining: " + String.valueOf(Counter));

            if(Counter == 0){
                Login.setEnabled(false);
            }
        }
    }
    public void onReg(View view){
        Intent i = new Intent(this, Register.class);
        startActivity(i);
    }
}




