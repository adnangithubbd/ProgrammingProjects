#include<stdio.h>
#include<iostream>
using namespace std;

 void fib(int n){
        int numbers[n+1]; 
    numbers[0]=0;
    if(n>0){
        numbers[1]=1;
    }
    for(int i=2;i<=n;i++){
        numbers[i]=numbers[i-1]+numbers[i-2];
    }
        for(int i=0;i<n;i++){
            cout<<numbers[i]<<" ";
        }
 }

int main(){
    fib(5);
    return 0;
}