package com.epicodus.madlibs;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    public static final String TAG = MainActivity.class.getSimpleName();

    private Button mFindMadLibButton;
    private EditText makeLib;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mFindMadLibButton = (Button) findViewById(R.id.findMadLibButton);
        mFindMadLibButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String noun = makeLib.getText().toString();
                Log.d(TAG, noun);
                Intent intent = new Intent(MainActivity.this, MadLibActivity.class);
                startActivity(intent);
            }
        });
    }
}
