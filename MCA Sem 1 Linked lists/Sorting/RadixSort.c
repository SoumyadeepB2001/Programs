#include<stdio.h>

void radixSort(int *arr, int n);
void printArray(int *arr, int size);

int main()
{
	int arrayLength;
	
	printf("Enter the number of elements: ");
	scanf("%d",&arrayLength);

	int dataSet[arrayLength];
	printf("Enter the numbers:\n");
	
	for(int i = 0;i<arrayLength; i++){
		scanf("%d",&dataSet[i]);
	}

	printf("Before Sorting : ");
	printArray(dataSet,arrayLength);
	
	radixSort(dataSet, arrayLength);
	
	printf("After Sorting : ");
	printArray(dataSet, arrayLength);
	
	return 0;
}

void printArray(int *arr, int size){
	int i;
	for(i = 0;i<size;i++){
		
		printf("%d ",arr[i]);
	}
	printf("\n");
}

void radixSort(int *arr, int n){

    int maxVal = arr[0], digitPos = 1;

    for(int i = 1; i < n; i++){

        if(arr[i] > maxVal){
            
            maxVal = arr[i];
        }
    }

    while(maxVal / digitPos > 0){

        //printf("Number : %d\n", maxVal / digitPos);

        int colIndex[10] = {0};
        int pocket[10][10] = {0};

        for(int i = 0,k; i < n; i++){

            k = arr[i] / digitPos % 10;
            pocket[k][colIndex[k]++] = arr[i];
        }

        for(int j = 0,i = 0; j<10; j++){

            if(pocket[j][0] != 0){

                for(int k = 0; k < colIndex[j]; k++){

                    arr[i++] = pocket[j][k];
                }
            }
        }

        digitPos *= 10;


    }
}