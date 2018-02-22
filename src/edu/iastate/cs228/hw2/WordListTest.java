package edu.iastate.cs228.hw2;

import org.junit.jupiter.api.Test;

import java.io.FileNotFoundException;

import static org.junit.jupiter.api.Assertions.*;

class WordListTest {

    String[] temp = {"test", "here", "LOL", "death", "white", "rainbow"};
    WordList tested = new WordList(temp);
    //WordList tested = new WordList(temp);
    @Test
    void length_array() {
        assertEquals(tested.length(), 6);
    }

    @Test
    void length_file() throws FileNotFoundException {
        tested = new WordList("10.wordlist.txt");
        assertEquals(tested.length(), 10);
    }

    @Test
    void get_1() throws FileNotFoundException {
        tested = new WordList("10.wordlist.txt");
        assertEquals(tested.get(5), "l[b");
    }

    @Test
    void get_2(){
        tested = new WordList(temp);
        assertEquals(tested.get(4), "white");
    }

    @Test
    void set() {
        tested = new WordList(temp);
        tested.set(4, "blanc");
        assertEquals(tested.get(4), "blanc");
    }

    @Test
    void swap() {
        tested = new WordList(temp);
        tested.swap(4,5);
        assertEquals(tested.get(4), "rainbow");
        assertEquals(tested.get(5), "white");
        tested.swap(1,5);
        assertEquals(tested.get(1),"white");
        assertEquals(tested.get(5), "here");
    }

    @Test
    void getArray() {
        assertEquals(temp, tested.getArray());
    }

}