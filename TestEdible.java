
public class TestEdible {

	public static void main(String[] args) {
		Object[] objects = {new Tiger(), new Chicken(), new Apple()};
		for (int i = 0; i < objects.length; i++) {
			if (objects[i] instanceof Edible)
				System.out.println(((Edible)objects[i]).howToEat());

			if (objects[i] instanceof Animalss) {
				System.out.println(((Animalss)objects[i]).sound());
			}
		}
	}
}


abstract class Animalss {
	/** Return animal sound */
	public abstract String sound();
}

class Chicken extends Animalss implements Edible {
	@Override
	public String howToEat() {
		return "Chicken: Fry it";
	}

	@Override
	public String sound() {
		return "Chicken: cock-a-doodle-doo";
	}
}

class Tiger extends Animalss {
	@Override
	public String sound() {
		return "Tiger: RROOAARR";
	}
}

abstract class Fruitss implements Edible {
// Data fields, constructors, and methods omitted here
}

class Appless extends Fruitss {
	@Override
	public String howToEat() {
		return "Apple: Make apple cider";
	}
}

class Orange extends Fruitss {
	@Override
	public String howToEat() {
		return "Orange: Make orange juice";
	}
}