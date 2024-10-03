package com.example.lengthunitconverter;

public class MetreToMilesCalculator implements Calculator{
    @Override
    public double times(double fromQuantity) {
      return fromQuantity * 0.000621371;
    }
}
