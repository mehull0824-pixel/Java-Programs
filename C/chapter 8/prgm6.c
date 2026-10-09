#include<stdio.h>
#include<string.h>

int main(){
    char c;
    scanf("%s", &c);
    int contains = 0;
    char str[] = "fuck you";
    for(int i=0; i<strlen(str); i++){
        if (str[i] == c){
            contains = 1;
            break;
        }
    }
    if(contains){
        printf("yes it contains\n");
    }
    else{
        printf("does not contains\n");
    }
   
    return 0;
}