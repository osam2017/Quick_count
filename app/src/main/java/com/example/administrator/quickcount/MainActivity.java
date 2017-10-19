package com.example.administrator.quickcount;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.view.View.OnClickListener;



public class MainActivity extends AppCompatActivity  implements OnClickListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button count = (Button) findViewById(R.id.count);
        Button tap = (Button) findViewById(R.id.tap);
        count.setOnClickListener(this);
        tap.setOnClickListener(this);
    }



    @Override
    public void onClick(View v) {
        Intent intentCount = new Intent(this, Count.class);
        Intent intentTap = new Intent(this, Tap.class);
        switch (v.getId()) {
            case R.id.count:
                startActivity(intentCount);
                break;

            case R.id.tap:
                startActivity(intentTap);
                break;


        }

    }
}
