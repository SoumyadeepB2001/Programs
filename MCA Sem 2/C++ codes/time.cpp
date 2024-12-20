#include<iostream>
using namespace std;
class TIME{
    int hours;
    int minutes;
    int seconds;
    public:
        TIME(){
            hours = 0;
            minutes = 0;
            seconds = 0;
        }
        TIME(int h,int m,int s){
            hours = h;
            minutes = m;
            seconds = s;
        }
        void add(TIME,TIME);
        void displayTime(){
            cout<<hours<<":";
            cout<<minutes<<":";
            cout<<seconds<<endl;
        }
};
void TIME::add(TIME T1,TIME T2){
    seconds = T1.seconds + T2.seconds;
    minutes = T1.minutes + T2.minutes +seconds/60;
    hours = T1.hours + T2.hours + minutes/60;
    minutes = minutes%60;
    seconds = seconds%60;
}
int main(){
TIME T1(2,45,50);
TIME T2(1,20,30);
TIME T3;
T3.add(T1,T2);
T1.displayTime();
T2.displayTime();
T3.displayTime();
}