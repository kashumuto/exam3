import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Main {
    public static void main(String[] args) {

        Map<String,String> toys = new HashMap<>();
        toys.put("Настольные","Uno");
        toys.put("Спортивные","Ракетка");
        toys.put("для детей","человек-паук");

        Iteration.printByEntrySet(toys);
        Iteration.printByKey(toys);
        Iteration.printByValues(toys);

    }
}
class Iteration{
    public static <K, V> void printByEntrySet(Map<K, V> map) {
        Set<Map.Entry<K, V>> entrySet = map.entrySet();
        for (Map.Entry<K, V> entry : entrySet) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
        System.out.println();
    }
    public static <K, V> void printByKey(Map<K, V> map) {
        for (K key : map.keySet()) {
            System.out.println(key);
        }
        System.out.println();
    }
    public static <K, V> void printByValues(Map<K, V> map) {
        for (V value : map.values()) {
            System.out.println(value);
        }
        System.out.println();
    }
}