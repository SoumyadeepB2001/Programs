#include<stdio.h>

int main()
{
    int n;
    printf("Enter size Of Matrix: ");
    scanf("%d",&n);
    float a[n][n+n];

    printf("Enter the elements\n");
    for (int i = 0; i < n; i++){
        for (int j = 0; j < (2*n); j++){
            if(j<n){
                scanf("%f",&a[i][j]);
            }else{
                if(i+n==j){
                    a[i][j]=1;
                }else{
                    a[i][j]=0;
                }
            }
        }
    }

    printf("\nInitial Matrix:\n");
    for (int i = 0; i < n; i++){
        for (int j = 0; j < (2*n); j++){
            if(j==n)
                printf("| ");
            printf("%f\t",a[i][j]);
        }
        printf("\n");
    } 

    for (int k = 0; k < n-1; k++){
         float max=a[k][k];
         int pos;
        for (int j = k+1; j < n; j++){
             if(a[j][k]>max){
                max=a[j][k];
                pos=j;
             }           
        }
        if(pos!=k){
            for (int q = 0; q < (2*n); q++){
                float t= a[k][q];
                a[k][q]=a[pos][q];
                a[pos][q]=t;
            }
            
        }

        //Elimination
        for (int i = k+1; i < n; i++){
            if(a[k][k]==0){
                 printf("divide by 0");
                continue;
            }
            else{
                float u=a[i][k]/a[k][k];
                for (int j = k; j < n+n; j++)
                    a[i][j] -= (u* a[k][j]);
            }
        }

        printf("\nAfter %d Elimination:\n",k);
        for (int i = 0; i < n; i++){
            for (int j = 0; j < n+n; j++){
                if(j==n)
                    printf("| ");
                printf("%f\t",a[i][j]);
            }
            printf("\n");
        }
    }

    

    for (int i = n-1; i >= 0 ;i--){
        for(int q=n;q<(2*n);q++){

            float sum = 0;
            for (int j = i+1; j < n; j++){
                sum += (a[i][j] * a[j][q]);
            }
            if(a[i][i]==0){
                printf("divide by 0");
                continue;
            }
            else{
                a[i][q]=(a[i][q]-sum)/a[i][i];
            }
        }
    }

    printf("\n\nInverse Of Matrix:\n");
     for (int i = 0; i < n; i++){
        for (int j = n; j < (2*n); j++)
            printf("%.2f\t",a[i][j]);
        printf("\n");
    }
    return 0;
}