package com.example.medical_app;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class enter_Num extends AppCompatActivity {

    EditText enternumber;
    Button get_button_otp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_enter_num);

        enternumber=findViewById(R.id.number);
        get_button_otp=findViewById(R.id.button_otp);


        get_button_otp.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                if(!enternumber.getText().toString().trim().isEmpty()){
                    if((enternumber.getText().toString().trim()).length() == 10){
                        Intent i = new Intent(getApplicationContext(),Num_verify.class);
                        i.putExtra("mobile",enternumber.getText().toString());
                        startActivity(i);
                    }else{
                        Toast.makeText(enter_Num.this, "Please enter correct number ", Toast.LENGTH_SHORT).show();
                    }
                }else{
                    Toast.makeText(enter_Num.this, "Enter your Mobile Number ", Toast.LENGTH_SHORT).show();
                }
            };
        } );
    }}