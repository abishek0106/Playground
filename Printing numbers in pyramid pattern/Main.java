#include <stdio.h>
int main() {
int n,i,j,k,count=0;
  scanf("%d",&n);
  for(i=1;i<=n;i++)
  {
    for(j=1;j<=n-i;j++)
    {
      printf(" ");
    }
    for(k=1;k<=i;k++)
    {
      count++;
      printf("%d ",count);
    }
    printf("\n");
  }
	return 0;
}