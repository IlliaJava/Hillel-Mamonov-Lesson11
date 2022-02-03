package com.hillel.lesson11.task2;
// Task 2. Methods to work with matrix (2-dimension arrays)
        /*2*. Написать класс для работы с матрицами (2-мерными массивами), методы:
        print(int[][] matrix) - печатает матрицу
        swapColumns(int[][] matrix, i, j) - меняет 2 столбца местами
        swapRows(int[][] matrix, i, j) - меняет 2 рядка местами
        mul(int[][] matrix, int value) - умножает матрицу на число
        toArray(int[][] matrix) - превращает матрицу в массив. Например если была матрица на 3x4 то вернуть массив из 12 элементов
        max(int[][] matrix) - возвращает максимальный элемент матрицы*/

public class UtilsMatrix {

    public static void print(int[][] matrix) {
        for (int[] row : matrix) {
            for (int column : row) {
                System.out.print(column + "\t");
            }
            System.out.println();
        }
    }

    public static void swapColumns(int[][] matrix, int i, int j) {
        for (int index = 0; index < matrix[0].length; index++) {
            // Swap two numbers
            int temp = matrix[index][i];
            matrix[index][i] = matrix[index][j];
            matrix[index][j] = temp;
        }
    }

    public static void swapRows(int[][] matrix, int i, int j) {
        int[] temp = matrix[i];
        matrix[i] = matrix[j];
        matrix[j] = temp;
    }


    public static void mul(int[][] matrix, int value) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] *= value;
            }
        }
    }

    public static int[] toArray(int[][] matrix) {
        int newArray[] = new int[matrix.length * matrix[0].length];
        int indexNewArray = 0;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                newArray[indexNewArray] = matrix[i][j];
                indexNewArray++;
            }
        }
        return newArray;
    }


    public static int max(int[][] matrix) {
        int maxValue = matrix[0][0];
        for (int j = 0; j < matrix.length; j++) {
            for (int i = 0; i < matrix[j].length; i++) {
                if (matrix[j][i] > maxValue) {
                    maxValue = matrix[j][i];
                }
            }
        }
        return maxValue;
    }


}
