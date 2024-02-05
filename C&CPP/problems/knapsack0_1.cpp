#include <iostream>

using namespace std;

int main() {
    float weight[50], profit[50], ratio[50], totalValue = 0, temp, capacity;
    int n, i;

    cout << "Enter the number of items: ";
    cin >> n;
    cout << endl;

     for (i = 0; i < n; i++) {
        cout << "Enter weight and profit for item " << i << ": ";
        cin >> weight[i] >> profit[i];
    }

    cout << "Enter the capacity of knapsack: ";
    cin >> capacity;
     for (i = 0; i < n; i++) {
        ratio[i] = profit[i] / weight[i];
    }

     for (i = 0; i < n; i++) {
        for (int j = i + 1; j < n; j++) {
            if (ratio[i] < ratio[j]) {
                temp = ratio[j];
                ratio[j] = ratio[i];
                ratio[i] = temp;

                temp = weight[j];
                weight[j] = weight[i];
                weight[i] = temp;

                temp = profit[j];
                profit[j] = profit[i];
                profit[i] = temp;
            }
        }
    }

    cout << "Knapsack problem using Greedy Algorithm:\n";

    // Continue using i without redeclaration
    for (i = 0; i < n; i++) {
        if (weight[i] > capacity) {
            break;
        } else {
            totalValue = totalValue + profit[i];
            capacity = capacity - weight[i];
        }
    }

    if (i < n) {
        totalValue = totalValue + (ratio[i] * capacity);
    }

    printf("\nThe maximum value is: %f\n", totalValue);

    return 0;
}
