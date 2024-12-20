#include<stdio.h>

int main()
{
    int n;
    printf("Enter No. of Unknowns: ");
    scanf("%d",&n);
    float a[n][n+1],x[n];

    for (int i = 0; i < n; i++){
        for (int j = 0; j < n+1; j++){
            printf("a[%d][%d] : ",i,j);
            scanf("%f",&a[i][j]);
        }  
    }

    printf("\nInitial Matrix :\n");
    for (int i = 0; i < n; i++){
        for (int j = 0; j < n+1; j++){
            printf("%f\t",a[i][j]);
        }
        printf("\n");
    }

    
    for (int k = 0; k < n-1; k++)
    {
        //Pivotal Condensation
         float max=a[k][k];
         int pos;
        for (int j = k+1; j < n; j++){
             if(a[j][k]>max){
                max=a[j][k];
                pos=j;
             }           
        }
        if(pos!=k){
            for (int q = 0; q < n+1; q++){
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
                for (int j = k; j < n+1; j++)
                    a[i][j] -= (u* a[k][j]);
            }
        }

        printf("\nAfter %d Elimination :\n",k+1);
        for (int i = 0; i < n; i++){
            for (int j = 0; j < n+1; j++){
                printf("%f\t",a[i][j]);
            }
            printf("\n");
        }
    }
    //Back Subsitution
    x[n-1]=a[n-1][n]/a[n-1][n-1];
    for (int i = n-2; i >= 0 ;i--)
    {
        float sum = 0;
        for (int j = i+1; j < n; j++)
        {
            sum += (a[i][j] * x[j]);
        }
        if(a[i][i]==0){
            printf("divide by 0");
            continue;
        }
        else{
            x[i]=(a[i][n]-sum)/a[i][i];
        }
    }
    
    for (int  i = 0; i < n; i++)
        printf("x%d = %f\n",i,x[i]);
    
    return 0;
}