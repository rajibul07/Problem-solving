import java.util.*;
public class solution{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the value of watermelon:");
        int n=sc.nextInt();
        if(n%2==0 && n!=2){
            System.out.println("YES");
        }
        else
        {
            System.out.println("NO");  
        }
        
    }
}