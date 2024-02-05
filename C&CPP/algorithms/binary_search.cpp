#include<iostream>
using namespace std;

bool binarySearch(int target,int array[],int left,int right){
    while(left<=right){
        int mid=left+(right-left)/2;
        int midValue=array[mid];
       if(target==array[mid]){
            return true;
       }
       else if(target<array[mid]){
            right=mid-1;
        }else  {
            left=mid+1;
        } 
    }
    return false;
}

int main(){
    int array[] = {1, 2, 3, 4, 5};
    int left=0;
   int right=sizeof(array)/sizeof(array[0]) -1;
    bool result=binarySearch(3,array,left,right);
    if(result){
         cout<<"  found"<<endl;
    }else{
          cout<<"not found"<<endl;
    }

    return 0;
}
