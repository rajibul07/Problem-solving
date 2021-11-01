import java.util.*;

class problem1A{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        double n,m,a;
        n=sc.nextInt();
        m=sc.nextInt();
        a=sc.nextInt();

        System.out.println((int)(Math.ceil(n/a)*Math.ceil(m/a)));

    }
}