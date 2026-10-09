#include<stdio.h>
int main(){
int a=10,y;
y=a++;
printf("%d %d \n",a,y);
printf("%d %d \n",a--,++y);
return 0;
}