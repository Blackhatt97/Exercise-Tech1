/**
 * Created by blackhatt on 21/02/2017.
 */
public class Person {

    private String name;
    private double age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }
    public void setAge(Strin age){

        this.age = age;
    }
    public String toString() {

        return this.getName() + " and has " + this.getAge();
    }
}
