package com.example.lengthunitconverter;

public class MileToFootCalculator implements Calculator{
    @Override
    public double times(double fromQuantity) {
        return fromQuantity * 5280;
    }
}
