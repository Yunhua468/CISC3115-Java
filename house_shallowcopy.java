
public class house_shallowcopy implements Cloneable{
	private int id;
	private double area;
	java.util.Date whenBuilt;

	public house_shallowcopy(int id, double area) {
		this.id = id;
		this.area = area;
		whenBuilt = new java.util.Date();
	}
	

	public Object clone()  throws CloneNotSupportedException{
		return super.clone();
		
	}
}
