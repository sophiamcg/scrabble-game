package scrabble;

/**
 * An immutable data type representing a tile in a scrabble game
 * @author sophiamcgowan
 *
 */

public class Tile {
    private final char letter;
    private final int score;
    private boolean onBoard;  
    
    
    //Abstraction Function
    //  AF(letter, score, onBoard) = A tile that has letter that scores score points and is onBoard
    //Representation Invariant
    //  -score of tile must be consistent with letter/score pairings
    //  -onBoard may never switch from true to false
    //  -letter must be A-Z or blank
    //Safety From Rep Exposure
    //  -all fields are private and immutable
    //  -the only field that is not final can only be altered through one method that only allows
    //  one-way changes
    //Thread Safety Argument
    //  -letter and score and private, final, immutable
    //  -onBoard is only modified through one method that allows one way changes. Other classes will
    //   only be able to access this method if they have appropriate locks
    
    /**
     * Creates a new Tile with letter and corresponding score. The tile has not yet been played.
     * @param letter is the contents of this tile. Acceptable inputs are a-z, A-z, ' '
     */
    public Tile(char letter) {
        this.letter= Character.toUpperCase(letter);
        this.score = PlayRules.LETTER_SCORES.get(this.letter);
        this.onBoard = false;
        checkRep();
    }
    
    //Asserts the rep invariants
    private void checkRep() {
        //score of tile must be consistent with letter/score pairings
        assert this.score == PlayRules.LETTER_SCORES.get(this.letter);
        
        //letter must be A-Z or blank
        assert Character.isUpperCase(this.letter) || this.letter == ' ';
    }
    
    /**
     * Returns letter contents of tile
     */
    public char letter() {
        return this.letter;
    }
    
    /**
     * Returns score contents of tile
     */
    public int score() {
        return this.score;
    }
    
    /**
     * Returns whether tile has been played
     */
    public boolean onBoard() {
        return this.onBoard;
    }
    
    /**
     * Places a tile on the board
     */
    public void playTile() {
        onBoard = true;
    }
     

}
