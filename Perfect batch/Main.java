/* ***Test Instructions***
* There are multiple test cases to evaluate the program.
* Some test cases are visible and others are hidden.
* Your program should be generic so that it will satisfy all the test cases.
* Scan the input from stdin and print the exact output only which is as given in the sample test cases.
*/
#include<stdio.h>
int main()
{
  int a[100],n,i,m,sum=0,o;
  scanf("%d",&n);
  for(i=0;i<n;i++)
    scanf("%d",&a[i]);
  m=a[0]+a[1]+a[2];
  o=a[3]+a[4]+a[5];
if(m==o)
{
printf("Perfect Batch");
}
  else
  {
    printf("Not a Perfect Batch");
  }
 
  
  return 0;
}