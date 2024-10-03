package com.example.lengthunitconverter;

public class MetreToFootCalculator implements Calculator{
    @Override
    public double times(double fromQuantity) {
        return fromQuantity * 3.28084;
    }
}
