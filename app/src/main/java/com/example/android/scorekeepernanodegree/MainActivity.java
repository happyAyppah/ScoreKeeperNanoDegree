package com.example.android.scorekeepernanodegree;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private int scoreGoalTeamA, scoreShotOnTargetTeamA, scoreTotalShotsTeamA, scoreFoulTeamA, scoreOffsidesTeamA, scoreCornersTeamA;

    private int scoreGoalTeamB, scoreShotOnTargetTeamB, scoreTotalShotsTeamB, scoreFoulTeamB, scoreOffsidesTeamB, scoreCornersTeamB;

    private  TextView goalScoreTeamA, shotOnTargetScoreTeamA, totalShotsScoreTeamA, foulScoreTeamA, offsideScoreTeamA, cornerScoreTeamA;

    private TextView goalScoreTeamB, shotOnTargetScoreTeamB, totalShotsScoreTeamB, foulScoreTeamB, offsideScoreTeamB, cornerScoreTeamB;

    Button resetScore;


    TextView teamA;
    TextView teamB;

    String stringA;
    String stringB;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        /*
        set Text for both TeamA and TeamB
         */
        teamA = findViewById(R.id.textviewA);
        stringA = getIntent().getExtras().getString("TeamA");
        teamA.setText(stringA);

        teamB = findViewById(R.id.textviewB);
        stringB = getIntent().getExtras().getString("TeamB");
        teamB.setText(stringB);



        /*
         * Reset Score for Both Team's
         */

        resetScore = findViewById(R.id.resetScore);
        resetScore.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(scoreGoalTeamA > scoreGoalTeamB){
                    Toast.makeText(MainActivity.this,  stringA+" is winner",Toast.LENGTH_SHORT).show();
                }else if(scoreGoalTeamA < scoreGoalTeamB){
                    Toast.makeText(MainActivity.this, stringB+" is winner",Toast.LENGTH_SHORT).show();
                }else{
                    Toast.makeText(MainActivity.this, "It's DRAW",Toast.LENGTH_SHORT).show();
                }

                /*
                 *Reset Score for Team A
                */

                scoreGoalTeamA = 0;
                goalScoreTeamA = findViewById(R.id.goalScoreTeamA);
                goalScoreTeamA.setText(String.valueOf(scoreGoalTeamA));

                scoreShotOnTargetTeamA = 0;
                shotOnTargetScoreTeamA = findViewById(R.id.shotOnTargetScoreTeamA);
                shotOnTargetScoreTeamA.setText(String.valueOf(scoreShotOnTargetTeamA));

                scoreTotalShotsTeamA = 0;
                totalShotsScoreTeamA = findViewById(R.id.totalShotsScoreTeamA);
                totalShotsScoreTeamA.setText(String.valueOf(scoreTotalShotsTeamA));

                scoreFoulTeamA = 0;
                foulScoreTeamA = findViewById(R.id.foulScoreTeamA);
                foulScoreTeamA.setText(String.valueOf(scoreFoulTeamA));

                scoreOffsidesTeamA = 0;
                offsideScoreTeamA = findViewById(R.id.offsideScoreTeamA);
                offsideScoreTeamA.setText(String.valueOf(scoreOffsidesTeamA));

                scoreCornersTeamA = 0;
                cornerScoreTeamA = findViewById(R.id.cornerScoreTeamA);
                cornerScoreTeamA.setText(String.valueOf(scoreCornersTeamA));


                /*
                 *Reset Score for Team B
                */

                scoreGoalTeamB = 0;
                goalScoreTeamB = findViewById(R.id.goalScoreTeamB);
                goalScoreTeamB.setText(String.valueOf(scoreGoalTeamB));

                scoreShotOnTargetTeamB = 0;
                shotOnTargetScoreTeamB = findViewById(R.id.shotOnTargetScoreTeamB);
                shotOnTargetScoreTeamB.setText(String.valueOf(scoreShotOnTargetTeamB));

                scoreTotalShotsTeamB = 0;
                totalShotsScoreTeamB = findViewById(R.id.totalShotsScoreTeamB);
                totalShotsScoreTeamB.setText(String.valueOf(scoreTotalShotsTeamB));

                scoreFoulTeamB = 0;
                foulScoreTeamB = findViewById(R.id.foulScoreTeamB);
                foulScoreTeamB.setText(String.valueOf(scoreFoulTeamB));

                scoreOffsidesTeamB = 0;
                offsideScoreTeamB = findViewById(R.id.offsideScoreTeamB);
                offsideScoreTeamB.setText(String.valueOf(scoreOffsidesTeamB));

                scoreCornersTeamB = 0;
                cornerScoreTeamB = findViewById(R.id.cornerScoreTeamB);
                cornerScoreTeamB.setText(String.valueOf(scoreCornersTeamB));

            }
        });

    }


    public void buttonAction(View v) {
        //Perform action on click
        switch (v.getId()) {

            /*
             * Score for Team A
             */

            // Score Goals for Team A
            case R.id.goalTeamA:
                scoreGoalTeamA++;
                goalScoreTeamA = findViewById(R.id.goalScoreTeamA);
                goalScoreTeamA.setText(String.valueOf(scoreGoalTeamA));
                break;

            // Score Shot On Target for Team A
            case R.id.shotOnTargetTeamA:
                scoreShotOnTargetTeamA++;
                shotOnTargetScoreTeamA = findViewById(R.id.shotOnTargetScoreTeamA);
                shotOnTargetScoreTeamA.setText(String.valueOf(scoreShotOnTargetTeamA));
                break;

            // Score Total Shots for Team A
            case R.id.totalShotsTeamA:
                scoreTotalShotsTeamA++;
                totalShotsScoreTeamA = findViewById(R.id.totalShotsScoreTeamA);
                totalShotsScoreTeamA.setText(String.valueOf(scoreTotalShotsTeamA));
                break;

            // Score Fouls for Team A
            case R.id.foulTeamA:
                scoreFoulTeamA++;
                foulScoreTeamA = findViewById(R.id.foulScoreTeamA);
                foulScoreTeamA.setText(String.valueOf(scoreFoulTeamA));
                break;

            // Score Offsides for Team A
            case R.id.offsidesTeamA:
                scoreOffsidesTeamA++;
                offsideScoreTeamA = findViewById(R.id.offsideScoreTeamA);
                offsideScoreTeamA.setText(String.valueOf(scoreOffsidesTeamA));
                break;


            // Score Corners for Team A
            case R.id.cornerTeamA:
                scoreCornersTeamA++;
                cornerScoreTeamA = findViewById(R.id.cornerScoreTeamA);
                cornerScoreTeamA.setText(String.valueOf(scoreCornersTeamA));
                break;


            /*
             *Score for Team B
             */


            // Score Goals for Team B
            case R.id.goalTeamB:
                scoreGoalTeamB++;
                goalScoreTeamB = findViewById(R.id.goalScoreTeamB);
                goalScoreTeamB.setText(String.valueOf(scoreGoalTeamB));
                break;

            // Score Shot On Target for Team B
            case R.id.shotOnTargetTeamB:
                scoreShotOnTargetTeamB++;
                shotOnTargetScoreTeamB = findViewById(R.id.shotOnTargetScoreTeamB);
                shotOnTargetScoreTeamB.setText(String.valueOf(scoreShotOnTargetTeamB));
                break;

            // Score Total Shots for Team B
            case R.id.totalShotsTeamB:
                scoreTotalShotsTeamB++;
                totalShotsScoreTeamB = findViewById(R.id.totalShotsScoreTeamB);
                totalShotsScoreTeamB.setText(String.valueOf(scoreTotalShotsTeamB));
                break;

            // Score Fouls for Team B
            case R.id.foulTeamB:
                scoreFoulTeamB++;
                foulScoreTeamB = findViewById(R.id.foulScoreTeamB);
                foulScoreTeamB.setText(String.valueOf(scoreFoulTeamB));
                break;

            // Score Offsides for Team A
            case R.id.offsidesTeamB:
                scoreOffsidesTeamB++;
                offsideScoreTeamB = findViewById(R.id.offsideScoreTeamB);
                offsideScoreTeamB.setText(String.valueOf(scoreOffsidesTeamB));
                break;


            // Score Corners for Team A
            case R.id.cornerTeamB:
                scoreCornersTeamB++;
                cornerScoreTeamB = findViewById(R.id.cornerScoreTeamB);
                cornerScoreTeamB.setText(String.valueOf(scoreCornersTeamB));
                break;

        }

    }

}
