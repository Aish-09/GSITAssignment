package liveassignments;

import java.util.*;
import java.util.Map.*; // WHAT: Imports Map.Entry directly
                        // HOW: Lets us write Entry<Character, Integer> cleanly in the loop
                        // WHEN: Use when iterating over both keys and values of a Map

public class CharacterFrequencyCompression {

	public static void main(String[] args) {
		
		// WHAT: Input string highlighted on Priyanka's Notepad screen
		// HOW: Stored as a String; we will break it into individual characters
		String input = "aaabbc";
		
		// WHAT: LinkedHashMap stores each unique Character (Key) and its occurrence count (Value)
		// HOW: Preserves the exact insertion order ('a' first, 'b' second, 'c' third)
		// WHEN: Use instead of HashMap whenever output sequence must match first appearance order (a3b2c1)
		Map<Character, Integer> charCountMap = new LinkedHashMap<>();
		
		// WHAT: Enhanced for-loop iterating over input.toCharArray()
		// HOW: Converts the String into a char[] array and counts occurrences in a single O(n) pass
		// WHEN: Use whenever analyzing character frequencies, duplicates, or anagrams in strings
		for (char ch : input.toCharArray()) {
			// getOrDefault(ch, 0) fetches the existing count for 'ch', or 0 if seen for the first time
			charCountMap.put(ch, charCountMap.getOrDefault(ch, 0) + 1);
		}
		
		// WHAT: StringBuilder efficiently constructs the compressed output string ("a3b2c1")
		// HOW: Appends each character key followed immediately by its integer count without creating extra String objects
		// WHEN: Use inside loops when building strings dynamically instead of using '+' concatenation
		StringBuilder result = new StringBuilder();
		
		// WHAT: Iterating over entrySet() to combine each character and its frequency
		// HOW: Extracts each Entry<Character, Integer> pair in exact insertion order
		// WHEN: Use when you need both the character key and its count together
		for (Entry<Character, Integer> e : charCountMap.entrySet()) {
			result.append(e.getKey()).append(e.getValue());
		}
		
		System.out.println("Input:  " + input);
		System.out.println("Output: " + result.toString()); // Prints: a3b2c1
	}
}