package com.example.lengthunitconverter;

public class MileToMillimetreCalculator implements Calculator{
    @Override
    public double times(double fromQuantity) {
        return fromQuantity * 1.609e+6;
    }
}
