package com.example.lengthunitconverter;

public class ConverterAdapter extends Converter{

    public ConverterAdapter(double fromQuantity, String fromUnit, String toUnit){
        this.setFromQuantity(fromQuantity);
        this.setFromUnit(fromUnit);
        this.setToUnit(toUnit);
    }

    double generateResult(){
        return super.generateResult();
    }
}
