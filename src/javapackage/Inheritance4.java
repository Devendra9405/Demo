package javapackage;

public class Inheritance4 extends Inheritance3  {
	
	public void multiply(int x, int y) {
		
		z = x * y;
		System.out.println("multiply:-" + z);

		
	}


	public static void main(String[] args) {
		
		Inheritance4 s1 = new Inheritance4();
		s1.add(10, 10);
		s1.subtract(20, 10);
		s1.multiply(10, 5);
 
	}

}
