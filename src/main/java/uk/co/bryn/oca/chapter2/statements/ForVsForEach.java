package uk.co.bryn.oca.chapter2.statements;

import java.util.HashMap;
import java.util.Map;

/**
 * @author david.stevenson
 */
public class ForVsForEach {

    public static void main(String[] args) {

//        List<Integer> myList = new ArrayList<Integer>();
//        myList.add(0);
//        myList.add(1);
//        myList.add(2);
//
//        System.out.println(myList);
//
//        for (int i = 0; i < myList.size() || myList.get(i) >= 1; i++) {
//            if (myList.get(i).equals(1)) {
//                myList.remove(1);
//            }
//        }
//
//        for (Integer i : myList) {
//            if (i >= 1) {
//                break;
//            }
//        }
//        System.out.println(myList);
//
        Map<String, Object> myMap = new HashMap<String, Object>();

        for (String key : myMap.keySet()) {
            Object value = myMap.get(key);
            System.out.println(key + " = " + value);
        }

        for (Map.Entry<String, Object> entry : myMap.entrySet()) {
            System.out.println(entry.getKey() + " = " + entry.getValue());
        }

        myMap.forEach((k, v) -> System.out.println(k + " = " + v));

        int c = 7;
        int result = 4;
        result += c++;
        System.out.println(result);
    }
}
