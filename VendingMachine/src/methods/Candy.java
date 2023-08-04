package methods;

public class Candy {
	
	int value;
	int Candy = 10;

	public void getcandy(int number) {
		if (number > Candy) {
			value = number - Candy;
			System.out.println("Take your Candy..,Your remaining Amount $" + value);
			System.out.println("Thank you vist again..:)");

		} else if (number == Candy) {
			System.out.println("Take your Candy..");
			System.out.println("Thank you vist again..:)");
		} else {
			System.out.println("Actual price of candy is $10,Please put $10 or More..!");
		}

	}
}
