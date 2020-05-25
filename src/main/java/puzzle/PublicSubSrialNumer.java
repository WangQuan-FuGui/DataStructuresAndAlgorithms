package src.main.java.puzzle;

/**
 * 两个字符串的公共子序列的长度
 */
public class PublicSubSrialNumer {

    public static void main(String[] args) {
        String str1="advantage";
        String str2="didactical";
        byte[] b1=str1.getBytes();
        byte[] b2=str2.getBytes();
       // System.out.print(get(b1,b2,b1.length-1,b2.length-1));
        System.out.print(getByDynamic(b1,b2));
    }

    //递归
    public static int get(byte[]b1,byte[]b2,int end1,int end2){

        if(end1<0||end2<0){
            return 0;
        }
        if(b1[end1]==b2[end2]){
            return 1+get(b1,b2,end1-1,end2-1);
        }else{
            int tem1=get(b1,b2,end1,end2-1);
            int tem2=get(b1,b2,end1-1,end2);
            return tem1>tem2?tem1:tem2;
        }
    };

    //动态规划
    public static int getByDynamic(byte[]b1,byte[]b2){
        int[] [] tem=new int [b1.length+1] [b2.length+1];
         for (int i=0;i<b1.length;i++){
             for(int j=0;j<b2.length;j++){
                 if(b1[i]==b2[j]){
                     tem[i+1][j+1]=tem[i][j]+1;
                 }else{
                     int top =tem[i][j+1];
                     int below=tem[i+1][j];
                     tem[i+1][j+1]=top>below?top:below;
                 }
             }
         }
         return tem[b1.length][b2.length];
    }
}
