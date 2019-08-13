package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static int Validate() {
        Scanner sc = new Scanner(System.in);
        int a;
        while (true) {
            try {
                a = Integer.parseInt(sc.next());
                if (a < 0) {
                    System.out.println("Number of element must > 0");
                } else {
                    break;
                }
            } catch (NumberFormatException e) {
                System.out.println("Invalid input !!!");
            }
        }
        return a;
    }

    public static int[] CreateArray(int a) {
        Scanner sc = new Scanner(System.in);
        int[] arr;
        arr = new int[a];

        for (int i = 0; i < a; i++) {
            while (true) {
                try {
                    System.out.println("Enter number " + (i+1)+ ": ");
                    arr[i] = Integer.parseInt(sc.next());
                    break;
                }
                catch (NumberFormatException e) {
                    System.out.println("Invalid Input !!!");
                }
            }
        }
        System.out.println(Arrays.toString(arr));
        return arr;
    }

    public static void SortAscending(int[] arr){
        if (arr == null){
            System.out.println("Empty array");
        }

        for (int i=0; i <arr.length; i++){
            for (int j=i; j<arr.length; j++) {
                if (arr[i] > arr[j]){
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        System.out.println("The array: " + Arrays.toString(arr));
    }

    public static void SortDescending(int[] arr){
        if (arr == null){
            System.out.println("Empty array");
        }

        for (int i=0; i <arr.length; i++){
            for (int j=i; j<arr.length; j++) {
                if (arr[i] < arr[j]){
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        System.out.println("The array: " + Arrays.toString(arr));
    }

    public static void main(String[] args) {
        // write your code here
        int[] arr = new int[0];
        while (true) {
            int n;
            System.out.println("1. Input array");
            System.out.println("2. Sort Acsending");
            System.out.println("3. Sort Descending");
            System.out.println("4. Exit");

            int choice;
            Scanner sc = new Scanner(System.in);
            while (true) {
                try {
                    System.out.println("Choose option: ");
                    choice = Integer.parseInt(sc.next());
                    if (choice < 1 || choice > 4) {
                        System.out.println("option must between 1-4");
                    } else {
                        break;
                    }
                } catch (NumberFormatException e) {
                    System.out.println("Invalid Input !!!");
                }
            }

            if (choice == 1) {
                System.out.println("------ Input Array ------");
                System.out.println("Enter number of element: ");
                n = Validate();
                arr = CreateArray(n);
            }

            if (choice == 2) {
                System.out.println("------ Sort Ascending ------");
                SortAscending(arr);
            }

            if (choice == 3){
                System.out.println("------ Sort Descending ------");
                SortDescending(arr);
            }

            if (choice == 4){
                System.exit(0);
            }
        }
    }
}
