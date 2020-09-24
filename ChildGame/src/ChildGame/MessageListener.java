package ChildGame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MessageListener implements ActionListener {

	 Sounds sound = new Sounds();
	 Randomgenerator Random = new Randomgenerator();
	 UInterface ui = new UInterface();
	 int rNumber = 0;
	 @Override
	public void actionPerformed(ActionEvent e) {//when i click with the mouse depending on what button this happens..
		 if (UInterface.getgameMode()== 1) {//Sets the game mode for the different minigames.
		        System.out.println(e.getActionCommand());
		        if(e.getActionCommand()=="Cow") {
		        	sound.PlaySound(sound.Paths[0]);			//Takes the soundplayer from the class sounds and gives it the right path so the right animal noise
		        												//comes out. it were alot cleaner to make different classes for the music and this.
		        }
		        if(e.getActionCommand()=="Cat") {
		        	
		        	sound.PlaySound(sound.Paths[7]);

		        }
		        if(e.getActionCommand()=="Snake") {
		        	
		        	sound.PlaySound(sound.Paths[2]);

		        }
		        if(e.getActionCommand()=="Horse") {
		        	
		        	sound.PlaySound(sound.Paths[3]);
		        }
		        if(e.getActionCommand()=="Dog") {
		        	
		        	sound.PlaySound(sound.Paths[1]);
		        	
		        }
		        if(e.getActionCommand()=="Sheep") {
		        
		        	sound.PlaySound(sound.Paths[4]);
		        	
		        }
		        if(e.getActionCommand()=="Rooster") {
		        	
		        	sound.PlaySound(sound.Paths[5]);
		        	
		        }
		        if(e.getActionCommand()=="Bird") {
		        	
		        	sound.PlaySound(sound.Paths[8]);
		        	
		        }
		        if(e.getActionCommand()=="Pig") {
		       
		        	sound.PlaySound(sound.Paths[6]);
		        	
		        }
		        
		         }
		
		 
		 
		 
		 
		 
		 
		 
		 else if (UInterface.getgameMode()== 2) {  //Game mode 2 is a guess the animal, you get a random number and you have to guess the right animal.
			 
			   if(e.getActionCommand()=="PlayRandom") {
				  
			       Random.whatAnimal(Randomgenerator.getrNumber());//Gets a random number
			   }
		        	
			        if(e.getActionCommand()=="Pig") {					//if the number is 6 its the right number when u press the pig picture and you get a new random
					    if (Randomgenerator.getrNumber()==6) {			//number to play with. if you are wrong you get a wrong sound and can try again.
					    	sound.PlaySound(sound.Paths[9]);
					    	Random.Randomgen(rNumber);
					    }
					    else {
					    	sound.PlaySound(sound.Paths[10]);
					    }
			        }
			        if(e.getActionCommand()=="Bird") {
					    if (Randomgenerator.getrNumber()==4) {
					    	
					    	sound.PlaySound(sound.Paths[9]);
					    	Random.Randomgen(rNumber);
					    }
					    else {
					    	sound.PlaySound(sound.Paths[10]);
					    }
			        }
			        if(e.getActionCommand()=="Rooster") 
					    if (Randomgenerator.getrNumber()==7) {
					    	sound.PlaySound(sound.Paths[9]);
					    	Random.Randomgen(rNumber);
					    }
					    else {
					    	sound.PlaySound(sound.Paths[10]);
					    }
			       
			        if(e.getActionCommand()=="Sheep") {
					    if (Randomgenerator.getrNumber()==8) {
					    	sound.PlaySound(sound.Paths[9]);
					    	Random.Randomgen(rNumber);
					    }
					    else {
					    	sound.PlaySound(sound.Paths[10]);
					    }
			        }
			        if(e.getActionCommand()=="Dog") {
					    if (Randomgenerator.getrNumber()==3) {
					    	sound.PlaySound(sound.Paths[9]);
					    	Random.Randomgen(rNumber);
					    }
					    else {
					    	sound.PlaySound(sound.Paths[10]);
					    }
			        }
			        if(e.getActionCommand()=="Horse") {
					    if (Randomgenerator.getrNumber()==5) {
					    	sound.PlaySound(sound.Paths[9]);
					    	Random.Randomgen(rNumber);
					    }
					    else {
					    	sound.PlaySound(sound.Paths[10]);
					    }
			        }
			        if(e.getActionCommand()=="Snake") {
					    if (Randomgenerator.getrNumber()==9) {
					    	sound.PlaySound(sound.Paths[9]);
					    	Random.Randomgen(rNumber);
					    }
					    else {
					    	sound.PlaySound(sound.Paths[10]);
					    }
			        }
			        if(e.getActionCommand()=="Cat") {
					    if (Randomgenerator.getrNumber()==2) {
					    	sound.PlaySound(sound.Paths[9]);
					    	Random.Randomgen(rNumber);
					    }
					    else {
					    	sound.PlaySound(sound.Paths[10]);
					    }
			        }
			        if(e.getActionCommand()=="Cow") {
					    if (Randomgenerator.getrNumber()==1) {
					    	sound.PlaySound(sound.Paths[9]);
					    	Random.Randomgen(rNumber);
					    }
					    else {
					    	sound.PlaySound(sound.Paths[10]);
					    }
			        }
			  }
		 if (UInterface.getgameMode()== 3) {		//Gamemode3 is just to listen to music
			 										//You can puse/play and play 2 different songs right now.
			 
			 if(e.getActionCommand()=="PlayOl") {
				 sound.PlaySound(sound.Paths[11]);
			 }
			 if(e.getActionCommand()=="Pause") {
				 if(Sounds.clip.isActive()) {
				 Sounds.clip.stop();
				 }
				 else {
					 Sounds.clip.start();
				 }
			 }
			 if(e.getActionCommand()=="Veckans") {
				 sound.PlaySound(sound.Paths[12]);
			
			 }
			 
		 } 
	 }
}
