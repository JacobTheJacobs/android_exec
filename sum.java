package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

     EditText number1;
     EditText number2;
     Button sum;
     TextView result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        number1 =  findViewById(R.id.num1);
        number2 =  findViewById(R.id.num2);
        sum =  findViewById(R.id.add);
        result= findViewById(R.id.result);
    }

    public void sum(View view){

        if((number1.getText().length()>0) && (number2.getText().length()>0))
        {
            int oper1 = Integer.parseInt(number1.getText().toString());
            int oper2 = Integer.parseInt(number2.getText().toString());
            int calc = oper1 + oper2;
            //calc res
            result.setText(Integer.toString(calc));
        }
        //if one of the number is null
        else{
            
            if(number1.getText().length()>0 )
            {
                 result.setText(number1.getText());

            }else if (number2.getText().length()>0){

                result.setText(number2.getText());

            }else{
                result.setText(0);
            }

        }
    }


}


<?xml version="1.0" encoding="utf-8"?>
<LinearLayout xmlns:android="http://schemas.android.com/apk/res/android"
    xmlns:app="http://schemas.android.com/apk/res-auto"
    xmlns:tools="http://schemas.android.com/tools"
    android:layout_width="fill_parent"
    android:layout_height="fill_parent"
    android:orientation="vertical"
    android:gravity="center"
    android:weightSum="1"
    tools:context=".MainActivity">


    <TextView
        android:text="Sum Some Num"
        android:layout_width="match_parent"
        android:layout_height="30dp"
        android:gravity="center_horizontal"
        android:textColorLink="?android:attr/editTextColor"
        android:fontFamily="casual"
        android:textSize="24sp"
   />

    <EditText
        android:layout_width="78dp"
        android:layout_height="wrap_content"
        android:inputType="number"
        android:ems="10"
        android:id="@+id/num1"
        android:textSize="18sp"
        android:gravity="center_horizontal"
        android:layout_marginBottom="5dp"
        android:visibility="visible" />

    <TextView
        android:layout_width="match_parent"
        android:layout_height="40dp"
        android:background="#F1CE88"
        android:fontFamily="casual"
        android:gravity="center_horizontal"
        android:text="+"
        android:textColor="#FFFFFF"
        android:textSize="30sp" />


    <EditText
        android:layout_width="78dp"
        android:layout_height="wrap_content"
        android:inputType="number"
        android:ems="10"
        android:id="@+id/num2"
        android:textSize="18sp"
        android:gravity="center_horizontal"
        android:elevation="1dp" />


    <Button
        android:id="@+id/add"
        android:layout_width="118dp"
        android:layout_height="wrap_content"
        android:layout_weight="0.03"
        android:text="="
        android:onClick="sum"/>


    <TextView
        android:text="Result"
        android:layout_width="match_parent"
        android:layout_height="30dp"
        android:gravity="center_horizontal"
        android:textColorLink="?android:attr/editTextColor"
        android:fontFamily="casual"
        android:textSize="24sp"
        />

    <EditText
        android:layout_width="match_parent"
        android:layout_height="wrap_content"
        android:inputType="number"
        android:ems="10"
        android:id="@+id/result"
        android:textSize="18sp"
        android:text="0.00"
        android:gravity="center_horizontal" />


</LinearLayout>
