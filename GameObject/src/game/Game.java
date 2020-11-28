package game;

import java.util.Random;
import java.util.Scanner;

import game.objects.GObject;
import game.objects.Paper;
import game.objects.Rock;
import game.objects.Scissors;

public class Game {

	private GObject[] objects = { new Rock(), new Paper(), new Scissors() };
	Random rand = new Random();
	private Scanner in = new Scanner(System.in);
	private int userWinCounter = 0;
	private int computerWinCounter = 0;
	private int gamePlayCount = 0;

	public void start() {

		for (int i = 0; i < 3; i++) {
			GObject object = objects[rand.nextInt(objects.length)];

			System.out.print("Enter a number 1 -> Rock, 2 -> Paper, 3 -> Scissors >> ");
			int userChoice = in.nextInt();
			GObject object2 = objects[userChoice - 1];

			System.out.println("You picked: " + object2);
			System.out.println("Computer picked: " + object);

			int gameResult = object2.compareTo(object);
			switch (gameResult) {
			case 0:
				System.out.println("Draw!");
				gamePlayCount++;
				break;
			case 1:
				System.out.println("You win!");
				userWinCounter++;
				gamePlayCount++;
				break;
			case -1:
				System.out.println("You loose!");
				computerWinCounter++;
				gamePlayCount++;
			default:
				break;
			}
			System.out.println();
		}

		System.out.println("\n\t===== RESULTS =====");

		if (userWinCounter > computerWinCounter) {
			System.out.println("\tYOU WIN " + userWinCounter + "/" + gamePlayCount);
		} else if (computerWinCounter > userWinCounter) {
			System.out.println("\tCOMPUTER WINS " + computerWinCounter + "/" + gamePlayCount);
		} else {
			System.out.println("\tDRAW!");
		}

		System.out.println("\n\t===================");

		in.close();
	}
}
