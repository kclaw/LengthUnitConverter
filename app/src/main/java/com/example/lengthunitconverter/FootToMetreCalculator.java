package com.example.lengthunitconverter;

public class FootToMetreCalculator implements Calculator{
    @Override
    public double times(double fromQuantity) {
        return fromQuantity * 0.3048;
    }
}
