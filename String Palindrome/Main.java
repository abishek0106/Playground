import java.util.Scanner;
class Main{
    public static void main(String args[])
    {
      Scanner sc=new Scanner(System.in);
      String s1=sc.nextLine();
      String b="";
      for(int i=s1.length()-1;i>=0;i--)
      {
        b=b+s1.charAt(i);
      }
      if(s1.equals(b))
         System.out.println("Yes");
         else
         System.out.println("No");
    } 
}