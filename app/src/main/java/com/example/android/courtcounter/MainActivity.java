package com.example.android.courtcounter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int scoreTeamA = 0;
    int scoreTeamB = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void displayForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(scoreTeamA));
    }

    public void addOneA(View view){
        scoreTeamA = scoreTeamA+1;
        displayForTeamA(1);
    }

    public void addTwoA(View view){
        scoreTeamA = scoreTeamA+2;
        displayForTeamA(2);
    }

    public void addThreeA(View view){
        scoreTeamA = scoreTeamA+3;
        displayForTeamA(3);
    }


    /**
     * Displays the given score for Team B.
     */
    public void displayForTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(scoreTeamB));
    }

    public void addOneB(View view){
        scoreTeamB = scoreTeamB+1;
        displayForTeamB(1);
    }

    public void addTwoB(View view){
        scoreTeamB = scoreTeamB+2;
        displayForTeamB(2);
    }

    public void addThreeB(View view){
        scoreTeamB = scoreTeamB+3;
        displayForTeamB(3);
    }

    public void reset(View view){

        scoreTeamA=0;
        scoreTeamB=0;

        TextView scoreView = (TextView) findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(scoreTeamA));

        TextView scoreView1 = (TextView) findViewById(R.id.team_b_score);
        scoreView1.setText(String.valueOf(scoreTeamB));

    }


}

