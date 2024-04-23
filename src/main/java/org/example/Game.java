package org.example;

import java.util.List;

public class Game {
    private Board board;
    List<Player> playerList;
    int nextPlayerMoveIndex;
    Player Winner;
    List<Move> moveList;
    GameState gameState;
}
