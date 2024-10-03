package com.example.lengthunitconverter;

public class Converter {
    double fromQuantity;
    String fromUnit;
    double toQuantity;
    String toUnit;

    double generateResult(){
        switch(fromUnit){
            case "metre":
                if (toUnit.equals("millimetre"))
                    this.toQuantity = new MetreToMillimetreCalculator().times(fromQuantity);
                else if (toUnit.equals("miles"))
                    this.toQuantity = new MetreToMilesCalculator().times(fromQuantity);
                else if (toUnit.equals("foot"))
                    this.toQuantity = new MetreToFootCalculator().times(fromQuantity);
                else if (toUnit.equals("metre"))
                    this.toQuantity = this.fromQuantity;
                break;
            case "millimetre":
                if (toUnit.equals("metre"))
                    this.toQuantity = new MillimetreToMetreCalculator().times(fromQuantity);
                else if (toUnit.equals("mile"))
                    this.toQuantity = new MillimetreToMileCalculator().times(fromQuantity);
                else if (toUnit.equals("foot"))
                    this.toQuantity = new MillimetreToFootCalculator().times(fromQuantity);
                else if (toUnit.equals("millimetre"))
                    this.toQuantity = this.fromQuantity;
                break;
            case "mile":
                if (toUnit.equals("metre"))
                    this.toQuantity = new MileToMetreCalculator().times(fromQuantity);
                else if (toUnit.equals("millimetre"))
                    this.toQuantity = new MileToMillimetreCalculator().times(fromQuantity);
                else if (toUnit.equals("foot"))
                    this.toQuantity = new MileToFootCalculator().times(fromQuantity);
                else if (toUnit.equals("mile"))
                    this.toQuantity = this.fromQuantity;
                break;
            case "foot":
                if (toUnit.equals("metre"))
                    this.toQuantity = new FootToMetreCalculator().times(fromQuantity);
                else if (toUnit.equals("millimetre"))
                    this.toQuantity = new FootToMillimetreCalculator().times(fromQuantity);
                else if (toUnit.equals("mile"))
                    this.toQuantity = new FootToMileCalculator().times(fromQuantity);
                else if (toUnit.equals("foot"))
                    this.toQuantity = this.fromQuantity;
                break;
        }
        return this.toQuantity;
    }
    void clear(){

    }

    void setFromQuantity(double qty){
        this.fromQuantity = qty;
    }

    double getFromQuantity(){
        return this.fromQuantity;
    }

    void setFromUnit(String unit){
        this.fromUnit =  unit;
    }

    String getFromUnit(){
        return this.fromUnit;
    }

    void setToQuantity(double qty){
        this.toQuantity = qty;
    }

    double getToQuantity(){
        return this.toQuantity;
    }

    void setToUnit(String unit){
        this.toUnit = unit;
    }

    String getToUnit(){
        return this.toUnit;
    }
}
