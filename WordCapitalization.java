/*
Capitalization is writing a word with its first letter as a capital letter. Your task is to capitalize the given word.

Note, that during capitalization all the letters except the first one remains unchanged.
*/

import java.util.*;
class solution{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);

        String str=sc.next();
       
        System.out.print((str.charAt(0)+"").toUpperCase()+str.substring(1));
    }
}
