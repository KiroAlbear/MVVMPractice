package com.example.administrator.mvvmpractice;

import android.databinding.DataBindingUtil;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.example.administrator.mvvmpractice.Model.NumbersStorage;
import com.example.administrator.mvvmpractice.ViewModel.Calculations;
import com.example.administrator.mvvmpractice.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

   Calculations calculations;
    TextView num1text;
    TextView num2text;
    Button button;
     private ActivityMainBinding activityMainBinding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        activityMainBinding = DataBindingUtil.setContentView(this,R.layout.activity_main);

        calculations = new Calculations();


        activityMainBinding.setResult(calculations);


    }



}
