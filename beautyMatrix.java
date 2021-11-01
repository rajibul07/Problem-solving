/*
You've got a 5 × 5 matrix, consisting of 24 zeroes and a single number one. Let's index the matrix rows by numbers from 1 to 5 from top to bottom, let's index the matrix columns by numbers from 1 to 5 from left to right. In one move,
you are allowed to apply one of the two following transformations to the matrix:

    Swap two neighboring matrix rows, that is, rows with indexes i and i + 1 for some integer i (1 ≤ i < 5).
    Swap two neighboring matrix columns, that is, columns with indexes j and j + 1 for some integer j (1 ≤ j < 5). 

You think that a matrix looks beautiful, if the single number one of the matrix is located in its middle (in the cell that is on the intersection of the third row and
the third column). Count the minimum number of moves needed to make the matrix beautiful.
*/


import java.util.*;
import java.lang.Math;

class solution{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);

        int x=0,ans=0;
        for(int i=0;i<5;i++){
            for(int j=0;j<5;j++){
                x=sc.nextInt();

                if(x==1){
                    ans+=Math.abs(i-2);
                    ans+=Math.abs(j-2);
                }
            }
        }
        System.out.println(ans);

    }
}
