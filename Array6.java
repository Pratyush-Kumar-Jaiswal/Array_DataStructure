import java.util.Scanner;

class Employee{
    int emp_id;
    String name;
    String address;
    int salary;
    String designation;
    public Employee() {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the employee id");
        emp_id=sc.nextInt();
        sc.nextLine();
        System.out.println("Enter the name");
        name=sc.nextLine();
        System.out.println("Enter your address");
        address=sc.nextLine();
        System.out.println("Enter the salary");
        salary=sc.nextInt();
        sc.nextLine();
        System.out.println("Enter the disignation");
        designation=sc.nextLine();
    }

    @Override
    public String toString() {
        return  "emp_id=" + emp_id +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", salary=" + salary +
                ", designation='" + designation ;
    }
}
public class Array6 {
    public static void main(String[] args) {
        Employee obj[]=new Employee[10];
        for (int i = 0; i < obj.length; i++) {
            obj[i]=new Employee();
        }
        for (Employee em:
             obj) {
            System.out.println(em);
        }
    }
}

