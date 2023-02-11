package _99_extra;

import java.applet.AudioClip;

import javax.swing.JApplet;
import javax.swing.JOptionPane;

public class DontForgetTheLyrics {
	/*
	 * For this game, we'll play the start of a song, and the player has to guess the rest of the lyrics.
	 * 
	 * 1. To record a sound clip, open Audacity and record your song.
	 * 
	 * 2. Click File -> Export Audio, and save your file on the Desktop.
	 * 
	 * 3. Drag your file from the Desktop into the "default package" under "src".
	 */
	
	public static void main(String[] args) {
		// 4. Make a pop-up to explain the game.
		JOptionPane.showMessageDialog(null, "I will play part of a song, and you have to guess the lyrics after.");
		int score = 0;
		// 5. Use the playSound method to play your song.
		playSound("OldMD.wav");
		// 6. Make a pop-up for the player to type their answer.
		String ans = JOptionPane.showInputDialog("Type the next line (use a dash to connect 2 of the same words and don't end with any punctuation): ");
		// 7. If they answered correctly, tell them that they were right.
		if(ans.equalsIgnoreCase("With a moo-moo here")) {
			System.out.println("Correct!");
			score ++;
		}
		// 8. Otherwise, tell them they are wrong, and give them the answer.
		else {
			System.out.println("Wrong!");
			System.out.println("Should've been: With a moo-moo here");
		}
		// 9. Record another sound and repeat steps 5-8.
		System.out.println("Your score was: " + score + ".");
		// 10. [optional] Add a points variable that will calculate their final score.
	}

	public static void playSound(String fileName) {
		AudioClip audioClip = JApplet.newAudioClip(new DontForgetTheLyrics().getClass().getResource(fileName));
		System.out.println(new DontForgetTheLyrics().getClass().getResource(fileName).toString());
		audioClip.play();
	}
}


