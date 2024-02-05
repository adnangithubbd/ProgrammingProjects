package Dynamic;
import java.util.*;
public class Fibonacci {
    public static void main(String[] args) {
        int n=5;
        System.out.println(fibonacci(n));
        
    }

    private static Map<Integer,Integer> memo=new HashMap<>();
    private static int fibonacci(int n){
        if(n==0){
            return 0;
        }else if(n==1){
            return 1;
        }
        if(memo.containsKey(n)){
            return memo.get(n);
        }
        int result=fibonacci(n-1)+fibonacci(n-2);
        memo.put(n, result);
        return result;
    }
}
