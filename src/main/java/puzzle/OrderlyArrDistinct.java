package src.main.java.puzzle;

import java.util.Arrays;

//有序的数组去重
public class OrderlyArrDistinct {
    public static void main(String[] args) {
        int [] arr={1,1,1,3,4,5,12,12,12};
        System.out.print(distinct(arr));
        System.out.print(Arrays.toString(arr));
    }

    public static int distinct(int[] arr){

        int len=0,i=0,j=0;
        while (++j<arr.length){
            if(arr[i]!=arr[j]){
                arr[++i]=arr[j];
                len++;
            }
        }

     return len+1 ;
    }
}
