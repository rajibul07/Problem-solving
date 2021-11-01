/*
There are n stones on the table in a row, each of them can be red, green or blue. Count the minimum number of stones to take from the table so that any two neighboring stones had
different colors.
Stones in a row are considered neighboring if there are no other stones between them.
*/

import java.util.*;
public class solution{
    public static void main(String[] args){
 
        Scanner sc=new Scanner(System.in);
 
        int n=sc.nextInt();
        String s=sc.next();
        int c=0;
 
        for(int i=0;i<n-1;i++)
            if(s.charAt(i)==s.charAt(i+1))
            c++;
        
         System.out.println(c);
    }
}
