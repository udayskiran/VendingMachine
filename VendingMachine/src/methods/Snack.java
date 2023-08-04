package methods;

public class Snack {
	
	int amount;
	int Snack=20;
	public void getSnack(int number) {
		if(number>Snack) {
			amount=number-Snack;
			System.out.println("Take your snacks..,Your remaining Amount $"+amount);	
			System.out.println("Thank you vist again..:)");
		}else if(number==Snack){
			System.out.println("Take your snacks..");
			System.out.println("Thank you vist again..:)");
		}else {
			System.out.println("Actual price of snacks is $20,Please put $20 or More..!");
		}
	}
	
}
