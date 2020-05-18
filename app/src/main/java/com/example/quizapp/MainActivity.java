package com.example.quizapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button submit;
    RadioButton rd1, rd2, rd3, rd4, rd5, rd6;
    CheckBox ch1, ch2, ch3, ch4, ch5, ch6;
    EditText et1, et2;

    int t = 0, f = 0;
    int percent= 17;

     final String s1 = "final";
     final String s2 = "interface";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        submit = findViewById(R.id.submit);

        rd1 = findViewById(R.id.rd1);
        rd2 = findViewById(R.id.rd2);
        rd3 = findViewById(R.id.rd3);
        rd4 = findViewById(R.id.rd4);
        rd5 = findViewById(R.id.rd5);
        rd6 = findViewById(R.id.rd6);

        ch1 = findViewById(R.id.ch1);
        ch2 = findViewById(R.id.ch2);
        ch3 = findViewById(R.id.ch3);
        ch4 = findViewById(R.id.ch4);
        ch5 = findViewById(R.id.ch5);
        ch6 = findViewById(R.id.ch6);

        et1 = findViewById(R.id.et1);
        et2 = findViewById(R.id.et2);




        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (rd2.isChecked())
                    t++;
                else if (rd1.isChecked() || rd3.isChecked())
                    f++;
//////////////////////////////////////////////////////////////////////
                if (rd6.isChecked())
                    t++;
                else if (rd4.isChecked() || rd5.isChecked())
                    f++;

/////////////////////////////////////////////////////////////////////
                if (ch1.isChecked() && ch3.isChecked())
                    t++;
                else if (ch1.isChecked() || ch2.isChecked() || ch3.isChecked())
                    f++;

                //////////////////////////////////////////////////////////////////////
                if (ch4.isChecked())
                    t++;
                else if (ch5.isChecked() || ch6.isChecked())
                    f++;
////////////////////////////////////////////////////////////////////////////////////////
                String test1 = et1.getText().toString();

                if (test1.equals(s1))
                    t++;
                else
                    f++;
///////////////////////////////////////////////////////////////////////////////////////////
                String test2 = et2.getText().toString();

                if (test2.equals(s2))
                    t++;
                else
                    f++;
///////////////////////////////////////////////////////////////////////////////////////////
             percent = percent * t;

             if (t == 6){
                 Toast.makeText(getApplicationContext(), t + " true\n" + f + " false\n" + "100 %", Toast.LENGTH_LONG).show();
             }else {
                 Toast.makeText(getApplicationContext(), t + " true\n" + f + " false\n" + percent + " %", Toast.LENGTH_LONG).show();
             }
                t = 0;
                f = 0;
            }
        });
    }
}
