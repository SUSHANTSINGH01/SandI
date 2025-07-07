package sANDl;

import java.util.Random;

public class Dice {

	public static int randomNum() {
		Random rand = new Random();
	    return rand.nextInt(6) + 1;
	}
}
