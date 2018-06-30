package com.example.android.quizapp;

public class QuestionLibrary {
    private String mQuestions[] = {
            "quiz_1_which_of_the_following_is_a_mobile_based_database",
            "quiz_2_a_view_contained_within_another_view_is_called",
            "quiz_3_a_visible_screen_on_an_android_app_is_refered_to_as",
            "quiz_4_select_only_the_mobile_operating_systems",
            "quiz_5_briefly_describe_your_experience_with_google_africa_scholarship_on_the_andela_platform"
    };
    private String mAnswers[][]

    {
        {
            "sqlite", "intent", "karnel", "view"
        },
        {
            "cascade_view", "hidden_view", "child_view", "container_view"
        },
        {
            "symbian", "android", "firebase", "zamarin"
        },
        {
            "Good", "Awesome", "nice", "Great", "wau!"
        }
    }

    ;
    private String mCorrectAnswers[] = {
            {"sqlite", "child_view", "view", "symbian", "android", "Good", "Awesome", "nice", "Great", "wau!"};


}

    public String Answers1(int a) {
        String Answer0 = mAnswers[a][0];
        return Answer0;

    }

    public String Answers2(int a) {
        String Answer1 = mAnswers[a][1];
        return Answer1;

    }

    public String Answers3(int a) {
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

    public String getQuestion(int a) {
        String Question = mQuestions[a];
        return Question;

    }

    public String getCorrectAnswers(int a) {
        String Answers = mCorrectAnswers[a];
        return Answers;
    }
};
