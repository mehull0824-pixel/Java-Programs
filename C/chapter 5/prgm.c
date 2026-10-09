#include<stdio.h>

float force(float);

float force(float mass){
    return (mass*9.8);
}

int main(){
    float c = 45;
    printf("the value of force is %f",force(c));
    return 0;
}

