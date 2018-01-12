package com.example.salis.lat_calculator;

import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.InputType;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private Button one;
    private Button two;
    private Button three;
    private Button four;
    private Button five;
    private Button six;
    private Button seven;
    private Button eight;
    private Button nine;
    private Button zero;
    private Button clear;
    private Button del;
    private FloatingActionButton balance_result;
    private TextView income;
    private TextView outcome;
    private TextView balance;

    int num1,num2;
    String value = "1", str = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        SetupUIViews();

        income.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {
                value = "1";
                income.setInputType(InputType.TYPE_NULL);
                return false;
            }
        });

        outcome.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {
                value = "2";
                outcome.setInputType(InputType.TYPE_NULL);
                return false;
            }
        });

        income.setOnClickListener(new View.OnClickListener() {
            @Override

            public void onClick(View view) {
                one.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        income.setText(income.getText().toString() + "1");
                    }
                });

                two.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        income.setText(income.getText().toString() + "2");
                    }
                });

                three.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        income.setText(income.getText().toString() + "3");
                    }
                });

                four.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        income.setText(income.getText().toString() + "4");
                    }
                });

                five.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        income.setText(income.getText().toString() + "5");
                    }
                });

                six.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        income.setText(income.getText().toString() + "6");
                    }
                });

                seven.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        income.setText(income.getText().toString() + "7");
                    }
                });

                eight.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        income.setText(income.getText().toString() + "8");
                    }
                });

                nine.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        income.setText(income.getText().toString() + "9");
                    }
                });
                zero.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        income.setText(income.getText().toString() + "0");
                    }
                });
            }
        });

        outcome.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                one.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        income.setText(income.getText().toString() + "1");
                    }
                });

                two.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        income.setText(income.getText().toString() + "2");
                    }
                });

                three.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        income.setText(income.getText().toString() + "3");
                    }
                });

                four.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        income.setText(income.getText().toString() + "4");
                    }
                });

                five.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        income.setText(income.getText().toString() + "5");
                    }
                });

                six.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        income.setText(income.getText().toString() + "6");
                    }
                });

                seven.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        income.setText(income.getText().toString() + "7");
                    }
                });

                eight.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        income.setText(income.getText().toString() + "8");
                    }
                });

                nine.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        income.setText(income.getText().toString() + "9");
                    }
                });
                zero.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        income.setText(income.getText().toString() + "0");
                    }
                });
            }
        });

        balance_result.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                num1 = Integer.parseInt(income.getText().toString());
                num2 = Integer.parseInt(outcome.getText().toString());

                if (num1 == num2){
                    balance.setText("Result balance");
                }
                else { balance.setText("Result not balance");}
            }
        });

        clear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                income.setText("");
                outcome.setText("");
            }
        });

        del.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (value == "1"){
                    int displayLength = income.length();
                    if (displayLength > 0){
                        income.setText(income.getText().toString().substring(0,displayLength - 1));
                    } else if (value == "2"){
                        displayLength = outcome.length();
                        if (displayLength > 0){
                            outcome.setText(outcome.getText().toString().substring(0,displayLength - 1));
                        }
                    }
                }
            }
        });
    }

    private void SetupUIViews(){
        one = (Button)findViewById(R.id.btn1);
        two = (Button)findViewById(R.id.btn2);
        three = (Button)findViewById(R.id.btn3);
        four = (Button)findViewById(R.id.btn4);
        five = (Button)findViewById(R.id.btn5);
        six = (Button)findViewById(R.id.btn6);
        seven = (Button)findViewById(R.id.btn);
        eight = (Button)findViewById(R.id.btn8);
        nine = (Button)findViewById(R.id.btn9);
        zero = (Button)findViewById(R.id.btn0);
        clear = (Button)findViewById(R.id.btnClear);
        del = (Button)findViewById(R.id.BtnDel);
        income = (TextView)findViewById(R.id.income);
        outcome = (TextView)findViewById(R.id.outcome);
        balance = (TextView)findViewById(R.id.balance);
        balance_result = (FloatingActionButton)findViewById(R.id.float_btn);
    }
}
