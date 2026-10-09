#include<stdio.h>

float average(int a, int b, int c);


float average(int a, int b, int c){
    return (a+b+c)/3;
}


int main(){
    int a=9,  b=7,  c=5;
    printf("the average is %f",average(a,b,c));
    return 0;
}