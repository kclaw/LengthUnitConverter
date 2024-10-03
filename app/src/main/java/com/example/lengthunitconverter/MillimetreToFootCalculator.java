package com.example.lengthunitconverter;

public class MillimetreToFootCalculator implements Calculator {
    @Override
    public double times(double fromQuantity) {
        return fromQuantity * 0.00328084;
    }
}
