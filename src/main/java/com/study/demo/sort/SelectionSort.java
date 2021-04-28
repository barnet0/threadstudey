package com.study.demo.sort;

import java.util.Set;

/**
 * @author zsy
 * @date 2021/4/19 11:00
 * @email Chauncey.zhu@redearth.com
 */
public class SelectionSort {
    public static void main(String[] args) {
        int[] arr = {2, 5, 6, 9, 1, 8, 4};
        //找出数组中最小值的下标
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i+1; j < arr.length ; j++) {
                if (arr[j] < arr[i]) {
                    int temp = arr[j];
                    arr[j] = arr[i];
                    arr[i] = temp;
                }
            }
        }

        for (int j : arr) {
            System.out.println(j);
        }
    }

    /**
     *  优化选择排序
     *  第一次循环找出最大值和最小值
     */
    public static void optimizeSelectionSort(){

        int[] arr = {2, 5, 6, 9, 9, 1, 1,8, 4,4};
        int minPos = 0;
        int maxPos = arr.length -1;

        for (int i = 0; i <= arr.length-(1+i); i++) {
            if (arr[minPos] > arr[i]){
                int temp = arr[i];
                arr[i] = arr[minPos];
                arr[minPos] = temp;
            }

            if (arr[maxPos] < arr[i]){
                int temp = arr[i];
                arr[i] = arr[maxPos];
                arr[maxPos] = temp;
            }

            for (int j = i+1; j <= arr.length-(1+i); j++) {
                if (arr[j] < arr[i]) {
                    int temp = arr[j];
                    arr[j] = arr[i];
                    arr[i] = temp;
                }
            }
        }

        for (int j : arr) {
            System.out.println(j);
        }

    }


}
