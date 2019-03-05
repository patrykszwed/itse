import java.util.HashMap;
import java.util.Map;

public class Main {

    public static void main(String[] args) {
//        int []ar = {1,2-1,1,2,3,1};
        int []ar = {1, 2, 1, 2, 3, 2, 3, 3};

        Map<Integer, Integer> integerMap = new HashMap<>();
        int value, result = 0, max = 0;

        for(int elem : ar){
            if(integerMap.containsKey(elem)){
                value = integerMap.get(elem);
                integerMap.put(elem, ++value);
                if(max < value){
                    max = value;
                    result = elem;
                }
                continue;
            }
            integerMap.put(elem, 1);
        }

        System.out.println("Mode = " + result);
    }
}
