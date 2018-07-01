package com.example.android.quizapp;

public class QuestionLibrary {
    String mQuizzes[] = {
            "quiz_1_which_of_the_following_is_a_mobile_based_database",
            "quiz_2_a_view_contained_within_another_view_is_called",
            "quiz_3_a_visible_screen_on_an_android_app_is_refered_to_as",
    };
    private String mAnswers[][] = {
            {"sqlite", "intent", "karnel", "view"},
            {"cascade_view", "hidden_view", "child_view", "container_view"},
            {"symbian", "android", "firebase", "zamarin"},
            {"Good", "Awesome", "nice", "Great", "wau!"}
    };

    private String mCorrectAnswers[] = {"sqlite", "child_view", "views"};


    public String getAnswers1(int a) {
        String Answers0 = mAnswers[a][0];
        return Answers0;

    }

    public String getAnswers2(int a) {
        String Answers1 = mAnswers[a][1];
        return Answers1;

    }

    public String getAnswers3(int a) {
        String Answers2 = mAnswers[a][2];
        return Answers2;

    }

    public String getAnswers4(int a) {
        String Answer3 = mAnswers[a][3];
        return Answer3;

    }

    public String getAnswers5(int a) {
        String Answer4 = mAnswers[a][4];
        return Answer4;

    }

    public String getAnswers6(int a) {
        String Answer5 = mAnswers[a][5];
        return Answer5;
    }

    public String getAnswers7(int a) {
        String Answer6 = mAnswers[a][6];
        return Answer6;

    }

    public String getAnswers8(int a) {
        String Answer7 = mAnswers[a][7];
        return Answer7;

    }

    public String getAnswers9(int a) {
        String Answer8 = mAnswers[a][8];
        return Answer8;

    }

    public String getAnswers10(int a) {
        String Answer9 = mAnswers[a][9];
        return Answer9;

    }

    public String getAnswers11(int a) {
        String Answer10 = mAnswers[a][10];
        return Answer10;

    }

    public String getAnswers12(int a) {
        String Answer11 = mAnswers[a][11];
        return Answer11;

    }
    public String getQuestion(int a) {
        String Question = mQuizzes[a];
        return Question;

    }

    public String getCorrectAnswers(int a) {
        String Answers = mCorrectAnswers[a];
        return Answers;
    }
}
