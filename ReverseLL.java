import java.util.Scanner;

public class ReverseLL {
    static Node2 head;
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        char ch = '\0';
        do{
            System.out.println("Enter the value");
            int n=sc.nextInt();
            insert(n);
            System.out.println("Do you want to repeat(Y/N)");
            ch=sc.next().charAt(0);
        }
        while(ch=='y'||ch=='Y');
        display(head);
    }
    public static  void insert(int data){
        Node2 n1=new Node2(data);
        if(head==null){
            head=n1;
            return;}
        Node2 temp=head;
        while(temp.next!=null)
            temp=temp.next;
        temp.next=n1;
    }
    public static void display(Node2 head){
        if(head==null){
            return;
        }
        
        System.out.println(head.data);

    }
}
class Node2{
    int data;
    Node2 next;

    public Node2(int data) {
        this.data = data;
    }
}
