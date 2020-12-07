package ru.geekbrains.DZ2_LF;

import java.util.Arrays;

public class MainApp {
    public static class homework2{
        /*
        1 Задать целочисленный массив, состоящий из элементов 0 и 1. Например: [ 1, 1, 0, 0, 1, 0, 1, 1, 0, 0 ]. Написать метод, заменяющий в принятом массиве 0 на 1, 1 на 0;
        2 Задать пустой целочисленный массив размером 8. Написать метод, который c помощью цикла заполнит его значениями 1 4 7 10 13 16 19 22;
        3 Задать массив [ 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 ], написать метод, принимающий на вход массив и умножающий числа меньше 6 на 2;
        4 Задать одномерный массив. Написать методы поиска в нём минимального и максимального элемента;
         */
        public static void main(String[] args) {
            /*
            1 Задать целочисленный массив, состоящий из элементов 0 и 1. Например: [ 1, 1, 0, 0, 1, 0, 1, 1, 0, 0 ]. Написать метод, заменяющий в принятом массиве 0 на 1, 1 на 0
            */

            int[] array1 = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
            for (int i = 0; i < array1.length; i++) {
                if (array1[i] == 0) {
                    array1[i] = 1;
                } else {
                    array1[i] = 0;
                }
            }
            System.out.println("Задание1");
            for (int i = 0; i < array1.length; i++) {
                System.out.print(array1[i] + " ");
            }

            /*
            2 Задать пустой целочисленный массив размером 8. Написать метод, который c помощью цикла заполнит его значениями 1 4 7 10 13 16 19 22
            */

            int[] array2 = new int[8];
            for (int i = 0; i < array2.length; i++) {
                        array2[i] = i*3+1;
            }
            System.out.println(" ");
            System.out.println("Задание2");
            for (int i = 0; i < array2.length; i++) {
                System.out.print(array2[i] + " ");
                }
            /*
            3 Задать массив [ 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 ], написать метод, принимающий на вход массив и умножающий числа меньше 6 на 2
            */

            int[] array3 = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
            for (int i = 0; i < array3.length; i++) {
                if (array3[i] < 6) {
                    array3[i] = array3[i]*2;
                } else {
                    array3[i] = array3[i];
                }
            }
            System.out.println(" ");
            System.out.println("Задание3");
            for (int i = 0; i < array3.length; i++) {
                System.out.print(array3[i] + " ");
            }

            /*
            4 Задать одномерный массив. Написать методы поиска в нём минимального и максимального элемента
            */

            int[] array4 = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
            Arrays.sort(array4);
            System.out.println(" ");
            System.out.println("Задание4");
            for (int i = 0; i < array3.length; i++) {
                System.out.print(array4[i] + " ");
            }
            System.out.println(" ");
            System.out.println("Минимальное значение - " + array4[0]);
            System.out.println("Максимальное значение - " + array4[11]);


        }



        }
    }


