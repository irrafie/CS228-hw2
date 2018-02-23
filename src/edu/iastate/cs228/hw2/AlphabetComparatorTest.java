package edu.iastate.cs228.hw2;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AlphabetComparatorTest {

    @Test
    void compare() {
        char[] to = {'w', 'M', 'l', 'R', 'y', 'a', '5', 'I', 'o', '9', 'x', 'Z', 'b'};
        Alphabet tw = new Alphabet(to);
        AlphabetComparator teno = new AlphabetComparator(tw);
        System.out.println(teno.compare("yR","ab"));
    }
}