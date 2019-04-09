package DG2;

import java.util.Random;
import java.util.Scanner;

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
	
	public static void letterCheck(char[] characters, boolean scannen) {
		Scanner scanner = new Scanner(System.in);
		
		int kansen = 5;
		while (scannen) {
			char letter = scanner.next().charAt(0);
			boolean fout = true;
			
			for(int i = 0; i < characters.length; i++) {
				System.out.println(characters[i]);
				
				if(characters[i] == letter && kansen != 0) {
					fout = false;
				}	
			}
			
			if (fout == true && kansen != 0) {
				kansen--;
				System.out.println("U hebt nog: " + kansen + " kansen.");
				fout = false;
			}
			
			if (kansen == 0) {
				System.out.println("hang jezelf");
				scannen = false;
			}
			
		}
		
	}
	
	public static void main(String[] args) {
		String woord = randomWord();
		char[] characters = charArray(woord);
		boolean scannen = true;
		letterCheck(characters, scannen);
	}
}
