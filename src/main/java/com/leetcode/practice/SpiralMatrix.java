package com.leetcode.practice;

import java.util.ArrayList;
import java.util.List;

public class SpiralMatrix {
    public static void main(String[] args) {
        int[][] input = {{1,2,3},{4,5,6},{7,8,9}};
        System.out.println(spiralOrder(input));
    }
    public static List<Integer> spiralOrder(int[][] matrix) {
        int i =0,j=0,k=0;
        List<Integer> result = new ArrayList<>();
        while(true){
            if(j<0 ){
                j=0;

            }
            if(i<0){
                i=0;
            }
            if(j<matrix[i].length-1 && i <=j && matrix[i][j]!=-1) {
                result.add(matrix[i][j]);
                matrix[i][j] = -1;
                j++;
            }else if(i<matrix.length-1 && matrix[i][j]!=-1){
                result.add(matrix[i][j]);
                matrix[i][j] = -1;
                i++;
            }else if(i==matrix.length-1 && matrix[i][j]!=-1){
                result.add(matrix[i][j]);
                matrix[i][j] = -1;
                j--;
            }else if(i<=matrix.length-1 && j == 0){
                if(matrix[i][j]==-1 && i!=0){
                    i--;
                }else if(i==0){
                    i++;
                    result.add(matrix[i][j]);
                    matrix[i][j] = -1;
                    j++;
                }else{
                    result.add(matrix[i][j]);
                    matrix[i][j] = -1;
                    i--;
                }
            }
            else{
                break;
            }
        }

        return result;
    }
}
