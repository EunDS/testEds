package com.kks.testeds;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView textview;
    Button btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textview = findViewById(R.id.textview);
        btn = findViewById(R.id.btn);
        textview.setText("go to hell");

        textview.setOnClickListener(v -> {

            if(textview.getText() == "doge to the moon"){
                textview.setText("go to hell");
            } else {
                textview.setText("doge to the moon");
            }
        });

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(textview.getText() == "doge to the moon"){
                    textview.setText("go to hell");
                } else {
                    textview.setText("doge to the moon");
                }
            }
        });

    }

    @Override
    protected void onStart() {
        super.onStart();
    }

    @Override
    protected void onResume() {
        super.onResume();


    }
}