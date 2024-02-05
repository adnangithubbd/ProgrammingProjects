#include<iostream>
#include<vector>
using namespace std;

vector<int> minCoins(int amount,vector<int>& coins){
        vector<int> result;

        for(int i=coins.size()-1;i>=0;i--){
                while (amount>=coins[i])
                {
                    result.push_back(coins[i]);
                    amount-=coins[i];
                }
                
        }
        return result;
}

int main(){

 
 vector<int> coins = {1, 5, 10, 25};
 int amount=63;
        vector<int> result=minCoins(amount,coins);
    for(int coin: result){
        cout<<coin<<endl;
    }
    return 0;
}