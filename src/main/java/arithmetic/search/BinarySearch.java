package src.main.java.arithmetic.search;

/**
 * 有序数组的二分查找
 */
public class BinarySearch {
    public static void main(String[] args) {
        int [] arr={12,21,32,45,67,321,321};
        System.out.print(search(arr,321));
    }

    public static int search(int [] arr,int findVlue){
    if(arr[arr.length-1]>=findVlue||findVlue>=arr[0]){
        int left=0,rigth=arr.length-1;
        while(left<=rigth){
            int mid=left+(rigth-left)/2;//||(right+left)/2
            if(findVlue<arr[mid]){
                rigth=mid-1;
            }if(arr[mid]<findVlue){
                left=mid+1;
            }else {
                return mid;
            }
        }
    }

        return -1;

    }
}
