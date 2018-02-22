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

    @Test
    public void testConstruct() throws FileNotFoundException {
        Alphabet testConstruct = new Alphabet("10.alphabet.txt");
        assertEquals(testConstruct.getPosition('M'), 1);
    }
}