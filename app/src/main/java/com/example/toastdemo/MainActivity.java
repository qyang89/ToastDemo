package com.example.toastdemo;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;
import android.util.Log;




import androidx.appcompat.app.AppCompatActivity;


import static com.example.toastdemo.R.id.butt_0;
import static com.example.toastdemo.R.id.display;

import com.example.toastdemo.MainActivity;
import com.example.toastdemo.R;

import static com.example.toastdemo.R.id.butt_0;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = MainActivity.class.getSimpleName();
    // Declare our variables
    Button butt_0, butt_1, butt_2, butt_3, butt_4, butt_5, butt_6, butt_7, butt_8, butt_9, butt_dot, butt_equal, butt_add, butt_sub, butt_multiply, butt_negate, butt_clear, butt_percent, butt_divide;
    TextView display;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Initialize our variables
        butt_0 = findViewById(R.id.butt_0);
        butt_1 = findViewById(R.id.butt_1);
        butt_2 = findViewById(R.id.butt_2);
        butt_3 = findViewById(R.id.butt_3);
        butt_4 = findViewById(R.id.butt_4);
        butt_5 = findViewById(R.id.butt_5);
        butt_6 = findViewById(R.id.butt_6);
        butt_7 = findViewById(R.id.butt_7);
        butt_8 = findViewById(R.id.butt_8);
        butt_9 = findViewById(R.id.butt_9);
        butt_dot = findViewById(R.id.butt_dot);
        butt_equal = findViewById(R.id.butt_equal);
        butt_sub = findViewById(R.id.butt_sub);
        butt_add = findViewById(R.id.butt_add);
        butt_multiply = findViewById(R.id.butt_multiply);
        butt_clear = findViewById(R.id.butt_clear);
        butt_negate = findViewById(R.id.butt_negate);
        butt_percent = findViewById(R.id.butt_percent);
        butt_divide = findViewById(R.id.butt_divide);

        display = findViewById(R.id.display);


        // First way to do onClick Listener
//        butt_0.setOnClickListener(new View.OnClickListener() {  //why is this red?
//            @Override
//            public void onClick(View view) {
//                display.append("1");
//                Toast.makeText(MainActivity.this, "Zero", Toast.LENGTH_SHORT).show();
//            }
//        });

        butt_0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                display.append("0");
                Toast.makeText(MainActivity.this, "Zero", Toast.LENGTH_SHORT).show();
            }
        });

        butt_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                display.append("1");
                Toast.makeText(MainActivity.this, "One", Toast.LENGTH_SHORT).show();
            }
        });

        butt_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                display.append("2");
                Toast.makeText(MainActivity.this, "Two", Toast.LENGTH_SHORT).show();
            }
        });

        butt_3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                display.append("3");
                Toast.makeText(MainActivity.this, "Three", Toast.LENGTH_SHORT).show();
            }
        });

        butt_4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                display.append("4");
                Toast.makeText(MainActivity.this, "Four", Toast.LENGTH_SHORT).show();
            }
        });

        butt_5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                display.append("5");
                Toast.makeText(MainActivity.this, "Five", Toast.LENGTH_SHORT).show();
            }
        });

        butt_6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                display.append("6");
                Toast.makeText(MainActivity.this, "Six", Toast.LENGTH_SHORT).show();
            }
        });

        butt_7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                display.append("7");
                Toast.makeText(MainActivity.this, "Seven", Toast.LENGTH_SHORT).show();
            }
        });

        butt_8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                display.append("8");
                Toast.makeText(MainActivity.this, "Eight", Toast.LENGTH_SHORT).show();
            }
        });

        butt_9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                display.append("9");
                Toast.makeText(MainActivity.this, "Nine", Toast.LENGTH_SHORT).show();
            }
        });

        butt_dot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                display.append(".");
                Toast.makeText(MainActivity.this, "Dot", Toast.LENGTH_SHORT).show();
            }
        });

        butt_equal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                display.append("=");
                Toast.makeText(MainActivity.this, "Equal", Toast.LENGTH_SHORT).show();
            }
        });

        butt_add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                display.append("+");
                Toast.makeText(MainActivity.this, "Add", Toast.LENGTH_SHORT).show();
            }
        });

        butt_sub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                display.append("-");
                Toast.makeText(MainActivity.this, "Sub", Toast.LENGTH_SHORT).show();
            }
        });

        butt_multiply.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                display.append("X");
                Toast.makeText(MainActivity.this, "multiply", Toast.LENGTH_SHORT).show();
            }
        });

        butt_clear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                display.append("");
                Toast.makeText(MainActivity.this, "Clear", Toast.LENGTH_SHORT).show();
            }
        });

        butt_negate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                display.append("+/-");
                Toast.makeText(MainActivity.this, "Negate", Toast.LENGTH_SHORT).show();
            }
        });

        butt_percent.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                display.append("%");
                Toast.makeText(MainActivity.this, "Percent", Toast.LENGTH_SHORT).show();
            }
        });

        butt_divide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                display.append("/");
                Toast.makeText(MainActivity.this, "Divide", Toast.LENGTH_SHORT).show();
            }
        });


        // Second way to do onClick Listener
        // first implements View.OnClickListener on the class
        // override the required onClick method
        // set the variables onClickListener to this
        // btn1.setOnClickListener(this);
        //btn9.setOnClickListener(this);
    }


    @Override
    protected void onStart() {
        super.onStart();
        Log.d(TAG, "onStart()");
        Toast.makeText(MainActivity.this, "onStart", Toast.LENGTH_SHORT).show();

    }


    @Override
    protected void onResume() {
        super.onResume();
        Log.d(TAG, "onResume");
        Toast.makeText(MainActivity.this, "onResume", Toast.LENGTH_SHORT).show();

    }


    @Override
    protected void onPause() {
        super.onPause();
        Log.d(TAG, "onPause");
        Toast.makeText(MainActivity.this, "onPause", Toast.LENGTH_SHORT).show();

    }


    @Override
    protected void onStop() {
        super.onStop();
        Log.d(TAG, "onStop");
        Toast.makeText(MainActivity.this, "onStop", Toast.LENGTH_SHORT).show();

    }



    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d(TAG, "onRestart");
        Toast.makeText(MainActivity.this, "onRestart", Toast.LENGTH_SHORT).show();

    }



    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d(TAG, "onDestroy");
        Toast.makeText(MainActivity.this, "onDestroy", Toast.LENGTH_SHORT).show();

    }

    //part of second way to do onClick Listener
