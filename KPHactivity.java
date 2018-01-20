package com.example.coolkidgatorclub.greenfootprint;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class KPHactivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kphactivity);
    }
    public void sendMessage(View view) {
        Intent intent = new Intent(this, BikeMilesActivity.class);
        startActivity(intent);
    }
}
