#include<iostream>

using namespace std;

int main(){
    int n,q;
    cin>>n>>q;
    int a[n];
    for(int i=0;i<n;i++){
        cin>>a[i];
    }
    int pre[n];
    pre[0]=a[0];
    for(int i=1;i<n;i++){
        pre[i]+=a[i];
    }
    while(q--){
        int l,r;
        cin>>l>>r;
        l--;
        r--;
        int sum=0;
        if(l==0) return sum= a[0];
        else  sum= pre[r]-pre[l-1];
        
    }
    return 0;
}