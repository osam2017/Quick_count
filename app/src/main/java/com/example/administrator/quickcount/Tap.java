package com.example.administrator.quickcount;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Tap extends AppCompatActivity {
    EditText groupEditText;
    Button tapButton;
    String int1,int2, int3, int4, int5, int6;
    Integer result, ccc;
    TextView timesText,resultText;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tap);
        groupEditText = (EditText) findViewById(R.id.groupEditText);


        tapButton= (Button) findViewById(R.id.tapButton);

        timesText = (TextView) findViewById(R.id.timesTextView);
        resultText = (TextView) findViewById(R.id.resultText);
        ccc = 0;

        tapButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int1 = groupEditText.getText().toString();
                ccc=ccc+1;

                result = Integer.parseInt(int1) * ccc;
                timesText.setText(ccc.toString());
                resultText.setText(result.toString() + " 개");
            }
        });

    }
}
