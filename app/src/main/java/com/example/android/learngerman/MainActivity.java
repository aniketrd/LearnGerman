package com.example.android.learngerman;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView numbersTv = (TextView) findViewById(R.id.tvNumbers);
        TextView phrasesTv = (TextView) findViewById(R.id.tvPhrases);
        TextView familyTv = (TextView) findViewById(R.id.tvFamily);
        TextView colorsTv = (TextView) findViewById(R.id.tvColors);
        numbersTv.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(),"Open Numbers List",Toast.LENGTH_SHORT).show();
            }
        });

        familyTv.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(),"Open Family List",Toast.LENGTH_SHORT).show();
            }
        });

        colorsTv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(),"Open Colors List",Toast.LENGTH_SHORT).show();
            }
        });

        phrasesTv.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(),"Open Phrase List",Toast.LENGTH_SHORT).show();
            }
        });
    }
/*
    public void openNumberActivity(View view)
    {
        Intent intent = new Intent(this,NumberActivity.class);
        startActivity(intent);
    }
    public void openColorsActivity(View view)
    {
        Intent intent = new Intent(this,ColorsActivity.class);
        startActivity(intent);
    }
    public void openPhrasesActivity(View view)
    {
        Intent intent = new Intent(this,PhraseActivity.class);
        startActivity(intent);
    }

    public void openFamilyActivity(View view)
    {
        Intent intent = new Intent(this,FamilyActivity.class);
        startActivity(intent);
    }
*/
}
