/*
"Contestant who earns a score equal to or greater than the k-th place finisher's score will advance to the next round, as long as the contestant earns a positive score..."
— an excerpt from contest rules.

A total of n participants took part in the contest (n ≥ k), and you already know their scores. Calculate how many participants will advance to the next round.
*/


import java.util.*;
public class solution{
    public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int k=sc.nextInt();
    int[] arr=new int[n];
    int cnt=0;
    for(int i=0;i<n;i++){
        arr[i]=sc.nextInt();
        
        if(arr[i]!=0 && arr[i]>=arr[k-1])
        cnt++;
    }
    System.out.println(cnt);
}
}
