#include<iostream>
using namespace std;

void swap(int& a,int& b){
    int temp=a;
    a=b;
    b=temp;

}
 
int partintion(int arr[],int start,int end){
    int pivot=arr[end];
    int i=start-1;
    for(int j=start;j<end;j++){
        if(arr[j]<pivot){
            i++;
            swap(arr[j],arr[i]);
        }
    }
    swap(arr[i+1],arr[end]);
    return i+1;
}
 
void quickSort(int arr[], int start, int end) {
    if(start<end){
            int p=partintion(arr,start,end);
            quickSort(arr,start,p-1);
            quickSort(arr,p+1,end);
    }
}

  
 void printArr(int a[], int n)  
{  
    int i;  
    for (i = 0; i < n; i++)  
       cout<<a[i]<<" ";
}  
int main()  
{  
    int a[] = { 24, 9, 29, 14, 19, 27 };  
    int n = sizeof(a) / sizeof(a[0]);  
    printf("Before sorting array elements are - \n");  
    printArr(a, n);  
    quickSort(a, 0, n - 1);  
    printf("\nAfter sorting array elements are - \n");    
    printArr(a, n);  
    
      
    return 0;  
}  