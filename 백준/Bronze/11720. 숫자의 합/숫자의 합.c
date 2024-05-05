#include <stdio.h>

int main()
{
	int num, result = 0;
	char arr[101];

	scanf("%d", &num);
	scanf("%s", &arr[0]);

	for (int i = 0; i < num; i++)
	{
		result += arr[i] - '0';
	}	
    printf("%d",result);
}
