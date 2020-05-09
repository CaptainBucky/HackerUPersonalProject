package com.memo_fun.tech.memorygame;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    private final int INTENT_MAIN_SINGLE_PLAYER_ACTIVITY_CODE=1000;
    private final int INTENT_MAIN_TWO_PLAYERS_ACTIVITY_CODE=1001;
    private final int INTENT_MAIN_PARTY_MODE_ACTIVITY_CODE=1002;
    private final int INTENT_MAIN_LEADER_BOARD_ACTIVITY_CODE=1003;
    private final int INTENT_MAIN_OPTIONS_ACTIVITY_CODE=1004;
    private final int INTENT_MAIN_ABOUT_THE_CREATOR_ACTIVITY_CODE=1005;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final Button singlePlayerButton, twoPlayersButton, partyModeButton, leaderBoardButton, optionsButton, aboutTheCreatorButton;
        singlePlayerButton = findViewById(R.id.singlePlayerButton);
        twoPlayersButton = findViewById(R.id.twoPlayersButton);
        partyModeButton = findViewById(R.id.partyModeButton);
        leaderBoardButton = findViewById(R.id.leaderBoardButton);
        optionsButton = findViewById(R.id.optionsButton);
        aboutTheCreatorButton = findViewById(R.id.aboutTheCreatorButton);

        singlePlayerButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,SinglePlayerActivity.class);
                startActivityForResult(intent,INTENT_MAIN_SINGLE_PLAYER_ACTIVITY_CODE);
            }

        });
        twoPlayersButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,TwoPlayesActivity.class);
                startActivityForResult(intent,INTENT_MAIN_TWO_PLAYERS_ACTIVITY_CODE);
            }
        });
        partyModeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,PartyModeActivity.class);
                startActivityForResult(intent,INTENT_MAIN_PARTY_MODE_ACTIVITY_CODE);
            }
        });
        leaderBoardButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,LeaderBoard.class);
                startActivityForResult(intent,INTENT_MAIN_LEADER_BOARD_ACTIVITY_CODE);
            }
        });
        optionsButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,OptionsActivity.class);
                startActivityForResult(intent,INTENT_MAIN_OPTIONS_ACTIVITY_CODE);
            }
        });
        aboutTheCreatorButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,AboutTheCreatorActivity.class);
                startActivityForResult(intent,INTENT_MAIN_ABOUT_THE_CREATOR_ACTIVITY_CODE);
            }
        });
    }



}
