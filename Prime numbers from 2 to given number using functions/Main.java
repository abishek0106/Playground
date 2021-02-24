#include<stdio.h>
  int main()
  {
    int i,j,n,fact;
    scanf("%d",&n);
    for(i=2;i<=n;i++)
    {
      fact=0;
      for(j=1;j<=n;j++)
      {
        if(i%j==0)
          fact++;
      }
      if(fact==2)
        printf("%d\n",i);
    }
 return 0;
}