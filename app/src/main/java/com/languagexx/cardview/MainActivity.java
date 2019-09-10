package com.languagexx.cardview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Switch;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    CardView bankCard,folderCard,ideasCard,filesCard,feedbackCard;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // Initialization of layout elements
        bankCard = findViewById(R.id.bankCard);
        folderCard = findViewById(R.id.folderCard);
        ideasCard = findViewById(R.id.ideasCard);
        filesCard = findViewById(R.id.filesCard);
        feedbackCard = findViewById(R.id.feedbackCard);

        //Add a listener to Cards
        bankCard.setOnClickListener(this);
        folderCard.setOnClickListener(this);
        ideasCard.setOnClickListener(this);
        filesCard.setOnClickListener(this);
        feedbackCard.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        Intent i;

        switch (v.getId()){
            case R.id.bankCard:
                i = new Intent(this,Bank.class);
                startActivity(i);
                break;
            case R.id.folderCard:
                i = new Intent(this,Folder.class);
                startActivity(i);
                break;
            case R.id.ideasCard:
                i = new Intent(this,Ideas.class);
                startActivity(i);
                break;case R.id.filesCard:
                i = new Intent(this,Files.class);
                startActivity(i);
                break;case R.id.feedbackCard:
                i = new Intent(this,Feedback.class);
                startActivity(i);
            default:break;
        }

    }
}
