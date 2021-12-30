package com.nomad.calculyator;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.QuickContactBadge;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity2 extends AppCompatActivity{
    private TextView textView;
    private Button btnFinish;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        textView = findViewById(R.id.result);
        findViewById(R.id.button_red).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                MainActivity main1 = new MainActivity();
                finishAffinity();
            }
        });


        String text = getIntent().getStringExtra("key1");
        textView.setText(text);


    }
}