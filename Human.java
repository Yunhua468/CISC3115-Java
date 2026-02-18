
public class Human {
	String name;
	int age;
	double weight;
	Human(String name, int age, double weight){     // constructor same name with the class, when we create a new class, treat it as more as a method, which we can custom
		this.name = name;  // this. assgin name to object human.name, without this. it will show null
		this.age = age;
		this.weight = weight;
	}
	void eat() {
		System.out.println(this.name + " is eating");
	}
}
