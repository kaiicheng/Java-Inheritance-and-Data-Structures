package words;

import java.util.Scanner;

/**
 * Count the syllables in the words of a sentence.
 * @author kai
 *
 */
public class SyllableCounter {

	public static void main(String[] args) {
		
		System.out.println("Enter a sentence: ");
		
		//create scanner for user input
		Scanner in = new Scanner(System.in);
		
		String input;
		Word w;
		int syllables;
		
		//while there is a word to scan
		// The hasNext() method returns true if this scanner has another token in its input
		while(in.hasNext()) {
			
			//scan next token (word)
			// The next() method finds and returns the next complete token from this scanner
			input = in.next();
			
			//create instance of Word class with user inputted word
			w = new Word(input);
			
			//count syllables in word
			syllables = w.countSyllables();
			
			//print word and count of syllables
			System.out.println("Syllables in " + w.getText() + ": " + syllables);
			
			//break out of while loop at period (end of sentence)
			// The endsWith(String suffix) method checks whether the string ends with a specific suffix
			if (input.endsWith(".")) break;
		}
		
		// The close() method is to close the scanner
		in.close();
	}
}
