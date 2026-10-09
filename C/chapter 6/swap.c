#include<stdio.h>
void swap(int* a , int* b);

void swap(int* a , int* b){
    int temp;
    temp = *a;
    *a = *b;
    *b = temp;

}
int main()
{
    int c = 8;
    int x = 0;
    swap(&c,&x);
    printf("the value of c is %d and the value of x is %d",c,x);
    return 0;
}