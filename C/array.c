#include<stdio.h>
int main(){
    char ar[10];
    int i;
    printf("enter the digit:\n");
    for (int i=0; i<=9; i++){
        scanf("%c",&ar[i]);
    }
    printf("here is your output\n");
    for (int i=9; i>=0; i--){
        printf("%c",ar[i]);
    }
    
    return 0;
}