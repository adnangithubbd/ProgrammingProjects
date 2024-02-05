#include <iostream>

using namespace std;

void knapsackFractional(float weight[], float profit[], int n, float capacity) {
    float ratio[50], totalValue = 0;
    int i, j;
    
    // Calculate the profit-to-weight ratio for each item
    for (i = 0; i < n; i++)
        ratio[i] = profit[i] / weight[i];

    // Sort items based on the profit-to-weight ratio in descending order
    for (i = 0; i < n; i++)
        for (j = i + 1; j < n; j++)
            if (ratio[i] < ratio[j]) {
                float temp = ratio[j];
                ratio[j] = ratio[i];
                ratio[i] = temp;

                temp = weight[j];
                weight[j] = weight[i];
                weight[i] = temp;

                temp = profit[j];
                profit[j] = profit[i];
                profit[i] = temp;
            }

    // Fill the knapsack with fractional items
    for (i = 0; i < n; i++) {
        if (weight[i] <= capacity) {
            totalValue += profit[i];
            capacity -= weight[i];
        } else {
            totalValue += ratio[i] * capacity;
            break;
        }
    }

    cout << "The maximum value in the fractional knapsack is: " << totalValue << endl;
}

int main() {
    float weight[] = {2, 5, 1};
    float profit[] = {10, 15, 5};
    int n = sizeof(weight) / sizeof(weight[0]);
    float capacity = 8;

    knapsackFractional(weight, profit, n, capacity);

    return 0;
}
