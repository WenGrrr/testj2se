package temptypes;

public class Fahrenheit implements Temp{
    double gragDegree =-32;
    double gradValue;
    public Fahrenheit(double grads) {
        gradValue = grads;
    }
    public double getGrag() {
        return gradValue + gragDegree;
    }
}
