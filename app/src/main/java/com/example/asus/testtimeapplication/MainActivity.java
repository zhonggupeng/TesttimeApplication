package com.example.asus.testtimeapplication;



import android.app.AlertDialog;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.TextView;


import java.util.Arrays;

public class MainActivity extends AppCompatActivity{

    private TextView SexTv;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        SexTv= (TextView) findViewById(R.id.txt_Sex);
        final SexSelect sexSelect = new SexSelect(this);
        SexTv.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View view) {
                sexSelect.showSex();
            }
        });
    }

}

