package com.example.android.scorekeeper;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int scoreA = 0;
    int scoreB = 0;
    int cornerA = 0;
    int cornerB = 0;
    int faultA = 0;
    int faultB = 0;
    int yellowCardA = 0;
    int yellowCardB = 0;
    int redCardA = 0;
    int redCardB = 0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void addScoreForTeamA(View v) {
        scoreA = scoreA + 1;
        displayScoreForTeamA(scoreA);
    }

    public void addScoreForTeamB(View v) {
        scoreB = scoreB + 1;
        displayScoreForTeamB(scoreB);
    }

    public void addCornerForTeamA(View v) {
        cornerA = cornerA + 1;
        displayCornerForTeamA(cornerA);
    }

    public void addCornerForTeamB(View v) {
        cornerB = cornerB + 1;
        displayCornerForTeamB(cornerB);
    }

    public void addFaultForTeamA(View v) {
        faultA = faultA + 1;
        displayFaultForTeamA(faultA);
    }

    public void addFaultForTeamB(View v) {
        faultB = faultB + 1;
        displayFaultForTeamB(faultB);
    }

    public void addYellowForTeamA(View v) {
        yellowCardA = yellowCardA + 1;
        displayYellowForTeamA(yellowCardA);
    }

    public void addYellowForTeamB(View v) {
        yellowCardB = yellowCardB + 1;
        displayYellowForTeamB(yellowCardB);
    }

    public void addRedForTeamA(View v) {
        redCardA = redCardA + 1;
        displayRedForTeamA(redCardA);
    }

    public void addRedForTeamB(View v) {
        redCardB = redCardB + 1;
        displayRedForTeamB(redCardB);
    }

    public void newTeams(View v) {
        scoreA = 0;
        scoreB = 0;
        cornerA = 0;
        cornerB = 0;
        faultA = 0;
        faultB = 0;
        yellowCardA = 0;
        yellowCardB = 0;
        redCardA = 0;
        redCardB = 0;
        displayScoreForTeamA(scoreA);
        displayScoreForTeamB(scoreB);
        displayCornerForTeamA(cornerA);
        displayCornerForTeamB(cornerB);
        displayFaultForTeamA(faultA);
        displayFaultForTeamB(faultB);
        displayYellowForTeamA(yellowCardA);
        displayYellowForTeamB(yellowCardB);
        displayRedForTeamA(redCardA);
        displayRedForTeamB(redCardB);
    }

    public void displayScoreForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(score));
    }

    public void displayScoreForTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(score));
    }

    public void displayCornerForTeamA(int corner) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_corner);
        scoreView.setText(String.valueOf(corner));
    }

    public void displayCornerForTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_corner);
        scoreView.setText(String.valueOf(score));
    }

    public void displayFaultForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_fault);
        scoreView.setText(String.valueOf(score));
    }

    public void displayFaultForTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_fault);
        scoreView.setText(String.valueOf(score));
    }

    public void displayYellowForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_yellow);
        scoreView.setText(String.valueOf(score));
    }

    public void displayYellowForTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_yellow);
        scoreView.setText(String.valueOf(score));
    }

    public void displayRedForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_red);
        scoreView.setText(String.valueOf(score));
    }

    public void displayRedForTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_red);
        scoreView.setText(String.valueOf(score));
    }
}