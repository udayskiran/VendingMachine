package methods;

public class Soda {
	
	int Soda=25;
	int amount;
	public void getSoda(int Number) {
		if(Number>Soda) {
			amount=Number-Soda;
			System.out.println("Take your Soda..,Your remaining Amount $"+amount);	
			System.out.println("Thank you vist again..:)");
		}else if(Number==Soda){
			System.out.println("Take your Soda..");
			System.out.println("Thank you vist again..:)");
		}else {
			System.out.println("Actual price of Soda is $25,Please put $25 or More..!");
		}
	}

}
