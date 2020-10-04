package dsa.oo.figuras;
public class Rectangle extends Figura{

    private double l1;
    private double l2;

    public Rectangle(int l1, int l2){
        this.l1=l1;
        this.l2=l2;
    }

    public double getL1() {
        return l1;
    }

    public double getL2() {
        return l2;
    }

    @Override
    public double area() {
        return this.l1*this.l2 ;
    }

    @Override
    public String toString() {
        return "Rectangle l1: "+this.l1+" y l2: "+this.l2+"\nArea: "+this.area()+"\n";
    }
}
