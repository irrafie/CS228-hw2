package edu.iastate.cs228.hw2;


import java.util.Comparator;


/**
 * An implementation of {@link Sorter} that performs quick sort
 * to sort the list.
 *
 * @author  Irfan Farhan Mohamad Rafie
 */
public class QuickSorter extends Sorter {
  @Override
  public void sort(WordList toSort, Comparator<String> comp) throws NullPointerException
  {
    // TODO
      try{
          if(toSort == null){
              throw new NullPointerException("Null Pointer");
          }
          quickSortRec(toSort, comp, 0, toSort.length()-1);
      }
      catch (NullPointerException e){
          e.printStackTrace();
      }
  }

  private void quickSortRec(WordList list, Comparator<String> comp, int start, int end) {
    // TODO
      if(start < end){
         int index = partition(list,comp,start,end);
         quickSortRec(list, comp, start, index-1);
         quickSortRec(list,comp,index+1,end);
      }
  }

  private int partition(WordList list, Comparator<String> comp, int start, int end) {
    // TODO
    String pivot = list.get(end);
    int i = (start-1);
    for(int j = start; j <= end; j++){
      if(comp.compare(list.get(j), pivot) < 0){
          i++;
          list.swap(i,j);
        }
    }

    list.swap(end,i+1);
    return i+1;
  }
}
