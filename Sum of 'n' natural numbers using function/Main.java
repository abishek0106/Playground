#include<stdio.h>
int sum(int s);
int main()
{
  int k,result;
  scanf("%d",&k);
  result=sum(k);
  printf("%d",result);
}
int sum(int s)
{
int i,sum=0;
  for(i=1;i<=s;i++)
  {
    sum=sum+i;  
}
  return sum;
}