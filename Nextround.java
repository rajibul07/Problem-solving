import java.util.*;
//import java.util.*;
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
