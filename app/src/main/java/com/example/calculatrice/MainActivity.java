package com.example.calculatrice;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    Button bouton0;
    Button bouton1;
    Button bouton2;
    Button bouton3;
    Button bouton4;
    Button bouton5;
    Button bouton6;
    Button bouton7;
    Button bouton8;
    Button bouton9;
    Button boutonPlus;
    Button boutonMinus;
    Button boutonMult;
    Button boutonEquals;
    Button boutonDot;

    Button boutonOnOff;
    Button boutonClear;
    TextView Screen;
    boolean started;

    float op1;
    float op2;
    String operation;


    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        started=false;

        bouton0=(Button)findViewById(R.id.Btt0);
        bouton1=(Button)findViewById(R.id.Btt1);
        bouton2=(Button)findViewById(R.id.Btt2);
        bouton3=(Button)findViewById(R.id.Btt3);
        bouton4=(Button)findViewById(R.id.Btt4);
        bouton5=(Button)findViewById(R.id.Btt5);
        bouton6=(Button)findViewById(R.id.Btt6);
        bouton7=(Button)findViewById(R.id.Btt7);
        bouton8=(Button)findViewById(R.id.Btt8);
        bouton9=(Button)findViewById(R.id.Btt9);
        boutonPlus=(Button)findViewById(R.id.BttPlus);
        boutonMinus=(Button)findViewById(R.id.BttMinus);
        boutonMult=(Button)findViewById(R.id.BttMult);
        boutonEquals=(Button)findViewById(R.id.BttEquals);
        boutonDot=(Button)findViewById(R.id.BttDot);
        boutonOnOff=(Button)findViewById(R.id.onoffBtt);
        Screen=(TextView) findViewById(R.id.screen);
        boutonClear=(Button) findViewById(R.id.BttClear);

        bouton0.setOnClickListener(this);
        bouton1.setOnClickListener(this);
        bouton2.setOnClickListener(this);
        bouton3.setOnClickListener(this);
        bouton4.setOnClickListener(this);
        bouton5.setOnClickListener(this);
        bouton6.setOnClickListener(this);
        bouton7.setOnClickListener(this);
        bouton8.setOnClickListener(this);
        bouton9.setOnClickListener(this);
        boutonPlus.setOnClickListener(this);
        boutonMinus.setOnClickListener(this);
        boutonMult.setOnClickListener(this);
        boutonDot.setOnClickListener(this);
        boutonEquals.setOnClickListener(this);
        boutonOnOff.setOnClickListener(this);
        boutonClear.setOnClickListener(this);

        bouton0.setEnabled(false);
        bouton1.setEnabled(false);
        bouton2.setEnabled(false);
        bouton3.setEnabled(false);
        bouton4.setEnabled(false);
        bouton5.setEnabled(false);
        bouton6.setEnabled(false);
        bouton7.setEnabled(false);
        bouton8.setEnabled(false);
        bouton9.setEnabled(false);
        boutonPlus.setEnabled(false);
        boutonMinus.setEnabled(false);
        boutonMult.setEnabled(false);
        boutonDot.setEnabled(false);
        boutonEquals.setEnabled(false);
        boutonClear.setEnabled(false);

    }

    @Override
    public void onClick(View view) {
        if(view.getId()==R.id.onoffBtt ){
            if (started==false){
            bouton0.setEnabled(true);
            bouton1.setEnabled(true);
            bouton2.setEnabled(true);
            bouton3.setEnabled(true);
            bouton4.setEnabled(true);
            bouton5.setEnabled(true);
            bouton6.setEnabled(true);
            bouton7.setEnabled(true);
            bouton8.setEnabled(true);
            bouton9.setEnabled(true);
            boutonPlus.setEnabled(true);
            boutonMinus.setEnabled(true);
            boutonMult.setEnabled(true);
            boutonDot.setEnabled(true);
                boutonEquals.setEnabled(true);
                boutonClear.setEnabled(true);
            started=true;
            }
            else{
                bouton0.setEnabled(false);
                bouton1.setEnabled(false);
                bouton2.setEnabled(false);
                bouton3.setEnabled(false);
                bouton4.setEnabled(false);
                bouton5.setEnabled(false);
                bouton6.setEnabled(false);
                bouton7.setEnabled(false);
                bouton8.setEnabled(false);
                bouton9.setEnabled(false);
                boutonPlus.setEnabled(false);
                boutonMinus.setEnabled(false);
                boutonMult.setEnabled(false);
                boutonDot.setEnabled(false);
                boutonClear.setEnabled(false);
                started=false;
            }
        }

        if(view.getId()==R.id.Btt1){
         Screen.setText(Screen.getText()+"1");
     }
        if(view.getId()==R.id.Btt0){
            Screen.setText(Screen.getText()+"0");
        }
        if(view.getId()==R.id.Btt2){
            Screen.setText(Screen.getText()+"2");
        }
        if(view.getId()==R.id.Btt3){
            Screen.setText(Screen.getText()+"3");
        }
        if(view.getId()==R.id.Btt4){
            Screen.setText(Screen.getText()+"4");
        }
        if(view.getId()==R.id.Btt5){
            Screen.setText(Screen.getText()+"5");
        }
        if(view.getId()==R.id.Btt6){
            Screen.setText(Screen.getText()+"6");
        }
        if(view.getId()==R.id.Btt7){
            Screen.setText(Screen.getText()+"7");
        }
        if(view.getId()==R.id.Btt8){
            Screen.setText(Screen.getText()+"8");
        }
        if(view.getId()==R.id.Btt9){
            Screen.setText(Screen.getText()+"9");
        }
        if(view.getId()==R.id.BttClear){
            Screen.setText("");
        }

        if(view.getId()==R.id.BttPlus){
            op1=Float.parseFloat(Screen.getText().toString());
            operation="+";
            Screen.setText("");
        }
        if(view.getId()==R.id.BttMinus){
            op1=Float.parseFloat(Screen.getText().toString());
            operation="-";
            Screen.setText("");
        }
        if(view.getId()==R.id.BttMult){
            op1=Float.parseFloat(Screen.getText().toString());
            operation="*";
            Screen.setText("");
        }
        if(view.getId()==R.id.BttEquals){
            op2=Float.parseFloat(Screen.getText().toString());
            if (operation.equals("+"))
                Screen.setText(String.valueOf(op1+op2));
            else if (operation.equals("-"))
                Screen.setText(String.valueOf(op1-op2));
            else if (operation.equals("*"))
                Screen.setText(String.valueOf(op1*op2));



        }

    }
}