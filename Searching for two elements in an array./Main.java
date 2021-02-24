#include<stdio.h>
int main()
{
int a[10],n,i,b,c,d,e;
  scanf("%d",&n);
  for(i=0;i<n;i++)
    scanf("%d",&a[i]);
   scanf("%d",&b);
   scanf("%d",&c);
  for(i=0;i<n;i++)
      {
    if(a[i]==b)
    {
      d=i;
      b=i;
    }   
  }
  if(d==b)
  {
    printf("%d \n",d);
  }
  else
  {
    printf("-1");
  }
  
  
  
   for(i=0;i<n;i++)
      {
    if(a[i]==c)
    {
      e=i;
      c=i;
    }   
  }
  if(e==c)
  {
    printf("%d \n",e);
  }
  else
  {
    printf("-1");
  }
  
  return 0;
}