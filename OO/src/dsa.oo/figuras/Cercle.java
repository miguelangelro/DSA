package dsa.oo.figuras;
import static java.lang.Math.*;

public class Cercle extends Figura {
    private double r;

    public Cercle(double r){
        this.r=r;
    }
    @Override
    public double area() {
        return PI * pow(this.r,2);
    }

    @Override
    public String toString() {
        return "Cercle radio: "+this.r+"\nArea: "+this.area()+"\n";
    }
}
