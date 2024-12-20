#include<stdio.h>

// dy/dx + xy =0
float dydx(float x, float y) { return (-1*x*y); }

float RK2nd(float x0, float y0, float xf, float h)
{
	int n = (int)((xf - x0) / h);

	float k1, k2;

	printf("x\t y\n");
	for (int i = 0; i < n; i++) {
		printf("%.4f  %.4f\n",x0,y0);

		k1 = h * dydx(x0, y0);

        float x1 = x0 + h;
        float y1 = y0 + k1;
		
		k2 = h * dydx(x1, y1);

        y1 = y0 + 0.5 * (k1+k2);

        x0=x1;
        y0=y1;
	}
		printf("%.4f  %.4f\n",x0,y0);

	return y0;
}

int main()
{
	float x0 = 0, y0 = 1, xf = 0.25, h = 0.05;
    printf( "y(%.4f)=%.4f",xf,RK2nd(x0,y0,xf,h));

	return 0;
}
