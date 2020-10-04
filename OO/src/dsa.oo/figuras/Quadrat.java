package dsa.oo.figuras;

public class Quadrat extends Rectangle{
    private int i;
    public Quadrat(int i) {
        super(i,i);
    }

    @Override
    public String toString() {
        return "Quadrat l: "+super.getL1()+"\nArea: "+super.area();
    }
}
