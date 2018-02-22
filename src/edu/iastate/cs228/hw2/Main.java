package edu.iastate.cs228.hw2;

import java.io.FileNotFoundException;

public class Main {

    public static void main(String[] args) throws FileNotFoundException {
        String[] temp = {"test", "here", "LOL", "death", "white", "rainbow"};
        WordList tested = new WordList(temp);
        System.out.println(temp[1]);
    }
}
