package com.adamszysiak.loyalitycardspanel;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends Activity {

    private Button mTakeLoyalityCardPhotoButton;
    private Button mLoaylityCardsButton;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initializeButtons();
    }

    public void initializeButtons() {
        mTakeLoyalityCardPhotoButton = (Button) findViewById(R.id.take_loyalty_card_photo);
        mLoaylityCardsButton = findViewById(R.id.loyalty_cards_photos);

        mTakeLoyalityCardPhotoButton.setOnClickListener(v -> {
            takeCardPhoto();

        });
        /*(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });*/
    }

    public void takeCardPhoto() {
        Intent takeCardPhotoIntent = new Intent(MainActivity.this, TakeLoyaltyCardPhotoActivity.class);
        /*MainActivity.this.*/
        startActivity(takeCardPhotoIntent);
        startActivityForResult(takeCardPhotoIntent, 0);

    }

    public void showLoyalityCardButton() {

    }
}