package com.example.mainactivity;

import android.os.Bundle;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class C_Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_c_);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        ImageView image = (ImageView)findViewById(R.id.isaiahOjedokun);
        image.setImageResource(R.drawable._isaiah);



        TextView name = (TextView) findViewById(R.id.myName);
        TextView track = (TextView) findViewById(R.id.myTrack);
        TextView email = (TextView) findViewById(R.id.myEmail);
        TextView country = (TextView) findViewById(R.id.myCountry);
        TextView phone = (TextView) findViewById(R.id.myPhone);


    }

}
