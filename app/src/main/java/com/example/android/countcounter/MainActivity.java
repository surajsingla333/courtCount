package com.example.android.countcounter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    int aScore = 0;
    public void aPoint3(View v){
        aScore= aScore + 3;
        displayForTeamA(aScore);
    }
    public void aPoint2(View v){
        aScore= aScore + 2;
        displayForTeamA(aScore);
    }
    public void aPoint1(View v){
        aScore= aScore + 1;
        displayForTeamA(aScore);
    }
    /**
     * Displays the given score for Team A.
     */
    public void displayForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(score));
    }

    int bScore = 0;
    public void bPoint3(View v){
        bScore= bScore + 3;
        displayForTeamB(bScore);
    }
    public void bPoint2(View v){
        bScore= bScore + 2;
        displayForTeamB(bScore);
    }
    public void bPoint1(View v){
        bScore= bScore + 1;
        displayForTeamB(bScore);
    }
    /**
     * Displays the given score for Team A.
     */
    public void displayForTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(score));
    }

    public void reset(View v){
        aScore = 0;
        bScore = 0;
        displayForTeamA(aScore);
        displayForTeamB(bScore);
    }
}
