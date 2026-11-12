/*
 *	Author:  
 *  Date: 
*/

package pkg;
import java.util.Scanner;
import java.util.Random;


public class BaseClass {
	String Sname;
	String Sauthor;
	String[] Slyrics = new String[15];
	public BaseClass() {
		Sname = "Song Name: You've Got Mail";
		Sauthor = "Song Author: Phantoskii";
		Slyrics[0] = "Voice recieved";
		Slyrics[1] = "Replay, replay the apprecieved";
		Slyrics[2] = "Oh, its just a memory";
		Slyrics[3] = "Retrieved, relieved my sensory";
		Slyrics[4] = "One two three";
		Slyrics[5] = "Believe, believe it's you and me";
		Slyrics[6] = "Oh, so full of euphory";
		Slyrics[7] = "Know I can feel it";
		Slyrics[8] = "Oh, grown within apathy; within a memory";
		Slyrics[9] = "You don't know how to take it";
		Slyrics[10] = "Take it all from me, view unseen";
		Slyrics[11] = "Visual, digital";
		Slyrics[12] = "It doesnt even matter";
		Slyrics[13] = "But with you and me, fluency";
		Slyrics[14] = "Our contiguity will rival what you had";
	}
	public void printSong() {
		System.out.println(Sname);
		System.out.println(Sauthor);
		for(int i = 0; i < Slyrics.length; i++) {
			System.out.println(Slyrics[i]);
		}
	}

}

