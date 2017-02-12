package com.example.mainpchan.csc201_ch911_app;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    LinearEquation eq;
    TextView result;
    EditText atemp;
    EditText btemp;
    EditText ctemp;
    EditText dtemp;
    EditText etemp;
    EditText ftemp;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        Button calcubtn = (Button) findViewById(R.id.calcubtn);
        calcubtn.setOnClickListener(this);

        result = (TextView) findViewById(R.id.result);

        atemp = (EditText) findViewById(R.id.ainput);
        btemp = (EditText) findViewById(R.id.binput);
        ctemp = (EditText) findViewById(R.id.cinput);
        dtemp = (EditText) findViewById(R.id.dinput);
        etemp = (EditText) findViewById(R.id.einput);
        ftemp = (EditText) findViewById(R.id.finput);


    }

    @Override
    public void onClick(View v) {


        double a = Double.parseDouble(atemp.getText().toString());
        double b = Double.parseDouble(btemp.getText().toString());
        double c = Double.parseDouble(ctemp.getText().toString());
        double d = Double.parseDouble(dtemp.getText().toString());
        double e = Double.parseDouble(etemp.getText().toString());
        double f = Double.parseDouble(ftemp.getText().toString());
        eq = new LinearEquation(a, b, c, d, e, f);


        if (eq.isSolvable()) {
            result.setText("x is " + eq.getX() + " and y is " + eq.getY());
        } else {
            result.setText("The equation has no solution");
        }

    }
}
