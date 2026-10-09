#include<stdio.h>

int fibo(int);

int fibo(int x){
    if (x == 0 || x == 1){
        return x-1;
    }
    return fibo (x-1) + fibo (x-2);
}


int main(){
    int x = 7;
    printf("the fibonacci series of %d is %d",x, fibo(x));
    return 0;
}