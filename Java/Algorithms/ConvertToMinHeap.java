public class ConvertToMinHeap {
    public static void main(String[] args) {
        int[] array ={8, 5, 10, 3, 6};
        System.out.println("Original array: ");
        for (int item : array) {
            System.out.print(item + " ");
        }

        System.out.println("\nAfter converting to Min Heap:");
    
        convertToMinHeap(array);
        heapSort(array);
        for (int item : array) {
            System.out.print(item + " ");
        }
        System.out.println();
        System.out.println();
        System.out.println();
        
    }

    private static void convertToMinHeap(int[] array) {
        int n = array.length;
        for(int i=(n/2)-1;i>=0;i--){
           minHeapify(array, n, i);
        }
    }

    private static void minHeapify(int[] array, int size, int i) {
        int smallest=i;
        int left=2*i+1;
        int right=2*i+2;
        if(left<size&&array[left]<array[smallest]){
            smallest=left;
        }
        if(right<size&&array[right]<array[smallest]){
            smallest=right;
        }
        if(smallest!=i){
            swap(array, smallest,i);
            minHeapify(array, size, smallest);
        }
    }
    private static void swap(int[] array,int a,int b){
        int temp=array[a];
        array[a]=array[b];
        array[b]=temp;
    }
    private static void heapSort(int[] array){
        int n=array.length;
        for(int i=n-1;i>=0;i--){
            swap(array, 0, i);
            minHeapify(array, i, 0);
        }
    }
 
}
