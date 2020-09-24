package ChildGame;

import java.io.File;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;

public class Sounds {//this class takes care of all the sounds.

																							//6
String[] Paths = {"Cow.wav", "Dog.wav", "Snake.wav", "Horse.wav","Sheep.wav","Rooster.wav","Pig.wav","Cat.wav","Bird.wav","Right.wav", "Wrong.wav"
						//11
					,"oldm.wav","dansa.wav"};
//Made an array to keep check of the sound paths.

	static Clip clip;

	 void PlaySound(String mLocation) {
		 
		  try {if(clip != null) {
			    clip.stop();
			  }
			  
			 File musicPath = new File(mLocation);
			 if (musicPath.exists())
			 {
				 
				 AudioInputStream audioInput = AudioSystem.getAudioInputStream(musicPath);
				  clip = AudioSystem.getClip();
				  clip.open(audioInput);
				  clip.start();
				 
			 }
			 
			 
		  }catch(Exception e) {
			  
		  }
	 }
}
