
public class CarEncapsulation {
	private String make;
	private String model ;
	private int year = 2016;
	
	CarEncapsulation(String make, String model, int year) {	
		
		// for setter
		this.setMake(make);
		this.setModel(model);
		this.setYear(year);
		 
	}
	
	CarEncapsulation(CarEncapsulation x) {	
		this.copy(x);

	}
	
	public String getMake() {
		return make;
	}
	
	public String getModel() {
		return model;
	}
	
	public int getYear() {
		return year;
	}
	
	public void setMake(String make) {
		this.make = make; 
	}
	
	public void setModel(String model) {
		this.model = model; 
	}
	
	public void setYear(int year) {
		this.year = year; 
	}
	
	public void copy(CarEncapsulation x) {
		this.setMake(x.getMake());
		this.setModel(x.getModel());
		this.setYear(x.getYear());
	}
}
