#include<stdio.h>

int main(){
	int a;
	printf("enter the value of a\n");
	scanf("%d",&a);
	int b;
	printf("enter  the value of b\n");
	scanf("%d",&b);
	int h;
	h = (a>b)? a:b;
	printf("%d",h);
	return 0;
}
