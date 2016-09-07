package com.example.android.basketballcourtcounter;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;
    public class MainActivity extends AppCompatActivity {
        int scoreTeamA = 0;
        int scoreTeamB = 0;
        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_main);
            displayForTeamA(0);
        }
        /**
         * Displays the given score for Team A.
         */
        public void displayForTeamA(int score) {
            TextView scoreView = (TextView) findViewById(R.id.team_a_score);
            scoreView.setText(String.valueOf(score));
        }
        /**
         * Increases the score for Team A by 3.
         */
        public void addThreeForTeamA(View V) {
            scoreTeamA = scoreTeamA + 3;
            displayForTeamA(scoreTeamA);
        }
        /**
         * Increases the score for Team A by 2.
         */
        public void addTwoForTeamA(View V) {
            scoreTeamA = scoreTeamA + 2;
            displayForTeamA(scoreTeamA);
        }
        /**
         * Increases the score for Team A by 1.
         */
        public void addOneForTeamA(View V) {
            scoreTeamA = scoreTeamA + 1;
            displayForTeamA(scoreTeamA);
        }
        /**
         * Displays the given score for Team B.
         */
        public void displayForTeamB(int score) {
            TextView scoreView = (TextView) findViewById(R.id.team_b_score);
            scoreView.setText(String.valueOf(score));
        }
        /**
         * Increases the score for Team B by 3.
         */
        public void addThreeForTeamB(View V) {
            scoreTeamB = scoreTeamB + 3;
            displayForTeamB(scoreTeamB);
        }
        /**
         * Increases the score for Team B by 2.
         */
        public void addTwoForTeamB(View V) {
            scoreTeamB = scoreTeamB + 2;
            displayForTeamB(scoreTeamB);
        }
        /**
         * Increases the score for Team B by 1.
         */
        public void addOneForTeamB(View V) {
            scoreTeamB = scoreTeamB + 1;
            displayForTeamB(scoreTeamB);
        }
        /**
         * Resets both scores to 0.
         */
        public void resetScore(View V) {
            scoreTeamA = 0;
            scoreTeamB = 0;
            displayForTeamA(scoreTeamA);
            displayForTeamB(scoreTeamB);
        }
    }




