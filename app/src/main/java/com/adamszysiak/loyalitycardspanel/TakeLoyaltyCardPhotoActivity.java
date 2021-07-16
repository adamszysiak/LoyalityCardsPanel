package com.adamszysiak.loyalitycardspanel;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.provider.MediaStore;
import android.os.Bundle;
import android.widget.Toast;

public class TakeLoyaltyCardPhotoActivity extends    Activity {

    static final int REQUEST_IMAGE_CAPTURE = 1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_take_loyalty_card_photo);
        dispatchTakePictureIntent();
    }



    private void dispatchTakePictureIntent() {
        Intent takePictureIntent = new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
        try {
            startActivityForResult(takePictureIntent, REQUEST_IMAGE_CAPTURE);
        } catch (ActivityNotFoundException e) {
            Toast.makeText(this,R.string.camere_device_error,Toast.LENGTH_SHORT).show();
            // display error state to the user
        }
    }
}