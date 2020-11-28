package application;

import java.util.Random;

public class RandomWord {

	private String[] words = { "family", "tombstone", "hierarchy", "whatever", "explicit", "frame", "big" };
	private String chosenWord;
	private Random random;
	private char[] characters;
	private StringBuilder sb;

	public RandomWord() {
		random = new Random();
		chosenWord = words[random.nextInt(words.length)];
		characters = new char[chosenWord.length()];
	}

	@Override
	public String toString() {
		sb = new StringBuilder();

		for (char c : characters) {
			sb.append(c == '\u0000' ? "_" : c);
			sb.append(' ');
		}

		return sb.toString();
	}

	public void addGuess(char c) {
		for (int i = 0; i < chosenWord.length(); i++) {
			characters[i] = c == chosenWord.charAt(i) ? c : characters[i];
		}
	}

	public boolean randomWordIsComplete() {
		for (char c : characters) {
			if (c == '\u0000')
				return false;
		}
		return true;
	}

	public String getWord() {
		return this.chosenWord;
	}
}
