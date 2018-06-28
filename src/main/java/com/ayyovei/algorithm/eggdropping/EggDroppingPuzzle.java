package com.ayyovei.algorithm.eggdropping;

/**
 * @author chenxiaobin
 * @description
 * @create 2018/6/28
 */
public class EggDroppingPuzzle {


    public static int solution(int egg,int floor){
        int[][] result = new int[egg + 1][floor + 1];
        for (int i = 0; i < result.length; i++) {
            result[i][0] = 0;
            result[i][1] = 1;
        }
        for (int j = 0; j <result[0].length ; j++) {
            result[0][j] =0;
            result[1][j] =j;
        }
        for (int i = 2; i < result.length; i++) {
            for (int j = 2; j <result[0].length ; j++) {
                int max = j;
                for (int k = 1; k <=j; k++) {
                        int temp = Math.max(result[i-1][k-1],result[i][j-k])+1;
                        if (temp<max){
                            max = temp;
                        }
                }
                result[i][j] = max;
            }
        }
        return result[egg][floor];

    }

    public static void main(String[] args) {
        int solution = solution(2, 100);
        System.out.println(solution);

    }

}
