import java.util.Scanner;

public class Array5 {
    private int arr1[];
    private int arr2[];
    static Scanner sc=new Scanner(System.in);
    public Array5(int n1, int n2) {
        arr1=new int[n1];
        arr2=new int[n2];
        System.out.println("Enter the values for 1st Array");
        for (int i = 0; i < n1; i++) {
            arr1[i]=sc.nextInt();
        }
        System.out.println("Enter the values for 2nd Array");
        for (int i = 0; i < n2; i++) {
            arr2[i]=sc.nextInt();
        }
    }

    public static void main(String[] args) {
        System.out.print("Enter the no of values in 1st array ");
        int n1=sc.nextInt();
        System.out.print("Enter the no of values in 2nd array ");
        int n2=sc.nextInt();
        Array5 obj=new Array5(n1,n2);
        for (int i = 0; i < obj.arr1.length; i++) {
            int count=0;
            for (int j = 0; j < obj.arr2.length; j++) {
                if(obj.arr1[i]<=obj.arr2[j])
                    count++;
            }
            System.out.print(count+" ");
        }
    }
}
