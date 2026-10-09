#include<stdio.h>
#include<string.h>

int main(){
    char c;
    scanf("%s", &c);
    int count = 0;
    char str[] = "fuck you";
    for(int i=0; i<strlen(str); i++){
        if (str[i] == c){
            count++;
        }
    }
    printf("%d", count);
    return 0;
}