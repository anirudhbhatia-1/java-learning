//Use a for loop when you know in advance how many times you want code to repeat (e.g., "Repeat 10 times").
//Use a while loop when you don't know the exact number of cycles, but you want to keep repeating as long as a condition remains true (e.g., "Keep playing until player health reaches 0").
//A do-while loop executes its block of code first, and only checks the condition afterwards.
public class loops{
    public static void main(String[] args){
        for (int i=1;i<=5;i++){
            System.out.println("increasing number"+i);
        }
        int energy=3;
        while(energy>0){
            System.out.println("your energy remaining:"+energy);
            energy--;
        }
        System.out.println("khatam");
        int tery=0;
        do{
            System.out.println("processing");
            tery++;
        }
        while(tery<2);
        for(int i=1;i<=5;i++){
            if(i==3){
                continue;//skips 3
            }
            System.out.println("numbers"+i);
        }

    }
}
