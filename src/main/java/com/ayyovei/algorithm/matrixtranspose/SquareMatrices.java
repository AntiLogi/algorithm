package com.ayyovei.algorithm.matrixtranspose;

/**
 * @author chenxiaobin
 * @description
 * @create 2018/6/25
 */
public class SquareMatrices {

    public static void trans(int [][]matrix){
        int N = matrix.length;
        for (int i = 0; i <N; i++) {
            for (int j = 0; j < i; j++) {
                swap(matrix,i,j);
            }

        }
    }

    public static void swap(int[][] matrix,int i,int j){
        int temp = matrix[i][j];
        matrix[i][j] = matrix[j][i];
        matrix[j][i] = temp;
    }

    public static void printMatrix(int [][]matrix){
        for (int i = 0; i <matrix.length ; i++) {
            for (int j = 0; j <matrix[0].length ; j++) {
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int [][]matrix = {{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};

        printMatrix(matrix);

        trans(matrix);

        printMatrix(matrix);
    }
}
