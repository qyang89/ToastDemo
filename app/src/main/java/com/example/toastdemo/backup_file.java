//package com.example.toastdemo;
//
//import android.os.Bundle;
//import android.util.Log;
//import android.view.View;
//import android.widget.Button;
//import android.widget.Toast;
//
//import androidx.appcompat.app.AppCompatActivity;
//
//import static com.example.toastdemo.R.id.butt_0;
//import static com.example.toastdemo.R.id.display;
//
//public class MainActivity2 extends AppCompatActivity{ //implements View.OnClickListener{
//
////declare our variables, continue to display all buttons
// Button butt_1, butt_2, butt_3, butt_4, butt_5, butt_6, butt_7, butt_8, butt_9, butt_dot, butt_equal, butt_add, butt_sub, butt_multiply, butt_negate, butt_clear, butt_percent, butt_divide;
//
//
//    //john's method
////   TextView display;
////   int num1 = 0;
////   int num2 = 0;
////   String op = "";
//
//
//
//
//    //add the tag
//    private static final String TAG = MainActivity2.class.getSimpleName();
//
//    @Override
//    protected void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_main);
//
//        //initialize our variables, continue to initialize all buttons
//        butt_0 = findViewById(R.id.butt_0);
//        butt_1 = findViewById(R.id.butt_1);
//        butt_2 = findViewById(R.id.butt_2);
//        butt_3 = findViewById(R.id.butt_3);
//        butt_4 = findViewById(R.id.butt_4);
//        butt_5 = findViewById(R.id.butt_5);
//        butt_6 = findViewById(R.id.butt_6);
//        butt_7 = findViewById(R.id.butt_7);
//        butt_8 = findViewById(R.id.butt_8);
//        butt_9 = findViewById(R.id.butt_9);
//        butt_dot = findViewById(R.id.butt_dot);
//        butt_equal = findViewById(R.id.butt_equal);
//        butt_sub = findViewById(R.id.butt_sub);
//        butt_add = findViewById(R.id.butt_add);
//        butt_multiply = findViewById(R.id.butt_multiply);
//        butt_clear = findViewById(R.id.butt_clear);
//        butt_negate = findViewById(R.id.butt_negate);
//        butt_percent = findViewById(R.id.butt_percent);
//        butt_divide = findViewById(R.id.butt_divide);
//
//        display = findViewById(R.id.display);  //is this ok for display?
//
//
//
//        //first way to do onClick Listener
//        butt_0.setOnClickListener(new View.OnClickListener(); {
//            @Override
//            public void onClick(View view) {
//                display.append("0");
//                Toast.makeText(MainActivity2.this, "zero", Toast.LENGTH_SHORT).show();  //text reflects button value
//            }
//        }
//
//        butt_1.setOnClickListener(new View.OnClickListener(); {
//            @Override
//            public void onClick(View view) {
//                display.append("1");
//                Toast.makeText(MainActivity2.this, "one", Toast.LENGTH_SHORT).show();  //text reflects button value
//            }}
//
//
//        butt_2.setOnClickListener(new View.OnClickListener(); {
//            @Override
//            public void onClick(View view) {
//                display.append("2");
//                Toast.makeText(MainActivity2.this, "two", Toast.LENGTH_SHORT).show();  //text reflects button value
//            }}
//
//
//        butt_3.setOnClickListener(new View.OnClickListener(); {
//            @Override
//            public void onClick(View view) {
//                display.append("3");
//                Toast.makeText(MainActivity2.this, "three", Toast.LENGTH_SHORT).show();  //text reflects button value
//            }
//        }
//
//
//        butt_4.setOnClickListener(new View.OnClickListener(); {
//            @Override
//            public void onClick(View view) {
//                display.append("4");
//                Toast.makeText(MainActivity2.this, "four", Toast.LENGTH_SHORT).show();  //text reflects button value
//            }
//        }
//
//            butt_5.setOnClickListener(new View.OnClickListener(); {
//                @Override
//                public void onClick(View view) {
//                    display.append("1");
//                    Toast.makeText(MainActivity2.this, "one", Toast.LENGTH_SHORT).show();  //text reflects button value
//                }
//            }
//
//            butt_6.setOnClickListener(new View.OnClickListener(); {
//                @Override
//                public void onClick(View view) {
//                    display.append("6");
//                    Toast.makeText(MainActivity2.this, "six", Toast.LENGTH_SHORT).show();  //text reflects button value
//                }
//            }
//
//            butt_7.setOnClickListener(new View.OnClickListener(); {
//                @Override
//                public void onClick(View view) {
//                    display.append("7");
//                    Toast.makeText(MainActivity2.this, "seven", Toast.LENGTH_SHORT).show();  //text reflects button value
//                }
//            }
//
//            butt_8.setOnClickListener(new View.OnClickListener(); {
//                @Override
//                public void onClick(View view) {
//                    display.append("8");
//                    Toast.makeText(MainActivity2.this, "eight", Toast.LENGTH_SHORT).show();  //text reflects button value
//                }
//            }
//
//            butt_9.setOnClickListener(new View.OnClickListener(); {
//                @Override
//                public void onClick(View view) {
//                    display.append("9");
//                    Toast.makeText(MainActivity2.this, "nine", Toast.LENGTH_SHORT).show();  //text reflects button value
//                }
//            }
//
//            butt_dot.setOnClickListener(new View.OnClickListener(); {
//                @Override
//                public void onClick(View view) {
//                    display.append(".");
//                    Toast.makeText(MainActivity2.this, "dot", Toast.LENGTH_SHORT).show();  //text reflects button value
//                }
//            }
//
//            butt_equal.setOnClickListener(new View.OnClickListener(); {
//                @Override
//                public void onClick(View view) {
//                    display.append("=");
//                    Toast.makeText(MainActivity2.this, "equal", Toast.LENGTH_SHORT).show();  //text reflects button value
//                }
//            }
//
//            butt_add.setOnClickListener(new View.OnClickListener(); {
//                @Override
//                public void onClick(View view) {
//                    display.append("+");
//                    Toast.makeText(MainActivity2.this, "add", Toast.LENGTH_SHORT).show();  //text reflects button value
//                }
//            }
//
//
//            butt_sub.setOnClickListener(new View.OnClickListener(); {
//                @Override
//                public void onClick(View view) {
//                    display.append("-");
//                    Toast.makeText(MainActivity2.this, "sub", Toast.LENGTH_SHORT).show();  //text reflects button value
//                }
//            }
//
//            butt_multiply.setOnClickListener(new View.OnClickListener(); {
//                @Override
//                public void onClick(View view) {
//                    display.append("X");
//                    Toast.makeText(MainActivity2.this, "multiply", Toast.LENGTH_SHORT).show();  //text reflects button value
//                }
//            }
//
//            butt_clear.setOnClickListener(new View.OnClickListener();{
//                @Override
//                public void onClick(View view) {
//                    display.append("");
//                    Toast.makeText(MainActivity2.this, "clear", Toast.LENGTH_SHORT).show();  //text reflects button value
//                }
//            }
//
//            butt_negate.setOnClickListener(new View.OnClickListener(); {
//                @Override
//                public void onClick(View view) {
//                    display.append("+/-");
//                    Toast.makeText(MainActivity2.this, "negate", Toast.LENGTH_SHORT).show();  //text reflects button value
//                }
//
//            }
//
//            butt_percent.setOnClickListener(new View.OnClickListener(); {
//                @Override
//                public void onClick(View view) {
//                    display.append("%");
//                    Toast.makeText(MainActivity2.this, "percent", Toast.LENGTH_SHORT).show();  //text reflects button value
//                }
//            }
//
//
//            butt_divide.setOnClickListener(new View.OnClickListener(); {
//                @Override
//                public void onClick(View view) {
//                    display.append("/");
//                    Toast.makeText(MainActivity2.this, "divide", Toast.LENGTH_SHORT).show();  //text reflects button value
//                }
//            }
//
//
//        //second way to do onClick listener
//      //  change13.setOnClickListener(this);
//      //  change14.setOnClickListener(this);
//
//
//       // Toast.makeText(getApplicationContext(), "i am oncreate, I am a 3 second toast", Toast.LENGTH_LONG).show();
//
//
//
//
//    }
//
//
//    @Override
//    protected void onStart() {
//        super.onStart();
//        Log.d(TAG, "onStart");
//
//    //    Toast.makeText(getApplicationContext(), "i am onstart", Toast.LENGTH_SHORT).show();
//
//
//
//    }
//
//    @Override
//    protected void onResume() {
//        super.onResume();
//       // Toast.makeText(getApplicationContext(), "i am onresume", Toast.LENGTH_SHORT).show();
//
//
//    }
//
//    @Override
//    public void onClick(View view){   //establish what we care about, continue to list all buttons
//        switch (view.getId()){
//            case butt_0:
//                display.append("0");
//                break;
//            case R.id.butt_1:
//                display.append("1");
//                break;
//            case R.id.butt_2:  //button
//                display.append("2");  //action of button
//                break;
//            case R.id.butt_3:  //button
//                display.append("3");  //action of button
//                break;
//            case R.id.butt_4:  //button
//                display.append("4");  //action of button
//                break;
//            case R.id.butt_5:  //button
//                display.append("5");  //action of button
//                break;
//            case R.id.butt_6:  //button
//                display.append("6");  //action of button
//                break;
//            case R.id.butt_7:  //button
//                display.append("7");  //action of button
//                break;
//            case R.id.butt_8:  //button
//                display.append("8");  //action of button
//                break;
//            case R.id.butt_9:  //button
//                display.append("9");  //action of button
//                break;
//            case R.id.butt_dot:  //button
//                display.append(".");  //action of button
//                break;
//            case R.id.butt_add:  //button
//                display.append("+");  //action of button
//                break;
//            case R.id.butt_sub:  //button
//                display.append("-");  //action of button
//                break;
//            case R.id.butt_multiply:  //button
//                display.append("X");  //action of button
//                break;
//            case R.id.butt_clear:  //button
//                display.append("");  //action of button
//                break;
//            case R.id.butt_negate:  //button
//                display.append("+/-");  //action of button
//                break;
//            case R.id.butt_percent:  //button
//                display.append("%");  //action of button
//                break;
//            case R.id.butt_divide:  //button
//                display.append("/");  //action of button
//                break;
//
//
//        }
//    }
//
//    @Override
//    protected void onPause() {
//        super.onPause();
//     //   Toast.makeText(getApplicationContext(), "i am pause", Toast.LENGTH_SHORT).show();
//
//    }
//
//    @Override
//    protected void onStop() {
//        super.onStop();
//      //  Toast.makeText(getApplicationContext(), "i am onstop", Toast.LENGTH_SHORT).show();
//
//    }
//
//    @Override
//    protected void onRestart() {
//        super.onRestart();
//     //   Toast.makeText(getApplicationContext(), "i am onrestart", Toast.LENGTH_SHORT).show();
//
//    }
//
//    @Override
//    protected void onDestroy() {
//
//        super.onDestroy();
//        Log.d(TAG, "onDestroy");
//
//    }
//
////john's calculator
////    public void clickZero(View view) {
////        Log.d(TAG, "clickZero");
//////        String textDisplay = display.getText().toString();
//////        display.setText(textDisplay + "0");
////    display.append("0");
////    }
////
////    public void clickOne(View view) {
////        Log.d(TAG, "clickOne");
////
////        display.append("1");
////        if (op.isEmpty()) {
////            num1 = Integer.parseInt(display.getText().toString());
////        }
////        else{
////            num2 = Integer.parseInt(display.getText().toString());
////
////        }
////    }
////
////
////
////    public void clickAdd(View view){
////        Log.d(TAG, "clickAdd");
////        if(op.isEmpty()){
////            op="+";
////        }
////      else{
////          clickEqual(view);
////        }
////    }
////
////
////    public void clickEqual(View view){  //
////        Log.d(TAG, "clickEqual");
////        int total = 0;
////            switch (op) {
////                case "+":
////                   total =num1+num2;
////                   break;
////                case "-":
////                    total =num1-num2;
////                    break;
////
////
////            }
////            display.setText(String.valueOf(total));
////            op = "0";
////            num1=total;
////            num2=0;
////    }
//
//}
