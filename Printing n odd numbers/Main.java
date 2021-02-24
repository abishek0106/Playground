#include<stdio.h>
void main()
{
  int n,N;
  scanf("%d",&n);
  N=n*2;
  for(int i=1;i<=N;i++)
  {
    if(i%2==1)
    {
      printf("%d \n",i);
    }
    
  }
}
   