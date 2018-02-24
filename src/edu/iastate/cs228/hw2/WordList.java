package edu.iastate.cs228.hw2;


import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;


/**
 * A simple list of Strings.
 *
 * @author  Irfan Farhan Mohamad Rafie
 */
public class WordList implements Cloneable {
  /**
   * The array holding all of the elements of the list.
   */
  private String[] words;


  /**
   * Constructs and initializes the list to have exactly the same contents as
   * the given array.
   *
   * @param contents
   *   the array with the contents of the new list
   * @throws NullPointerException
   *   if {@code contents} is {@code null}
   */
  public WordList(String[] contents) throws NullPointerException {
    // TODO
    try{
      if(contents.equals(null)){
        throw new NullPointerException("Null Pointer");
      }
      words = contents;
    }
    catch (NullPointerException e){
      e.printStackTrace();
    }
  }

  /**
   * Constructs and initializes the list by reading from the indicated file.
   * The file is read assuming that each line contains a word. The ordering in
   * the file is the order that will be used by the list.
   *
   * @param filename
   *   the name of the file to read
   * @throws NullPointerException
   *   if {@code filename} is {@code null}
   * @throws FileNotFoundException
   *   if the file cannot be found
   */
  public WordList(String filename) throws NullPointerException, FileNotFoundException {
    // TODO
      try{
          if(filename == null){
              throw new NullPointerException("Null Pointer");
          }
          Scanner input = new Scanner(new FileReader(filename));
          Scanner inputNum = new Scanner(new FileReader(filename));
          int i = 0;
          while(inputNum.hasNext()){
              i++;
              inputNum.nextLine();
          }
          words = new String[i];

          for(int x = 0; x < i; x++){
              words[x] = input.nextLine();
          }
      }
      catch(NullPointerException e){
          e.printStackTrace();
      }

      catch (FileNotFoundException e){
          e.printStackTrace();
      }
  }

    public WordList() {

    }


    /**
   * Returns the number of elements in the list.
   *
   * @return
   *   the number of elements in the list
   */
  public int length() {
    return words.length;
  }

  /**
   * Returns the element of the list at the indicated index.
   *
   * @param idx
   *   the index of the element to retrieve
   * @return
   *   the element at the indicated index
   * @throws IndexOutOfBoundsException
   *   if {@code idx} is negative or greater than or equal to the length of
   *   the list
   */
  public String get(int idx) throws IndexOutOfBoundsException
  {
    // TODO
    try{
        if(idx < 0 || idx > length()){
            throw new IndexOutOfBoundsException("Index Out of Bounds");
        }

        return words[idx];
    }
    catch (IndexOutOfBoundsException e){
        e.printStackTrace();
    }

    return null;
  }

  /**
   * Sets the element of the list at the indicated index to the given value.
   *
   * @param idx
   *   the index of the element to set
   * @param newValue
   *   the new value of the element
   * @throws IndexOutOfBoundsException
   *   if {@code idx} is negative or greater than or equal to the length of the
   *   list
   */
  public void set(int idx, String newValue) throws IndexOutOfBoundsException {
      try{
          if(idx < 0 || idx > length()){
              throw new IndexOutOfBoundsException("Index Out of Bounds");
          }
          words[idx] = newValue;
      }
      catch (IndexOutOfBoundsException e){
          System.out.println("Index to set is out of bounds");
      }
  }

  /**
   * Swaps the indicated elements in the list.
   *
   * @param idxA
   *   the index of one of the elements to swap
   * @param idxB
   *   the index of the other element to swap
   * @throws IndexOutOfBoundsException
   *   if either of {@code idxA} or {@code idxB} is negative or greater than or
   *   equal to the length of the list
   */
  public void swap(int idxA, int idxB) throws IndexOutOfBoundsException {
      try{
          if(idxA < 0 || idxA > words.length || idxB < 0 || idxB > words.length){
              throw new IndexOutOfBoundsException("Index Out of Bounds");
          }

          String temp = words[idxA];
          words[idxA] = words[idxB];
          words[idxB] = temp;
      }
      catch (IndexOutOfBoundsException e){
          e.printStackTrace();
      }
  }

  /**
   * Returns the array used by the list to store its elements.
   *
   * @return
   *   the array used by the list to store its elements
   */
  public String[] getArray() {
    return words;
  }

  /**
   * Performs a deep copy of the list.
   */
  @Override
  public WordList clone() {
    /*
     * note: since Strings are immutable, you don't need to clone them
     */

      WordList next = new WordList(words);
      for(int i = 0; i < words.length; i++){
        next.words[i] = words[i];
      }

    return next;
  }

  public WordList cloneHalf(int size){
      int j = 0;
      String[] temp = new String[size];
      while(j < size){
          temp[j] = words[j];

          j++;
      }

      WordList tempo = new WordList(temp);
      return tempo;
  }
}
