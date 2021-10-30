package week1.day1;

public class LearnObjectClass {
	
	
	 int resolution;
	char brandName;
	boolean isTouchScreen;
	
	
	
	public void makeCalls() {
	

	}
	
	public void payMoney() {
		

	}		

	public static void main(String[] args) {
		
		LearnObjectClass sample = new LearnObjectClass();
		
		LearnObjectClass demo = new LearnObjectClass();
		
		
		sample.brandName = 'R';
	
		sample.payMoney();
		
		
		System.out.println("Displaying Variables using sample object "  +sample.brandName);
		System.out.println("Displaying methods using sample object");
		
		demo.makeCalls();
		demo.payMoney();
		
		
		
		System.out.println("Displaying methods using demo");
		
	}

}
