package com.example.goldenboy;

import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class GymDetailActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gym_detail);

        TextView gymNameTextView = findViewById(R.id.gymName);
        TextView gymAddressTextView = findViewById(R.id.gymAddress);
        TextView coach1NameTextView = findViewById(R.id.coach1Name);
        TextView coach1SpecialtyTextView = findViewById(R.id.coach1Specialty);
        TextView coach1PhoneTextView = findViewById(R.id.coach1Phone);
        TextView coach2NameTextView = findViewById(R.id.coach2Name);
        TextView coach2SpecialtyTextView = findViewById(R.id.coach2Specialty);
        TextView coach2PhoneTextView = findViewById(R.id.coach2Phone);

        // Retrieve the data passed from SpinnerActivity
        String gymName = getIntent().getStringExtra("gymName");
        String gymAddress = getIntent().getStringExtra("gymAddress");
        String coach1Name = getIntent().getStringExtra("coach1Name");
        String coach1Specialty = getIntent().getStringExtra("coach1Specialty");
        String coach1Phone = getIntent().getStringExtra("coach1Phone");
        String coach2Name = getIntent().getStringExtra("coach2Name");
        String coach2Specialty = getIntent().getStringExtra("coach2Specialty");
        String coach2Phone = getIntent().getStringExtra("coach2Phone");

        // Set the data to the TextViews
        gymNameTextView.setText(gymName);
        gymAddressTextView.setText(gymAddress);
        coach1NameTextView.setText(coach1Name);
        coach1SpecialtyTextView.setText(coach1Specialty);
        coach1PhoneTextView.setText(coach1Phone);
        coach2NameTextView.setText(coach2Name);
        coach2SpecialtyTextView.setText(coach2Specialty);
        coach2PhoneTextView.setText(coach2Phone);
    }
}