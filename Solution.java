        //Children in an Array
        import java.io.*;
        import java.util.*;
        import java.text.*;
        import java.math.*;
        import java.util.regex.*;

        public class Solution {
            public static void main(String args[] ) throws Exception {
                Scanner sc= new Scanner(System.in);
                int n=sc.nextInt();
                int arr[]=new int[n];
                for(int i=0;i<n;i++){
                    arr[i]=sc.nextInt();
                }
                for(int i=0;i<n;i++){
                    int flag=0;
                    for(int j=i+1;j<n;j++){
                        if(arr[i]>=arr[j]){
                            flag=1;
                            break;
                        }
                    }
                    if(flag==0){
                        System.out.print(arr[i]+" ");
                    }
                }
            }
        }
