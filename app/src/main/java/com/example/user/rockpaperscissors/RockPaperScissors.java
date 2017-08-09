package com.example.user.rockpaperscissors;

import java.util.ArrayList;
import java.util.Random;

/**
 * Created by user on 09/08/2017.
 */

public class RockPaperScissors {

    ArrayList<String> games;
    String myHand;
    String copHand;


    public RockPaperScissors() {

        games = new ArrayList<String>();

    }

    public RockPaperScissors(ArrayList<String> newGame ){
        games = newGame;
    }

    public ArrayList<String> getGame(){
        return new ArrayList<String>(games);
    }

    public  int getLength(){
        return games.size();
    }

    public void setGame(){
        String[] gameToAdd = {
                "rock",
                "paper",
                "scissors"
        };
        for(String game : gameToAdd){
            games.add(game);
        }
    }

    public void add(String newGame){
        games.add(newGame);
    }

    public String getGameAtIndex(int game){
        return games.get(game);
    }

    public String getAnswer() {
        Random rand = new Random();
        int listSize = getLength();
        int game = rand.nextInt(listSize);
        return getGameAtIndex(game);
    }

    public String gameLogic(String myHand, String copHand) {
        if (myHand == copHand) {
            return "Draw!";

        } else if (myHand == "rock" && copHand == "scissors") {
            return "You win!";
        } else if (myHand == "rock" && copHand == "paper") {
            return "You lose!";
        } else if (myHand == "paper" && copHand == "scissors") {
            return "You lose!";
        } else if (myHand == "paper" && copHand == "rock") {
            return "You win!";
        } else if (myHand == "scissors" && copHand == "paper") {
            return "You win!";
        } else if (myHand == "scissors" && copHand == "rock") {
            return "You lose!";
        }
        return "Try again";
    }

}
