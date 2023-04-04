package com.zhu.pt02;

import java.util.Arrays;
import java.util.Random;

public class Sorter<T> {
    public void sort(T[] arrs,Comparetor<T> comparetor){
        if(arrs == null || arrs.length == 0){
            return;
        }
        for (int i = 0 ; i < arrs.length; i++) {
            for(int j = i + 1; j< arrs.length;j++){
                if(comparetor.compareTo(arrs[j],arrs[i]) < 0){
                    swap(arrs,i,j);
                }
            }
        }
    }
    public void swap(T[] arrs,int i,int j){
       T tmp = arrs[i];
        arrs[i] = arrs[j];
        arrs[j] = tmp;
     }

    public static void main(String[] args) {
//        int[] arrs = new int[new Random().nextInt(20)];
//        Arrays.setAll(arrs,i -> new Random().nextInt(50));
        Cat[] arrs = {new Cat(5),new Cat(8),new Cat(6)};
        Sorter<Cat> catSorter = new Sorter<>();

        System.out.println(Arrays.toString(arrs));
        catSorter.sort(arrs, new CatComparetor());
        System.out.println(Arrays.toString(arrs));
    }
}
