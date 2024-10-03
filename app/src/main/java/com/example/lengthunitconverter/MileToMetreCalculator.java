package com.example.lengthunitconverter;

public class MileToMetreCalculator implements Calculator {
    @Override
    public double times(double fromQuantity) {
        return fromQuantity * 1609.34;
    }
}
