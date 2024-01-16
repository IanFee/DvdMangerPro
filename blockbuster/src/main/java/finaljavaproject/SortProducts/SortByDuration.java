/**
 * Comparator implementation for sorting DVDs based on their duration values in ascending order.
 * 
 * @author Iana Feniuc
 * @since 2023-11-28
 */
package finaljavaproject.SortProducts;

import java.util.Comparator;

import finaljavaproject.Products.Dvd;

public class SortByDuration implements Comparator<Dvd>{

     /**
     * Compares two DVDs based on their duration values.
     *
     * @param product1 The first DVD to compare.
     * @param product2 The second DVD to compare.
     * @return         -1 if the duration of product1 is less than that of product2, 1 if greater, 0 if equal.
     */
    public int compare(Dvd product1, Dvd product2){
        if(product1.getDuration() < product2.getDuration()){
            return -1;
        }
        else if(product1.getDuration() > product2.getDuration()){
            return 1;
        }
        else{
            return 0;
        }
    }
    
}
