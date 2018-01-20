package com.example.coolkidgatorclub.greenfootprint;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class BikeMilesActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bike_miles);
    }
    public void sendMessage(View view) {
        Intent intent = new Intent(this, YearlyCarMilesActivity.class);
        startActivity(intent);
    }
}
