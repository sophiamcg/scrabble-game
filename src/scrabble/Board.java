package scrabble;

import java.util.Map;
import java.util.Set;

public class Board {
    private Map<int[], Tile> boardTiles;
    
    //Abstraction Function:
    //  AF(boardTiles) = a board that contains tiles at the corresponding coordinates.
    //Representation Invariant:
    //  - Coordinates are 1-index arrayed and 1 <= x <= 20, 1 <= y <= 20
    //  - Tiles are restricted by what is available for the game (specified in PlayRules)
    //Safety From Rep Exposure:
    //  - fields are private but mutable. Fields can only be mutated through mutators. 
    //Thread Safety Argument:
    //  - Board is not threadsafe but will be locked and only accessed by a client who obtains
    //  the lock.
}
