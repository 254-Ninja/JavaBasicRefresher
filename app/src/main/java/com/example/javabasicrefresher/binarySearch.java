package com.example.javabasicrefresher;
//write a Java program to find a specified element in a given array of elements using Binary Search
public class binarySearch {
    public static int binarySearch(int[] nums, int flag){
        int hi_num = nums.length - 1;
        int lo_num = 0;
        while (hi_num >= lo_num) {
            int guess = (lo_num + hi_num) >>> 1;
            if(nums[guess] > flag){
                hi_num = guess - 1;
            }
        }

    }

}
