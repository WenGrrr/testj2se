package temptypes;

public class Kelvin implements Temp{
    double gragDegree = 273.15;
    double gradValue;
    public Kelvin(double grads) {
        gradValue = grads;
    }

    public double getGrag() {
        return gradValue + gragDegree;
    }




}
