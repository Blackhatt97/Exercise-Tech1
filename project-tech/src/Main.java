/**
 * Created by blackhatt on 21/02/2017.
 */
public class Main {

    public static void main(String[] args) {

        Person p = new Person("Bob",20);
        System.out.println(p);
	Person v = new Person("Raz", 18);
	
	Person y = new Person("Milan",20);
	System.out.println(y);
	p.setName("Bogdanel");
	System.out.println(p);
	v.setName("Myez");
	System.out.println(v);

	Person p2 = new Person("Bogdanush", 2);
	p.setName("Bogulet");
	System.out.println(p);

    }
}
