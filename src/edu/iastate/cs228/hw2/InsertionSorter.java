package edu.iastate.cs228.hw2;


import java.util.Comparator;


/**
 * An implementation of {@link Sorter} that performs insertion sort
 * to sort the list.
 *
 * @author  Irfan Farhan Mohamad Rafie
 */
public class InsertionSorter extends Sorter {

    @Override
    public void sort(WordList toSort, Comparator<String> comp) throws NullPointerException {
        try{
            if(toSort == null || comp == null){
                throw new NullPointerException("Null Pointer");
            }
            CountingComparator<String> countingComp = new CountingComparator<>(comp);
            for(int i = 0; i < toSort.length(); i++){
                String a = toSort.get(i);
                int b = i-1;

                while(b >= 0 && countingComp.compare(toSort.get(b),a) > 0){
                    //toSort.set(b+1,toSort.get(b));
                    toSort.swap(b+1,b);
                    b--;
                }
                toSort.set(b+1, a);
            }
        }
        catch (NullPointerException e){
            e.printStackTrace();
        }
    }
}
