package factory;

import temptypes.Kelvin;
import temptypes.TempType;

public class KelvinFactory implements TempFactory{
    @Override
    public double convert(TempType type, double gradStart){
        Kelvin kelvin = new Kelvin(gradStart);
        double gradResult =kelvin.getGrag();

        switch (type){
            case Celsius:
                return gradResult;
            case Fahrenheit:
                return ((gradResult - 273.15)*(9/5)+32);
            case Kelvin:
                return gradStart;
        }
        System.out.println("Ой-ой");
        return 0;
    }
}
