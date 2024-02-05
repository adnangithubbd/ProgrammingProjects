#include<iostream>
using namespace std;

  
 int function(int value){
 
    if(value<1){
        return 0;
    }
    cout<<value<<" ";
    function(value-1);
   
    if( value == 1){
         printf("\n %d -> " ,value);
    }else{
         printf("%d -> " ,value);
    }

 }
 

int main(){
    function(12);
    return 0;
}