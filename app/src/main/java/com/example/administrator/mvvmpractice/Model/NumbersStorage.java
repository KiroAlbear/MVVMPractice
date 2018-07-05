package com.example.administrator.mvvmpractice.Model;

import android.databinding.BaseObservable;

import java.util.Observable;

public class NumbersStorage extends Observable{
    String num1;
    String num2;

    public NumbersStorage(String num1, String num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

    public String getNum1() {
        return num1;
    }

    public String getNum2() {
        return num2;
    }
}
