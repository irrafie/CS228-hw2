package edu.iastate.cs228.hw2;

import org.junit.jupiter.api.Test;

import java.io.FileNotFoundException;

import static org.junit.jupiter.api.Assertions.*;

class InsertionSorterTest {

    @Test
    void sort0() throws FileNotFoundException {
        QuickSorter temp0 = new QuickSorter();
        String[] a = {"ac","ba", "ag", "ef", "ab", "eg"};
        char[] b = {'a', 'c', 'd', 'e','f','g','b'};
        WordList test = new WordList(a);
        Alphabet ne = new Alphabet(b);
        AlphabetComparator comparator = new AlphabetComparator(ne);
        temp0.sort(test,comparator);

       // System.out.println(temp0.getTotalSortingTime());
        // assertTrue(arrayCompare(test.getArray(), trues.getArray()));
    }
    @Test
    void sort() throws FileNotFoundException {
        InsertionSorter tempa = new InsertionSorter();
        String[] a = {"a","b", "c", "d", "e", "f"};
        char[] b = {'a', 'c', 'd', 'e','f','g','b'};
        WordList test = new WordList(a);
        Alphabet ne = new Alphabet(b);
        AlphabetComparator comparator = new AlphabetComparator(ne);
        tempa.sort(test,comparator);
       // System.out.println(temp.getTotalSortingTime());
       // assertTrue(arrayCompare(test.getArray(), trues.getArray()));
    }

    @Test
    void sort_1() throws FileNotFoundException {
        InsertionSorter temp = new InsertionSorter();
        WordList test = new WordList("10.wordlist.txt");
        Alphabet te = new Alphabet("10.alphabet.txt");
        WordList trues = new WordList("10.sortedlist.txt");
        AlphabetComparator comparator = new AlphabetComparator(te);
        temp.sort(test,comparator);
        assertTrue(arrayCompare(test.getArray(), trues.getArray()));
    }

    @Test
    void sort_2() throws FileNotFoundException {
        QuickSorter temp = new QuickSorter();
        WordList test = new WordList("10.wordlist.txt");
        Alphabet te = new Alphabet("10.alphabet.txt");
        WordList trues = new WordList("10.sortedlist.txt");
        AlphabetComparator comparator = new AlphabetComparator(te);
        temp.sortWithStatistics(test,comparator, 10000);
        for(int i =0; i < test.length(); i++){
            System.out.println(test.get(i));
        }
        assertTrue(arrayCompare(test.getArray(), trues.getArray()));
    }

    @Test
    void sort_3() throws FileNotFoundException {
        MergeSorter temp = new MergeSorter();
        WordList test = new WordList("10.wordlist.txt");
        Alphabet te = new Alphabet("10.alphabet.txt");
        WordList trues = new WordList("10.sortedlist.txt");
        AlphabetComparator comparator = new AlphabetComparator(te);
        temp.sort(test,comparator);
        assertTrue(arrayCompare(test.getArray(), trues.getArray()));
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
