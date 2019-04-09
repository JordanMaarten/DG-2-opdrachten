package DG2;

import java.util.Random;

public class Galgje {

	// kiest één van de 30 woorden in de array.
	public static String randomWord() {
		Random rn = new Random();
		int randomnumber = rn.nextInt(30);
		String[] woorden = {"metaal","klimaat","stuurrad","draperen","tiener","opereren","papier","gasfles","leesteken","ongedeerd",
				"bufferen","regenmeter","kronkelen","driewieler","terras","dagloon","uranium","domein","artiest","gebaren",
				"inkoken","meedoen","evenzo","vertellen","diagram","schedel","deurbel","hindoe","provisor","trottoir"};
		return woorden[randomnumber];
		
	}
	
	// Splitst het woord in letters en zet de letters in een array.
	public static char[] charArray(String answer) {
		char[] characters = answer.toCharArray();
		return characters;
	}
	
	public static void main(String[] args) {
		String answer = randomWord();
		char[] characters = charArray(answer);
		

		for (int i = 0; i < answer.length(); i++) {
			System.out.println(characters[i]);
		}
		System.out.println(answer);
	}

}
