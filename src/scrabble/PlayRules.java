package scrabble;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class PlayRules {
    
    public static final Map<Character, Integer> LETTER_SCORES;
    static {
        Map<Character, Integer> letters = new HashMap<>();
        letters.put('A', 1);
        letters.put('B', 3);
        letters.put('C', 3);
        letters.put('D', 2);
        letters.put('E', 1);
        letters.put('F', 4);
        letters.put('G', 2);
        letters.put('H', 4);
        letters.put('I', 1);
        letters.put('J', 8);
        letters.put('K', 5);
        letters.put('L', 1);
        letters.put('M', 3);
        letters.put('N', 1);
        letters.put('O', 1);
        letters.put('P', 3);
        letters.put('Q', 10);
        letters.put('R', 1);
        letters.put('S', 1);
        letters.put('T', 1);
        letters.put('U', 1);
        letters.put('V', 4);
        letters.put('W', 4);
        letters.put('X', 8);
        letters.put('Y', 4);
        letters.put('Z', 10);
        letters.put(' ', 0);
        LETTER_SCORES = Collections.unmodifiableMap(letters);
    }
    
    public static final Map<Character, Integer> LETTER_FREQS;
    static {
        Map<Character, Integer> freqs = new HashMap<>();
        freqs.put('A', 9);
        freqs.put('B', 2);
        freqs.put('C', 2);
        freqs.put('D', 4);
        freqs.put('E', 12);
        freqs.put('F', 2);
        freqs.put('G', 3);
        freqs.put('H', 2);
        freqs.put('I', 9);
        freqs.put('J', 1);
        freqs.put('K', 1);
        freqs.put('L', 4);
        freqs.put('M', 2);
        freqs.put('N', 6);
        freqs.put('O', 8);
        freqs.put('P', 2);
        freqs.put('Q', 1);
        freqs.put('R', 6);
        freqs.put('S', 4);
        freqs.put('T', 6);
        freqs.put('U', 4);
        freqs.put('V', 2);
        freqs.put('W', 2);
        freqs.put('X', 1);
        freqs.put('Y', 2);
        freqs.put('Z', 1);
        freqs.put(' ', 2);
        LETTER_FREQS = Collections.unmodifiableMap(freqs);
    }

}
