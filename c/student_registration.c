// student_registration.c

#include <stdio.h>

int main(void) {
    char name[50];
    int units;
    char status[50];

    printf("Enter student name: ");
    if (scanf("%49s", name) != 1) return 1;

    printf("Enter number of registered units: ");
    if (scanf("%d", &units) != 1) return 1;

    if (units > 7) {
        sprintf(status, "Overload - Approval Required");
    } else {
        sprintf(status, "Registration Accepted");
    }

    printf("\n--- REGISTRATION SUMMARY ---\n");
    printf("Student Name: %s\n", name);
    printf("Units: %d\n", units);
    printf("Status: %s\n", status);

    return 0;
}
```