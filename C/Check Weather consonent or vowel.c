#include<stdio.h>
#include<ctype.h>
    int main() {
    char ch;
    printf("enter the alphabet: ");
    scanf("%c", &ch);
    ch = tolower(ch);
    if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u')
    {
    printf("it is a vowel");
    }
    else 
     if (ch>='a' && ch<='z'){
     printf("it ia a consonant");
     }
     else
     {
         printf("invalid input");
     }
    return 0;
}