package factory;

import temptypes.Celsius;
import temptypes.TempType;

public class CelsiusFactory implements TempFactory{
    @Override
    public double convert(TempType type, double gradStart){
        Celsius celsius = new Celsius(gradStart);
        double gradResult =celsius.getGrag();

        switch (type){
            case Celsius:
                return gradStart;
            case Fahrenheit:
                return (gradResult*(9/5)+32);
            case Kelvin:
                return gradResult + 273.15;
        }
        System.out.println("Ой-ой");
        return 0;
    }
}
