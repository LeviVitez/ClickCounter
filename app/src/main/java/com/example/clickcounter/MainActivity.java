package com.example.clickcounter;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private RelativeLayout layout;
    private Button plussz;
private TextView ertek;
private Button minus;
int szamolo=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        layout=findViewById(R.id.layout);
        plussz=findViewById(R.id.plussz);
        minus=findViewById(R.id.minus);
        ertek=findViewById(R.id.szamlalo);
        plussz.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                szamolo++;
                if (szamolo==0){
                    ertek.setTextColor(Color.BLUE);
                }
                else if (szamolo<0){
                    ertek.setTextColor(Color.RED);
                }
                else if (szamolo>0){
                    ertek.setTextColor(Color.parseColor("#7CFC00"));
                }
                ertek.setText(String.valueOf(szamolo));
            }
        });

        minus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                szamolo--;
                if (szamolo==0){
                    ertek.setTextColor(Color.BLUE);
                }
                else if (szamolo<0){
                    ertek.setTextColor(Color.RED);
                }
                else if (szamolo>0){
                    ertek.setTextColor(Color.parseColor("#7CFC00"));
                }
                ertek.setText(String.valueOf(szamolo));
            }
        });

        ertek.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                szamolo=0;
                ertek.setTextColor(Color.BLUE);
                ertek.setText(String.valueOf(szamolo));
            }
        });

    }

}