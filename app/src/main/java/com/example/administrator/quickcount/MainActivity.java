package com.example.administrator.quickcount;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity  {
    EditText inBoxEditText, boxXEditText, boxYEditText, boxZEditText, emptyEditText, liteEditText;
    Button countButton;
    String int1,int2, int3, int4, int5, int6;
    Integer result;
    TextView textResult;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        inBoxEditText =(EditText)findViewById(R.id.inBoxEditText);
        boxXEditText =(EditText)findViewById(R.id.boxXEditText);
        boxYEditText =(EditText)findViewById(R.id.boxYEditText);
        boxZEditText =(EditText)findViewById(R.id.boxZEditText);
         emptyEditText =(EditText)findViewById(R.id.emptyEditText);
         liteEditText =(EditText)findViewById(R.id.liteEditText);




        countButton= (Button)findViewById(R.id.countButton);

        textResult=(TextView)findViewById(R.id.resultTextView);


        countButton.setOnClickListener (new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                int1 = inBoxEditText.getText().toString();
                int2 = boxXEditText.getText().toString();
                int3 = boxYEditText.getText().toString();
                int4 = boxZEditText.getText().toString();
                int5 = emptyEditText.getText().toString();
                int6 = liteEditText.getText().toString();
                result = Integer.parseInt(int1) * (Integer.parseInt(int2)*Integer.parseInt(int3)*Integer.parseInt(int4)-Integer.parseInt(int5)-1)+Integer.parseInt(int6);
                textResult.setText(result.toString()+" R");
            }
        });








    }
}
