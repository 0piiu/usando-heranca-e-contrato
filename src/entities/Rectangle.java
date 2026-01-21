package entities;

public class Rectangle extends AbstractShape {
	
	private double base;
	private double height;
		

	public Rectangle () {
		
	}
	
	public Rectangle(double base, double height) {
		this.base = base;
		this.height = height;
	}
	
	
	public double getBase() {
		return base;
	}


	public void setBase(double base) {
		this.base = base;
	}

	
	public double getHeight() {
		return height;
	}


	public void setHeigth(double heigth) {
		this.height = heigth;
	}


	@Override
	public double area() {
		return getBase() * getHeight();
	}
}
