package com.example.android.learngerman;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

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
}
