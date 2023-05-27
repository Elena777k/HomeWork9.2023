package MyHashMap;

public class MyHashMapTests {

        public static void main(String[] args) {
            MyHashMap<String, Integer> hashMap = new MyHashMap<String, Integer>();


            hashMap.put("Elena", 15);
            System.out.println("Size: " + hashMap.size());
            hashMap.put("Elena", 33);
            System.out.println("Key 'Elena': " + hashMap.get("Elena"));
            hashMap.clear();
            System.out.println("Size: " + hashMap.size());
            System.out.println("HashMap: " + hashMap);

        }

}
