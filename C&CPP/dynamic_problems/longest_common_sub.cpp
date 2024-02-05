#include<iostream>
#include<algorithm>
#include<stdio.h>
#include<string>
#include<vector>
using namespace std;

int longestCommonSubstring(string str1, string str2) {
    int m = str1.length();
    int n = str2.length();

     int dp[m + 1][n + 1];

     for (int i = 0; i <= m; i++) {
        for (int j = 0; j <= n; j++) {
            dp[i][j] = 0;
        }
    }

 int endIndex = 0;
    int maxLength = 0;
     for (int i = 1; i <= m; i++) {
        for (int j = 1; j <= n; j++) {
            if (str1[i - 1] == str2[j - 1]) {
                dp[i][j] = 1 + dp[i - 1][j - 1];

                  if (dp[i][j] > maxLength) {
                    maxLength = dp[i][j];
                    endIndex = i - 1;
                }
            } else {
                dp[i][j] = 0;
            }
        }
    }

 
    for (int i = 0; i <= m; i++) {
        for (int j = 0; j <= n; j++) {
            maxLength = max(maxLength, dp[i][j]);
        }
    }

    string result = str1.substr(endIndex - maxLength + 1, maxLength);
        cout<<result<<endl;
    return maxLength;
}

int main() {
     string str1,str2;
  cout<<"Enter two string "<<endl;
  cin>>str1;
  cin>>str2;

    int lcsLength = longestCommonSubstring(str1, str2);

    cout << "Length of longest common substring: " << lcsLength << endl;

    return 0;
}