package edu.iastate.cs228.hw2;


import java.util.Comparator;


/**
 * An implementation of {@link Sorter} that performs merge sort
 * to sort the list.
 *
 * @author  Irfan Farhan Mohamad Rafie
 */
public class MergeSorter extends Sorter {
  WordList temp;

  @Override
  public void sort(WordList toSort, Comparator<String> comp) throws NullPointerException {
    try{
      if(toSort == null || comp == null){
       throw new NullPointerException("Null Pointer");
      }
    }
    catch (NullPointerException e){
      e.printStackTrace();
    }


    mergeSortRec(toSort, comp, 0, toSort.length()-1);
  }
  private void mergeSortRec(WordList list, Comparator<String> comp, int start, int end) {

    if(start >= end){
      return;
    }
    CountingComparator<String> countingComp = new CountingComparator<>(comp);
    int mid = (end+start)/2;
    mergeSortRec(list, countingComp, start, mid);
    mergeSortRec(list, countingComp, mid+1, end);
    merge(list, start, mid, end, countingComp);
  }

  private void merge(WordList list, int low, int mid, int end, Comparator<String> comp){
    int ha = mid - low + 1;
    int ho = end - mid;
    WordList tempA = list.cloneHalf(ha);
    WordList tempB = list.cloneHalf(ho);

    for(int x = 0; x < ha; ++x){
      tempA.set(x, list.get(low+x));
    }

    for(int y = 0; y < ho; ++y){
      tempB.set(y, list.get(mid + 1 + y));
    }

    int i = 0;
    int j = 0;

    int a = low;

    while(i < ha && j < ho){
      if(comp.compare(tempA.get(i), tempB.get(j)) <  0){
        list.set(a, tempA.get(i));
        i++;
      }
      else{
        list.set(a, tempB.get(j));
        j++;
      }
      a++;
    }

    while(i < ha){
      list.set(a, tempA.get(i));
      i++;
      a++;
    }

    while(j < ho){
      list.set(a, tempB.get(j));
      j++;
      a++;
    }


  }



}
