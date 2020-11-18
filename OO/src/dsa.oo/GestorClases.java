package dsa.oo;

import dsa.oo.figuras.Cercle;
import dsa.oo.figuras.Figura;
import dsa.oo.figuras.Quadrat;
import dsa.oo.figuras.Rectangle;
import java.util.*;

import java.util.Arrays;


public class GestorClases {

    public static void sort(Figura[] v){
        Arrays.sort(v,(o1,o2)-> (int)(o2.area()-o1.area()));
    }

    public static double suma(Figura[] v) {
        double res = 0;

        for (Figura f : v){
            System.out.println(f);
            res = res + f.area();
    }
        return res;
    }

    public static void main(String[] args) {
        Figura[] v = new Figura[3];
        v[0]= new Quadrat(2);
        v[1]= new Rectangle(2,1);
        v[2]= new Cercle(5);

        double r = GestorClases.suma(v);

        System.out.println("Suma de areas: "+r);
        System.out.println(Arrays.asList(v));
        GestorClases.sort(v);
        System.out.println(Arrays.asList(v));
    }
}
