#include<stdio.h>
int main(){
    int n, original, reverse=0 , rem;
    printf("enter a number:");
    scanf("%d",&n);
    original= n;
    while(n!=0){
        rem=n%10;
        reverse= reverse * 10 + rem;
        n /=10;

    }
    if (original == reverse){
        printf("%d is palindrome",original);
    }
    else
    printf("%d is not palindrome",original);
    return 0;
}