//    @Override
//    public void onClick(View view) {
//        switch (view.getId()) {
//            case R.id.butt_0:
//                display.append("0");
//                break;
//            case R.id.butt_1:
//                display.append("1");
//                break;
//            case R.id.butt_2:
//                display.setText("2");
//                break;
//            case R.id.butt_3:
//                display.append("3");
//                break;
//            case R.id.butt_4:
//                display.append("4");
//                break;
//            case R.id.butt_5:
//                display.setText("5");
//                break;
//            case R.id.butt_6:
//                display.append("6");
//                break;
//            case R.id.butt_7:
//                display.append("7");
//                break;
//            case R.id.butt_8:
//                display.setText("8");
//                break;
//            case R.id.butt_9:
//                display.append("9");
//                break;
//            case R.id.butt_dot:
//                display.append(".");
//                break;
//            case R.id.butt_sub:
//                display.setText("-");
//                break;
//            case R.id.butt_add:
//                display.append("+");
//                break;
//            case R.id.butt_multiply:
//                display.append("x");
//                break;
//            case R.id.butt_clear:
//                display.setText("");
//                break;
//            case R.id.butt_negate:
//                display.append("+/-");
//                break;
//            case R.id.butt_percent:
//                display.append("%");
//                break;
//            case R.id.butt_divide:
//                display.setText("/");
//                break;
//
//        }
//    }


//    public void clickZero(View view) {
//        Log.d(TAG, "clickZero");
//      String textDisplay = display.getText().toString();
//        display.setText(textDisplay + "0");
//    display.append("0");
//    }
//
//    public void clickOne(View view) {
//        Log.d(TAG, "clickOne");
//
//        display.append("1");
//        if (op.isEmpty()) {
//            num1 = Integer.parseInt(display.getText().toString());
//        }
//        else{
//            num2 = Integer.parseInt(display.getText().toString());
//
//        }
//    }
//
//
//
//    public void clickAdd(View view){
//        Log.d(TAG, "clickAdd");
//        if(op.isEmpty()){
//            op="+";
//        }
//      else{
//          clickEqual(view);
//        }
//    }
//
//
//    public void clickEqual(View view){  //
//        Log.d(TAG, "clickEqual");
//        int total = 0;
//            switch (op) {
//                case "+":
//                   total =num1+num2;
//                   break;
//                case "-":
//                    total =num1-num2;
//                    break;
//
//
//            }
//            display.setText(String.valueOf(total));
//            op = "0";
//            num1=total;
//            num2=0;
//    }

}
