package factory;


import temptypes.Fahrenheit;
import temptypes.TempType;

public class FahrenheitFactory implements TempFactory{
    @Override
    public double convert(TempType type, double gradStart){
        Fahrenheit fahrenheit = new Fahrenheit(gradStart);
            double gradResult =fahrenheit.getGrag();

            switch (type){
                case Celsius:
                    return (gradResult *(5/9));
                case Fahrenheit:
                    return gradStart;
                case Kelvin:
                    return (gradResult *(5/9)+273.15);
            }
            System.out.println("Ой-ой");
            return 0;
        }
    }

