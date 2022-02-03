package com.hillel.lesson11.task2;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[][] matrix = {{1, 3, 6}, {2, 4, 8}, {-7, -5, -3}};
        System.out.println("1)Оригинальная матрица:");
        UtilsMatrix.print(matrix);

        UtilsMatrix.swapColumns(matrix, 0, 1);
        System.out.println("\n2)\"swapColumns\" новая матрица:");
        UtilsMatrix.print(matrix);

        UtilsMatrix.swapRows(matrix, 0, 1);
        System.out.println("\n3)\"swapRows\" новая матрица:");
        UtilsMatrix.print(matrix);

        UtilsMatrix.mul(matrix, 2);
        System.out.println("\n4)\"mul\" новая матрица:");
        UtilsMatrix.print(matrix);

        System.out.println("\n5)\"toArray\" новый масив:" + Arrays.toString(UtilsMatrix.toArray(matrix)));

        System.out.println("\n6)Максимальное значение элемента в матрице: " + UtilsMatrix.max(matrix));
    }
}
