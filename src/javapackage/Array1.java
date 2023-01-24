package javapackage;

public class Array1 {
	
	public static void paasingarraytomethod(int a[]) {
		
		int b = a[0];
		
		for(int i=0;i< a.length;i++) {
			
			if(b >= a[i]) {
				
				System.out.println(b);
				
			}else {
				System.out.println("AVBC");
			}
			
		}
	}

	public static void main(String[] args) {
		
		int c[] = {22,2,44,5};
	
		paasingarraytomethod(c);	
       
	}

}
