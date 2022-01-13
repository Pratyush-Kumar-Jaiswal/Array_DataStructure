import java.util.*;
class Student{
    protected int rollno;
    protected int marks;
    protected String name;
    public Student(){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the roll no ");
        rollno= sc.nextInt();
        System.out.print("Enter the marks ");
        marks= sc.nextInt();
        System.out.print("Enter the name ");
        name=sc.next();
        
    }
}
public class Array2 {
    public static void main(String[] args) {
        Student obj[]=new Student[10];
        for (int i=0;i< obj.length;i++){
            obj[i]=new Student();
        }
        int minind=0,maxind=0;
        for(int i=1;i< obj.length;i++){
            if(obj[i].marks<obj[minind].marks){
                minind=i;
            }
            if (obj[i].marks>obj[maxind].marks){
                maxind=i;
            }
        }
        System.out.println("Highest marks student is "+obj[maxind].name);
        System.out.println("Lowest marks student is "+obj[minind].name);
    }
}
