
public class Interface_house implements Cloneable, Comparable<Interface_house>{
	private int id;
	private double area;
	private java.util.Date whenBuilt;

	public Interface_house(int id, double area) {
		this.id = id;
		this.area = area;
		whenBuilt = new java.util.Date();
	}
	
	public int getId() {
		return id;
	}

	public double getArea() {
		return area;
	}

	public java.util.Date getWhenBuilt() {
		return whenBuilt;
	}

	@Override /** Override the protected clone method defined in he Object class, 
				and strengthen its accessibility 
				Header: protected native Object clone() throws CloneNotSupportedException;
				The keyword native indicates that this method is not written in Java 
												but is implemented in the JVM for the native platform. 
				*/
	public Object clone() throws CloneNotSupportedException {
		return super.clone();
		
		/**
		// Perform a shallow copy
		 House houseClone = (House)super.clone();
		// Deep copy on whenBuilt
		 houseClone.whenBuilt = (java.util.Date)(whenBuilt.clone());
		return houseClone;
		*/
		// interface_deep_shallow_copy.png
		/**
		 * House house1 = new House(1, 1750.50);
			House house2 = (House)house1.clone();
			shallow: house1.whenBuilt == house2.whenBuilt  (t, although house1==house2 is f)
			deep: (f)
		 */
	}

	@Override // Implement the compareTo method defined in Comparable
	public int compareTo(Interface_house o) {
		if (area > o.area)
			return 1;
		else if (area < o.area)
			return -1;
		else
			return 0;
	}
	
}
