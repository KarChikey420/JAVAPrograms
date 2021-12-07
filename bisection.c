#include<stdio.h>
#include<math.h>
double fun(double x)
{
    return x*x*x-4*x-9;
}
int main()
{
    double x0,x1=0,x2;
    while(fun(x1)<0)
    x1++;
    x0=x1-1;
    do{
        x2=(x1+x0)/2.0;
        if(fun(x0)*fun(x2)<0)
        x1=x2;
        else
        x0=x2
    }while(fabs(x0-x1)>0.0001);
    printf("\n%.4if",x2);
    return 0;
}