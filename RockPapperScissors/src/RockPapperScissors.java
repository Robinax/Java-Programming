
import java.util.Scanner;
import java.util.Random;

public class RockPapperScissors {
	static Scanner scan = new Scanner(System.in);
	static int P2pick = 0;
	static String Rock = "Rock", Paper = "Paper", Scissor = "Scissor";
	public static boolean yesno = true;
	static String P2answer;

	public static void main(String[] args) {

		while (yesno == true) {//made a menu for the user to chose if they want to play with the computer or against another player.
			System.out.println(
					"If you want to play with another player type in pvp, if you want to play against an ai type in pve. If you havent played Rock,Paper and scissor you can type in M for manual. If you want to exit type EX");
			String start = scan.nextLine();
			if (start.equals("pve")) {
				P2pick = 0;
				GamePlay();//Here we call the GamePlay method and with "P2pick" = 0 it just says that we play against the ai.
			} else if (start.equals("pvp")) {
				P2pick = 1;
				NameRPSpvp();//Here we call the NameRPSpvp method and with the P2pick = 1 we just say later in the GamePlay method that we play against another player.
			} else if (start.equals("M")) {
				System.out.println(
						"Ok, you choose rock, papper or scissor and i will choose one of the 3 aswell. Rock beats scissor, papper beats rock, and scissor beats papper.");
				yesno = false;
			} else if (start.equals("EX")) {
				System.out.println("Bye!!");
				yesno = false;
			} else {
				System.out.println("Answer with pvp, pve, M or EX!");
			}
		}
	}

	public static void NameRPSpvp() {
		boolean pvptf = false;
		while (pvptf == false) {// Here the player make a choice to rename rock,paper and scissor if they want then they go straight into GamePlay or if they dont want to they just go straight into Gameplay instead.
			System.out
					.println("Do you want to name rock,paper and scissor to whater you want? answer with yes or no. ");
			String nameRPS = scan.nextLine();
			if (nameRPS.equalsIgnoreCase("yes")) {
				System.out.println("What name do you Rock want to be?");
				Rock = scan.nextLine();
				System.out.println("What name do you Paper want to be?");
				Paper = scan.nextLine();
				System.out.println("What name do you Scissor want to be?");
				Scissor = scan.nextLine();
				pvptf = true;
				GamePlay();
			} else if (nameRPS.equalsIgnoreCase("no")) {
				GamePlay();
				pvptf = true;
			} else {
				System.out.println("answer with yes or no.");
			}
		}
	}

	public static void GamePlay() {//here is the GamePlay method where all the "rules for winning" is set.
		int YourPoints = 0;
		int SecondPlayerP = 0;
		String P1answer;
		while (YourPoints != 3 && SecondPlayerP != 3) {//the first to get 3 points win and the loop will end with that.
			System.out.println(
					"Player 1 choose your weapon. Type in " + Rock + " for rock, " + Scissor + " for scissor and "
							+ Paper + " for papper. the score is P1 " + YourPoints + " P2 " + SecondPlayerP);
			P1answer = scan.nextLine();
			if (P2pick == 1) {//here is the P2pick where if its = 1 its against the player and if its = 0 its against the computer.
				System.out.println(
						"Player 2 choose your weapon. Type in " + Rock + " for rock, " + Scissor + " for scissor and "
								+ Paper + " for papper. the score is P1 " + YourPoints + " P2 " + SecondPlayerP);
				P2answer = scan.nextLine();
			}
			if (P2pick == 0) {//when its against the computer it just randomize a number from 1-3 and if its 1 its = rock and so on.
				Random generator = new Random();
				int Cinput = generator.nextInt(3) + 1;
				if (Cinput == 1) {
					P2answer = Rock;
				} else if (Cinput == 2) {
					P2answer = Paper;
				} else if (Cinput == 3) {
					P2answer = Scissor;
				}
			}
			if (P1answer.equals(Rock)) {//here is all the rules for winning and all the points they win adds here.
				if (P1answer.equals(P2answer)) {
					System.out.println(Rock + " vs " + Rock + ". Its a tie");
				} else if (P2answer.equals(Scissor)) {
					System.out.println(Rock + " beats " + Scissor + ". Player1 won!");
					YourPoints++;
				} else if (P2answer.equals(Paper)) {
					System.out.println(Paper + " beats " + Rock + ". Player2 won!");
					SecondPlayerP++;
				}
			} else if (P1answer.equals(Scissor)) {
				if (P1answer.equals(P2answer)) {
					System.out.println(Scissor + " vs " + Scissor + ". Its a tie");
				} else if (P2answer.equals(Rock)) {
					System.out.println(Rock + " beats " + Scissor + ". Player2 won");
					SecondPlayerP++;
				} else if (P2answer.equals(Paper)) {
					System.out.println(Scissor + " beats " + Paper + ". Player1 won!");
					YourPoints++;
				}
			} else if (P1answer.equals(Paper)) {
				if (P1answer.equals(P2answer)) {
					System.out.println(Paper + " vs " + Paper + ". Its a tie");
				} else if (P2answer.equals(Rock)) {
					System.out.println(Paper + " beats " + Rock + ". Player1 won!");
					YourPoints++;
				} else if (P2answer.equals(Scissor)) {
					System.out.println(Scissor + " beats " + Paper + ". Player2 won!");
					SecondPlayerP++;
				}

			} else {
				System.out.println("Answer with " + Rock + " for rocks, " + Scissor + " for scissors or " + Paper
						+ " for papper!");
			}
		}
		if (YourPoints > SecondPlayerP) {
			System.out.println("Player1 won the game!!!!!!");
		} else if (YourPoints < SecondPlayerP) {
			System.out.println("Player2 won the game!!!!");
		}//here it lets you see who won the game aswell if they want to play again.
		System.out.println("Do you want to play again?");
		String again = scan.nextLine();
		if (again.equals("yes")) {
			yesno = true;
			YourPoints = 0;
			SecondPlayerP = 0;//all the points resets here so they can play again.
		} else if (again.equals("no")) {
			yesno = false;

		}
	}
}