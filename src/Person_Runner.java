
public class Person_Runner {
	public static void main(String[] args) {
		Person Samantha = new Person();
		Person Bob = new Person();
		Person Freddie = new Person();
		Samantha.setName("Samantha");
		Samantha.setSuperpower("Guster");
		Bob.setName("Bob");
		Bob.setSuperpower("Empath");
		Freddie.setName("Freddie");
		Freddie.setSuperpower("Faser");
	System.out.println(Samantha);
	System.out.println(Bob);
	System.out.println(Freddie);
	}

}

//6. Now, make a Runner class that creates 3 different people, sets their superpowers, and prints the value returned by the default toString() method. 

//7. Override the default toString() method by implementing a toString() method on the Person class that returns "<name> has mad <superpower> skills". 