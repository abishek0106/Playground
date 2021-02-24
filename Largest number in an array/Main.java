
import java.io.*;
import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
    Scanner sc=new Scanner(System.in);
      int i;
      int n=sc.nextInt();
      int a[]=new int[n];
      for(i=0;i<n;i++)
      {
        a[i]=sc.nextInt();
      }
      int k=a[0];
      for(i=0;i<n;i++)
      {
      if(k<a[i])
      {
        k=a[i];
      }  
      }
         System.out.println(k);
    }
}
