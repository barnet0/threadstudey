package com.study.demo.sort;

/**
 * @author zsy
 * @date 2021/4/27 9:58
 * @email Chauncey.zhu@redearth.com
 */
public class BubbleSort {
    /**
     * 冒泡排序
     */

    public static void main(String[] args) {
        int[] arr = {1,6,5,9,2,3,4};
        sort(arr);

        for (int j : arr){
            System.out.println(j);
        }
    }

    static void sort(int[] arr) {
        for (int i = arr.length -1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (arr[j] > arr[j+1]){
                    swap(arr,j,j+1);
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
