package main;

import java.util.HashMap;
import java.util.Map;

public class PT11_Map {

    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<>();

        map.put(1, "igor");
        map.put(2, "pedro");
        map.put(3, "ana");
        map.put(4, "joao");

        System.out.println(map.values().toArray()[1]);
        System.out.println(map.keySet().toArray()[1]);

        for(Integer key : map.keySet()) {
            System.out.println("Key: " + key + ", Value: " + map.get(key));
        }

        if(map.containsKey(1)) {
            System.out.println(map.get(1));
        }

        if(map.containsValue("pedro")) {
            System.out.println("pedro");
        }


        // Se a chave ja existir será substituida
        map.put(1, "maria");

        System.out.println(map);

        map.replace(2, "marcos");
        System.out.println(map);

        map.putIfAbsent(1, "carlos");
        System.out.println(map);

        map.putIfAbsent(5, "carla");
        System.out.println(map);

        map.remove(2);
        System.out.println(map);
    }

}
