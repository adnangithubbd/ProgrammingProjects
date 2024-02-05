import java.util.*;


class Item{
    int value;
    int weight;
    double valuePerWeight;

    public Item(int value,int weight){
        this.value=value;
        this.weight=weight;
        this.valuePerWeight= (double) value/weight;
    }
}
public class colldemo {

   public static double factionalKnapsack(int W,List<Item> items){
        Collections.sort(items,Comparator.comparingDouble((Item item)->item.valuePerWeight).reversed());
        double totalValue=0.0;
        double currentWeight=W;

        for(Item item:items){
            System.out.println("item  Weight : "+item.weight);
            System.out.println("Item value  : "+item.value);
            System.out.println("value PerWeight : "+item.valuePerWeight);
        }

            for(Item item:items){
                if(currentWeight>=item.weight){
                    totalValue+=item.value;
                    currentWeight-=item.weight;
                }else{
                    totalValue+=item.valuePerWeight*currentWeight;
                    break;
                }
            }

  
        return totalValue;
   }

    public static void main(String[] args) {
       int maxWeight=50;
       List<Item> items=new ArrayList();
       items.add(new Item(10, 60));
       items.add(new Item(20, 100));
       items.add(new Item(30, 120));
       double maxValue= factionalKnapsack(maxWeight,items);
       System.out.println("Max values " +maxValue);
    }


}
