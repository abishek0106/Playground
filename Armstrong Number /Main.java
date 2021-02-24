#include <stdio.h>
int main() {
	int n,a,sum=0,temp;
  scanf("%d",&n);
  temp=n;
  while(n>0)
  {
    a=n%10;
    sum=sum+(a*a*a);
    n=n/10;
  }
  n=temp;
 if(temp==sum)
   printf("Armstrong Number");
else
  printf("Not an Armstrong Number");
	return 0;
}