package com.example.scrollingtextapp3;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    private Button addComment;
    private TextView comment;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        comment = findViewById(R.id.comment_text);
        comment.setVisibility(View.INVISIBLE);

        addComment = findViewById(R.id.buttonAddComment);
        addComment.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                comment.setVisibility(View.VISIBLE);
            }
        });



    }


    @Override
    public void onClick(View view) {

    }


}