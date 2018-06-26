package com.ayyovei.algorithm.matrixtranspose;

/**
 * @author chenxiaobin
 * @description
 * @create 2018/6/25
 */
public class InSpaceNonSquareMatrices {


    /**
     *
     * @param array  MxN
     * @param M
     * @param N
     */
    public static void trans(int []array,int M,int N){

        for (int i = 0; i < array.length; i++) {
            int next = getNextIndex(i,M,N);
            while (next>i){
                next=getNextIndex(next,M,N);
            }
            if(next==i){
                dealCycle(array,i,M,N);
            }
        }
    }
    public static  void  dealCycle(int [] array,int i,int M,int N){
        int cur = array[i];
       int temp = array[i];
       int next = getNextIndex(i, M, N);
       while (i!=next){
            temp =array[next];
            array[next] = cur;
            cur = temp;
           next = getNextIndex(next, M, N);
       }
       array[i] = cur;


    }

    public static void swap(int[] array,int a,int b){

    }

    public static void printArray(int []array,int column) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]+"  ");
            if ((i+1)%column==0){
                System.out.println();
            }
        }
    }

    /**
     * @description
     * 例如oldIndex = 4，对应矩阵坐标为(4/N,4%N)
     * 转置后坐标为(4%N,4/N)
     * 此时新下标为4%N*M+4/N
     * @param oldIndex
     * @param M
     * @param N
     * @return
     */
    public static int  getNextIndex(int oldIndex,int M,int N){

        int i =  oldIndex/N;
        int j = oldIndex%N;
        int result =   j*M+i;
        return result;
    }
    public static int  getPreIndex(int Index,int M,int N){

        int i =  Index/M;
        int j = Index%M;
        int result =   i+j*N;
        return result;
    }

    public static void main(String[] args) {
        int [] array = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15};
        printArray(array,3);
        trans(array,5,3);
        printArray(array,5);


    }


}
