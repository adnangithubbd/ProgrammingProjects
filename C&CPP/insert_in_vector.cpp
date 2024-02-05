#include <iostream>
#include <vector>
#include<algorithm>
#include<bits/stdc++.h>
using namespace std;

int main() {
     
    vector<int> v;
    for(int i=0;i<5;i++){
        v.push_back(i+12);
       
    }
    
      for(size_t index;index<v.size();index++){
        try{
             cout << v.at(index) << " ";
        }catch(exception e){
            cout<<e.what()<<endl;
        }
       
    } 

    cout<<v.capacity()<<endl;
     
   vector<string> strVect;
   strVect.push_back("john");
   strVect.push_back("rony");
   strVect.push_back("raisa");
   strVect.push_back("ratul");
   strVect.push_back("akhi");
    sort(strVect.begin(), strVect.end());
   
 
 
    
    return 0;
}
