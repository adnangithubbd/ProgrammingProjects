#include <iostream>
#include <vector>
#include <algorithm>
#include<cmath>
 #include <iostream>
#include <cmath>
 using namespace std;
int main() {      
  
  vector<int> v={1,2,3,4,5};
  vector<int> v2={100,200,300,4000};
  v.insert(v.begin()+2,v2.begin(),v2.end());
  
  vector<int> check = {1, 2, 3, 4, 5,6,7,8};
      
    // replace(check.begin(),check.end(),2,100);
   auto res= find(check.begin(),check.end(),22);
   vector<int>:: iterator it;
   it=find(check.begin(),check.end(),62);
    if(it==check.end()) cout<<"Not found";
    else cout<<"value found";
    
  // for (int item : check) {
  //   cout << item << " ";
  // }
   
    return 0;
}
