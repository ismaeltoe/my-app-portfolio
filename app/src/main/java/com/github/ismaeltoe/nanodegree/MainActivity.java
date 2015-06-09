package com.github.ismaeltoe.nanodegree;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {

    private Toast mAppToast;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void showToast(View v) {
        switch (v.getId()) {
            case R.id.button:
            case R.id.button2:
            case R.id.button3:
            case R.id.button4:
            case R.id.button5:
            case R.id.button6:
                if(mAppToast !=null) {
                    mAppToast.cancel();
                }
                mAppToast = Toast.makeText(
                        this,
                        ((Button)v).getText().toString(),
                        Toast.LENGTH_SHORT);
                mAppToast.show();
                break;
            default:
                break;
        }
    }
}
