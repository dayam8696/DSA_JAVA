package HashMap;

public class Main {
    public static void main(String[] args) {

        HashMapImplementation.MapUsingHash map = new HashMapImplementation.MapUsingHash();

        map.put("Mango", "King of fruits");
        map.put("Apple", "A sweet red fruit");
        map.put("Litchi", "Kunal's fav fruit");

        System.out.println(map.get("Apple"));

        HashMapFinal<Object, String> goodMap = new HashMapFinal<Object, String>();

        goodMap.put("Mango", "King of fruits");
        goodMap.put("Apple", "A sweet red fruit");
        goodMap.put("Litchi", "Kunal's fav fruit");

        System.out.println(map.get("Apple"));


    }
}
