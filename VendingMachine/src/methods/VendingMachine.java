package methods;

import java.util.Scanner;

public class VendingMachine {
	
	int num;

	public void machine(int cc) {
		Candy Candy = new Candy();
		num = cc;

		Candy.getcandy(num);
	}

	public void mAchine(int sc) {

		Snack snack = new Snack();
		num = sc;
		snack.getSnack(num);

	}

	public void maChine(int nt) {

		Nuts nuts = new Nuts();
		num = nt;
		nuts.getNuts(num);

	}

	public void macHine(int ck) {

		Coke coke = new Coke();
		num = ck;
		coke.getCoke(num);

	}

	public void machIne(int sd) {

		Soda soda = new Soda();
		num = sd;
		soda.getSoda(num);

	}

	public static void main(String[] args) {

		VendingMachine Machine = new VendingMachine();
		System.out.println("Enter the coin :");
		Scanner s = new Scanner(System.in);

		int Coin = s.nextInt();

		if ((Coin == 1) || (Coin == 5) || (Coin == 10) || (Coin == 25) || (Coin == 50)) {

			System.out.println("Select the Item you want :");
			System.out.println("1. for Candy $10");
			System.out.println("2. for Snack $20");
			System.out.println("3. for nuts $35");
			System.out.println("4. for coke $25");
			System.out.println("5. for soda $25");
			System.out.println("6. for Exit..!");
			int item = s.nextInt();

			switch (item) {
			case 1:
				Machine.machine(Coin);
				break;
			case 2:
				Machine.mAchine(Coin);
				break;
			case 3:
				Machine.maChine(Coin);
				break;
			case 4:
				Machine.macHine(Coin);
				break;
			case 5:
				Machine.machIne(Coin);
				break;
			case 6:
				System.out.println("Take you Money $" + Coin + "..:)");
				break;
			default:
				System.out.println("Invalid option..");
			}

		} else {
			System.out.println("Incorrect demonstration..");
		}

	}

}
