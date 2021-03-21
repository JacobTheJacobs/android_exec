package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private int mCounter = 0;
    Button IncBtn;
    Button DecBtn;
    TextView cntView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        IncBtn = (Button)findViewById(R.id.IncButton);
        DecBtn = (Button)findViewById(R.id.DecButton);
        cntView = (TextView)findViewById(R.id.counterView);
    }

    public void Inc(View view){

        mCounter++;
        cntView.setText(Integer.toString(mCounter));

    }

    public void Dec(View view){
        if(mCounter<=0){
            cntView.setText(":)");
        }else{
            mCounter--;
            cntView.setText(Integer.toString(mCounter));
        }


    }
}


---------------------------------------------------------------------------------------------------


<?xml version="1.0" encoding="utf-8"?>
<LinearLayout xmlns:android="http://schemas.android.com/apk/res/android"
    xmlns:app="http://schemas.android.com/apk/res-auto"
    xmlns:tools="http://schemas.android.com/tools"
    android:layout_width="fill_parent"
    android:layout_height="fill_parent"
    android:orientation="vertical"
    android:gravity="center"
    tools:context=".MainActivity">


    <TextView
        android:id="@+id/counterView"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:fontFamily="casual"
        android:scaleX="2"
        android:scaleY="2"
        android:text="0"
        android:textSize="30sp"
        app:layout_constraintBottom_toBottomOf="parent"
        app:layout_constraintLeft_toLeftOf="parent"
        app:layout_constraintRight_toRightOf="parent"
        app:layout_constraintTop_toTopOf="parent"
        app:layout_constraintVertical_bias="0.391" />

    <Button
        android:id="@+id/IncButton"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:backgroundTint="#8BC34A"
        android:fontFamily="casual"
        android:onClick="Inc"

        android:text="Increment" />

    <Button
        android:id="@+id/DecButton"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:backgroundTint="#E91E63"
        android:fontFamily="casual"
        android:onClick="Dec"
        android:text="Decrement" />


</LinearLayout>
