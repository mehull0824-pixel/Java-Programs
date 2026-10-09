#include<stdio.h>
int main(){
    int a=69;
    printf("the address of a is %p\n",&a);
    int* j = &a;
    printf("the address of a is %p\n",j);
    printf("the value at address at j is %d\n",*(&a)); 
    return 0;
}