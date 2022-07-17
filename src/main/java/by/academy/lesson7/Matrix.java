package by.academy.lesson7;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Matrix {
    public void matrixSum(float[][] matrix1, float[][] matrix2) {
        float[][] matrix3 = new float[matrix1.length][matrix1.length];
        for (int i = 0; i < matrix1.length; i++) {

            for (int j = 0; j < matrix1.length; j++) {

                matrix3[i][j] = matrix1[i][j] + matrix2[i][j];

            }
        }
        System.out.println("Sum matrix 1 and matrix 2 : " + Arrays.deepToString(matrix3));
    }

    public void matrixMultiplication(float[][] matrix, int number) {

        for (int i = 0; i < matrix.length; i++) {

            for (int j = 0; j < matrix.length; j++) {

                matrix[i][j] = matrix[i][j] * number;
            }
        }
        System.out.println("Matrix * " + number + " : " + Arrays.deepToString(matrix));
    }

     void print(float[][] matrix) {

        System.out.println("Matrix: " + Arrays.deepToString(matrix));
        return;
    }

    public static void main(String[] arg) {
        int matrixString;
        int matrixColumn;
        int number;
        float[][] matrix1;
        float[][] matrix2;
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter number of strings and columns for matrix:");
        matrixString = scan.nextInt();
        matrixColumn = matrixString;
        matrix1 = new float[matrixString][matrixColumn];
        Random rand = new Random();
        for (int i = 0; i < matrixString; i++) {
            for (int j = 0; j < matrixColumn; j++) {
                matrix1[i][j] = rand.nextFloat();
            }
        }
        System.out.println("Matrix 1 : " + Arrays.deepToString(matrix1));

        matrix2 = new float[matrixString][matrixColumn];
        for (int i = 0; i < matrixString; i++) {
            for (int j = 0; j < matrixColumn; j++) {
                matrix2[i][j] = rand.nextFloat();
            }
        }
        System.out.println("Matrix 2 : " + Arrays.deepToString(matrix2));
        Matrix matrixS = new Matrix();
        matrixS.matrixSum(matrix1, matrix2);
        System.out.println("Enter number for multiplication:");
        number = scan.nextInt();
        matrixS.matrixMultiplication(matrix1, number);
        matrixS.print(matrix1);
        matrixS.print(matrix2);

    }
}
