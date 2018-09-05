package com.example.android.scorekeepernanodegree;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class first_activity extends AppCompatActivity {

    EditText editTxtTeamA;
    EditText editTxtTeamB;
    Button button;
    String stringA;
    String stringB;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first_activity);

        button = findViewById(R.id.button);
        editTxtTeamA = findViewById(R.id.editTeamA);
        editTxtTeamB = findViewById(R.id.editTeamB);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i = new Intent(first_activity.this,MainActivity.class);
                stringA = editTxtTeamA.getText().toString();
                stringB = editTxtTeamB.getText().toString();
                i.putExtra("TeamA",stringA);
                i.putExtra("TeamB",stringB);

               /*
               Check EditText Fields empty or not
                */
                if(TextUtils.isEmpty(editTxtTeamA.getText()) || TextUtils.isEmpty(editTxtTeamB.getText())) {
                    editTxtTeamA.setError("Team name required!");
                    editTxtTeamB.setError("Team name required");

                }else{

                    startActivity(i);
                    finish();
                }

            }
        });

    }
}
