import java.util.Scanner;

public class Array4 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if(i==j)
                    continue;
                if((arr[i]*arr[j])%2!=0){
                    System.out.println(arr[i]+"  ,  "+arr[j]);
                }
            }
        }
    }
}
