package edu.iastate.cs228.hw2;


import java.util.Comparator;
import java.util.Random;


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
      CountingComparator<String> countingComp = new CountingComparator<>(comp);
      try{
          if(toSort == null){
              throw new NullPointerException("Null Pointer");
          }
          quickSortRec(toSort, countingComp, 0, toSort.length()-1);
      }
      catch (NullPointerException e){
          e.printStackTrace();
      }
  }

  private void quickSortRec(WordList list, Comparator<String> comp, int start, int end) {
      if(start < end){
         int index = partition(list,comp,start,end);
         quickSortRec(list, comp, start, index-1);
         quickSortRec(list,comp,index+1,end);
      }
  }

  private int partition(WordList hora, Comparator<String> comp, int start, int end) {
      Random rand = new Random();
      int num = start + rand.nextInt(end-start);
      String pivot = hora.get(end);
      int i = (start-1);

    for(int j = start; j < end; j++){
      if(comp.compare(hora.get(j), pivot) < 0){
          i++;
          hora.swap(i,j);
        }
    }

    hora.swap(end,i+1);
    return i+1;
  }
}
