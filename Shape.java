package Shapes.src.shapes;

public class Shape {
	private double volume = 0;
	
	// The constructor used depends on how many variable are in use
	public Shape(String type, double length, double width, double height) {
		switch(type) {
		case "rectangular prism":
			volume = rectPrismV(length, width, height);
		case "triangular prism":
			volume = triPrismV(length, width, height);
		}
	}
	
	public Shape(String type, double radius, double other) {
		switch(type) {
		case "cone":
			volume = coneV(radius, other);
		case "cylinder":
			volume = cylinderV(radius, other);
		case "torus":
			volume = torusV(radius, other);
		}
	}
	
	public Shape(double radius) {
		// Sphere case
		volume = sphereV(radius);
	}
	
	// getter
	public double getVolume() {
		return this.volume;
	}
	
	// Calculate volume methods
	private double rectPrismV(double x, double y, double z) {
		return x * y * z;
	}
	
	private double triPrismV(double x, double y, double z) {
		return x * y * z / 2;
	}
	
	private double coneV(double r, double h) {
		double rSq = Math.pow(r, 2);
		return Math.PI * rSq * h / 3;
	}
	
	private double cylinderV(double r, double h) {
		double rSq = Math.pow(r, 2);
		return Math.PI * rSq * h;
	}
	
	private double torusV(double r1, double r2) {
		double rSq = Math.pow(r2, 2);
		double piSq = Math.pow(Math.PI, 2);
		return 2 * piSq * r1 * rSq;
	}
	
	private double sphereV(double r) {
		double rCubed = Math.pow(r, 3);
		return Math.PI * rCubed * 4 / 3;
	}

}
