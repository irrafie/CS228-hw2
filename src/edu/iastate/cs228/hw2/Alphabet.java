package edu.iastate.cs228.hw2;


import java.io.FileNotFoundException;
import java.io.File;
import java.io.FileReader;
import java.util.Scanner;

/**
 * A class representing an ordering of characters that can be queried to know
 * the position of a given character.
 *
 * @author Irfan Farhan Mohamad Rafie
 */
public class Alphabet {
    /**
     * A lookup table containing characters and their positions.
     * Sorted by the character of each entry.
     */
    private CharAndPos[] lookup;

//Automate your code review with style, quality, security, and test‑coverage checks when you need them

    /**
     * Constructs and initializes the ordering to have exactly the ordering of
     * the elements in the given array.
     *
     * @param ordering the array containing the characters, in the ordering desired
     * @throws NullPointerException if {@code ordering} is {@code null}
     */
    public Alphabet(char[] ordering) throws NullPointerException {
        try {
            if(ordering == null){
                throw new NullPointerException("Null Pointer");
            }

            lookup = new CharAndPos[ordering.length];
            int i = 0;

            for(i = 0; i < ordering.length; i++){
                lookup[i] = new CharAndPos(ordering[i],i);
            }
        }
        catch(NullPointerException e){
         e.printStackTrace();
        }
    }

    /**
     * Constructs and initializes the ordering by reading from the indicated
     * file. The file is expected to have a single character on each line, and
     * the ordering in the file is the order that will be used.
     *
     * @param filename the name of the file to read
     * @throws NullPointerException  if {@code filename} is {@code null}
     * @throws FileNotFoundException if the file cannot be found
     */
    public Alphabet(String filename) throws NullPointerException, FileNotFoundException {
        Scanner inputScan = null;
        Scanner inputNum = null;
        try {
            if(filename == null){
                throw new NullPointerException("Null Pointer");
            }
            inputScan = new Scanner(new FileReader(filename));
            inputNum = new Scanner(new FileReader(filename));
            int var = 0;

            while(inputNum.hasNext()){
                var++;
                inputNum.nextLine();
            }
            lookup = new CharAndPos[var];
            for(int i = 0; i < var; i++) {
                //System.out.println(inputScan.next());
                lookup[i] = new CharAndPos(inputScan.nextLine().charAt(0), i);
            }
            }
        catch(FileNotFoundException e){
            e.printStackTrace();
        }
        catch(NullPointerException e){
            e.printStackTrace();
        }



    }


    /**
     * Returns true if and only if the given character is present in the
     * ordering.
     *
     * @param c the character to test
     * @return true if and only if the given character is present in the ordering
     */
    public boolean isValid(char c) {
        for(int i = 0; i < lookup.length;i++){
            if(lookup[i].character == c){
                return true;
            }
        }
        return false;
    }

    /**
     * Returns the position of the given character in the ordering.
     * Returns a negative value if the given character is not present in the
     * ordering.
     *
     * @param c the character of which the position will be determined
     * @return the position of the given character, or a negative value if the given
     * character is not present in the ordering
     */
    public int getPosition(char c) {
        for(int i = 0; i < lookup.length; i++){
            if(lookup[i].character == c){
                return lookup[i].position;
            }
        }
        return -1;
    }

    /**
     * Returns the index of the entry containing the given character within the
     * lookup table {@link #lookup}.
     * Returns a negative value if the given character does not have an entry in
     * the table.
     *
     * @param toFind the character for which to search
     * @return the index of the entry containing the given character, or a negative
     * value if the given character does not have an entry in the table
     */
    private int binarySearch(char toFind) {
        /*
         * note: for testing, you can perform a simple search through the array
         * instead of a binary search, allowing you to test other components with a
         * working (but slower) implementation
         */
        // TODO
        //Char boleh be compared
        //Suggestion: guna a.compareTo(b) which gives result 0 if sama, > 0 if a > b, < 0 if a < b

        // compare c1 with c2 and assign result to res
        // res = c1.compareTo(c2);
        //
        // String str1 = "Both values are equal ";
        // String str2 = "First character is numerically greater";
        // String str3 = "Second character is numerically greater";
        //
        // if( res == 0 ) {
        //    System.out.println( str1 );
        // } else if( res > 0 ) {
        //    System.out.println( str2 );
        // } else if( res < 0 ) {
        //    System.out.println( str3 );
        // }



        return -1;
    }


    /**
     * A PODT class containing a character and a position.
     * Used as the entry type within {@link Alphabet#lookup lookup}.
     */
    /* already completed */
    private static class CharAndPos {
        /**
         * The character of the entry.
         */
        public char character;

        /**
         * The position of the entry in the ordering.
         */
        public int position;


        /**
         * Constructs and initializes the entry with the given values.
         *
         * @param character the character of the entry
         * @param position  the position of the entry
         */
        public CharAndPos(char character, int position) {
            this.character = character;
            this.position = position;
        }


        @Override
        public boolean equals(Object obj) {
            if (null == obj || this.getClass() != obj.getClass()) {
                return false;
            }

            CharAndPos o = (CharAndPos) obj;

            return this.character == o.character && this.position == o.position;
        }

        @Override
        public int hashCode() {
            return character ^ position;
        }

        @Override
        public String toString() {
            return "{" + character + ", " + position + "}";
        }
    }
}
