// INCLUDE HEADER FILES NEEDED BY YOUR PROGRAM
// SOME LIBRARY FUNCTIONALITY MAY BE RESTRICTED
// DEFINE ANY FUNCTION NEEDED
// FUNCTION SIGNATURE BEGINS, THIS FUNCTION IS REQUIRED
#include <stdio.h>
// Main function
int main()
{
int a[15],n,i,max,index;
  scanf("%d",&n);
  for(i=0;i<n;i++)
    scanf("%d",&a[i]);
  max=a[0];
  for(i=0;i<=n-1;i++)
  {
    if(max<a[i])
    {
    max=a[i];
      index=i;
    }
  }
  printf("%d",index);

  
   return 0;
}