package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int[] arr = {10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20};
        Scanner sc = new Scanner(System.in);
        System.out.println("Input number for search");
        int req = sc.nextInt();
        System.out.println("Position is: " + serch(arr, req, 0, arr.length));
    }

    public static int serch(int[] arr, int req, int left, int right){
        int mid = left + (right - left)/2;

        if(left == right)
            return -1;
        else if(arr[mid] == req)
            return mid;
        else if(arr[mid] > req)
            return serch(arr, req, left, mid);
        else
            return serch(arr, req, mid + 1, right);
    }
}
