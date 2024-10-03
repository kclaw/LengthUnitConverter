package com.example.lengthunitconverter;

public class FootToMileCalculator implements Calculator{
    @Override
    public double times(double fromQuantity) {
        return fromQuantity * 0.000189394;
    }
}
