 import java.util.ArrayList;
import java.util.Scanner;

public class Array3 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter the dimensions");
        int n= sc.nextInt();
        int m=sc.nextInt();
        int arr[][]=new int[n][m];
        System.out.println("Enter the 2d array");
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                arr[i][j]=sc.nextInt();
            }
        }
        ArrayList<Integer> arr1=new ArrayList<>();
        ArrayList<Integer> arr2=new ArrayList<>();
        for (int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(arr[i][j]%2==0){
                    arr1.add(arr[i][j]);
                }
                else{
                    arr2.add(arr[i][j]);
                }
            }
        }
        System.out.println("Here comes the even numbers");
        for(int rs:arr1){
            System.out.println(rs);
        }
        System.out.println("Here comes the odd numbers");
        for(int rs:arr2){
            System.out.println(rs);
        }
    }
}
