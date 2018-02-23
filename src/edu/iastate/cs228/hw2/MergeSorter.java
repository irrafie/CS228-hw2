package edu.iastate.cs228.hw2;


import java.util.Comparator;


/**
 * An implementation of {@link Sorter} that performs merge sort
 * to sort the list.
 *
 * @author  Irfan Farhan Mohamad Rafie
 */
public class MergeSorter extends Sorter {

  @Override
  public void sort(WordList toSort, Comparator<String> comp) throws NullPointerException {
    if(toSort.length()<2){
      return;
    }
    // TODO
    mergeSortRec(toSort, comp, 0,toSort.length()-1);
  }

  private void mergeSortRec(WordList list, Comparator<String> comp, int start, int end) {
    if(start >= end){
      return;
    }

    for(int i = start; start < end; i++){

    }

    int center = (start + end)/2;
    mergeSortRec(list,comp,start,center);
    mergeSortRec(list,comp,center+1,end);
  }
}
