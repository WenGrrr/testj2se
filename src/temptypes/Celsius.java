package temptypes;

public class Celsius implements Temp{
    double gragDegree = 0;
    double gradValue;
    public Celsius(double grads) {
        gradValue = grads;
    }

    public double getGrag() {
        return gradValue+gragDegree;
    }
}
