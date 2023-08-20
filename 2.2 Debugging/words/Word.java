/**
 * Represents a word with functionality for counting syllables.
 * @author kai
 * Input: This class is amazing, although the homework can be difficult, everyone loves it.
 */

package words;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Word {
	
	/**
	 * Clean text for word.
	 */
	private String text; 
	
	//constructor
	//trim word having number
	// 123This456 -> This
	public Word(String s) {
		
		
		//trim beginning of word
		// i is index
		int i = 0;
		while (i < s.length() && !Character.isLetter(s.charAt(i))) {
			i++;
		}
		
		//trim end of word
		int j = s.length() - 1;
		while (j > i && !Character.isLetter(s.charAt(j))) {
			j--;
		}
		
		//gets a substring of given s based on i an j
		//stores it as text for word
		//e.g. 123hello321 will be stored as hello
		// substring(i, j) doesn't include index j! Only from i to j - 1
		this.text = s.substring(i, j + 1);
	}
	
	/**
	 * Counts the syllables in the word.
	 * Bases count of syllables on location of vowels in the word.
	 * @return syllable count
	 */
	public int countSyllables() {
		
		//set initial count of syllables
		int count = 0;
		
		//get index of last character in word
		int end = this.text.length() - 1;
		
		//if word has no chars, consider 0 syllables
		if (end < 0) {
			return 0;
		}
		
		//An 'e' at the end of the word doesn't count as beginning of new syllable
		//So decrement end index
		// this.text refers to the instance variable text declared in the Word class
		char ch = this.text.charAt(end);
		if (ch == 'e' || ch == 'E') {
			end--;
		}
		
		//set flag for being inside a syllable
		boolean insideSyllable = false;
		
		//iterate over characters in the word and look for vowels
		for (int i = 0; i <= end; i++) {
			
			//get each character
			ch = this.text.charAt(i);
			
			//determine if character is a vowel
			//create a "character class" using regular expression
			//containing every vowel we're looking for (lower and upper) in the word
			String vowelRegex = "[aeiouAEIOU]";
			
			//create pattern to match with character
			// The compile(String) method is used to create a Pattern from the regular expression passed
			// as an argument to the method
			Pattern p = Pattern.compile(vowelRegex);
			
			//find matches in char (casted to a String)
			// The matcher(String input) method creates a Matcher that will match the given input 
			// against the Pattern
			Matcher m = p.matcher(ch + "");
			
			//if it is a vowel, enter syllable
			// The matches() method checks whether the string matches the given regular expression
			if (m.matches()) {
				if (!insideSyllable) {
					count++;
					insideSyllable = true;
				}
			} else {
				//reset flag back to false
				insideSyllable = false;
			}
		}
		
		//every word has at least one syllable
		if (count == 0) {
			count = 1;
		}
		
		return count;
	}
	
	/**
	 * Get word text.
	 * @return text
	 */
	public String getText() {
		return this.text;
	}
}