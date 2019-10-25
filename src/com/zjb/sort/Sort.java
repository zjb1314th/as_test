package com.zjb.sort;

import java.util.Arrays;

public class Sort {

    private static int[] arr = {9, 1, 2, 7, 6, 3, 4, 5, 8, 10};

    public static void main(String[] args) {
//        select_sort(arr);
//        bubble_sort(arr);
//        quick_sort(arr, 0, arr.length - 1);
//        insert_sort(arr);
        System.out.println(Arrays.toString(arr));
    }

    /**
     * 选择排序
     * @param arr
     */
    private static void select_sort(int[] arr) {
        for(int i = 0, len = arr.length; i < len; i++) {
            for(int j = i + 1; j < len; j ++) {
                if(arr[i] > arr[j]) {
                    swap(i, j);
                }
            }
        }
    }

    /**
     * 冒泡排序
     * @param arr
     */
    private static void bubble_sort(int[] arr) {
        for(int i = 0, len = arr.length - 1; i < len; i++) {
            //flag为交换标志位，如果哪一次没有交换，则说明数组已经排好序，可直接跳出循环
            boolean flag = false;
            for(int j = 0; j < len - i; j ++) {
                if(arr[j] < arr[j + 1]) {
                    swap(j, j + 1);
                    flag = true;
                }
            }
            if(!flag) {
                break;
            }
        }
    }

    /**
     * 快速排序
     * @param arr
     * @param left
     * @param right
     */
    private static void quick_sort(int[] arr, int left, int right) {
        if(left >= right) {
            return;
        }
        int i = left, j = right;
        int temp = arr[left];
        while(i < j) {
            while(arr[j] >= temp && i < j) {
                j --;
            }
            while(arr[i] <= temp && i < j) {
                i ++;
            }
            if(i < j) {
                swap(i, j);
            }
        }
        arr[left] = arr[j];
        arr[j] = temp;
        quick_sort(arr, left, j - 1);
        quick_sort(arr, j + 1, right);
    }

    /**
     * 插入排序
     * @param arr
     */
    private static void insert_sort(int[] arr) {
        for(int i = 1, len = arr.length; i < len; i++) {
            int temp = arr[i], j = i - 1;
            while(j >= 0 && temp <= arr[j]) {
                arr[j + 1] = arr[j];
                j--;
            }
            //此处如果使用arr[i] = temp，会报数组越界，因为while循环是以j--结束的
            arr[j + 1] = temp;
        }
    }

    private static void swap(int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

}
