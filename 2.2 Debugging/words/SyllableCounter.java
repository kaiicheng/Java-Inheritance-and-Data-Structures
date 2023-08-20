/**
 * Count the syllables in the words of a sentence.
 * @author kai
 * input: This class is amazing, although the homework can be difficult, every loves it.
 */
package words;

import java.util.Scanner;

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
			
			System.out.println(input);
			
			//create instance of Word class with user inputed word
			// 123This456 -> This
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
