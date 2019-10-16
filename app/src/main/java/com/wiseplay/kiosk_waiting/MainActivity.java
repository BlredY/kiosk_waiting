package com.wiseplay.kiosk_waiting;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {

    private Button btn_number1,btn_number2,btn_number3,btn_number4,btn_number5,btn_number6,btn_number7,btn_number8,btn_number9,btn_number0;
    private Button btn_numberC,btn_numberE;

    private TextView tv_wait1,tv_wait2;
    private TextView tv_n1,tv_n2,tv_n3;
    private EditText et_member1;
    private EditText et_number1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn_number1 = (Button)findViewById(R.id.btn_number1);
        btn_number2 = (Button)findViewById(R.id.btn_number2);
        btn_number3 = (Button)findViewById(R.id.btn_number3);
        btn_number4 = (Button)findViewById(R.id.btn_number4);
        btn_number5 = (Button)findViewById(R.id.btn_number5);
        btn_number6 = (Button)findViewById(R.id.btn_number6);
        btn_number7 = (Button)findViewById(R.id.btn_number7);
        btn_number8 = (Button)findViewById(R.id.btn_number8);
        btn_number9 = (Button)findViewById(R.id.btn_number9);
        btn_number0 = (Button)findViewById(R.id.btn_number0);

        btn_numberC = (Button)findViewById(R.id.btn_numberC);
        btn_numberE = (Button)findViewById(R.id.btn_numberE);

        tv_wait1 = (TextView)findViewById(R.id.tv_wait1);
        tv_wait2 = (TextView)findViewById(R.id.tv_wait2);

        tv_n1 = (TextView)findViewById(R.id.tv_n1);
        tv_n2 = (TextView)findViewById(R.id.tv_n2);
        tv_n3 = (TextView)findViewById(R.id.tv_n3);

        et_member1 = (EditText)findViewById(R.id.et_member1);
        et_number1 = (EditText)findViewById(R.id.et_number1);
        et_member1.setTextIsSelectable(true);
        et_number1.setTextIsSelectable(true);
        et_member1.setText("000");



//        et_member1.OnTouchListener(new View.OnTouchListener() {
//            @Override
//            public boolean onTouch(View v, MotionEvent event) {


        int isEtm = et_member1.getText().toString().length();

        if (isEtm < 3) {

            OnClickListener cm = new OnClickListener() {
                @Override
                public void onClick(View v) {
                    if (v == btn_number1) {
//                    if(isEtMember) {
//                        et_member1.setText(et_member1.getText().toString()+1);
//                    }else{z
                        et_member1.setText(et_member1.getText().toString() + 1);

                    } else if (v == btn_number2) {
                        et_member1.setText(et_member1.getText().toString() + 2);
                    } else if (v == btn_number3) {
                        et_member1.setText(et_member1.getText().toString() + 3);
                    } else if (v == btn_number4) {
                        et_member1.setText(et_member1.getText().toString() + 4);
                    } else if (v == btn_number5) {
                        et_member1.setText(et_member1.getText().toString() + 5);
                    } else if (v == btn_number6) {
                        et_member1.setText(et_member1.getText().toString() + 6);
                    } else if (v == btn_number7) {
                        et_member1.setText(et_member1.getText().toString() + 7);
                    } else if (v == btn_number8) {
                        et_member1.setText(et_member1.getText().toString() + 8);
                    } else if (v == btn_number9) {
                        et_member1.setText(et_member1.getText().toString() + 9);
                    } else if (v == btn_number0) {
                        et_member1.setText(et_member1.getText().toString() + 0);
                    } else if (v == btn_numberC) {
                        et_member1.setText("");
                        et_number1.setText("");
                        return;
                    }
                }
            };

            btn_number1.setOnClickListener(cm);
            btn_number2.setOnClickListener(cm);
            btn_number3.setOnClickListener(cm);
            btn_number4.setOnClickListener(cm);
            btn_number5.setOnClickListener(cm);
            btn_number6.setOnClickListener(cm);
            btn_number7.setOnClickListener(cm);
            btn_number8.setOnClickListener(cm);
            btn_number9.setOnClickListener(cm);
            btn_number0.setOnClickListener(cm);
            btn_numberC.setOnClickListener(cm);

            return;

        } else {

        OnClickListener cn = new OnClickListener() {
            @Override
            public void onClick(View vv) {
                if(vv==btn_number1){
                    et_number1.setText(et_number1.getText().toString()+1);
                }
                else if(vv==btn_number2){
                    et_number1.setText(et_number1.getText().toString()+2);
                }
                else if(vv==btn_number3){
                    et_number1.setText(et_number1.getText().toString()+3);
                }
                else if(vv==btn_number4){
                    et_number1.setText(et_number1.getText().toString()+4);
                }
                else if(vv==btn_number5){
                    et_number1.setText(et_number1.getText().toString()+5);
                }
                else if(vv==btn_number6){
                    et_number1.setText(et_number1.getText().toString()+6);
                }
                else if(vv==btn_number7){
                    et_number1.setText(et_number1.getText().toString()+7);
                }
                else if(vv==btn_number8){
                    et_number1.setText(et_number1.getText().toString()+8);
                }
                else if(vv==btn_number9){
                    et_number1.setText(et_number1.getText().toString()+9);
                }
                else if(vv==btn_number0){
                    et_number1.setText(et_number1.getText().toString()+0);
                }
                else if(vv==btn_numberC){
                    et_member1.setText("");
                    et_number1.setText("");
                    return;
                }
            }
        };


        btn_number1.setOnClickListener(cn);
        btn_number2.setOnClickListener(cn);
        btn_number3.setOnClickListener(cn);
        btn_number4.setOnClickListener(cn);
        btn_number5.setOnClickListener(cn);
        btn_number6.setOnClickListener(cn);
        btn_number7.setOnClickListener(cn);
        btn_number8.setOnClickListener(cn);
        btn_number9.setOnClickListener(cn);
        btn_number0.setOnClickListener(cn);
        btn_numberC.setOnClickListener(cn);

        return;
    }}
}
