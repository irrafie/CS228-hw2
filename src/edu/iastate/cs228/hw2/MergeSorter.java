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
    mergeSortRec(toSort, comp, 0,toSort.length()-1);
  }

  private void mergeSortRec(WordList list, Comparator<String> comp, int start, int end) {
    if(start >= end){
      return;
    }

    int center = start + (end - start) / 2;
    mergeSortRec(list,comp,start,center);
    mergeSortRec(list,comp,center+1,end);
    merge(list, comp,start, center, end);

  }

  private void merge(WordList a,Comparator<String> comp,int start, int center, int end){
    WordList temp = a.clone();
    int left = start;
    int right = center;
    int left1 = center+1;
    int right1 = end;
    int i = left;

    while((left <= right) && (left1 <= right1)){
    //  if(comp.compare(a))
    }

  }


}
