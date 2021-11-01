import java.util.*;
class solution
{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);

        String first=sc.next().replace("+"," ");

        char arr[]=first.toCharArray();
        Arrays.sort(arr);

        for(int i=0;i<first.length();i++){
            if(i==0){
                System.out.print(arr[i]);
            }
            else
            {
                System.out.print("+"+arr[i]);
            }
        }
    }
}

