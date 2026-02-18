
public class house_deepcopy implements Cloneable{
	private int id;
	private double area;
	java.util.Date whenBuilt;

	public house_deepcopy(int id, double area) {
		this.id = id;
		this.area = area;
		whenBuilt = new java.util.Date();
	}
	

	public Object clone() throws CloneNotSupportedException {
		house_deepcopy houseClone = (house_deepcopy)super.clone();
		houseClone.whenBuilt = (java.util.Date)(whenBuilt.clone());
		return houseClone;
	}
}

