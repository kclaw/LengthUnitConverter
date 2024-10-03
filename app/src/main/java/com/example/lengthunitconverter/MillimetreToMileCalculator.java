package com.example.lengthunitconverter;

public class MillimetreToMileCalculator implements Calculator {
    @Override
    public double times(double fromQuantity) {
        return fromQuantity * 6.2137e-7;
    }
}
