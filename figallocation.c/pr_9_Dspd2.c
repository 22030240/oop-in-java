#include <stdio.h>
#include <string.h>

typedef struct {
    char employee_name[50];
    int emp_no;
    double emp_salary;
} Employee;

int binarySearch(Employee arr[], int size, int key, int* comparisons) {
    int low = 0;
    int high = size - 1;
    int mid;

    while (low <= high) {
        mid = low + (high - low) / 2;
        (*comparisons)++;

        if (arr[mid].emp_no == key)
            return mid;

        if (arr[mid].emp_no < key)
            low = mid + 1;
        else
            high = mid - 1;
    }

    return -1;
}

int main() {
    Employee employees[] = {
        {"John Doe", 101, 5000.0},
        {"Jane Smith", 202, 6000.0},
        {"Alice Johnson", 303, 7000.0},
        {"Bob Williams", 404, 8000.0},
        {"Sarah Davis", 505, 9000.0}
    };

    int size = sizeof(employees) / sizeof(employees[0]);
    int key;
    printf("Enter the value of key: ");
    scanf("%d", &key);
    //int key = 303;
    int comparisons = 0;

    int index = binarySearch(employees, size, key, &comparisons);

    if (index != -1){
        printf("Employee found at index %d\n", index);
        
    printf("Name of Emp:->%s\n",employees[index].employee_name);
    printf("Id of Emp:->%d\n",employees[index].emp_no);
    printf("Salary of Emp:->%f\n",employees[index].emp_salary);

        
    }
    else
        printf("Employee not found\n");

    printf("Number of comparisons: %d\n", comparisons);

    return 0;
}