package application;

import java.util.Scanner;

public class Hangman {

	private boolean running = true;
	RandomWord word = new RandomWord();
	private Scanner input;

	public void run() {
		do {
			displayWord();
			getUserInput();
			checkUserInput();
		} while (running);

		closeScanner();
	}

	void displayWord() {
		System.out.println(word);
	}

	void getUserInput() {
		input = new Scanner(System.in);

		System.out.print("Guess a letter >> ");
		String userGuessAsString = input.next();

		char userGuessAsChar = userGuessAsString.charAt(0);
		word.addGuess(userGuessAsChar);
	}

	void checkUserInput() {
		if (word.randomWordIsComplete()) {
			System.out.println("WINNER!");
			System.out.println("Word: " + word.getWord());
			running = false;
		}
	}

	void closeScanner() {
		input.close();
	}

}
