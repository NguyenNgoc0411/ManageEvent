package com.example.myapplication;



import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.viewpager.widget.ViewPager;
import androidx.viewpager2.widget.ViewPager2;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TableLayout;

import com.google.android.material.bottomnavigation.BottomNavigationView;

import java.util.ArrayList;

import adapter.AdapterViewPaper;


public class ManageEvent extends AppCompatActivity {

    ImageView btn_create;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_manage_event);
        btn_create=findViewById(R.id.list_event);
        btn_create.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //khai báo intent thực hiện gọi
                Intent myIntentRegister = new Intent(ManageEvent.this,FillEvent.class);
                startActivity(myIntentRegister);
            }
        });




    }
}