import java.util.Scanner;
public class scanfu{
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter your name :");
        String name= sc.nextLine();
        System.out.println("Enter your age:");
        int age=sc.nextInt();
        System.out.println("enter your targate weight");
        double wei=sc.nextDouble();
        System.out.println("your nbame is:"+name);
        System.out.println("your age after 5 years:"+ (age+5) );
        System.out.println("your targate weightis :"+wei);
        sc.close();


    }
}