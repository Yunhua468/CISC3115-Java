
public class CircleFromSimpleGeometricObject  extends AbstractGeometricObject{
	private double radius;

	public CircleFromSimpleGeometricObject() {
	}

	public CircleFromSimpleGeometricObject(double radius) {
		this.radius = radius;
	}

	public CircleFromSimpleGeometricObject(double radius,String color, boolean filled) {
		this.radius = radius;
		setColor(color);
		setFilled(filled);
	}
	
	/*
	 * public CircleFromSimpleGeometricObject(double radius, String color, boolean filled) {
	 * 		super(color, filled);
			this.radius = radius;
		}
	 */
	
	/** Return radius */
	public double getRadius() {
		return radius;
	}

	/** Set a new radius */
	public void setRadius(double radius) {
		this.radius = radius;
	}

	/** Return area */
	public double getArea() {
		return radius * radius * Math.PI;
	}

	/** Return diameter */
	public double getDiameter() {
		return 2 * radius;
	}

	/** Return perimeter */
	public double getPerimeter() {
		return 2 * radius * Math.PI;
	}

	/** Print the circle info */
	public void printCircle() {
		System.out.println("The circle is created " + getDateCreated() +
		" and the radius is " + radius);
	}
	
	/*
	 * public void printCircle() {
 			System.out.println("The circle is created " + super.getDateCreated() + " and the radius is " + radius);
		}
	 */
	
		//  If a method with this annotation does not override its superclass’s method, 
		// the compiler will report an error.
		@Override
		public String toString() {
			return super.toString() + "\nradius is " + radius;
		}

	

}
