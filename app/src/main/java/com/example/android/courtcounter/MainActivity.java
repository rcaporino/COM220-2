package com.example.android.courtcounter;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity
{

    int scoreTeamA = 0;
    int scoreTeamB = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void point3A (View view)
    {
        scoreTeamA += 3;
        displayForTeamA(scoreTeamA);
    }

    public void point2A (View view)
    {
        scoreTeamA = scoreTeamA += 2;
        displayForTeamA(scoreTeamA);
    }

    public void point1A (View view)
    {
        scoreTeamA = scoreTeamA += 1;
        displayForTeamA(scoreTeamA);
    }

    public void point3B (View view)
    {
        scoreTeamB += 3;
        displayForTeamB(scoreTeamB);
    }

    public void point2B (View view)
    {
        scoreTeamB = scoreTeamB += 2;
        displayForTeamB(scoreTeamB);
    }

    public void point1B (View view)
    {
        scoreTeamB = scoreTeamB += 1;
        displayForTeamB(scoreTeamB);
    }

    public void resetScore(View view)
    {
        scoreTeamA = 0;
        scoreTeamB = 0;
        displayForTeamA(scoreTeamA);
        displayForTeamB(scoreTeamB);
    }

    public void displayForTeamA(int scoreTeamA)
    {
        TextView scoreView = (TextView) findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(scoreTeamA));
    }

    public void displayForTeamB(int scoreTeam)
    {
        TextView scoreView = (TextView) findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(scoreTeamB));
    }

}
