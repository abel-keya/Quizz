package com.example.android.quizapp;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    TextView submit_Order;
    private QuestionLibrary mQuestionLibrary = new QuestionLibrary();
    private TextView mScoreView;
    private TextView mQuestionView;
    private QuestionLibrary mQuizzes = new QuestionLibrary();
    private String mAnswers;
    private int mScore = 0;
    private int mquestionNumber = 0;
    private RadioButton mRadioButtonAnswers1;
    private RadioButton mRadioButtonAnswers2;
    private RadioButton mRadioButtonAnswers3;
    private RadioButton mRadioButtonAnswers4;
    private RadioButton mRadioButtonAnswers5;
    private RadioButton mRadioButtonAnswers6;
    private RadioButton mRadioButtonAnswers7;
    private RadioButton mRadioButtonAnswers8;
    private RadioButton mRadioButtonAnswers9;
    private RadioButton mRadioButtonAnswers10;
    private RadioButton mRadioButtonAnswers11;
    private RadioButton mRadioButtonAnswers12;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mScoreView = findViewById(R.id.score);
        submit_Order = findViewById(R.id.SubmitQuiz);
        mRadioButtonAnswers1 = findViewById(R.id.Answers1);
        mRadioButtonAnswers2 = findViewById(R.id.Answers2);
        mRadioButtonAnswers3 = findViewById(R.id.Answers3);
        mRadioButtonAnswers4 = findViewById(R.id.Answers4);
        mRadioButtonAnswers5 = findViewById(R.id.Answers5);
        mRadioButtonAnswers6 = findViewById(R.id.Answers6);
        mRadioButtonAnswers7 = findViewById(R.id.Answers7);
        mRadioButtonAnswers8 = findViewById(R.id.Answers8);
        mRadioButtonAnswers9 = findViewById(R.id.Answers9);
        mRadioButtonAnswers10 = findViewById(R.id.Answers10);
        mRadioButtonAnswers11 = findViewById(R.id.Answers11);
        mRadioButtonAnswers12 = findViewById(R.id.Answers12);
        mQuestionView = findViewById(R.id.quiz1);
        mQuestionView = findViewById(R.id.quiz2);
        mQuestionView = findViewById(R.id.quiz3);
        //Start of Button Listener for Button1

        // Register the onClick listener with the implementation above
        mRadioButtonAnswers1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // logic for Answers 1
                if (mRadioButtonAnswers1.getText() == mAnswers) {
                    mScore = mScore + 1;
                    updateScore(mScore);
                    updateQuestion();
                    //optional code
                    Toast.makeText(MainActivity.this, "correct", Toast.LENGTH_SHORT).show();
                } else {
                    Toast.makeText(MainActivity.this, "wrong", Toast.LENGTH_SHORT).show();
                    updateQuestion();
                }
            }
        });
        mRadioButtonAnswers2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // logic for Answers 2
                if (mRadioButtonAnswers2.getText() == mAnswers) {
                    mScore = mScore + 1;
                    updateScore(mScore);
                    updateQuestion();
                    //optional code
                    Toast.makeText(MainActivity.this, "correct", Toast.LENGTH_SHORT).show();
                } else {
                    Toast.makeText(MainActivity.this, "wrong", Toast.LENGTH_SHORT).show();
                    updateQuestion();
                }
            }
        });
        mRadioButtonAnswers3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // logic for Answers 3
                if (mRadioButtonAnswers3.getText() == mAnswers) {
                    mScore = mScore + 1;
                    updateScore(mScore);
                    updateQuestion();
                    //optional code
                    Toast.makeText(MainActivity.this, "correct", Toast.LENGTH_SHORT).show();
                } else {
                    Toast.makeText(MainActivity.this, "wrong", Toast.LENGTH_SHORT).show();
                    updateQuestion();
                }
            }
        });

        mRadioButtonAnswers4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // logic for Answers 4
                if (mRadioButtonAnswers4.getText() == mAnswers) {
                    mScore = mScore + 1;
                    updateScore(mScore);
                    updateQuestion();
                    //optional code
                    Toast.makeText(MainActivity.this, "correct", Toast.LENGTH_SHORT).show();
                } else {
                    Toast.makeText(MainActivity.this, "wrong", Toast.LENGTH_SHORT).show();
                    updateQuestion();
                }
            }
        });
        mRadioButtonAnswers5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // logic for Answers 5
                if (mRadioButtonAnswers5.getText() == mAnswers) {
                    mScore = mScore + 1;
                    updateScore(mScore);
                    updateQuestion();
                    //optional code
                    Toast.makeText(MainActivity.this, "correct", Toast.LENGTH_SHORT).show();
                } else {
                    Toast.makeText(MainActivity.this, "wrong", Toast.LENGTH_SHORT).show();
                    updateQuestion();
                }
            }
        });
        mRadioButtonAnswers6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // logic for Answers 6
                if (mRadioButtonAnswers6.getText() == mAnswers) {
                    mScore = mScore + 1;
                    updateScore(mScore);
                    updateQuestion();
                    //optional code
                    Toast.makeText(MainActivity.this, "correct", Toast.LENGTH_SHORT).show();
                } else {
                    Toast.makeText(MainActivity.this, "wrong", Toast.LENGTH_SHORT).show();
                    updateQuestion();
                }
            }
        });
        mRadioButtonAnswers7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // logic for Answers 7
                if (mRadioButtonAnswers7.getText() == mAnswers) {
                    mScore = mScore + 1;
                    updateScore(mScore);
                    updateQuestion();
                    //optional code
                    Toast.makeText(MainActivity.this, "correct", Toast.LENGTH_SHORT).show();
                } else {
                    Toast.makeText(MainActivity.this, "wrong", Toast.LENGTH_SHORT).show();
                    updateQuestion();
                }
            }
        });
        mRadioButtonAnswers8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // logic for Answers 8
                if (mRadioButtonAnswers8.getText() == mAnswers) {
                    mScore = mScore + 1;
                    updateScore(mScore);
                    updateQuestion();
                    //optional code
                    Toast.makeText(MainActivity.this, "correct", Toast.LENGTH_SHORT).show();
                } else {
                    Toast.makeText(MainActivity.this, "wrong", Toast.LENGTH_SHORT).show();
                    updateQuestion();
                }
            }
        });
        mRadioButtonAnswers9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // logic for Answers 9
                if (mRadioButtonAnswers9.getText() == mAnswers) {
                    mScore = mScore + 1;
                    updateScore(mScore);
                    updateQuestion();
                    //optional code
                    Toast.makeText(MainActivity.this, "correct", Toast.LENGTH_SHORT).show();
                } else {
                    Toast.makeText(MainActivity.this, "wrong", Toast.LENGTH_SHORT).show();
                    updateQuestion();
                }
            }
        });
        mRadioButtonAnswers10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // logic for Answers 10
                if (mRadioButtonAnswers10.getText() == mAnswers) {
                    mScore = mScore + 1;
                    updateScore(mScore);
                    updateQuestion();
                    //optional code
                    Toast.makeText(MainActivity.this, "correct", Toast.LENGTH_SHORT).show();
                } else {
                    Toast.makeText(MainActivity.this, "wrong", Toast.LENGTH_SHORT).show();
                    updateQuestion();
                }
            }
        });
        mRadioButtonAnswers11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // logic for Answers 11
                if (mRadioButtonAnswers11.getText() == mAnswers) {
                    mScore = mScore + 1;
                    updateScore(mScore);
                    updateQuestion();
                    //optional code
                    Toast.makeText(MainActivity.this, "correct", Toast.LENGTH_SHORT).show();
                } else {
                    Toast.makeText(MainActivity.this, "wrong", Toast.LENGTH_SHORT).show();
                    updateQuestion();
                }
            }
        });
        mRadioButtonAnswers12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // logic for Answers 12
                if (mRadioButtonAnswers12.getText() == mAnswers) {
                    mScore = mScore + 1;
                    updateScore(mScore);
                    updateQuestion();
                    //optional code
                    Toast.makeText(MainActivity.this, "correct", Toast.LENGTH_SHORT).show();
                } else {
                    Toast.makeText(MainActivity.this, "wrong", Toast.LENGTH_SHORT).show();
                    updateQuestion();
                }
            }
        });

    }

    private void updateQuestion() {
        mQuestionView.setText(mQuestionLibrary.getQuestion(mquestionNumber));
        mRadioButtonAnswers1.setText(mQuestionLibrary.getAnswers1(mquestionNumber));
        mRadioButtonAnswers2.setText(mQuestionLibrary.getAnswers2(mquestionNumber));
        mRadioButtonAnswers3.setText(mQuestionLibrary.getAnswers3(mquestionNumber));
        mRadioButtonAnswers4.setText(mQuestionLibrary.getAnswers4(mquestionNumber));
        mRadioButtonAnswers5.setText(mQuestionLibrary.getAnswers5(mquestionNumber));
        mRadioButtonAnswers6.setText(mQuestionLibrary.getAnswers6(mquestionNumber));
        mRadioButtonAnswers7.setText(mQuestionLibrary.getAnswers7(mquestionNumber));
        mRadioButtonAnswers8.setText(mQuestionLibrary.getAnswers8(mquestionNumber));
        mRadioButtonAnswers9.setText(mQuestionLibrary.getAnswers9(mquestionNumber));
        mRadioButtonAnswers10.setText(mQuestionLibrary.getAnswers10(mquestionNumber));
        mRadioButtonAnswers11.setText(mQuestionLibrary.getAnswers11(mquestionNumber));
        mRadioButtonAnswers12.setText(mQuestionLibrary.getAnswers12(mquestionNumber));
        mAnswers = mQuestionLibrary.getCorrectAnswers(mquestionNumber);
        mquestionNumber++;
    }

    private void updateScore(int point) {
        mScoreView.setText(mScore);
    }

    public void selectItem(View view) {

    }

    public void submitQuiz(View view) {


    }
}


