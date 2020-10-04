public class Person {
    private String name;
    private int id;
    private static int lastId;

    public Person(String name) {
        this.name = name;
        this.id= lastId++;
    }

    @Override
    public String toString() {
        return "ID:"+this.id+"\nNombre:"+ this.name+"\n";
    }

    public static void main(String[] args) {

        Person p1 = new Person("Miguel");
        Person p2 = new Person("Alice");

        System.out.println(p1);
        System.out.println(p2);
    }
}
