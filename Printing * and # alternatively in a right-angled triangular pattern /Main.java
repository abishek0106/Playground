#include <stdio.h>
int main(){
   int n,i,j;
   int count=0;
  scanf("%d",&n);
    for(i=1;i<=n;i++)
    {
      for(j=1;j<=i;j++)
      {
        count++;
        if(count%2==0)
          printf("#");
        else
          printf("*");
      }
      printf("\n");
    }
  	return 0;
}