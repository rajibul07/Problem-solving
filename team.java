import java.util.*;
class solution{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int count=0;

        
        for(int i=0;i<n;i++){
            int sum=0;
           
               int a=sc.nextInt();
               int b=sc.nextInt();
               int c=sc.nextInt();
               sum=a+b+c;
               if(sum>=2)
               count++;
        
        }
        System.out.println(count);
    }
}