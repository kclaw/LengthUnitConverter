package com.example.lengthunitconverter;

public class FootToMillimetreCalculator implements Calculator{
    @Override
    public double times(double fromQuantity) {
        return fromQuantity * 304.8;
    }
}
