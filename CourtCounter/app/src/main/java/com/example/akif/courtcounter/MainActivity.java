package com.example.akif.courtcounter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int scoreTeamA = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void threePoints(View view){
        scoreTeamA+= 3;
        displayForTeamA(scoreTeamA);
    }
    public void twoPoints(View view){
        scoreTeamA+= 2;
        displayForTeamA(scoreTeamA);
    }
    public void freeThrow(View view){
        scoreTeamA+= 1;
        displayForTeamA(scoreTeamA);
    }
    /**
     * Displays the given score for Team A.
     */
    public void displayForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(score));
    }

}
