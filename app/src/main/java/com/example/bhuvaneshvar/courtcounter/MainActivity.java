package com.example.bhuvaneshvar.courtcounter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    int teamAscore , teamBsore;
    TextView tvteamAscore , tvteamBscore;
    Button btnteamA3point , btnteamA2point , btnteamAfree;
    Button btnteamB3point , btnteamB2point , btnteamBfree;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tvteamAscore = (TextView)findViewById(R.id.tvteamAscore);
        btnteamA3point = (Button)findViewById(R.id.btnTeamA3point);
        btnteamA2point = (Button)findViewById(R.id.btnTeamA2point);
        btnteamAfree = (Button)findViewById(R.id.btnTeamAFree);


        tvteamBscore = (TextView)findViewById(R.id.tvteamBscore);
        btnteamB3point = (Button)findViewById(R.id.btnTeamB3point);
        btnteamB2point = (Button)findViewById(R.id.btnTeamB2point);
        btnteamBfree = (Button)findViewById(R.id.btnTeamBFree);
    }

    public void resetAll(View view)
    {
        tvteamAscore.setText("0");
        tvteamBscore.setText("0");

    }

    public void teamA3point(View view)
    {
        int currentScore = Integer.parseInt(tvteamAscore.getText().toString());
        tvteamAscore.setText(String.valueOf(currentScore + 3));
    }

    public void teamA2poin(View view) {
        int currentScore = Integer.parseInt(tvteamAscore.getText().toString());
        tvteamAscore.setText(String.valueOf(currentScore + 2));
    }

    public void teamB3point(View view) {
        int currentScore = Integer.parseInt(tvteamBscore.getText().toString());
        tvteamBscore.setText(String.valueOf(currentScore + 3));
    }

    public void teamB2point(View view) {
        int currentScore = Integer.parseInt(tvteamBscore.getText().toString());
        tvteamBscore.setText(String.valueOf(currentScore + 2));
    }

    public void teamAfree(View view) {
        int currentScore = Integer.parseInt(tvteamAscore.getText().toString());
        tvteamAscore.setText(String.valueOf(currentScore + 1));
    }

    public void teamBfree(View view) {
        int currentScore = Integer.parseInt(tvteamBscore.getText().toString());
        tvteamBscore.setText(String.valueOf(currentScore + 1));
    }
}
