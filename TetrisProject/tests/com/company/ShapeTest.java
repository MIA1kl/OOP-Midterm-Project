package com.company;

import org.junit.Test;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

import static org.junit.Assert.*;


public class ShapeTest {

    @Test
    public void ourScoreTest1() {
        Shape shape = new Shape();
        String answer=shape.ourScore(-5);
        assertEquals("Invalid score", answer);
    }

    @Test
    public void ourScoreTest2() {
        Shape shape = new Shape();
        String answer=shape.ourScore(0);
        assertEquals("Too bad, play again", answer);
    }

    @Test
    public void ourScoreTest3() {
        Shape shape = new Shape();
        String answer=shape.ourScore(10);
        assertEquals("It is good score, but try do better", answer);
    }

    @Test
    public void ourScoreTest4() {
        Shape shape = new Shape();
        String answer=shape.ourScore(25);
        assertEquals("It is excellent score. Good job!!!", answer);
    }

}
