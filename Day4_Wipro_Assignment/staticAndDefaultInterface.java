package secondAss;



interface Polygon {

	 double getArea();

	 // default method
	 default double getPerimeter(int... sides) {
	     int sum = 0;
	     for (int i = 0; i < sides.length; i++) {
	         sum = sum + sides[i];
	     }
	     return sum;
	 }

	 // static method
	 static String shapeInfo() {
	     return "Polygon is a 2D shape with many sides";
	 }
	}


	//Rectangle class
	class Rectangle implements Polygon {
	 int length, width;

	 Rectangle(int l, int w) {
	     length = l;
	     width = w;
	 }

	 public double getArea() {
	     return length * width;
	 }
	}


	//Triangle class
	class Triangle implements Polygon {
	 int base, height;

	 Triangle(int b, int h) {
	     base = b;
	     height = h;
	 }

	 public double getArea() {
	     return 0.5 * base * height;
	 }
	}


	//Main class
	public class staticAndDefaultInterface {
	 public static void main(String[] args) {

	     Rectangle r = new Rectangle(10, 5);
	     System.out.println("Rectangle Area: " + r.getArea());
	     System.out.println("Rectangle Perimeter: " + r.getPerimeter(10, 5, 10, 5));

	     Triangle t = new Triangle(6, 4);
	     System.out.println("Triangle Area: " + t.getArea());
	     System.out.println("Triangle Perimeter: " + t.getPerimeter(3, 4, 5));

	     // calling static method
	     System.out.println(Polygon.shapeInfo());
	 }
	}