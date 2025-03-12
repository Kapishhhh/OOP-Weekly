package week3;

import java.util.Scanner;

public class StringReverser {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);
        System.out.print("Enter a sentence: ");
        String sentence = scan.nextLine();
        
        String[] words = sentence.split(" ");
        StringBuilder reversedSentence = new StringBuilder();
        
        for (String word : words) {
            StringBuilder reversedWord = new StringBuilder(word);
            reversedSentence.append(reversedWord.reverse()).append(" ");
        }
        
        System.out.println("Reversed sentence: " + reversedSentence.toString().trim());
        scan.close();
    }
		
	}
