import java.util.*;

public class Array {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter size of the array ");
        int n= sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        int arr2[]=new int[n];
        int ind=0;
        for (int i: arr) {
            int flag=0;
            for(int j: arr2){
                if(j==i){
                    flag=1;
                    break;
                }
            }
            if(flag==0){
                arr2[ind]=i;
                ind++;
            }

        }
        for (int i=0;i<ind;i++) {
            System.out.println(arr2[i]);

        }
    }
}
