package ChildGame;

import java.util.Random;

public class Randomgenerator {//here i do a random for the sound in game mode 2 where the sound plays a random animal and you have to guess the right one.
	static int settruerand = 0;
	
	public void Randomgen(int truerand) {
		if (truerand == 0) {
			truerand = genRandom();
				truerand ++;
				settruerand = truerand;
			}
	}
	

	public void whatAnimal(int truerand) {
	Sounds sound = new Sounds();
	System.out.println(truerand);				//I play different sounds depending on what number it gets. 
		if (truerand == 1) {
			sound.PlaySound(sound.Paths[0]);
			
		}
		else if (truerand ==2) {
			sound.PlaySound(sound.Paths[7]);
			
		}
		else if (truerand ==3) {
			
			sound.PlaySound(sound.Paths[1]);
		}
		else if (truerand ==4) {
			
			sound.PlaySound(sound.Paths[8]);
		}
		else if (truerand ==5) {
			
			sound.PlaySound(sound.Paths[3]);
		}
		else if (truerand ==6) {
			
			sound.PlaySound(sound.Paths[6]);
		}
		else if (truerand ==7) {
			sound.PlaySound(sound.Paths[5]);
		}
		else if (truerand ==8) {
			sound.PlaySound(sound.Paths[4]);
		}
		else if (truerand ==9) {
			sound.PlaySound(sound.Paths[2]);
		}		

		
	}

	public static int genRandom() {
		return new Random().nextInt(9);
	}
	static public int getrNumber() {//a get for the truerandom number so the MessageListerner knows what number is the right one.
		return settruerand;
	}
}
