// A class that contains abstract methods must be defined as abstract. 
public abstract class AbstractGeometricObject {
	private String color = "white";
	private boolean filled;
	private java.util.Date dateCreated;

	/*
	 * * The constructor in the abstract class is defined as protected, 
		 * because it is used only by subclasses.
		 * When you create an instance of a concrete subclass, 
		 * its superclass’s constructor is invoked to initialize data fields defined in the superclass.
	 */
	/** Construct a default geometric object */
	protected AbstractGeometricObject() {
		dateCreated = new java.util.Date();
	}

	/** Construct a geometric object with color and filled value */
	protected AbstractGeometricObject(String color, boolean filled) {
	dateCreated = new java.util.Date();
		this.color = color;
		this.filled = filled;
	}
	
	/** Return color */
	public String getColor() {
		return color;
	}

	/** Set a new color */
	public void setColor(String color) {
		this.color = color;
	}

	/** Return filled. Since filled is boolean,
	* the get method is named isFilled */
	public boolean isFilled() {
		return filled;
	}

	/** Set a new filled */
	public void setFilled(boolean filled) {
		this.filled = filled;
	}

	/** Get dateCreated */
	public java.util.Date getDateCreated() {
		return dateCreated;
	}

	@Override
	public String toString() {
		return "created on " + dateCreated + "\ncolor: " + color +	" and filled: " + filled;
	}

	/*
	 * * An abstract method is defined without implementation. 
		 * Its implementation is provided by the subclasses
	 */
	/** Abstract method getArea */
	public abstract double getArea();
	
	/** Abstract method getPerimeter */
	public abstract double getPerimeter();
}
