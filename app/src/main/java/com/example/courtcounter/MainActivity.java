package com.example.courtcounter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int gameScore, threePointScore, twoPointScore, freePointScore;
    Button teamAthreePointBtn, teamBthreePointBtn, teamAtwoPointBtn,
            teamBtwoPointBtn, teamAFreeThrowBtn, teamBFreeThrowBtn, resetBtn;
    TextView teamAdisplayScore, teamBdisplayScore;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        gameScore = 0;

        teamAdisplayScore = findViewById(R.id.team_A_score_display);
        teamBdisplayScore = findViewById(R.id.team_B_score_display);

        teamAthreePointBtn = findViewById(R.id.three_points_button);
        teamBthreePointBtn = findViewById(R.id.three_points_buttonB);
        threePointScore = 0;

        teamAtwoPointBtn = findViewById(R.id.two_points_button);
        teamBtwoPointBtn = findViewById(R.id.two_points_buttonB);
        twoPointScore = 0;

        teamAFreeThrowBtn = findViewById(R.id.free_throw_points_button);
        teamBFreeThrowBtn = findViewById(R.id.free_throw_points_buttonB);
        freePointScore = 0;

        resetBtn = findViewById(R.id.reset_button);

        teamAthreePointBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                threePointScore+=3;
                gameScore+=threePointScore;

                teamAdisplayScore.setText(String.valueOf(gameScore));

            }
        });

    }
}
