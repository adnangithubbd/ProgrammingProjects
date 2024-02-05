public class merge_sort{
    public static void main(String[] args) {
         int[] array={8,2,5,3,4,7,6,1};
         mergeSort(array);
         for (int item : array) {
            System.out.println(item);
         }
    }
    private static void mergeSort(int[] array){
            int length=array.length;
            if(length<=1) return ;
            
            int middle=length/2;
            int[] leftArray=new int[middle];
            int[] rightArray=new int[length-middle];
            
             for(int i=0;i<middle;i++){
                leftArray[i]=array[i];
             }
              
             for(int i=middle,j=0;i<length;j++,i++){
                rightArray[j]=array[i];
             }
            mergeSort(leftArray);
            mergeSort(rightArray);
            merge(leftArray, rightArray, array);

    }
    private static void merge(int [] leftArray,int[] rightArray,int[] array){
            int leftsize=array.length/2;
            int righsize=array.length-leftsize;
            int i=0,l=0,r=0;
            while (l<leftsize&&r<righsize) {
                if(leftArray[l]<rightArray[r]){
                    array[i]=leftArray[l];
                    i++;
                    l++;
                }else{
                    array[i]=rightArray[r];
                    i++;
                    r++;
                }
            }
            while (l<leftsize) {
                array[i]=leftArray[l];
                i++;
                l++;
            }
            while (r<righsize) {
                array[i]=rightArray[r];
                i++;
                r++;
            }
    }
}