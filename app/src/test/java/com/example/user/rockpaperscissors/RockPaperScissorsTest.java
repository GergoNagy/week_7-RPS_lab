package com.example.user.rockpaperscissors;


import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static junit.framework.Assert.assertEquals;
import static junit.framework.Assert.assertNotNull;

public class RockPaperScissorsTest {


    ArrayList<String> testGame;
    RockPaperScissors game;



    @Before
    public void before(){
        game = new RockPaperScissors();
        testGame = new ArrayList<String>();
        testGame.add("rock");
        testGame.add("paper");
        testGame.add("scissor");
    }

    @Test
    public void testGame(){
        assertEquals("You lose!", game.gameLogic("rock", "paper"));
    }


    @Test
    public void testGetAnswer(){
        RockPaperScissors rockPaperScissors = new RockPaperScissors();
        assertNotNull(rockPaperScissors.getLength());
    }
}
