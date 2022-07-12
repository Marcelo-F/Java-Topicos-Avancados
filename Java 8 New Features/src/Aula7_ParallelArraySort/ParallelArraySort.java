package Aula7_ParallelArraySort;

import java.util.Arrays;

public class ParallelArraySort {
    public static void main(String[] args) {
        int[] meu_array ={5,8,1,0,6,9,50,-3};
        for (int i :meu_array){
            System.out.println(i+" ");
        }

        System.out.println("Array ordenada com parallelSort ");
        Arrays.parallelSort(meu_array);
        for (int i :meu_array){
            System.out.println(i+" ");
        }

    }
}
