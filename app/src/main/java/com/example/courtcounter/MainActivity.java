package com.example.courtcounter;


import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity
{
    private int participant1Score = 0;
    private int participant2Score = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        participant1Display();
        participant2Display();
    }

    /**
     * This method increases participant1 Score by 3
     */
    public void participant1ThreePointer(View view)
    {
        participant1Score += 3;
        participant1Display();
    }

    /**
     * This method increases participant1 Score by 2
     */
    public void participant1TwoPointer(View view)
    {
        participant1Score += 2;
        participant1Display();
    }

    /**
     * This method increases participant1 Score by 1
     */
    public void participant1FreeThrow(View view)
    {
        participant1Score += 1;
        participant1Display();
    }

    /**
     * This method increases participant2 Score by 3
     */
    public void participant2ThreePointer(View view)
    {
        participant2Score += 3;
        participant2Display();
    }

    /**
     * This method increases participant1 Score by 2
     */
    public void participant2TwoPointer(View view)
    {
        participant2Score += 2;
        participant2Display();
    }

    /**
     * This method increases participant2 Score by 1
     */
    public void participant2FreeThrow(View view)
    {
        participant2Score += 1;
        participant2Display();
    }

    /**
     * This method increases resets Score
     */
    public void reset(View view)
    {
        participant1Score = 0;
        participant2Score = 0;
        participant1Display();
        participant2Display();
    }

    /**
     * This method displays score for participant1
     */
    private void participant1Display()
    {
        TextView participant1TextView = findViewById(R.id.participant1ScoreBoard);
        participant1TextView.setText(getString(R.string.blank,participant1Score));
    }

    /**
     * This method displays score for participant2
     */
    private void participant2Display()
    {
        TextView participant2TextView = findViewById(R.id.participant2ScoreBoard);
        participant2TextView.setText(getString(R.string.blank,participant2Score));
    }


}