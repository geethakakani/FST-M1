package activities;

import java.util.HashMap;

public class Activity11 {
    public static void main(String[] args) {
        HashMap<Integer, String> map = new HashMap<Integer, String>();
        map.put(1, "Orange");
        map.put(2, "Blue");
        map.put(3, "Black");
        map.put(4, "White");
        map.put(5, "Red");
        System.out.println("The Original map: " + map);
        map.remove(4);
        System.out.println("After removing White: " + map);
        if (map.containsValue("Green")) {
            System.out.println("Green exists in the Map");
        } else {
            System.out.println("Green does not exist in the Map");
        }
        System.out.println("Number of pairs in the Map is: " + map.size());

    }
}
