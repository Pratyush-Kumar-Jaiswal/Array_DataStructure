import java.util.Scanner;

public class BubbleSort {
    int arr[];

    public BubbleSort(int n) {
        arr=new int[n];
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the Array");
        for (int i = 0; i < arr.length; i++) {
            arr[i]=sc.nextInt();
        }
    }

    public static void main(String[] args) {
        System.out.println("Enter the size of array");
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        BubbleSort obj=new BubbleSort(n);
        System.out.println("unsorted array");
        obj.print();
        obj.sort();
        System.out.println("sorted array");
        obj.print();

    }
    void sort(){
        for (int i = 0; i < arr.length-1; i++) {
            for (int j = 0; j < arr.length-i-1; j++) {
                if(arr[j]>arr[j+1]){
                    int temp=arr[j+1];
                    arr[j+1]=arr[j];
                    arr[j]=temp;
                }
            }
        }
    }
    void print(){
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
