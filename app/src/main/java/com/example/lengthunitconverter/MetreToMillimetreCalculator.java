package com.example.lengthunitconverter;

public class MetreToMillimetreCalculator implements Calculator{
    @Override
    public double times(double fromQuantity) {
        return fromQuantity * 1000;
    }
}
