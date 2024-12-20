#include <stdio.h>
#include <stdlib.h>
#include <math.h>
#define RE 0.0005

float f(float x){
    return (x*x*x-4*x+1);
}

float fDash(float x){
    return (2*x);
}
int main(){
    float x0 = 0, x1 = 0, x2, f0, fD;
    int n;
    printf("Enter Initial Guess: ");
    scanf("%f", &x0);
    printf("Enter Max Iteration: ");
    scanf("%f", &n);

        printf("I\tx0\t\tf(x0)\t\tf'(x0)\t\tx1\n");
    for (int i = 0; i < n; i++){ 
        f0=f(x0);
        fD=fDash(x0);

        x1 = x0 - (f0/fD);
        if (fabs((x1 - x0)/x1) > RE){
            printf("%2d\t%4.6f\t%4.6f\t%4.6f\t%4.6f\n", i+1, x0, f0, fD, x1);
            x0 = x1;
        }else
            break; 
    }

    printf("Approximate Root is %4.6f", x1);
    return 0;
}