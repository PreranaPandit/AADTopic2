package com.example.aadtopic2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.RadioButton;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    //Image activity
    RadioButton rdobtni1, rdobtni2, rdobtni3, rdobtni4;
    ImageView imgVNature;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //binding

        rdobtni1 = findViewById(R.id.rdobtni1);
        rdobtni2 = findViewById(R.id.rdobtni2);
        rdobtni3 = findViewById(R.id.rdobtni3);
        rdobtni4 = (RadioButton) findViewById(R.id.rdobtni4);
        imgVNature = findViewById(R.id.imgVNature);

        rdobtni3.setOnClickListener(this);
        rdobtni2.setOnClickListener(this);
        rdobtni3.setOnClickListener(this);
        rdobtni4.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {

        switch(v.getId())
        {
            case R.id.rdobtni1:
            imgVNature.setImageResource(R.drawable.i1);
            break;

            case R.id.rdobtni2:
            imgVNature.setImageResource(R.drawable.i2);
            break;

            case R.id.rdobtni3:
            imgVNature.setImageResource(R.drawable.i3);
            break;

            case R.id.rdobtni4:
                imgVNature.setImageResource(R.drawable.i4);
                break;
        }
    }
}
