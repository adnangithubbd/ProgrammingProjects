package heap;

class MaxHeap {

    private int[] heap;
    private int size;
    private int capacity;
    
    public MaxHeap(int capacity){
        this.capacity=capacity;
        this.size=0;
        this.heap=new int[capacity+1];
    }
    private int parent(int i){
        return i/2;
    }
    private int leftChild(int i){
        return 2*i;
    }
    private int rightChild(int i){
        return 2*i+1;
    }
    private void swap(int a,int b){
        int temp=heap[a];
        heap[a]=heap[b];
        heap[b]=temp;
       
    }
    public void insert(int value){
        if(size>=capacity){
            System.out.println("heap is full");
            return;
        }
        size++;
        heap[size]=value;
        int current=size;
        while (heap[current]>heap[parent(current)]) {
            swap(current, parent(current));
            current=parent(current);
        }
    }
      public void maxHeapify(int pos){
        int left=leftChild(pos);
        int right=rightChild(pos);
        int curr=pos;
        if(left<=size&& heap[left]>heap[curr]){
            curr=left;
        }
        if(right<=size&& heap[right]>heap[curr]){
            curr=right;
        }
        if(curr!=pos){
            swap(pos, curr);
            maxHeapify(curr);
        }
      }
      public void buildMaxHeap(int[] array){
        size=array.length;
        for(int i=0;i<size;i++){
            heap[i+1]=array[i];
        }
        for(int i=size/2;i>=1;i--){
            maxHeapify(i);
        }
      }
      public void printHeap() {
        for (int i = 1; i <= size / 2; i++) {
            System.out.print(" Parent: " + heap[i] + " Left child: " +
                             heap[2 * i] + " Right child: " + heap[2 * i + 1]);
            System.out.println();
        }
    }
    public int extractMax() {
        if (size == 0) {
            System.out.println("Heap is empty");
            return -1;  
        }

        int max = heap[1]; 
        heap[1] = heap[size];  
        size--;
        maxHeapify(1);  
        return max;
    }
    public static void main(String[] args) {
      MaxHeap maxHeap=new MaxHeap(10);
      maxHeap.insert(5);
      maxHeap.insert(3);
      maxHeap.insert(8);
      maxHeap.insert(1);
      maxHeap.insert(10);
      maxHeap.printHeap();
    }
}