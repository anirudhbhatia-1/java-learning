//Write a Movie Ticket Pricing program:
//Use Scanner to ask the user for their age (int).
//Use if / else if / else to calculate the ticket price based on these rules:
//Age under 12: Ticket is Rs. 100 (Child ticket).
//Age between 12 and 59: Ticket is Rs. 250 (Standard ticket).
//Age 60 and above: Ticket is Rs. 150 (Senior citizen discount).
//Print the assigned ticket category and final price.
import java.util.Scanner;
public class ques1{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("what is yput age : ");
        int age=sc.nextInt();
        if(age<12){
            System.out.println("Age under 12: Ticket is Rs. 100 (Child ticket).");

        }else if (age<=59){
            System.out.println("Age between 12 and 59: Ticket is Rs. 250 (Standard ticket).");

        }else{
            System.out.println("Age 60 and above: Ticket is Rs. 150 (Senior citizen discount).");
        }

        sc.close();
    }
}