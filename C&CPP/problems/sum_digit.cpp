#include<iostream>
using namespace std;

int sumOfDigits(int num) {
     if (num < 10) {
        return num;
    } else {
         return num % 10 + sumOfDigits(num / 10);
    }
}


void display(int n) {
     if (n == 0) {
        return;
    }
     cout << n << " -> ";
     display(n - 1);
     cout << n << " ";
 
    
}

int main(){
        display(12);
        return 0;
}