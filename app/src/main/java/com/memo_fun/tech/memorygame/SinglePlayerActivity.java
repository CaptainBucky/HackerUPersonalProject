package com.memo_fun.tech.memorygame;

import android.os.Bundle;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

public class SinglePlayerActivity extends AppCompatActivity {
    final String dogString = "DOG";
    final String catString = "CAT";
    final String eagleString = "EAGLE";
    final String lionString = "LION";
    final String lizardString = "LIZARD";
    final String monkeyString = "MONKEY";
    final String penguinString = "PENGUIN";
    final String sharkString = "SHARK";
    final String snakeString = "SNAKE";
    final String tigerString = "TIGER";
    final String octopusString ="OCTOPUS";
    final String whaleString = "WHALE";
    final String batString = "BAT";
    final String squirrelString = "SQUIRREL";
    final String spiderString = "SPIDER";
    final String chickenString = "CHICKEN";
    final String dolphinString = "DOLPHIN";
    final String bearString = "BEAR";
    final String wolfString = "WOLF";


    ArrayList<Card> cardArrayList = new ArrayList<>(36);
    ImageView[] imageViews = new ImageView[36];

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_single_player);
        imageViews[0] = findViewById(R.id.card0);
        imageViews[1] = findViewById(R.id.card1);
        imageViews[2] = findViewById(R.id.card2);
        imageViews[3] = findViewById(R.id.card3);
        imageViews[4] = findViewById(R.id.card4);
        imageViews[5] = findViewById(R.id.card5);
        imageViews[6] = findViewById(R.id.card6);
        imageViews[7] = findViewById(R.id.card7);
        imageViews[8] = findViewById(R.id.card8);
        imageViews[9] = findViewById(R.id.card9);
        imageViews[10] = findViewById(R.id.card10);
        imageViews[11] = findViewById(R.id.card11);
        imageViews[12] = findViewById(R.id.card12);
        imageViews[13] = findViewById(R.id.card13);
        imageViews[14] = findViewById(R.id.card14);
        imageViews[15] = findViewById(R.id.card15);
        imageViews[16] = findViewById(R.id.card16);
        imageViews[17] = findViewById(R.id.card17);
        imageViews[18] = findViewById(R.id.card18);
        imageViews[19] = findViewById(R.id.card19);
        imageViews[20] = findViewById(R.id.card20);
        imageViews[21] = findViewById(R.id.card21);
        imageViews[22] = findViewById(R.id.card22);
        imageViews[23] = findViewById(R.id.card23);
        imageViews[24] = findViewById(R.id.card24);
        imageViews[25] = findViewById(R.id.card25);
        imageViews[26] = findViewById(R.id.card26);
        imageViews[27] = findViewById(R.id.card27);
        imageViews[28] = findViewById(R.id.card28);
        imageViews[29] = findViewById(R.id.card29);
        imageViews[30] = findViewById(R.id.card30);
        imageViews[31] = findViewById(R.id.card31);
        imageViews[32] = findViewById(R.id.card32);
        imageViews[33] = findViewById(R.id.card33);
        imageViews[34] = findViewById(R.id.card34);
        imageViews[35] = findViewById(R.id.card35);
        cardArrayList.add(new Dog(dogString, imageViews[0], Status.DOWN));
        cardArrayList.add(new Dog(dogString, imageViews[1], Status.DOWN));
        cardArrayList.add(new Cat(catString, imageViews[2], Status.DOWN));
        cardArrayList.add(new Cat(catString, imageViews[3], Status.DOWN));
        cardArrayList.add(new Eagle(eagleString, imageViews[4],Status.DOWN));
        cardArrayList.add(new Eagle(eagleString, imageViews[5],Status.DOWN));
        cardArrayList.add(new Lion(lionString, imageViews[6],Status.DOWN));
        cardArrayList.add(new Lion(lionString, imageViews[7],Status.DOWN));
        cardArrayList.add(new Lizard(lizardString, imageViews[8],Status.DOWN));
        cardArrayList.add(new Lizard(lizardString, imageViews[9],Status.DOWN));
        cardArrayList.add(new Monkey(monkeyString, imageViews[10],Status.DOWN));
        cardArrayList.add(new Monkey(monkeyString, imageViews[11],Status.DOWN));
        cardArrayList.add(new Penguin(penguinString, imageViews[12],Status.DOWN));
        cardArrayList.add(new Penguin(penguinString, imageViews[13],Status.DOWN));
        cardArrayList.add(new Shark(sharkString, imageViews[14],Status.DOWN));
        cardArrayList.add(new Shark(sharkString, imageViews[15],Status.DOWN));
        cardArrayList.add(new Snake(snakeString, imageViews[16],Status.DOWN));
        cardArrayList.add(new Snake(snakeString, imageViews[17],Status.DOWN));
        cardArrayList.add(new Tiger(tigerString, imageViews[18],Status.DOWN));
        cardArrayList.add(new Tiger(tigerString, imageViews[19],Status.DOWN));
        cardArrayList.add(new Octopus(octopusString, imageViews[20],Status.DOWN));
        cardArrayList.add(new Octopus(octopusString, imageViews[21],Status.DOWN));
        cardArrayList.add(new Whale(whaleString, imageViews[22],Status.DOWN));
        cardArrayList.add(new Whale(whaleString, imageViews[23],Status.DOWN));
        cardArrayList.add(new Bat(batString, imageViews[24],Status.DOWN));
        cardArrayList.add(new Bat(batString, imageViews[25],Status.DOWN));
        cardArrayList.add(new Squirrel(squirrelString, imageViews[26],Status.DOWN));
        cardArrayList.add(new Squirrel(squirrelString, imageViews[27],Status.DOWN));
        cardArrayList.add(new Spider(spiderString, imageViews[28],Status.DOWN));
        cardArrayList.add(new Spider(spiderString, imageViews[29],Status.DOWN));
        cardArrayList.add(new Chicken(chickenString, imageViews[30],Status.DOWN));
        cardArrayList.add(new Chicken(chickenString, imageViews[31],Status.DOWN));
        cardArrayList.add(new Bear(bearString, imageViews[32],Status.DOWN));
        cardArrayList.add(new Bear(bearString, imageViews[33],Status.DOWN));
        cardArrayList.add(new Wolf(wolfString, imageViews[34],Status.DOWN));
        cardArrayList.add(new Wolf(wolfString, imageViews[35],Status.DOWN));
    }

}
