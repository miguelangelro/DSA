import java.util.Date;

public class Student extends Person {

    private Date data;

    public Student (String name, Date num){
       super(name);
       this.data= num;
    }

    @Override
    public String toString() {
        return super.toString()+ "Fecha: "+this.data;
    }

    public static void main(String[] args) {
        Student s1= new Student("Maria", new Date());
        System.out.println(s1);
    }
}
