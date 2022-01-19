//Change the arrangement
import java.io.*;
import java.util.*;

public class Solution2 {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        String arr[]=new String[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.next();
        }
        String temp=arr[n-1];
        for(int i=n-1;i>0;i--){
            arr[i]=arr[i-1];
            
        }
        arr[0]=temp;
        for(String res:arr){
            System.out.print(res+" ");
        }
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
    }
}
