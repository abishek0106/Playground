#include<stdio.h>
  
  int square(int a);
  int main()
  {
    int s,result;
    scanf("%d",&s);
    result=square(s);
    printf("%d",result);
  }
  int square(int a)
  {
int res;
    res=a*a;
    return res;
   
}