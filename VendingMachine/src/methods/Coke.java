package methods;

public class Coke {
	
	int Coke=25;
	int amount;
	public void getCoke(int Number) {
		if(Number>Coke) {
			amount=Number-Coke;
			System.out.println("Take your Coke..,Your remaining Amount $"+amount);	
			System.out.println("Thank you vist again..:)");
		}else if(Number==Coke){
			System.out.println("Take your Coke..");
			System.out.println("Thank you vist again..:)");
		}else {
			System.out.println("Actual price of Coke is $25,Please put $25 or More..!");
		}
	}
}
