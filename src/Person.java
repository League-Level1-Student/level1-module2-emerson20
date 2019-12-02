
public class Person {
private String name;
private String superpower;
public String getName(){
	return this.name;
}
public String getSuperpower(){
	return this.superpower;
}
public void setSuperpower (String Superpower) {
	this.superpower = Superpower;
}
public void setName (String Name) {
	this.name = Name;
}
public String toString() {
	return "This is "+name+ " and this persona is great at being a "+superpower;
}
}
