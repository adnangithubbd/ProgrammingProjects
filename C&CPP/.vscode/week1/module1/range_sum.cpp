#include <iostream>
#include <vector>
#include<algorithm>
#include<bits/stdc++.h>
using namespace std;
int fib(int n){
    if(n==1||n==0){
        return 1;
    }else{
        return n*fib(n-1);
    }
}
int main(){
    cout<<fib(5);
}