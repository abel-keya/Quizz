package com.example.android.quizapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private QuestionLibrary mQuestionLibrary = new QuestionLibrary();
    private TextView mScoreView;
    private TextView mQuestionView;
    private Button mButtonAnswers1;
    private Button mButtonAnswers2;
    private Button mButtonAnswers3;
    private Button mButtonAnswers4;
    private Button mButtonAnswers5;

    private String mAnswers;
    private int mScore = 0;
    private int mQuestionNumber = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mScoreView = (TextView) findViewById(R.id.score);
        mQuestionView(TextView) findViewById(R.id.question);
        mButtonAnswers1 = (Button) findViewById(R.id.Answers1);
        mButtonAnswers1 = (Button) findViewById(R.id.Answers2);
        mButtonAnswers1 = (Button) findViewById(R.id.Answers3);
        mButtonAnswers1 = (Button) findViewById(R.id.Answers4);
        mButtonAnswers1 = (Button) findViewById(R.id.Answers5);
        updateQuestion();
        //Start of Button Listener for Button1
        @Override
                mButtonAnswers1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void Onclick(View view)
            //my logic for Button goes in here
            if(mButtonAnswers1.getText()==mAnswers1);

            {
                mScore = mScore + 1;
                updateScore(mScore);
                updateQuestion();
                //optional code
                Toast.makeText(MainActivity.this, "correct", Toast.LENGTH_SHORT).show();
            }else

            {
                Toast.makeText(MainActivity.this, "wrong", Toast.LENGTH_SHORT).show();
                updateQuestion();
            }
        }
    });
    //End of Button Listener for Button1
    //Start of Button Listener for Button2
        @Override
                mButtonAnswers1.setOnClickListener(new View.OnClickListener()

    {
        @Override
        public void Onclick (View view)
        //my logic for Button goes in here
        if (mButtonAnswers1.getText() == mAnswers2) ;
        {
            mScore = mScore + 1;
            updateScore(mScore);
            updateQuestion();
            //optional code
            Toast.makeText(MainActivity.this, "correct", Toast.LENGTH_SHORT).show();
        }else{
        Toast.makeText(MainActivity.this, "wrong", Toast.LENGTH_SHORT).show();
        updateQuestion();
    }
    }
});
//End of Button Listener for Button2
//Start of Button Listener for Button3
@Override
mButtonAnswers3.setOnClickListener(new View.OnClickListener(){
@Override
public void Onclick(View view)
        //my logic for Button goes in here
        if(mButtonAnswers1.getText()==mAnswers3);
        {
        mScore=mScore+1;
        updateScore(mScore);
        updateQuestion();
        //optional code
        Toast.makeText(MainActivity.this,"correct",Toast.LENGTH_SHORT).show();
        }else{Toast.makeText(MainActivity.this,"wrong",Toast.LENGTH_SHORT).show();
        updateQuestion();
        }
        }
        });
//End of Button Listener for Button3
//Start of Button Listener for Button4
@Override
                mButtonAnswers1.setOnClickListener(new View.OnClickListener(){
@Override
public void Onclick(View view)
        //my logic for Button goes in here
        if(mButtonAnswers1.getText()==mAnswers4);
        {
        mScore=mScore+1;
        updateScore(mScore);
        updateQuestion();
        //optional code
        Toast.makeText(MainActivity.this,"correct",Toast.LENGTH_SHORT).show();
        }else{Toast.makeText(MainActivity.this,"wrong",Toast.LENGTH_SHORT).show();
        updateQuestion();
        }
        }
        });
//End of Button Listener for Button4
//Start of Button Listener for Button1
@Override
                mButtonAnswers5.setOnClickListener(new View.OnClickListener(){
@Override
public void Onclick(View view)
        //my logic for Button goes in here
        if(mButtonAnswers1.getText()==mAnswers5);
        {
        mScore=mScore+1;
        updateScore(mScore);
        updateQuestion();
        //optional code
        Toast.makeText(MainActivity.this,"correct",Toast.LENGTH_SHORT).show();
        }else{Toast.makeText(MainActivity.this,"wrong",Toast.LENGTH_SHORT).show();
        updateQuestion();
        }
        }
        });
//End of Button Listener for Button5
private void updateQuestion(){
        mQuestionView.setText(mQuestionLibrary.getQuestion(mQuestionNumber));
        mButtonAnswers1.setText(mQuestionLibrary.getAnswers1(mQuestionNumber));
        mButtonAnswers2.setText(mQuestionLibrary.getAnswers2(mQuestionNumber));
        mButtonAnswers3.setText(mQuestionLibrary.getAnswers3(mQuestionNumber));
        mButtonAnswers4.setText(mQuestionLibrary.getAnswers4(mQuestionNumber));
        mButtonAnswers5.setText(mQuestionLibrary.getAnswers5(mQuestionNumber));
        mAnswers=mQuestionLibrary.getCorrectAnswers(mQuestionNumber);
        mQuestionNumber++;
        }
private void updateScore(int point){
        mScoreView.setText(""+mScore);
        }
}
