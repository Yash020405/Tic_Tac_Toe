package org.example.controllers;

import org.example.exceptions.InvalidMoveException;
import org.example.exceptions.InvalidSymbolException;
import org.example.models.Game;
import org.example.models.GameState;
import org.example.models.Player;

import java.util.HashSet;
import java.util.List;

public class GameController {
    public Game startGame(int dimension, List<Player> players) throws InvalidSymbolException {
        HashSet<Character> set = new HashSet<>();
        for(Player player : players){
            if(set.contains(player.getSymbol())){
                throw new InvalidSymbolException("Please select unique symbols for each player");
            }set.add(player.getSymbol());
        }
        return new Game(dimension, players);
    }

    public void makeMove(Game game) throws InvalidMoveException {
        game.makeMove();
    }

    public GameState checkState(Game game) {
        return game.getGameState();
    }

    public Player getWinner(Game game) {
        return game.getWinner();
    }

    public void printBoard(Game game) {
        game.printBoard();
    }
}
