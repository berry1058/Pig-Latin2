package pigLatinpkg2;

import java.util.Scanner;

public class PigLatin2 {

	public static void main(String[] args) {

		char firstLetter;
		char secondLetter;
		System.out.println("Enter a name to start our Pig Latin program");
		Scanner keyboard = new Scanner(System.in);
		String nameInput;
		int length;
		nameInput = keyboard.nextLine();
		StringBuilder pigLatinChange = new StringBuilder(nameInput);
		firstLetter = pigLatinChange.charAt(0);
		secondLetter = pigLatinChange.charAt(1);

		System.out.println();
		
		System.out.println("Here is your Pig Latin name!!!");
		
		if (((consanantsAndVowels(firstLetter) == false)) && (consanantsAndVowels(secondLetter) == false)) {

			pigLatinChange = pigLatinChange.deleteCharAt(0);
			length = pigLatinChange.length();

			pigLatinChange = pigLatinChange.deleteCharAt(0);
			

			pigLatinChange = pigLatinChange.insert(pigLatinChange.length(), firstLetter + "" + secondLetter + "ay");
			System.out.println(pigLatinChange);

		} else if (consanantsAndVowels(firstLetter) == false) {
			pigLatinChange = pigLatinChange.deleteCharAt(0);
			length = pigLatinChange.length();
			pigLatinChange = pigLatinChange.insert(pigLatinChange.length(), firstLetter + "ay");
			System.out.println(pigLatinChange);
		} else {
			
			
			System.out.println(nameInput + " ay");
		}
	}

	public static boolean consanantsAndVowels(char numberOneLetter) {
		boolean vowels = false;

		if (numberOneLetter == 'a') {
			vowels = true;
			return vowels;
		} else if (numberOneLetter == 'A') {
			vowels = true;
			return vowels;
		} else if (numberOneLetter == 'e') {
			vowels = true;
			return vowels;
		} else if (numberOneLetter == 'E') {
			vowels = true;
			return vowels;
		} else if (numberOneLetter == 'i') {
			vowels = true;
			return vowels;
		} else if (numberOneLetter == 'I') {
			vowels = true;
			return vowels;
		} else if (numberOneLetter == 'o') {
			vowels = true;
			return vowels;
		} else if (numberOneLetter == 'O') {
			vowels = true;
			return vowels;
		} else if (numberOneLetter == 'u') {
			vowels = true;
			return vowels;
		} else if (numberOneLetter == 'U') {
			vowels = true;
			return vowels;
		}

		return vowels;
	}

}
