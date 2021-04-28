package com.study.demo.sort;

/**
 * @author zsy
 * @date 2021/4/28 10:32
 * @email Chauncey.zhu@redearth.com
 */
public class InsertionSort {


    public static void main(String[] args) {
        int[] a = {5,7,9,2,3};

        sort(a);

        for (int j : a){
            System.out.println(j);
        }
    }

    static void sort(int[] a){
        for (int i = 0; i < a.length; i++) {
            for (int j = i ; j > 0; j--) {
                if (a[j] < a[j-1]){
                    swap(a,j,j-1);
                }
            }
        }
    }

    static void swap(int[] arr,int i,int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
