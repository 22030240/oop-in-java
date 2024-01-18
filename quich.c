#include <stdio.h>
#include <stdlib.h>
#include <string.h>

// Define the structure for student
struct Student {
    char student_name[50];
    int student_roll_no;
    float total_marks;
};

// Function to swap two students
void swap(struct Student* a, struct Student* b) {
    struct Student temp = *a;
    *a = *b;
    *b = temp;
}

// Function to partition the array
int partition(struct Student arr[], int low, int high, int* swap_count) {
    int pivot = arr[high].student_roll_no;
    int i = low - 1;

    for (int j = low; j <= high - 1; j++) {
        if (arr[j].student_roll_no < pivot) {
            i++;
            swap(&arr[i], &arr[j]);
            (*swap_count)++;
        }
    }

    swap(&arr[i + 1], &arr[high]);
    (*swap_count)++;
    return (i + 1);
}

// Function to perform Quick Sort.
void quickSort(struct Student arr[], int low, int high, int* swap_count) {
    if (low < high) {
        int pi = partition(arr, low, high, swap_count);

        quickSort(arr, low, pi - 1, swap_count);
        quickSort(arr, pi + 1, high, swap_count);
    }
}

int main() {
    int n;
    printf("Enter the number of students: ");
    scanf("%d", &n);

    // Allocate memory for the array of students
    struct Student* students = (struct Student*)malloc(n * sizeof(struct Student));

    // Input the data for each student
    printf("Enter the data for each student:\n");
    for (int i = 0; i < n; i++) {
        printf("Student %d\n", i + 1);
        printf("Name: ");
        scanf("%s", students[i].student_name);
        printf("Roll No.: ");
        scanf("%d", &students[i].student_roll_no);
        printf("Total Marks: ");
        scanf("%f", &students[i].total_marks);
    }

    int swap_count = 0;

    // Perform Quick Sort on the array of students
    quickSort(students, 0, n - 1, &swap_count);

    // Print the sorted array of students
    printf("\nSorted array of students:\n");
    for (int i = 0; i < n; i++) {
        printf("Name: %s\tRoll No.: %d\tTotal Marks: %.2f\n", students[i].student_name, students[i].student_roll_no, students[i].total_marks);
    }

    // Print the number of swaps performed
    printf("\nNumber of swaps performed: %d\n", swap_count);

    // Free the allocated memory
    free(students);

    return 0;
}

