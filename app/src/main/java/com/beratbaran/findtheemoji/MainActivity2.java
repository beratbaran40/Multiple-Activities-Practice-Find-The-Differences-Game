package com.beratbaran.findtheemoji;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity2 extends AppCompatActivity {

    Button button2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main2);

        button2 = findViewById(R.id.button2);

    }

    public void changeScreen(View view) {

        Intent intent = new Intent (this, MainActivity.class);
        startActivity(intent);

    }

}