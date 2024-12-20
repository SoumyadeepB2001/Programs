#include <stdio.h>
#include <stdlib.h>
#include <math.h>
#define E 0.0005
float f(float x){
    return (x * x * x - 4*x - 36);
}
int main(){
    float x0 = 0, x1 = 0, x2, f0, f1, f2;
    int n;
    printf("Input initial guesses: ");
    scanf("%f %f", &x0, &x1);
    printf("Enter Max Iteration: ");
    scanf("%f", &n);
    
    f0 = f(x0);
    f1 = f(x1);

    if ((f0 * f1) > 0){
        printf("Invalid Interval !"); 
        exit(1);                      
    }

    x2=(x0*f1-x1*f0)/(f1-f0);

    printf(" Ite\tx0\t\tx1\t\tf0\t\tf1\t\tx2\t\t\t\tf(x2)\n");

    for (int i = 0; i < n; i++){
        x2 = ((x0*f1)-(x1*f0))/(f1-f0);
        f2 = f(x2);
        if (fabs(f2) > E){
            printf("%2d\t%4.6f\t%4.6f\t%4.6f\t%4.6f\t%4.6f\t\t\t%4.6f\n", i+1, x0, x1,f0,f1, x2, f2);
            if ((f0 * f2) > 0){
                x0 = x2;
                f0 = f2;
            }
            else{
                x1 = x2;
                f1 = f2;
            }
        }
        
        else
            break;
    }
    
    printf("Approximate Root is %4.6f", x2);
    return 0;
}