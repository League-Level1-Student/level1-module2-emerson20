package _02_sea_creature;

public class Runner {
	public static void main(String[] args) {
		SeaCreature sea = new SeaCreature("spongebob");
		sea.eat(); 
		sea.laugh();
		
		SeaCreature nat = new SeaCreature("patrick");
		nat.eat();
		nat.laugh();
		SeaCreature net = new SeaCreature("squidward");
		net.eat();
		net.laugh();
	}
	// 1. In a Runner class, make a SeaCreature called “Spongebob”. Use the methods below to make him eat, and laugh.
	// 2. Make Patrick and Squidward and print their name, have them eat, and make them laugh.

}
