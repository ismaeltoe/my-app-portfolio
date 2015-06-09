package com.github.ismaeltoe.nanodegree;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {

    private Button button;
    private Button button2;
    private Button button3;
    private Button button4;
    private Button button5;
    private Button button6;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button = (Button) findViewById(R.id.button);
        button2 = (Button) findViewById(R.id.button2);
        button3 = (Button) findViewById(R.id.button3);
        button4 = (Button) findViewById(R.id.button4);
        button5 = (Button) findViewById(R.id.button5);
        button6 = (Button) findViewById(R.id.button6);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, getString(R.string.button_launch) + " " +
                                getString(R.string.media_streamer) + "!",
                        Toast.LENGTH_SHORT).show();
            }
        });

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, getString(R.string.button_launch) + " " +
                                getString(R.string.super_duo1) + "!",
                        Toast.LENGTH_SHORT).show();
            }
        });

        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, getString(R.string.button_launch) + " " +
                                getString(R.string.super_duo2) + "!",
                        Toast.LENGTH_SHORT).show();
            }
        });

        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, getString(R.string.button_launch) + " " +
                                getString(R.string.ant_terminator) + "!",
                        Toast.LENGTH_SHORT).show();
            }
        });

        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, getString(R.string.button_launch) + " " +
                                getString(R.string.materialize) + "!",
                        Toast.LENGTH_SHORT).show();
            }
        });

        button6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, getString(R.string.button_launch) + " " +
                                getString(R.string.capstone) + "!",
                        Toast.LENGTH_SHORT).show();
            }
        });
    }
}
