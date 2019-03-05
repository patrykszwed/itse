import java.util.HashMap;
import java.util.Map;

public class Main {

    public static void main(String[] args) {
        mode();
        encrypt("abc");
    }

    public static void mode(){
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

    //todo
    public static void encrypt(String arg){
        arg = arg.toLowerCase();
        StringBuilder stringBuilder = new StringBuilder();
        for(int i = 0; i < arg.length(); ++i){
            if(i == arg.length() - 1){
                stringBuilder.append((char)(((int)arg.charAt(i) - 97 + (int)arg.charAt(0) - 97) % 27));
                break;
            }
            stringBuilder.append((char)(((int)arg.charAt(i) - 97 + (int)arg.charAt(i + 1) - 97) % 27));
        }
        System.out.println("Encrypted value of " + arg + " = " + stringBuilder.toString());
    }
}
