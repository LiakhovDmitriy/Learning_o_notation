package com.gmail.dimaliahov.Learning_o_notation;


public class O_notation {
    public static void main(String[] args) {
//        bigO_1 (елемент який треба, довжина масиву);
//        bigO_n (довжина масиву);
//        bigO_n2 (довжина масивів);

        double time = bigO_1(0,100 );
        System.out.println(time);



//        Для bigO_1
//        double a[] = {0.6, 0.9,  0.5, 1.8, 0.7,  0.6,  0.6,  0.6,  1.2,  0.7};
//        System.out.println("Середнє при a[0] " + average(a)); // 0.82
//        double b[] = {1.6, 0.8,  0.6,  0.4,  0.6,  0.7,  0.7,  2.9,  0.6,  0.6};
//        System.out.println("Середнє при a[999] " + average(b)); // 0.95
//        double c[] = {2.0, 0.9, 1.0, 1.1, 1.4, 1.3, 1.3, 1.4, 1.5, 1.6};
//        System.out.println("Середнє при a[9999989] " + average(c)); // 1.35
    }


    //Беремо елемент з масиву
    public static double bigO_1(int element, int lengthMas) {
        int[] a = new int[lengthMas];
        for (int i = 0; a.length > i; i++) {
            a[i] = 10;
        }

        double start = System.nanoTime();
        int b = a[element];
        double end = System.nanoTime();

        double time = (end - start) / 1000;

        System.out.print("При a[" + element+ "], час виконання, в мікро секундах - ");
        return time;
    }

    //Проходимо по масиву в одну сторону
    public static double bigO_n(int lengthMas) {

        int[] a = new int[lengthMas];
        for (int i = 0; a.length > i; i++) {
            a[i] = 10;
        }
        int sum = 0;
        double start = System.nanoTime();
        for (int i = 0; a.length > i; i++) {
            sum = sum + a[i];
        }
        double end = System.nanoTime();

        double time = (end - start) / 1000;

        System.out.print("При a[" + lengthMas + "], час виконання, в мікро секундах - ");
        return time;
    }
    //Прохід по циклу в циклі
    public static double bigO_n2(int lengthMas) {

        int[][] a = new int[lengthMas][lengthMas];
        for (int i = 0; a.length > i; i++) {
            for (int j = 0; a.length > j; j++) {
                a[i][j] = 10;
            }
        }
        int sum = 0;
        double start = System.nanoTime();
        for (int i = 0; a.length > i; i++) {
            for (int j = 0; a.length > j; j++) {
                sum = sum+a[i][j];
            }
        }
        double end = System.nanoTime();

        double time = (end - start) / 1000000000;

        System.out.print("При a[" + lengthMas + "], час виконання, в секундах " );
        return time;
    }



    public static double average(double[] mas) {
        double sum = 0;
        for (int i = 0; mas.length > i; i++) {
            sum = sum + mas[i];
        }
        double result = sum / mas.length;

        return result;
    }

}
