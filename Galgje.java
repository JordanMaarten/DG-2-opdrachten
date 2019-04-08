package DG2;

import java.util.Random;

public class Galgje {

	public static String randomWord() {
		Random rn = new Random();
		int randomnumber = rn.nextInt(30);
		String[] woorden = {"metaal","klimaat","stuurrad","draperen","tiener","opereren","papier","gasfles","leesteken","ongedeerd",
				"bufferen","regenmeter","kronkelen","driewieler","terras","dagloon","uranium","domein","artiest","gebaren",
				"inkoken","meedoen","evenzo","vertellen","diagram","schedel","deurbel","hindoe","provisor","trottoir"};
		return woorden[randomnumber];
		
	}
	public static void main(String[] args) {
		
	}

}
