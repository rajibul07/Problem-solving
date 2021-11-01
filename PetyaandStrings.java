/*
Little Petya loves presents. His mum bought him two strings of the same size for his birthday. The strings consist of uppercase and lowercase Latin letters.
Now Petya wants to compare those two strings lexicographically. The letters' case does not matter, that is an uppercase letter is considered equivalent to the 
corresponding lowercase letter. Help Petya perform the comparison.
*/

import java.util.*;
import java.io.*;
 
public class solution{
    public static void main(String[] arg){
        Scanner sc=new Scanner(System.in);
 
        String first1=sc.nextLine();
        String second1=sc.nextLine();
 
        String first=first1.toLowerCase();
        String second=second1.toLowerCase();
 
        if(first.compareTo(second)==0){
            System.out.println("0");
        }
        if(first.compareTo(second)>0){
            System.out.println("1");
        }
        if(first.compareTo(second)<0){
            System.out.println("-1");
        }
    }
}
