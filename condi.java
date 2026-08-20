public class condi{
    public static void main(String[] args){
        //condion if else if else
        int score=9;
        if(score>=90){
            System.out.println("grade is A+");
        }else if(score>=80){
            System.out.println("grade is B");

        }else if(score>=70){
            System.out.println("grade is c");
        }else{
            System.out.println("you are a failier");
        }
        //For numbers, you use == (e.g., age == 18).
        //For String values, always use .equals(), never ==:
        String post="adin";
        if(post.equals("admin")){
            System.out.println("welcome");
        }else{
            System.out.println("mat kar lala mat kar");
        }
        //switch case 
        int dat=94;
        switch (dat){
            case 1:
                System.out.println("monday");
                break;
            case 2:
                System.out.println("tuesday");
                break;
            case 3:
                System.out.println("wednesday");
                break;
            case 4:
                System.out.println("thursday");
                break;
            case 5:
                System.out.println("friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("sunday");
                break;
            default:
                System.out.println("you are out of line");
                break;
        }

    }
}