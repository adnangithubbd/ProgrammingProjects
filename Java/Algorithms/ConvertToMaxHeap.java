public class ConvertToMaxHeap {
    public static void main(String[] args) {
        int[] array = {4, 10, 3, 5, 1};
        for(int item:array){
            System.out.print(item+" ");
        }
        System.out.println();
        convert2MaxHeap(array);
        System.out.println("After convert to maxheap  :: ");
        for(int item:array){
            System.out.print(item+" ");
        }
    }
    private static void convert2MaxHeap(int[] array){
        int n=array.length;
        for(int i=(n/2)-1;i>=0;i--){
            maxHeapify(array,n,i);
        }
       
    }
    private static void maxHeapify(int[] array,int size, int i){
        int largest=i;
        int left=2*i+1;
        int right=2*i+2;
        if(left<size && array[left]>array[largest]){
            largest=left;
        }
        if(right<size&& array[right]>array[largest]){
            largest=right;
        }
        if(largest!=i){
                swap(array, i, largest);
                maxHeapify(array, size, largest);
        }
    }
    
    private static void swap(int[] array,int i, int j){
        int temp=array[i];
        array[i]=array[j];
        array[j]=temp;

    }
}
