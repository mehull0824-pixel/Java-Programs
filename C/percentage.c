#include <stdio.h>

int main() {
    int maths, english, science, hindi, computer;
    float average;

    // Input marks
    printf("Enter Maths marks: ");
    scanf("%d", &maths);
    printf("Enter English marks: ");
    scanf("%d", &english);
    printf("Enter Science marks: ");
    scanf("%d", &science);
    printf("Enter Hindi marks: ");
    scanf("%d", &hindi);
    printf("Enter Computer marks: ");
    scanf("%d", &computer);

    // Validate input
    if (maths > 100 || maths < 0 ||
        english > 100 || english < 0 ||
        science > 100 || science < 0 ||
        hindi > 100 || hindi < 0 ||
        computer > 100 || computer < 0) {
        printf("Invalid marks entered.\n");
        return 1; // Exit with error
    }

    // Calculate average
    average = (maths + english + science + hindi + computer) / 5.0;

    // Determine grade
    if (average >= 90) {
        printf("Grade: A\n");
    } else if (average >= 80) {
        printf("Grade: B\n");
    } else if (average >= 70) {
        printf("Grade: C\n");
    } else if (average >= 60) {
        printf("Grade: D\n");
    } else {
        printf("Grade: E\n");
    }

    return 0;
}
