#include<stdio.h>
int main(){
    char a = 'A';
    char *ptr = &a;
    printf("the address of a is %u\n",&a);
    printf("the address of a is %u\n",ptr);
    ptr++;
    printf("the value of ptr is %u",ptr);
    return 0;

}
