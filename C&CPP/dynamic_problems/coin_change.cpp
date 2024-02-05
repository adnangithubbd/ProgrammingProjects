#include <iostream>
#include <vector>
#include <climits>
#include<algorithm>
using namespace std;

int minCoins(vector<int>& coins, int amount) {
   sort(coins.begin(),coins.end(),greater<int>());
   int cnt=0;
   int current_amout=amount;
    for(auto coin:coins){
        if(coin<=current_amout &&current_amout!=0){
          
            int new_cnt=current_amout/coin;
              cnt+=new_cnt;
            current_amout = current_amout- new_cnt*coin;
        }
    }
    cout<<cnt<<endl;
}
 

int main() {
   vector<int> coins = {5, 2, 8, 1, 3};
    int amount = 13;
    minCoins(coins,amount);
    return 0;
}
