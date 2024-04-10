package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class RegisterFinalActivity extends AppCompatActivity {
    Button btn_regis;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register_final);
        btn_regis=findViewById(R.id.button_register);
        btn_regis.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //khai báo intent thực hiện gọi
                Intent myIntentRegister = new Intent(RegisterFinalActivity.this,ManageEvent.class);
                startActivity(myIntentRegister);
            }
        });

    }
}
//    Button btn_continue;
//    @Override
//    protected void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_register);
//        btn_continue=findViewById(R.id.button_tieptheo);
//        btn_continue.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                //khai báo intent thực hiện gọi
//                Intent myIntentRegister = new Intent(RegisterActivity.this,RegisterFinalActivity.class);
//                startActivity(myIntentRegister);
//            }
//        });
//    }