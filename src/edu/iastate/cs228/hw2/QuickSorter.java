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
     int index = partition(list,comp,start,end);

     if(start < index -1){
         quickSortRec(list, comp, start, index - 1);
     }

     if(end > index){
         quickSortRec(list, comp, index, end);
     }
  }

  private int partition(WordList hora, Comparator<String> comp, int start, int end) {
      Random rand = new Random(100);
      int mid = rand.nextInt(end);
        String pivot = hora.get(start);

        while(start <= end){
            while(comp.compare(hora.get(start), pivot) < 0){
                start++;
            }

            while(comp.compare(hora.get(end), pivot) > 0){
                end--;
            }

            if(start <= end){
                hora.swap(start,end);
                start++;
                end--;
            }
        }

//      int i = (start-1);
//
//    for(int j = start; j < end; j++){
//      if(comp.compare(hora.get(j), pivot) < 0){
//          i++;
//          hora.swap(i,j);
//        }
//    }
//
//    hora.swap(end,i+1);
    return start;
  }



}
