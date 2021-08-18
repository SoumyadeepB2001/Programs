#include<stdio.h>
#include<math.h>
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
	struct line l;
	printf("Enter first point\n");
	scanf("%d%d",&l.p1.x,&l.p1.y);
	printf("Enter second point\n");
	scanf("%d%d",&l.p2.x,&l.p2.y);
	float lt=sqrt(pow((l.p1.x-l.p2.x),2)+pow((l.p1.y-l.p2.y),2));
	printf("%f",lt);
}