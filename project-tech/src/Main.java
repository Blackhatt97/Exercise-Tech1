/**
 * Created by blackhatt on 21/02/2017.
 */
public class Main {

    public static void main(String[] args) {

        Person p = new Person("Bob",20);
        System.out.println(p);
	
	p.setName("Bogdanel");
	System.out.println(p);

	Person p2 = new Person("Bogdanush", 2);
	p.setName("Bogulet");
	System.out.println(p);

    }
}
