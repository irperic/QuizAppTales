package com.example.android.quizapptales;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

import com.example.android.quizapptales.R;

public class MainActivity extends AppCompatActivity {

    /**
     * The number of correct answers
     */
    int score = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /**
     * This method is called when the Score button is clicked.
     */
    public void finalResult(View view) {

        EditText nameField = (EditText) findViewById(R.id.name_field);
        String name = nameField.getText().toString();

        //Called question checking methods.
        question_1();
        question_2();
        question_3();
        question_4();
        question_5();

        //Toast - Shows player name and score
        Toast.makeText(this, "Name: " + name +"\nScore: " + score +" of 6", Toast.LENGTH_SHORT).show();

        // Resets the variable score (The number of correct answers) to 0.
        score=0;
    }

    /**
     * This method is called when user selected the correct answer.
     * Added +1 to score for each correct answer
     */
    private int increment_score() {
        score +=1;
        return score;
    }

    /**
     * This method counter correct answers in question 1
     * "In fairy-tale, The Wizard of Oz, Dorothy on the way meets Scarecrow and ... (There may be more accurate answers."
     */
    public void question_1() {
        //Figure out if the user chose "Woodcutter" answer
        CheckBox Answer11CheckBox = (CheckBox) findViewById(R.id.answer_1_1_checkbox);
        boolean hasAnswer11 = Answer11CheckBox.isChecked();

        //Figure out if the user chose "Lion" answer
        CheckBox Answer14CheckBox = (CheckBox) findViewById(R.id.answer_1_4_checkbox);
        boolean hasAnswer14 = Answer14CheckBox.isChecked();

        if (hasAnswer11 && hasAnswer14) {
            increment_score();
            increment_score();
        } else if (hasAnswer11 || hasAnswer14){
            increment_score();
        }  else {
            score=0;
        }
    }

    /**
     * This method counter correct answers in question 2
     * "How long was Sleeping Beauty sleeping?"
     */
    public void question_2() {
        RadioButton answerRadio;
        RadioGroup answers = (RadioGroup) findViewById(R.id.question_2);
        switch (answers.getCheckedRadioButtonId()) {
            case R.id.answer_2_3_RadioButton:
                answerRadio = (RadioButton) findViewById(R.id.answer_2_3_RadioButton);
                increment_score();
                break;
            default:
                answerRadio = (RadioButton) findViewById(R.id.answer_2_1_RadioButton);
                answerRadio = (RadioButton) findViewById(R.id.answer_2_2_RadioButton);

        }
    }

    /**
     * This method counter correct answers in question 3
     * "How many dwarfs are there in the story of Snow White?</"
     */
    public void question_3() {
        RadioButton answerRadio;
        RadioGroup answers = (RadioGroup) findViewById(R.id.question_3);
        switch (answers.getCheckedRadioButtonId()) {
            case R.id.answer_3_2_RadioButton:
                answerRadio = (RadioButton) findViewById(R.id.answer_3_2_RadioButton);
                increment_score();
                break;
            default:
                answerRadio = (RadioButton) findViewById(R.id.answer_3_1_radiobutton);
                answerRadio = (RadioButton) findViewById(R.id.answer_3_3_RadioButton);
        }
    }

    /**
     * This method counter correct answers in question 4
     * "How much is it Cinderella had the evil half-siblings?"
     */
    public void question_4() {
        RadioButton answerRadio;
        RadioGroup answers = (RadioGroup) findViewById(R.id.question_4);
        switch (answers.getCheckedRadioButtonId()) {
            case R.id.answer_4_1_radiobutton:
                answerRadio = (RadioButton) findViewById(R.id.answer_4_1_radiobutton);
                increment_score();
                break;
            default:
                answerRadio = (RadioButton) findViewById(R.id.answer_4_2_radiobutton);
                answerRadio = (RadioButton) findViewById(R.id.answer_4_3_radiobutton);
        }
    }

    /**
     * This method counter correct answers in question 5
     * "Which figure of fairy tale will always remain a boy?"
     */
    public void question_5() {
        RadioButton answerRadio;
        RadioGroup answers = (RadioGroup) findViewById(R.id.question_5);
        switch (answers.getCheckedRadioButtonId()) {
            case R.id.answer_5_2_radiobutton:
                answerRadio = (RadioButton) findViewById(R.id.answer_5_2_radiobutton);
                increment_score();
                break;
            default:
                answerRadio = (RadioButton) findViewById(R.id.answer_5_1_radiobutton);
                answerRadio = (RadioButton) findViewById(R.id.answer_5_3_radiobutton);
        }
    }
}

