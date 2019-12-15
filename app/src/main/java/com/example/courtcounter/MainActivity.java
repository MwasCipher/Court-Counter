package com.example.courtcounter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int gameScoreA,gameScoreB;
    Button teamAthreePointBtn, teamBthreePointBtn, teamAtwoPointBtn,
            teamBtwoPointBtn, teamAFreeThrowBtn, teamBFreeThrowBtn, resetBtn;
    TextView teamAdisplayScore, teamBdisplayScore;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        gameScoreA = 0;
        gameScoreB = 0;

        teamAdisplayScore = findViewById(R.id.team_A_score_display);
        teamBdisplayScore = findViewById(R.id.team_B_score_display);

        teamAthreePointBtn = findViewById(R.id.three_points_button);
        teamBthreePointBtn = findViewById(R.id.three_points_buttonB);


        teamAtwoPointBtn = findViewById(R.id.two_points_button);
        teamBtwoPointBtn = findViewById(R.id.two_points_buttonB);


        teamAFreeThrowBtn = findViewById(R.id.free_throw_points_button);
        teamBFreeThrowBtn = findViewById(R.id.free_throw_points_buttonB);


        resetBtn = findViewById(R.id.reset_button);

//        Team A Scores For Three points, Two Points and Free Throws

        teamAthreePointBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gameScoreA +=3;
                displayThreePointsA(gameScoreA);

            }
        });

        teamAtwoPointBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                gameScoreA +=2;
                displayTwoPointsA(gameScoreA);

            }
        });

        teamAFreeThrowBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                gameScoreA +=1;
                displayFreePointsA(gameScoreA);

            }
        });

       // Team B Scores For Three points, Two Points and Free Throws


        teamBthreePointBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                gameScoreB +=3;
                displayThreePointsB(gameScoreB);

            }
        });

        teamBtwoPointBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                gameScoreB +=2;
                displayTwoPointsB(gameScoreB);

            }
        });

        teamBFreeThrowBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                gameScoreB +=1;
                displayFreePointsB(gameScoreB);

            }
        });

    }

    public void displayThreePointsA(int gameScoreA){

        teamAdisplayScore.setText(String.valueOf(gameScoreA));
    }

    public void displayTwoPointsA(int gameScoreA){

        teamAdisplayScore.setText(String.valueOf(gameScoreA));
    }

    public void displayFreePointsA(int gameScoreA){

        teamAdisplayScore.setText(String.valueOf(gameScoreA));
    }



    public void displayThreePointsB(int gameScoreB){

        teamBdisplayScore.setText(String.valueOf(gameScoreB));
    }

    public void displayTwoPointsB(int gameScoreB){

        teamBdisplayScore.setText(String.valueOf(gameScoreB));
    }

    public void displayFreePointsB(int gameScoreB){

        teamBdisplayScore.setText(String.valueOf(gameScoreB));
    }

    public void resetScore(){

    }


}
