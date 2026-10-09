#include<stdio.h>
int main(){
	int a;
	printf("enter the value of a\n");
	scanf("%d",&a);
	int b;
	printf("enter  the value of b\n");
	scanf("%d",&b);
	if(a>b){
		printf("a is greater than b");
	}
	else if(a<b){
	printf("b is greater than a");
	}
		
	
	else{
	printf("a and b are equal");
	}
	return 0;
}
