#include <iostream>
#include <vector>
using namespace std;
 vector<int> minCoins(int amount, const  vector<int>& coinDenominations) {
     vector<int> result;

    for (int i = coinDenominations.size() - 1; i >= 0; --i) {
        while (amount >= coinDenominations[i]) {
            result.push_back(coinDenominations[i]);
            amount -= coinDenominations[i];
        }
    }

    return result;
}

int main() {
    int amount = 63;
  vector<int> coinDenominations = {1, 5,25, 10};

 vector<int> change = minCoins(amount, coinDenominations);

     cout << "Minimum coins needed to make change for " << amount << " cents: ";
    for (int coin : change) {
        cout << coin << " ";
    }
    std::cout << std::endl;

    return 0;
}
