package com.company;

public class Main {

    public static void main(String[] args) {
/////////////////////////////   Основное ДЗ  ///////////////////////////////////
        System.out.println();
        System.out.println("         Основное ДЗ           ");

        int[] A = new int[]{1, 3, 3, 5, 12, 23, 45, 67, 89, 100};
        int steps = 0;
        int value = 67;
        // O(n)
        LineSort(value, A, steps);
        // O(log n)
        BinarySort(value, A, steps);
    }

    private static void LineSort(int val, int[] A, int steps) {
        System.out.println("        Линейный поиск");
        int n = A.length;
        int pos = -1;
        boolean resultOk = false;

        for (int i = 0; i < n && pos == -1; i++) {
            if (A[i] == val) {
                pos = i;
                resultOk = true;
            }
            steps++;
        }
        if (resultOk) {
            System.out.println("Элемент найден в позиции: " + pos + ", пройденный шаг: " + steps);
        } else System.out.println("Элемент не найден!");
    }

    //           {1, 3, 3, 5, 12, 23, 45, 67, 89, 100};
    private static void BinarySort(int val, int[] A, int steps) {
        System.out.println("        Бинарный поиск");
        int last = A.length - 1,
                first = 0,
                middle, i = 0;
        boolean resultOk = false;
        while (first < last) {

            middle = (first + last) / 2;

            if (val == A[middle]) {
                last = first;
                first = middle;
                resultOk = true;
                i = middle;
            } else {
                if (val > A[middle]) first = middle + 1;
                else last = middle - 1;
            }
            steps++;
        }
        if (resultOk) System.out.println("Элемент найден в позиции: " + i + ", пройденный шаг: " + steps);
        else System.out.println("Элемент не найден!");

    }

}