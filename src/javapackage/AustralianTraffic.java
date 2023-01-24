package javapackage;

public class AustralianTraffic implements CentralTraffic {
	
	

	public static void main(String[] args) {
		CentralTraffic a = new AustralianTraffic();
		
		a.greenGo();
		a.FlashYellow();
		a.redstop();
	}

	@Override
	public void greenGo() {
      System.out.println("greengo");		
	}

	@Override
	public void redstop() {
              System.out.println("redstop");		
	}

	@Override
	public void FlashYellow() {
     System.out.println("flashyellow");		
	}

}
