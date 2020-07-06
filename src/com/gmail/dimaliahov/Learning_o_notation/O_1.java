package com.gmail.dimaliahov.Learning_o_notation;


public class O_1 {
    public static void main(String[] args) {

        double start = System.nanoTime();
        int [] a = new int [10000];
        for (int i = 0; a.length<i; i++){
            a[i] = 10;
        }
        int b = a[9999];
        double end = System.nanoTime();

        double time = (end - start) / 1000;

        System.out.println(time + "с, час виконання");

        //Достаю a[0] -     2.5,  2.5,  4.2,  2.7,  2.5,  2.5,  3.6,  3.4,  2.5,  3.0   -середнє 2.94
        //Достаю a[999] -  24.0,  2.8,  2.4,  2.5,  2.5,  5.3,  3.8,  3.4,  3.4,  2.7   -середнє 5.28
        //Достаю a[9999] - 15.4, 15.4, 18.7, 15.9, 18.4, 30.7, 17.8, 20.4, 15.1, 16.0   -середнє 18.38

    }


}
