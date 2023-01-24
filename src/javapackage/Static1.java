package javapackage;

public class Static1 {
	
	static int z =5;
	int y = 1;
	
	public static void a() {
		int z=10;
		System.out.println(z);
		
	}
	
	public void b() {
	   z = 15;
	   System.out.println(z);
	   a();
	}
	

	public static void main(String[] args) {
                 a();
                 Static1 s = new Static1();
                 s.b();
	}

}
