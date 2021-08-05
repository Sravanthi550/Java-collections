package com.training.basics.collection;
import java.io.*;
import java.util.*;
import java.util.Scanner;
public class Evens {
    public static void main(String[] args) {
        int n;
        System.out.println("Input an integer");
        Scanner in = new Scanner(System.in);
        n = in.nextInt();
        ArrayList<Integer> evens = new ArrayList<Integer>();
        ArrayList<Integer> multiple = new ArrayList<Integer>();
        for (int i = 0; i <= n; i++) {
            if (i % 2 == 0) {
                evens.add(i);
                int j = i * 2;
                multiple.add(j);
            }
        }
        System.out.println(evens);

        System.out.println(multiple);
        for (int j = 0; j <= multiple.size() ; j++){
            if (multiple.get(j) == n){
                System .out.println("n");
            }
            else{
                System.out.println("Zero");
            }
        }

    }
}

  /*  public static void printArray(ArrayList<Integer> array)
    {
        System.out.println("Array:");
        for(int name: array)
        {
            System.out.print(name + " ");
        }
    } */




