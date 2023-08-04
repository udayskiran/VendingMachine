package methods;

public class Nuts {
	
	int amount;
	int Nuts=35;
	public void getNuts(int Number) {
		if(Number>Nuts) {
			amount=Number-Nuts;
			System.out.println("Take your Nuts..,Your remaining Amount $"+amount);	
			System.out.println("Thank you vist again..:)");
		}else if(Number==Nuts){
			System.out.println("Take your Nuts..");
			System.out.println("Thank you vist again..:)");
		}else {
			System.out.println("Actual price of Nuts is $35,Please put $35 or More..!");
		}
		
	}
		
}
