#include <stdio.h>
#include <string.h>
void countAndPrintSubstrings(char S[], char X, char Y)
{
 int count = 0;
 int length = strlen(S);
 int i, j;
 for (i = 0; i < length; i++)
 {
 if (S[i] == X)
 {
 for (j = i + 1; j < length; j++)
 {
 if (S[j] == Y)
 {
 count++;

 printf("%.*s ,", j - i + 1, &S[i]); 
 }
 }
 }
 else if (S[i] == Y)
 {
 for (j = i + 1; j < length; j++)
 {
 if (S[j] == X)
 {
 count++;
 printf("%.*s ,", j - i + 1, &S[i]); // Print the substring
 }
 }
 }
 }
 printf("\nNumber of substrings with endpoints %c and %c: %d.\n", X, Y, count);
}
int main()
{
 char S[] = "saransh";
 char X = 'r';
 char Y = 'h';
 countAndPrintSubstrings(S, X, Y);
 return 0;
}