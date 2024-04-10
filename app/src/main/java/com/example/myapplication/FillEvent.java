package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class FillEvent extends AppCompatActivity {
    Button creatEvent;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fill_event);
        creatEvent=findViewById(R.id.button_createEvent);
        creatEvent.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //khai báo intent thực hiện gọi
                Intent myIntentRegister = new Intent(FillEvent.this,CreateBudgetEvent.class);
                startActivity(myIntentRegister);
            }
        });
    }
}