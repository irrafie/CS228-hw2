package edu.iastate.cs228.hw2;

import org.junit.jupiter.api.Test;

import java.io.FileNotFoundException;

import static org.junit.jupiter.api.Assertions.*;

class AlphabetTest {

    @org.junit.jupiter.api.Test
    void isValid() {
    }

    @org.junit.jupiter.api.Test
    void getPosition() {
    }
    Alphabet testConstruct = null;
    @Test
    public void testConstruct_10_File() throws FileNotFoundException {
        testConstruct = new Alphabet("10.alphabet.txt");
        assertEquals(testConstruct.getPosition('M'), 1);
    }

    @Test
    public void testConstruct_100_File() throws FileNotFoundException{
        testConstruct = new Alphabet("100.alphabet.txt");
        assertEquals(testConstruct.getPosition('g'), 27);
    }

    @Test
    public void testConstruct_1000_File() throws FileNotFoundException{
        testConstruct = new Alphabet("1000.alphabet.txt");
        assertEquals(testConstruct.getPosition('#'), 21);
    }

    @Test
    public void testConstruct_10000_File() throws FileNotFoundException{
        testConstruct = new Alphabet("10000.alphabet.txt");
        assertEquals(testConstruct.getPosition('z'), 62);
    }

    @Test
    public void testConstruct_Array_1(){
        char[] temp = {'t','y', 'q', 'p', 'o', 's', 'i', 'c', 'z', 'm'};
        testConstruct = new Alphabet(temp);
        assertEquals(testConstruct.getPosition('p'), 3);
    }

    @Test
    public void testConstruct_Array_2(){
        char[] temp = {'t', 'y', 'e', 'a', 'p', 'u', ' ', 'q'};
        testConstruct = new Alphabet(temp);
        assertEquals(testConstruct.getPosition('p'), 4);
    }
        Alphabet testConstruct2 = null;
    @Test
    public void testEquals_1(){
        char[] temp = {'t', 'y', 'e', 'a', 'p', 'u', ' ', 'q'};
        char[] temp2 = {'y', 'e', 'p', 'a', 'u', ' ', 'q'};
        testConstruct = new Alphabet(temp);
        testConstruct2 = new Alphabet(temp2);
        //assertEquals(,true);
    }
}