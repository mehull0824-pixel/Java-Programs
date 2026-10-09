#include<stdio.h>
int main(){
	int maths,english,science,hindi,computer;
	int marks;

	printf("enter maths marks:\n");
	scanf("%d",&maths);
	printf("enter english marks:\n");
	scanf("%d",&english);
	printf("enter science marks:\n");
	scanf("%d",&science);
	printf("enter hindi marks:\n");
	scanf("%d",&hindi);
	printf("enter computer marks:\n");
	scanf("%d",&computer);

	if((marks>100 )|| (marks<0)){
		printf("invalid marks");
	}
	else if(marks>=90){
		printf("grade A");
		
	}
	else if(marks>=80){
		printf("grade B");
		
	}
	else if(marks>=70){
		printf("grade C");
		
	}
	else if(marks>=60){
		printf("grade D");
		
	}
	else if(marks<60){
		printf("grade E");
	
	}
	else{
		printf("grade F");
		
	}
	return 0;					
}
