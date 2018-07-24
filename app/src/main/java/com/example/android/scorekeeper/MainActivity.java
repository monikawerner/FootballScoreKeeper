package com.example.android.scorekeeper;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.view.WindowManager;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    int scoreFirstTeam = 0;
    int scoreSecondTeam = 0;
    int faultFirstTeam = 0;
    int faultSecondTeam = 0;
    int penaltyFirstTeam = 0;
    int penaltySecondTeam = 0;
    int cornerFirstTeam = 0;
    int cornerSecondTeam = 0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        EditText secondTeam = findViewById(R.id.second_team_name);
        secondTeam.clearFocus();
        secondTeam.setCursorVisible(false);
    }

    /**
     * Increase the score for First Team by 1 point.
     */
    public void goalForFirstTeam(View view) {
        scoreFirstTeam = scoreFirstTeam + 1;
        displayScoreForFirstTeam(scoreFirstTeam);
    }

    /**
     * Increase the number of faults for First Team by 1 point.
     */
    public void faultForFirstTeam(View view) {
        faultFirstTeam = faultFirstTeam + 1;
        displayFaultsForFirstTeam(faultFirstTeam);
    }

    /**
     * Increase the number of penalties for First Team by 1 point.
     */
    public void penaltyForFirstTeam(View view) {
        penaltyFirstTeam = penaltyFirstTeam + 1;
        displayPenaltiesForFirstTeam(penaltyFirstTeam);
    }

    /**
     * Increase the number of corners for First Team by 1 point.
     */
    public void cornerForFirstTeam(View view) {
        cornerFirstTeam = cornerFirstTeam + 1;
        displayCornersForFirstTeam(cornerFirstTeam);
    }

    /**
     * Increase the score for Second Team by 1 point.
     */
    public void goalForSecondTeam(View view) {
        scoreSecondTeam = scoreSecondTeam + 1;
        displayScoreForSecondTeam(scoreSecondTeam);
    }

    /**
     * Increase the number of faults for Second Team by 1 point.
     */
    public void faultForSecondTeam(View view) {
        faultSecondTeam = faultSecondTeam + 1;
        displayFaultsForSecondTeam(faultSecondTeam);
    }

    /**
     * Increase the number of penalties for Second Team by 1 point.
     */
    public void penaltyForSecondTeam(View view) {
        penaltySecondTeam = penaltySecondTeam + 1;
        displayPenaltiesForSecondTeam(penaltySecondTeam);
    }

    /**
     * Increase the number of corners for Second Team by 1 point.
     */
    public void cornerForSecondTeam(View view) {
        cornerSecondTeam = cornerSecondTeam + 1;
        displayCornersForSecondTeam(cornerSecondTeam);
    }

    /**
     * Clear team names, resets the score and other values for First Team and Second Team back to 0 and starts the new game.
     */

    public void newGame(View view) {

        EditText firstTeam = findViewById(R.id.first_team_name);
        EditText secondTeam = findViewById(R.id.second_team_name);
        firstTeam.setText(getString(R.string.enter));
        secondTeam.setText(getString(R.string.enter));
        secondTeam.clearFocus();

        scoreFirstTeam = 0;
        displayScoreForFirstTeam(scoreFirstTeam);
        scoreSecondTeam = 0;
        displayScoreForSecondTeam(scoreSecondTeam);
        faultFirstTeam = 0;
        displayFaultsForFirstTeam(faultFirstTeam);
        faultSecondTeam = 0;
        displayFaultsForSecondTeam(faultSecondTeam);
        penaltyFirstTeam = 0;
        displayPenaltiesForFirstTeam(penaltyFirstTeam);
        penaltySecondTeam = 0;
        displayPenaltiesForSecondTeam(penaltySecondTeam);
        cornerFirstTeam = 0;
        displayCornersForFirstTeam(cornerFirstTeam);
        cornerSecondTeam = 0;
        displayCornersForSecondTeam(cornerSecondTeam);
    }

    /**
     * Displays the given score for First Team.
     */
    public void displayScoreForFirstTeam(int score) {
        TextView scoreView = findViewById(R.id.first_team_score);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Displays the given score for Second Team.
     */
    public void displayScoreForSecondTeam(int score) {
        TextView scoreView = findViewById(R.id.second_team_score);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Displays the given faults for First Team.
     */
    public void displayFaultsForFirstTeam(int score) {
        TextView scoreView = findViewById(R.id.first_team_fault);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Displays the given faults for Second Team.
     */
    public void displayFaultsForSecondTeam(int score) {
        TextView scoreView = findViewById(R.id.second_team_fault);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Displays the given penalties for First Team.
     */
    public void displayPenaltiesForFirstTeam(int score) {
        TextView scoreView = findViewById(R.id.first_team_penalty);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Displays the given penalties for Second Team.
     */
    public void displayPenaltiesForSecondTeam(int score) {
        TextView scoreView = findViewById(R.id.second_team_penalty);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Displays the given corners for First Team.
     */
    public void displayCornersForFirstTeam(int score) {
        TextView scoreView = findViewById(R.id.first_team_corner);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Displays the given corners for Second Team.
     */
    public void displayCornersForSecondTeam(int score) {
        TextView scoreView = findViewById(R.id.second_team_corner);
        scoreView.setText(String.valueOf(score));
    }
}
