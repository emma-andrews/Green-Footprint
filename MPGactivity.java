package com.example.coolkidgatorclub.greenfootprint;

import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MPGactivity extends AppCompatActivity {

    Button button;
    EditText textbox;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mpgactivity);

        button = findViewById(R.id.button);
        textbox = findViewById(R.id.editText);

        button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                Log.v("Next", textbox.getText().toString());
            }
        });//https://stackoverflow.com/questions/4531396/get-value-of-a-edit-text-field
    }
    public void sendMessage(View view) {
        Intent intent = new Intent(this, KPHactivity.class);
        startActivity(intent);
    }
}
