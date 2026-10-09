#include<stdio.h>
//function prototype
int sum(int,int);
//function definition
int sum(int a, int b){
printf("the sum is %d",a+b);
return a+b;
}

int main(){
    int x = 32;
    int y = 90;
    sum(x,y);
    return 0;
}

