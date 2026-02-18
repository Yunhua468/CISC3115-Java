
public class TestAbstracttGeometricObject {

	public static void main(String[] args) {
		// Why Abstract Methods?
		
		// Create two geometric objects
		/*
		 * create a new circle and rectangle and assign them to the variables geoObject1 and geoObject2. 
		 * These two variables are of the GeometricObject type.
		 */
		AbstractGeometricObject geoObject1 = new CircleFromSimpleGeometricObject(5);
		AbstractGeometricObject geoObject2 = new RectangleFromSimpleGeometricObject(5, 3);
			

		System.out.println("The two objects have the same area? " +
		equalArea(geoObject1, geoObject2));
		
		// Display circle
		displayGeometricObject(geoObject1);
		
		// Display rectangle
		displayGeometricObject(geoObject2);
		}

		/** A method for comparing the areas of two geometric objects */
	/*
	 * Note that you could not define the equalArea method 
	 * for comparing whether two geometric objects have the same area 
	 * if the getArea method were not defined in GeometricObject.
	 */
		public static boolean equalArea(AbstractGeometricObject object1,
				AbstractGeometricObject object2) {
			return object1.getArea() == object2.getArea();
		}

		/** A method for displaying a geometric object */
		public static void displayGeometricObject(AbstractGeometricObject object) {
			System.out.println();
			System.out.println("The area is " + object.getArea());
			System.out.println("The perimeter is " + object.getPerimeter());
		}

}
