package com.example.mathsgame;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.os.CountDownTimer;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.util.Random;


public class Game extends AppCompatActivity {


    TextView Score;
    TextView Life;
    TextView Time;

    Button Ok;
    Button Next;
    EditText Ques;
    EditText Hint;

    Random random = new Random();
    int num1;
    int num2;
    int userAns;

    int realAns;
    int userScore = 0;
    int userLife = 3;

    CountDownTimer timer;
    private static final long START_TIMER_IN_MINS = 60000;
    Boolean timer_running;
    long time_left_in_milis = START_TIMER_IN_MINS;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game);

        Score = findViewById(R.id.Score);
        Life = findViewById(R.id.life);
        Time = findViewById(R.id.Time);
        Ok = findViewById(R.id.ok);
        Next = findViewById(R.id.NxtQue);
        Ques = findViewById(R.id.ed);
        Hint = findViewById(R.id.EnterYourAns);

        gameContinue();

        Ok.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                userAns = Integer.valueOf(Hint.getText().toString());
                if (userAns == realAns) {
                    userScore = userScore + 10;
                    Score.setText("" + userScore);
                    Ques.setText("Congratulations,Your answer is true");
                } else {
                    userLife = userLife - 1;
                    Life.setText("" + userLife);
                    Ques.setText("Sorry Your Answer is false");
                }

            }
        });

        Next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Hint.setText("");
                gameContinue();
            }
        });

    }

    public void gameContinue() {
        num1 = random.nextInt(100);
        num2 = random.nextInt(100);

        realAns = num1 + num2;
        Ques.setText(num1 + " + " + num2);
    }



        }



