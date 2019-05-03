package com.londonappbrewery.destini;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    final int T1 = 1;
    final int T2 = 2;
    final int T3 = 3;
    final int T4 = 4;
    final int T5 = 5;
    final int T6 = 6;
    final int TOP_BUTTON = 1;
    final int BOTTOM_BUTTON = 0;

    TextView story;
    Button topButton;
    Button bottomButton;
    int mPosition;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mPosition = 1;
        story = findViewById(R.id.storyTextView);
        topButton = findViewById(R.id.buttonTop);
        bottomButton = findViewById(R.id.buttonBottom);

        topButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                updateStory(TOP_BUTTON);
            }
        });

        bottomButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                updateStory(BOTTOM_BUTTON);
            }
        });

    }

    private void updateStory(int button){
        if(mPosition == T1){
            if(button == TOP_BUTTON){
                mPosition = T3;
                story.setText(R.string.T3_Story);
                topButton.setText(R.string.T3_Ans1);
                bottomButton.setText(R.string.T3_Ans2);
            }else if(button == BOTTOM_BUTTON){
                mPosition = T2;
                story.setText(R.string.T2_Story);
                topButton.setText(R.string.T2_Ans1);
                bottomButton.setText(R.string.T2_Ans2);
            }
        }else if(mPosition == T2){
            if(button == TOP_BUTTON){
                mPosition = T3;
                story.setText(R.string.T3_Story);
                topButton.setText(R.string.T3_Ans1);
                bottomButton.setText(R.string.T3_Ans2);
            }else if(button == BOTTOM_BUTTON){
                mPosition = T4;
                story.setText(R.string.T4_End);
                topButton.setVisibility(View.GONE);
                bottomButton.setVisibility(View.GONE);
            }
        }else if(mPosition == T3){
            if(button == TOP_BUTTON){
                mPosition = T6;
                story.setText(R.string.T6_End);
                topButton.setVisibility(View.GONE);
                bottomButton.setVisibility(View.GONE);
            }else if(button == BOTTOM_BUTTON){
                mPosition = T5;
                story.setText(R.string.T5_End);
                topButton.setVisibility(View.GONE);
                bottomButton.setVisibility(View.GONE);
            }
        }
    }
}
