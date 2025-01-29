package studio2;

import java.util.Scanner;

public class GamblersRuin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		System.out.println("What is your starting amount?");
		int startAmount = in.nextInt();
		System.out.println("What is your win chance?");
		double winChance = in.nextDouble();
		System.out.println("What is your win limit?");
		int winLimit = in.nextInt();
		System.out.println("Number of days?");
		int totalSimulations = in.nextInt();
		int plays = 0;
		int wins = 0, losses = 0;
		for (int day = 0; day < totalSimulations; day++) {
			while ((startAmount < winLimit) && (startAmount > 0)) {
				double random = Math.random();
				plays++;
				if (random < winChance) {
					System.out.println("success");
					startAmount++;
				} else {
					System.out.println("ruin");
					startAmount--;
				}
			}
			boolean success;
			if (startAmount == 0) {
				System.out.println("RUIN!!!");
				success = true;
			} else {
				success = false;
				System.out.println("Success!!");
			} 
			System.out.print("Simulation " + day + ": " + plays);
			if (success == true) {
				System.out.println(" WIN");
				wins++;
			}
			else {
				System.out.println(" LOSE");
				losses++;	
			}
		}
		System.out.println("Losses: " + losses + " Simulations: " + totalSimulations);
	}


}
