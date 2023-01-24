package javapackage;

public class unaryopeartor2 {

	public static void main(String[] args) {
             int a=20;
             int b=30;
             
             System.out.println(a++  ); // 20,21
             System.out.println(a++ + ++a); //21,22,23,23
             System.out.println(a + a++); // 23,23,24
             System.out.println(b++ + b--); // 30,31,31,30
             System.out.println(b++ - b--); // 30,31, 31,30
             
            	
	}
}
