#include <stdio.h>
int main() {
	int n,temp,a,sum=0,fact;
  scanf("%d",&n);
  temp=n;
  while(n>0)
  {
    a=n%10;
     fact=1;
    for(int i=1;i<=a;i++)
    {
      fact=fact*i;
    }
  
  sum=sum+fact;
  n=n/10;

  }
  if(sum==temp)
  {
    printf("Yes");
  }
  else
  {
    printf("No");
  }   
      
    
	return 0;
}