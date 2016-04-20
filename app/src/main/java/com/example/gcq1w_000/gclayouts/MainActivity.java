package com.example.gcq1w_000.gclayouts;

import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;



public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

            findViewById(R.id.hBtn).setOnClickListener(globalListener);
            findViewById(R.id.vBtn).setOnClickListener(globalListener);
            findViewById(R.id.fBtn).setOnClickListener(globalListener);
            findViewById(R.id.rBtn).setOnClickListener(globalListener);
            findViewById(R.id.tBtn1).setOnClickListener(globalListener);
            findViewById(R.id.tBtn2).setOnClickListener(globalListener);
            findViewById(R.id.tBtn3).setOnClickListener(globalListener);
            findViewById(R.id.tBtn4).setOnClickListener(globalListener);
    }
//Global Button Listener

    final View.OnClickListener globalListener = new View.OnClickListener() {
    String message = "";
    ImageView visible;
    TextView showTxt;
    boolean txt = false;

    //Image views for relative display

        @Override
        public void onClick(View v) {

            switch (v.getId()) {

                case R.id.hBtn:
                    //Horizontal linear button has been clicked
                    message = "Horizontal Linear Layout";
                    visible = (ImageView) findViewById(R.id.hDisplay);
                    txt = false;
                    break;

                case R.id.vBtn:
                    //Vertical linear button has been clicked
                    message = "Vertical Linear Layout";
                    visible = (ImageView) findViewById(R.id.vDisplay);
                    txt = false;
                    break;

                case R.id.fBtn:
                    //Frame button has been clicked
                    message = "Frame Layout";
                    visible = (ImageView) findViewById(R.id.fDisplay);
                    txt = false;
                    break;

                case R.id.rBtn:
                    //Frame button has been clicked
                    message = "Relative Layout";
                    visible = (ImageView) findViewById(R.id.rDisplay);
                    txt = false;
                    break;

                case R.id.tBtn1:
                    //Table button 1 has been clicked
                    message = "Table Row 1, Column 1";
                    showTxt = (TextView) findViewById(R.id.tTxt1);
                    txt = true;
                    break;

                case R.id.tBtn2:
                    //Table button 2 has been clicked
                    message = "Table Row 1, Column 2";
                    showTxt = (TextView) findViewById(R.id.tTxt2);
                    txt = true;
                    break;

                case R.id.tBtn3:
                    //Table button 3 has been clicked
                    message = "Table Row 2, Column 1";
                    showTxt = (TextView) findViewById(R.id.tTxt3);
                    txt = true;
                    break;

                case R.id.tBtn4:
                    //Table button 4 has been clicked
                    message = "Table Row 2, Column 2";
                    showTxt = (TextView) findViewById(R.id.tTxt4);
                    txt = true;
                    break;
            }

            // Make target panel visible
            if (!txt) {
                visible.setVisibility(View.VISIBLE);
            } else {
                showTxt.setVisibility(View.VISIBLE);
            }
            Toast.makeText(getApplicationContext(), message, Toast.LENGTH_SHORT).show();


            // Waits 1 second and makes panel invisible
            new Handler().postDelayed(new Runnable() {

                @Override
                public void run() {
                    if (!txt) {
                        visible.setVisibility(View.INVISIBLE);
                    } else {
                        showTxt.setVisibility(View.INVISIBLE);
                    }
                }
            }, 1000);
        }
    };

}


