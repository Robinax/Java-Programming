package ChildGame;

import java.awt.Color;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.WindowConstants;

public class UInterface implements Runnable {

	private JFrame frame;
	static int GameMode = 0;

	int rNumber = 0;
	static int ranumb = 0;

	public UInterface() {

	}

	@Override
	public void run() {
		frame = new JFrame("Childs Game");										//The frame is made here and i changed the background to blue.
		frame.setPreferredSize(new Dimension(600, 600));

		frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

		createComponents(frame.getContentPane());
		frame.getContentPane().setBackground(Color.BLUE);
		frame.pack();
		frame.setVisible(true);

	}

	private void createComponents(Container container) {// everything with the ui
		Randomgenerator Random = new Randomgenerator();
		JButton[] buttons = new JButton[17];//Here i make an array so i can easily put every button in a for loop later on.

		buttons[0] = new JButton("Listen to animal sounds");
		buttons[0].setBounds(200, 5, 200, 40);

		buttons[1] = new JButton("Guess the animal");
		buttons[1].setBounds(200, 85, 200, 40);


		buttons[2] = new JButton("Play kid song's");
		buttons[2].setBounds(200, 160, 200, 40);


		buttons[3] = new JButton("Pause/Play");
		buttons[3].setBounds(200, 400, 100, 40);
		buttons[3].setActionCommand("Pause");
		MessageListener PauseOn = new MessageListener();
		buttons[3].addActionListener(PauseOn);

		buttons[4] = new JButton("Play Old M");
		buttons[4].setBounds(200, 20, 200, 40);
		buttons[4].setActionCommand("PlayOl");
		MessageListener OldmOn = new MessageListener();
		buttons[4].addActionListener(OldmOn);

		buttons[5] = new JButton("Play veckans");
		buttons[5].setBounds(200, 100, 200, 40);
		buttons[5].setActionCommand("Veckans");
		MessageListener DansavOn = new MessageListener();
		buttons[5].addActionListener(DansavOn);

		buttons[6] = new JButton("Play");
		buttons[6].setBounds(320, 500, 200, 40);
		buttons[6].setActionCommand("PlayRandom");
		MessageListener Playsound = new MessageListener();
		buttons[6].addActionListener(Playsound);

		buttons[7] = new JButton(new ImageIcon("ko.jpg"));
		buttons[7].setBounds(5, 5, 150, 150);
		buttons[7].setActionCommand("Cow");
		MessageListener CowOn = new MessageListener();
		buttons[7].addActionListener(CowOn);

		buttons[8] = new JButton(new ImageIcon("Cat.jpg"));
		buttons[8].setBounds(5, 170, 150, 150);
		buttons[8].setActionCommand("Cat");
		MessageListener CatOn = new MessageListener();
		buttons[8].addActionListener(CatOn);

		buttons[9] = new JButton(new ImageIcon("Snake.jpg"));
		buttons[9].setBounds(430, 170, 150, 150);
		buttons[9].setActionCommand("Snake");
		MessageListener SnakeOn = new MessageListener();
		buttons[9].addActionListener(SnakeOn);

		buttons[10] = new JButton(new ImageIcon("Horse.jpg"));
		buttons[10].setBounds(5, 335, 150, 150);
		buttons[10].setActionCommand("Horse");
		MessageListener HorseOn = new MessageListener();
		buttons[10].addActionListener(HorseOn);

		buttons[11] = new JButton(new ImageIcon("Dog.jpg"));
		buttons[11].setBounds(220, 335, 150, 150);
		buttons[11].setActionCommand("Dog");
		MessageListener DogOn = new MessageListener();
		buttons[11].addActionListener(DogOn);

		buttons[12] = new JButton(new ImageIcon("Pig.jpg"));
		buttons[12].setBounds(220, 5, 150, 150);
		buttons[12].setActionCommand("Pig");
		MessageListener PigOn = new MessageListener();
		buttons[12].addActionListener(PigOn);

		buttons[13] = new JButton(new ImageIcon("Sheep.jpg"));
		buttons[13].setBounds(430, 5, 150, 150);
		buttons[13].setActionCommand("Sheep");
		MessageListener SheepOn = new MessageListener();
		buttons[13].addActionListener(SheepOn);

		buttons[14] = new JButton(new ImageIcon("Bird.jpg"));
		buttons[14].setBounds(220, 170, 150, 150);
		buttons[14].setActionCommand("Bird");
		MessageListener BirdOn = new MessageListener();
		buttons[14].addActionListener(BirdOn);


		buttons[15] = new JButton(new ImageIcon("Rooster.jpg"));
		buttons[15].setBounds(430, 335, 150, 150);
		buttons[15].setActionCommand("Rooster");
		MessageListener RoosterOn = new MessageListener();
		buttons[15].addActionListener(RoosterOn);

		buttons[16] = new JButton("Back");
		buttons[16].setBounds(80, 500, 200, 40);

		
		for (int i = 0; i < buttons.length; i++) {//adding all the buttons to the container
			container.add(buttons[i]);
			if (i == 16) {
				break;
			}
		}
		
		for (int i = 0; i < buttons.length; i++) {//Sets all the buttons that need to be visible to true and the next i set the ones i dont want to be visible to false
			buttons[i].setVisible(true);
			if (i == 2) {
				break;
			}
		}
		for (int i = 3; i < buttons.length; i++) {
			buttons[i].setVisible(false);
			if (i == 16) {
				break;
			}
		}
							//Every actionListenere in the ui class only goes back and forth true the meny.
		buttons[0].addActionListener(new ActionListener() {//Listen to animal sounds with loops about the visibility of the buttons

			@Override
			public void actionPerformed(ActionEvent e) {
				GameMode = 1;
				for (int i = 0; i < buttons.length; i++) {
					buttons[i].setVisible(false);
					if (i == 2) {
						break;
					}
				}
				for (int i = 7; i < buttons.length; i++) {
					buttons[i].setVisible(true);
					if (i == 16) {
						break;
					}
				}
				

			}
		});

		buttons[1].addActionListener(new ActionListener() {//Guess animal with loops about the visibility of the buttons
			@Override
			public void actionPerformed(ActionEvent e) {
				GameMode = 2;
				Random.Randomgen(rNumber);
				
				for (int i = 0; i < buttons.length; i++) {
					buttons[i].setVisible(false);
					if (i == 5) {
						break;
					}
				}
				for (int i = 6; i < buttons.length; i++) {
					buttons[i].setVisible(true);
					if (i == 16) {
						break;
					}
				}
				
				
				
			}
		});
		buttons[2].addActionListener(new ActionListener() {//Kids songs with loops about the visibility of the buttons
			@Override
			public void actionPerformed(ActionEvent e) {
				GameMode = 3;
				for (int i = 0; i < buttons.length; i++) {
					buttons[i].setVisible(false);
					if (i == 3) {
						break;
					}
				}
				for (int i = 3; i < buttons.length; i++) {
					buttons[i].setVisible(true);
					if (i == 5) {
						break;
					}
				}
				for (int i = 6; i < buttons.length; i++) {
					buttons[i].setVisible(false);
					if (i == 15) {
						break;
					}
				}
				buttons[16].setVisible(true);
			}
		});
		buttons[16].addActionListener(new ActionListener() {// Back button with loops about the visibility of the buttons
			@Override
			public void actionPerformed(ActionEvent e) {
				GameMode = 0;
				for (int i = 0; i < buttons.length; i++) {
					buttons[i].setVisible(true);
					if (i == 2) {
						break;
					}
				}
				for (int i = 3; i < buttons.length; i++) {
					buttons[i].setVisible(false);
					if (i == 16) {
						break;
					}
				}
				
				try {//if there is a sound active i close it.
					if (Sounds.clip.isActive()) {
					}
					Sounds.clip.close();

				} catch (Exception e1) {

				}
			}
		});
		container.setLayout(null);
		container.setVisible(true);
		
	}

	public JFrame getFrame() {
		return frame;
	}

	static public int getgameMode() {//Get Gamemode to know what the actionListener should do.
		return GameMode;
	}

}
