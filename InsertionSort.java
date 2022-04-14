import java.util.Scanner;

public class InsertionSort {
    int arr[];

    public InsertionSort(int n) {
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
        InsertionSort obj=new InsertionSort(n);
        System.out.println("unsorted array");
        obj.print();
        obj.sort();
        System.out.println("sorted array");
        obj.print();

    }
    void sort(){
        for (int i = 1; i <arr.length ; i++) {
                int current=arr[i];
                int j=i-1;

                while(j>=0 && arr[j]>current){
                    arr[j+1]=arr[j];
                    j--;
                }
                arr[j+1]=current;
        }
    }
    void print(){
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
