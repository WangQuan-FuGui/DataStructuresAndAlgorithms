package src.main.java.arithmetic.search;

/**
 * 有序数组的斐波那契查找
 */
public class FibonacciSearch {
    public static void main(String[] args) {
        int arr[]={12,34,1,32,56};

        System.out.println( search(arr,561));
    }

    public static int search(int [] arr,int findVlue){
        int[] f=fibonacci();
       int k=0;
        while (f[k]<arr.length-1){
            k++;
        }
        System.out.println("k="+k+"f="+f[k]);
        int left=0,rigth=arr.length-1;
        while(left<=rigth){
            int mid=left+f[k-1];
            if(mid>rigth){
                if (findVlue==arr[rigth]){
                    return rigth;
                }else {
                    return -1;
                }
            }
            if(findVlue<arr[mid]){
                k--;
            } else if (arr[mid]<findVlue){
               k=k-2;
               left=mid+1;
            }else {
                return mid;
            }
        }

        return -1;


    }
    /*
     2 3 5
     f[k]=f[k-1]+f[k-2];
     f[k]-1=(f[k-1]-1)+mid+(f[k-2]-1)
      */
    public static int[] fibonacci(){
        int [] f=new int [10];
        int le=0;
        f[0]=0;
        f[1]=1;
        for(int i=2;i<f.length;i++){
            f[i]=f[i-1]+f[i-2];

        }
        return f;
    }


}
