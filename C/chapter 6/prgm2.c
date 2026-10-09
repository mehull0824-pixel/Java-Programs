#include<stdio.h>
int main(){
    char a='M';
    float k=24.2;
    float* k1=&k; 
    printf("the address of a is %p\n",&a);
    char* j = &a;
    printf("the address of a is %p\n",j);
    printf("the value at address at j is %d\n",*(&a)); 
    return 0;
}