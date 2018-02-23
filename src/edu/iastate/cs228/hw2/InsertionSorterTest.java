package edu.iastate.cs228.hw2;

import org.junit.jupiter.api.Test;

import java.io.FileNotFoundException;

import static org.junit.jupiter.api.Assertions.*;

class InsertionSorterTest {

    @Test
    void sort() throws FileNotFoundException {
        InsertionSorter temp = new InsertionSorter();
        String[] a = {"ac","ba", "ag", "ef", "ab", "eg"};
        char[] b = {'b', 'a' , 'c', 'd', 'e','f','g'};
        WordList test = new WordList(a);
        Alphabet ne = new Alphabet(b);
        AlphabetComparator comparator = new AlphabetComparator(ne);
        temp.sort(test,comparator);
        for(int i = 0; i < test.length(); i++){
            System.out.println(test.get(i) );
        }
       // assertTrue(arrayCompare(test.getArray(), trues.getArray()));
    }

    @Test
    void sort_1() throws FileNotFoundException {
        InsertionSorter temp = new InsertionSorter();
        WordList test = new WordList("10.wordlist.txt");
        Alphabet te = new Alphabet("10.alphabet.txt");
        AlphabetComparator comparator = new AlphabetComparator(te);
        temp.sort(test,comparator);
        for(int i = 0; i < test.length(); i++){
            System.out.println(test.get(i) );
        }
    }


    @Test
    void sortWithStatistics() {
    }

    @Test
    void getName() {
    }

    @Test
    void getTotalWordsSorted() {
    }

    @Test
    void getTotalSortingTime() {
    }

    @Test
    void getTotalComparisons() {
    }

    private boolean arrayCompare(String[] arr1, String[] arr2)
    {
        if(arr1.length!=arr2.length)
        {
            return false;
        }
        for(int i = 0; i<arr1.length; i++)
        {
            if(!arr1[i].equals(arr2[i]))
            {
                return false;
            }
        }
        return true;
    }

}
