package edu.iastate.cs228.hw2;

import org.testng.annotations.Test;

import java.io.FileNotFoundException;

import static org.junit.jupiter.api.Assertions.*;

class FullTest {

    Alphabet testConstruct = null;
    WordList testWords =  null;

    @Test
    void testCompare() throws FileNotFoundException {
        String[] temp = {"alpha", "aeta", "charlie"};
        char[] tempAlphabet = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'};
        testWords = new WordList(temp);
        testConstruct = new Alphabet(tempAlphabet);
        AlphabetComparator comparator = new AlphabetComparator(testConstruct);
        int t = comparator.compare(testWords.get(0),testWords.get(1));
        assertTrue(t > 0);
    }


}