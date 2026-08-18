public class arthematic{
    public static void main(String[] args) {
        int quantity=3;
        int price=205;
        int costinc=price+10;
        double dis =costinc*0.10;
        double total= costinc-dis;
        int costic=costinc%2;//modulus 
        boolean bill=total>500;
        boolean vip= true;
        boolean gift=vip&&bill;
        System.out.println("total bill:" + total);
        System.out.println("getting gift:" +  gift );



    }
}