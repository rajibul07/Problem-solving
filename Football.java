/*
Petya loves football very much. One day, as he was watching a football match, he was writing the players' current positions on a piece of paper. 
To simplify the situation he depicted it as a string consisting of zeroes and ones. A zero corresponds to players of one team; a one corresponds to players of another team. 
If there are at least 7 players of some team standing one after another, then the situation is considered dangerous. For example,
the situation 00100110111111101 is dangerous and 11110111011101 is not. You are given the current situation. Determine whether it is dangerous or not.
*/

import java.util.*;
public class solution{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
       
        String s=sc.next();
        if(s.contains("0000000") || s.contains("1111111")){
            System.out.println("YES");
        }
        else
        {
            System.out.println("NO");
        }
       
      
        
    }
}
