package hangman;

import java.util.Scanner;

public class hangmanMain {
	static int getcount() {
		return count;
		
	}
	private static String asterisk = new String(new char[Hangmanwords.getSecrectWord().length()]).replace("\0", "*");

	static boolean guessWord = false;
	static int count = 7;
	static boolean wordGuess = true;
	String Word = "";
	
	static int gameStatus =0;
	

	public static void main(String[] args) {
		String Guesschar = "gc";
		String GuessWord = "gw";
		Scanner scanner = new Scanner(System.in);
		while (count > 0 && asterisk.contains("*") && wordGuess != false) {

			String guess;
			System.out.println(
					"Type in "+ Guesschar+ " to guess a char. Type in "+ GuessWord+" to guess a word.	Lifes left:**"+count+"**");
			String menu = scanner.next();
			if (menu.equalsIgnoreCase(Guesschar)) {
				guessWord = false;
				System.out.println(asterisk);
				System.out.println("Type in a letter.");
				guess = scanner.next();

				hang(guess);

			} else if (menu.equalsIgnoreCase(GuessWord)) {
				guessWord = true;
				System.out.println(asterisk);
				System.out.println("Guess the word that you think it is.");
				guess = scanner.next();

				hang(guess);

			} else if (menu.equalsIgnoreCase("gs")) {
				System.out.println("You are on round: " + count + " of 7 rounds total");
			} else {
				System.out.println("Wrong input.");
			}
		}
		scanner.close();
	}

	public static void hang(String guess) {
		String newasterisk = "";
		for (int i = 0; i < Hangmanwords.getSecrectWord().length(); i++) {//here is a loop that checks if your guess is the right 
													//one and goes from letter 0- the word lenght.if its wrong it just replaces all the letters with *
													// and if its right it takes away the * that replaced the word.
			if (Hangmanwords.getSecrectWord().charAt(i) == guess.charAt(0)) {
				newasterisk += guess.charAt(0);
			} else if (asterisk.charAt(i) != '*') {
				newasterisk += Hangmanwords.getSecrectWord().charAt(i);
			} else {
				newasterisk += "*";
			}
		}
		if (guessWord == true) {
			if (guess.equals(Hangmanwords.getSecrectWord())) {
				System.out.println("Correct! You win! The word was " + Hangmanwords.getSecrectWord());
				wordGuess = false;
			} else {
				
				Hangmanwords.hangmanImage();
				count--;
				System.out.println(asterisk);
				//if you want to play the game with the guess the word wrong death
				//wordGuess = false;
				//count = 7;
			}
		} else if (guessWord == false) {
			if (asterisk.equals(newasterisk)) {
				
				Hangmanwords.hangmanImage();
				count--;
			} else {
				asterisk = newasterisk;
				System.out.println(asterisk);
			}
		}
		if (asterisk.equals(Hangmanwords.getSecrectWord())) {
			System.out.println("Correct! You win! The word was " + Hangmanwords.getSecrectWord());
		}
	}
}