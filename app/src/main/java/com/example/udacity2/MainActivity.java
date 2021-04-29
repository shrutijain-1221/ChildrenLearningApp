package com.example.udacity2;

import androidx.appcompat.app.AppCompatActivity;
import android.view.View;
import android.os.Bundle;
import android.content.Intent;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView numbers = (TextView) findViewById(R.id.numbers);

// Set a click listener on that View
        numbers.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the numbers View is clicked on.
            @Override
            public void onClick(View view) {
                Intent numbersIntent = new Intent(MainActivity.this, NumbersActivity.class);
                startActivity(numbersIntent);
            }
        });
        //for family
        TextView family = (TextView) findViewById(R.id.family);
        family.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the numbers View is clicked on.
            @Override
            public void onClick(View view) {
                Intent familyIntent = new Intent(MainActivity.this, FamilyActivity.class);
                startActivity(familyIntent);
            }
        });
//for colors
        TextView colors = (TextView) findViewById(R.id.colors);
        colors.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the numbers View is clicked on.
            @Override
            public void onClick(View view) {
                Intent colorIntent = new Intent(MainActivity.this, ColorsActivity.class);
                startActivity(colorIntent);
            }
        });
 //phrases
        TextView phrases = (TextView) findViewById(R.id.phrases);
        phrases.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the numbers View is clicked on.
            @Override
            public void onClick(View view) {
                Intent phraseIntent = new Intent(MainActivity.this, PhraseActivity.class);
                startActivity(phraseIntent);
            }
        });



    }
}