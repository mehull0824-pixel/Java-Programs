#include<stdio.h>
int main(){
	int a;
	printf("enter a:\n");
	scanf("%d",&a);
	int b;
	printf("enter b:\n");
	scanf("%d",&b);
	int c;
	printf("enter c:\n");
	scanf("%d",&c);
	
	int h;
	h = ((a>b)&&(a>c))?a:(b>c)?b:c;
	printf("%d",h);
	return 0;
	

}
