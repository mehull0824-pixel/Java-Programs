#include<stdio.h>
int main(){
    int marks[] = {43,56,43,23};
    int* ptr = &marks[0];

    for (int i=0; i<4; i++){
        printf("the marks at index %d is %d\n",i,*ptr);
        ptr++;
        

    }
    return 0;
}