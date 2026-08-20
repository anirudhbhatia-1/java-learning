//Write a Countdown & Sum Calculator in VS Code using a for loop:
//Create an int totalSum = 0;.
//Write a for loop that starts at 10 and counts down to 1 (use i-- to decrease the counter by 1 each time).
//Inside the loop:
//Print "T-minus: " + i.
// Add the value of i to totalSum (totalSum = totalSum + i; or totalSum += i;).
//fter the loop finishes:
//Print "Liftoff!".
//Print "Sum of all countdown numbers: " + totalSum.
public class ques2{
    public static void main(String[] args){
        int TotalSum= 0;
        for(int i=10 ;i>=0;i--){
            System.out.println("T-minus:"+i);
            TotalSum+=i;
        }
        System.out.println("liftoff");
        System.out.println("Sum of all countdown numbers: " + TotalSum);

    }
}