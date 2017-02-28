/**
 * Created by blackhatt on 21/02/2017.
 */
public class Main {

    public static void main(String[] args) {

        Person p = new Person("Bob",20);
        System.out.println(p);
	Person v = new Person("Raz", 18);
	
	p.setName("Bogdanel");
	System.out.println(p);
	v.setName("Myez");
	System.out.println(v);

    }
}
