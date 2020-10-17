package com.company;


import java.util.ArrayList;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        double[] mas = {-1.1, 12.1, 9.5, -6.3, -3.12, 23.1, 5.14, 3.2, 3.3, 10.6, 12.9, 6.8, 2.9, 8.3, -2.2};
        System.out.println(Arrays.toString(mas));
        ArrayList<Integer> destination = new ArrayList<>();
        int positive_count = 0;
        double result = 0;

        for (int i = 0; i < mas.length; i++)
            if ((i % 2 == 0) && (mas[i] > 0)) {
                result += mas[i];
                positive_count++;
                System.out.print(mas[i] + " ");
            }
        boolean isSorted = false;
        int buf;
        while(!isSorted) {
            isSorted = true;
            for (int i = 0; i < mas.length-1; i++) {
                if(mas[i] > mas[i+1]) {
                    isSorted = false;

                    buf = (int) mas[i];
                    mas[i] = mas[i + 1];
                    mas[i + 1] = buf;
                }}
           System.out.println("_________________________________________");

            System.out.println(Arrays.toString(mas));

    }   }   }

