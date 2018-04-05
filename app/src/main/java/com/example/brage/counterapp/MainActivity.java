package com.example.brage.counterapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    public String text = "Press the button to start!";
    public int score = 0;
    public int highscore;

    Button btnCLick;

    TextView textV;
    TextView hScore;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnCLick = (Button)findViewById(R.id.button);
        textV = (TextView)findViewById(R.id.text);
        hScore = (TextView)findViewById(R.id.highscore);

        textV.setText(getText());
        btnCLick.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                score ++;
                if (score > highscore){
                    highscore = score;
                    hScore.setText(highscore);
                }
                setText("you've pressed the button " + " times!!");
            }
        });
    }

    public void plussOneScore(){
        score ++;
    }

    public int getScore(){
        return score;
    }

    public int getHighscore(){
        return highscore;
    }

    public String getText(){
        return text;
    }

    public void setText(String newText){
        text = newText;
    }


}
