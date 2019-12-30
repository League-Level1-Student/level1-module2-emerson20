 package _04_tea_maker;

public class TeaRunner {
public static void main(String[] args) {
	Cup c1 = new Cup();
	Kettle kat = new Kettle();
	TeaBag tea = new TeaBag(TeaBag.MINT);
	kat.getWater();
	kat.boil();
	c1.makeTea(tea, kat.getWater());
}
}
