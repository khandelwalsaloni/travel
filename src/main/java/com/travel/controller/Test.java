package com.travel.controller;

import java.util.ArrayList;

public class Test {
    public static void main(String[] args) {
        int[] arr = {1,2,3,7,5};
        System.out.println(subarraySum(arr, 5, 12));
    }

    static ArrayList<Integer> subarraySum(int[] arr, int n, int s)
    {
        ArrayList<Integer> result = new ArrayList<>();
        result.add(-1);

        // Your code here
        if(arr == null || arr.length == 0 || arr.length == 1) {
            return result;
        }
        int startIndex = 0;
        int endIndex = 1;
        int sum = arr[startIndex] + arr[endIndex];
        while(startIndex > -1 && startIndex < endIndex && endIndex < n) {
            if(sum < s) {
                if(endIndex == n-1) {
                    break;
                }
                endIndex++;
                sum = sum + arr[endIndex];
            }
            if(sum > s) {
                sum = sum - arr[startIndex];
                startIndex = startIndex + 1;
            }
            if(sum == s) {
                result.remove(-1);
                result.add(startIndex);
                result.add(endIndex);
                break;
            }
        }
        return result;
    }
}
