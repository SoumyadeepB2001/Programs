#include<stdio.h>
struct point
{
	int x,y;
};

struct line
{
	struct point p1;
	struct point p2;
};
 
void main()
{
	struct line l1;
	struct line l2;
	printf("Enter first point of first line\n");
	scanf("%d%d",&l1.p1.x,&l1.p1.y);
	printf("Enter second point of first line\n");
	scanf("%d%d",&l1.p2.x,&l1.p2.y);

	printf("Enter first point of second line\n");
	scanf("%d%d",&l2.p1.x,&l2.p1.y);
	printf("Enter second point of second line\n");
	scanf("%d%d",&l2.p2.x,&l2.p2.y);
	
	float m1=(l1.p2.y-l1.p1.y)/(l1.p2.x-l1.p1.x);
	float m2=(l2.p2.y-l2.p1.y)/(l2.p2.x-l2.p1.x);

	if(m1==m2)
	printf("Parallel");
	else
	printf("Not parallel");
}