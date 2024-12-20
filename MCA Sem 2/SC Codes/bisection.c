#include <stdio.h>
#include <stdlib.h>
#include <math.h>
#define E 0.0005

float f(float x){
    return ((x*x*x)-(4*x)+1);
}

int main(){
    float x0 = 0, x1 = 0, x2, y0, y1, y2;
    int i = 0;
    printf("Input Interval: ");
    scanf("%f %f", &x0, &x1);

    y0=f(x0);
    y1=f(x1);

    if ((y0*y1) > 0){
        printf("Invalid Interval !"); 
        exit(1);                         
    }

    x2=(x0+x1)/2;

    printf(" Ite\tx0\t\tx1\t\tx2\t\tf(x2)\n");
    while (fabs((x1 - x0)/x1) > E){
        x2 = (x0 + x1) / 2;
        y2=f(x2);
        printf("%2d\t%4.6f\t%4.6f\t%4.6f\t%4.6f\n", i++, x0, x1, x2, y2);
       if ((y0 * y2) > 0)
            x0 = x2;
        else
            x1 = x2;
    } 
    printf("Approximate Root is %4.6f", x2);
    return 0;
}