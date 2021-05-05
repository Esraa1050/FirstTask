package com.example.firsttask;

import androidx.appcompat.app.AppCompatActivity;
import andriod.widget.Toast;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
    EditText pass,email;
    ImageView facebook;
    Button login;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
         findView();
         setAction();
    }
    public void findView(){
        pass=findViewById(R.id.Pass_id);
        email=findViewById(R.id.Email_id);
        facebook=findViewById(R.id.facebook_image_id);
        login=findViewById(R.id.Login_id);
    }
    public void setAction() {
        login.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                if (pass.getText().toString().equals("12345") && email.getText().toString().equals("esra@gmail.com")) {
                    Intent intent = new Intent(MainActivity.this, LoginPage.class);
                    startActivity(intent);

                } }});

        }

    }
