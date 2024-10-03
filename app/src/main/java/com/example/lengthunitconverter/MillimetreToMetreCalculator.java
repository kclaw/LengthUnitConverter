package com.example.lengthunitconverter;

public class MillimetreToMetreCalculator implements Calculator {
    @Override
    public double times(double fromQuantity) {
        return fromQuantity * 0.001;
    }
}
