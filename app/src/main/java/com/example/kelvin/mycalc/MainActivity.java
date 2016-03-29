package com.example.kelvin.mycalc;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;

// additonal imports
import android.widget.Button;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {

    public String sign = "";
    public Double tempDouble, tempDouble2;
    public boolean done=false;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Buttons 0-9
        Button button0 = (Button) findViewById(R.id.button0);
        Button button1 = (Button) findViewById(R.id.button1);
        Button button2 = (Button) findViewById(R.id.button2);
        Button button3 = (Button) findViewById(R.id.button3);
        Button button4 = (Button) findViewById(R.id.button4);
        Button button5 = (Button) findViewById(R.id.button5);
        Button button6 = (Button) findViewById(R.id.button6);
        Button button7 = (Button) findViewById(R.id.button7);
        Button button8 = (Button) findViewById(R.id.button8);
        Button button9 = (Button) findViewById(R.id.button9);

        // Buttons Clear and Equals
        Button buttonC = (Button) findViewById(R.id.buttonC);
        final Button buttonE = (Button) findViewById(R.id.buttonE);

        // Buttons Add,Subtract, Divide, Multiply
        Button buttonA = (Button) findViewById(R.id.buttonA);
        Button buttonS = (Button) findViewById(R.id.buttonS);
        Button buttonM = (Button) findViewById(R.id.buttonM);
        Button buttonD = (Button) findViewById(R.id.buttonD);

        // Button 0 event handler
        button0.setOnClickListener(
                //Button 0 interface
                new Button.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        TextView input = (TextView)findViewById(R.id.editText);
                        if (done) {
                            input.setText("");
                            done = false;
                        }
                        else input.append("0");
                    }
                }
        );

        button1.setOnClickListener(
                //Button 0 interface
                new Button.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        TextView input = (TextView)findViewById(R.id.editText);
                        if (done) {
                            input.setText("");
                            done = false;
                        }
                        input.append("1");
                    }
                }
        );

        button2.setOnClickListener(
                //Button 0 interface
                new Button.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        TextView input = (TextView)findViewById(R.id.editText);
                        if (done) {
                            input.setText("");
                            done = false;
                        }
                        input.append("2");
                    }
                }
        );

        button3.setOnClickListener(
                //Button 0 interface
                new Button.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        TextView input = (TextView)findViewById(R.id.editText);
                        if (done) {
                            input.setText("");
                            done = false;
                        }
                        input.append("3");
                    }
                }
        );

        button4.setOnClickListener(
                //Button 0 interface
                new Button.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        TextView input = (TextView)findViewById(R.id.editText);
                        if (done) {
                            input.setText("");
                            done = false;
                        }
                        input.append("4");
                    }
                }
        );

        button5.setOnClickListener(
                //Button 0 interface
                new Button.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        TextView input = (TextView)findViewById(R.id.editText);
                        if (done) {
                            input.setText("");
                            done = false;
                        }
                        input.append("5");
                    }
                }
        );

        button6.setOnClickListener(
                //Button 0 interface
                new Button.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        TextView input = (TextView)findViewById(R.id.editText);
                        if (done) {
                            input.setText("");
                            done = false;
                        }
                        input.append("6");
                    }
                }
        );

        button7.setOnClickListener(
                //Button 0 interface
                new Button.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        TextView input = (TextView)findViewById(R.id.editText);
                        if (done) {
                            input.setText("");
                            done = false;
                        }
                        input.append("7");
                    }
                }
        );

        button8.setOnClickListener(
                //Button 0 interface
                new Button.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        TextView input = (TextView)findViewById(R.id.editText);
                        if (done) {
                            input.setText("");
                            done = false;
                        }
                        input.append("8");
                    }
                }
        );

        button9.setOnClickListener(
                //Button 0 interface
                new Button.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        TextView input = (TextView)findViewById(R.id.editText);
                        if (done) {
                            input.setText("");
                            done = false;
                        }
                        input.append("9");
                    }
                }
        );

        buttonC.setOnClickListener(
                //Button 0 interface
                new Button.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        TextView input = (TextView)findViewById(R.id.editText);
                        TextView signText = (TextView)findViewById(R.id.editText2);
                        TextView resultText = (TextView)findViewById(R.id.editText3);
                        input.setText("");
                        signText.setText("");
                        resultText.setText("");
                        sign="";
                        tempDouble=0.0;
                        tempDouble2=0.0;
                        done = false;
                    }
                }
        );

        buttonA.setOnClickListener(
                //Button 0 interface
                new Button.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        TextView input = (TextView)findViewById(R.id.editText);
                        TextView signText = (TextView)findViewById(R.id.editText2);
                        TextView resultText = (TextView)findViewById(R.id.editText3);
                        try {
                            tempDouble = Double.parseDouble(input.getText().toString());
                            resultText.setText(input.getText());
                        } catch (NumberFormatException e) {
                            try {
                                tempDouble = Double.parseDouble(resultText.getText().toString());
                            } catch (NumberFormatException e1) {
                                return;
                            }
                        }
//                        buttonE.performClick();
                        input.setText("");
                        sign = "+" ;

                        signText.setText("+");
                    }
                }
        );

        buttonS.setOnClickListener(
                //Button 0 interface
                new Button.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        TextView input = (TextView)findViewById(R.id.editText);
                        TextView signText = (TextView)findViewById(R.id.editText2);
                        TextView resultText = (TextView)findViewById(R.id.editText3);
                        try {
                            tempDouble = Double.parseDouble(input.getText().toString());
                            resultText.setText(input.getText());
                        } catch (NumberFormatException e) {
                            try {
                                tempDouble = Double.parseDouble(resultText.getText().toString());
                            } catch (NumberFormatException e1) {
                                return;
                            }
                        }
//                        if (sign.isEmpty()) tempDouble = getPreviousResult();
                        sign = "-" ;
                        input.setText("");
                        signText.setText("-");
                    }
                }
        );

        buttonM.setOnClickListener(
                //Button 0 interface
                new Button.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        TextView input = (TextView)findViewById(R.id.editText);
                        TextView signText = (TextView)findViewById(R.id.editText2);
                        TextView resultText = (TextView)findViewById(R.id.editText3);
                        try {
                            tempDouble = Double.parseDouble(input.getText().toString());
                            resultText.setText(input.getText());
                        } catch (NumberFormatException e) {
                            try {
                                tempDouble = Double.parseDouble(resultText.getText().toString());
                            } catch (NumberFormatException e1) {
                                return;
                            }
                        }
//                        if (sign.isEmpty()) tempDouble = getPreviousResult();
                        sign = "*" ;
                        input.setText("");
                        signText.setText("*");
                    }
                }
        );

        buttonD.setOnClickListener(
                //Button 0 interface
                new Button.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        TextView input = (TextView)findViewById(R.id.editText);
                        TextView signText = (TextView)findViewById(R.id.editText2);
                        TextView resultText = (TextView)findViewById(R.id.editText3);
                        try {
                            tempDouble = Double.parseDouble(input.getText().toString());
                            resultText.setText(input.getText());
                        } catch (NumberFormatException e) {
                            try {
                                tempDouble = Double.parseDouble(resultText.getText().toString());
                            } catch (NumberFormatException e1) {
                                return;
                            }
                        }
//                        if (sign.isEmpty()) tempDouble = getPreviousResult();
                        sign = "/" ;
                        input.setText("");
                        signText.setText("/");
                    }
                }
        );

        buttonE.setOnClickListener(
                //Button 0 interface
                new Button.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        TextView input = (TextView)findViewById(R.id.editText);
                        TextView signText = (TextView)findViewById(R.id.editText2);
                        TextView resultText = (TextView)findViewById(R.id.editText3);
                        Double res = 0.0;
                        try {
                            tempDouble2 = Double.parseDouble(input.getText().toString());
                        } catch (NumberFormatException e) {
                            return;
                        }

                        switch (sign) {
                            case "":
                                resultText.setText(input.getText());
                                input.setText("");
                                return;
                            case "+":
                                res = tempDouble + tempDouble2;
                                break;
                            case "-":
                                res = tempDouble - tempDouble2;
                                break;
                            case "*":
                                res = tempDouble * tempDouble2;
                                break;
                            case "/":
                                if (tempDouble2 == 0) {
                                    input.setText("Cannot Divide By Zero!");
                                } else {
                                    res = tempDouble / tempDouble2;
                                }
                                break;
                        }

                        input.setText("");
                        resultText.setText(Double.toString(res));
                        signText.setText("");
                        // reset the sign
                        sign = "";
                        done = true;
                        tempDouble = res;
                    }
                }
        );

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
//
//        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
//        fab.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
//                        .setAction("Action", null).show();
//            }
//        });


    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

//    public double getPreviousResult(){
//        double res=0.0;
//        TextView input = (TextView)findViewById(R.id.editText);
//        if (sign=="+") {
//            res = tempDouble+tempDouble2;
//        }
//        else if (sign=="-"){
//            res = tempDouble-tempDouble2;
//        }
//        else if (sign=="*"){
//            res = tempDouble*tempDouble2;
//        }
//        else if (sign=="/"){
//            if (tempDouble2==0){
//                input.setText("Cannot Divide By Zero!");
//            }
//            else {
//                res = tempDouble / tempDouble2;
//            }
//        }
//
//        tempDouble=0.0;
//        tempDouble2=0.0;
//        return res;
//    }
}
