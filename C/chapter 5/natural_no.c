#include<stdio.h>

int sum_natural(int);

int sum_natural(int n){
    if (n==1){
        return 1;
    }
    return sum_natural (n-1) + n;
}

int main(){
    int a = 5;
    printf("the sum of %d natural numbers is %d",a,sum_natural(a));
    return 0;
}