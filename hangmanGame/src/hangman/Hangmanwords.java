package hangman;

class Hangmanwords {

	private static String[] words = { "ocean", "orange", "monster", "education", "pear", "car", "bike", "house", "game",
			"window", "flower", "cabin", "box", "island", "sweden", "irland" };
	private static String word = words[(int) (Math.random() * words.length)];
//moved the random generator to this class so when the word get called it only calls 1 word and not all.
	public static String getSecrectWord() {
		return word;
	}
					//i made the hangman image in an array and moved it to the other class so it felt more clean.
	public static void hangmanImage() {
									// 0,1 //1,2 									//6,3 													//12,4
		String[] hangingMan =  {"  |  \\","  |  ","  |","  |\\","  | \\","  |  \\","  ______","  | ", "  |","  |\\", "  | \\","  |  \\", "  ______",
																					//18.4
								"  |     |","  |     O","  |\\","  | \\","  |  \\","  ______","  |     |","  |     O","  |\\    ()","  | \\","  |  \\",
									//24.5																//30,6
								"  ______","  |     |","  |     O","  |\\   \\()/","  | \\","  |  \\","  ______","  |     |","  |     O","  |\\   \\()/",
								"  | \\   /\\","  |  \\"};
		/* /n */
		if (hangmanMain.getcount() == 7) {
			System.out.println("Wrong guess, try again");
			System.out.println(hangingMan[0]);
		}
		if (hangmanMain.getcount() == 6) {
			System.out.println("Wrong guess, try again");
			for (int i = 1; i < hangingMan.length; i++) {
				System.out.println(hangingMan[i]);
				if (i == 5) {
					break;
				}
			}
		}
		if (hangmanMain.getcount() == 5) {
			System.out.println("Wrong guess, try again");
			for (int i = 6; i < hangingMan.length; i++) {
				System.out.println(hangingMan[i]);
				if (i == 11) {
					break;
				}
			}
		}
		if (hangmanMain.getcount() == 4) {
			System.out.println("Wrong guess, try again");
			for (int i = 12; i < hangingMan.length; i++) {
				System.out.println(hangingMan[i]);
				if (i == 17) {
					break;
				}
			}
		}
		if (hangmanMain.getcount() == 3) {
			System.out.println("Wrong guess, try again");
			for (int i = 18; i < hangingMan.length; i++) {
				System.out.println(hangingMan[i]);
				if (i == 23) {
					break;
				}
			}
		}
		if (hangmanMain.getcount() == 2) {
			System.out.println("Wrong guess, try again");
			for (int i = 24; i < hangingMan.length; i++) {
				System.out.println(hangingMan[i]);
				if (i == 29) {
					break;
				}
			}
		}
		if (hangmanMain.getcount() == 1) {
			System.out.println("Wrong guess, try again");
			for (int i = 30; i < hangingMan.length; i++) {
				System.out.println(hangingMan[i]);
			}
			System.out.println("GAME OVER! The word was " + getSecrectWord());
		}

	}
}
