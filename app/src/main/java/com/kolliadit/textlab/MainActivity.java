package com.kolliadit.textlab;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;

import com.kolliadit.textlab.R;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    Button sub;
    EditText responseText;
    TextView displayText;
    TextView cText;
    Button cb;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        sub=findViewById(R.id.clickButton);
        responseText=findViewById(R.id.response2EditText);
        displayText=findViewById(R.id.textBox);
        cb = findViewById(R.id.complimentButton);
        cText=findViewById(R.id.complimentBox);





        sub.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                System.out.println("testing onclick:  Good Job");
                Log.i("testButton","Good Job"+responseText.getText().toString());

                displayText.setText(responseText.getText());


            }
        });
        cb.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
//                System.out.println("testing onclick:  Good Job");
//                Log.i("testButton","Good Job"+responseText.getText().toString());

                cText.setText(responseText.getText());


            }
        });
        responseText.setOnFocusChangeListener(new View.OnFocusChangeListener() {
            @Override
            public void onFocusChange(View v, boolean hasFocus) {
                if (!hasFocus) {
                    if (responseText.getText().toString().equals("TJ")) {
                        displayText.setText("TJ Rocks!");
                        responseText.setText("");
                        responseText.setHint("That's a good name.");
                    }
                }
            }
        });
    }
}
