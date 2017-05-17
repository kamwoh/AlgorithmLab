
package lab1;

import java.util.HashMap;
import java.util.Map;


public class L1P2Q1 {
    public static void main(String[] args){
        Map<String, String>map=new HashMap<>();
        map.put("a","candy");
        map.put("b","dirt");
        System.out.println("Before..");
        System.out.print(map);
        if(map.containsKey("a")){
                map.put("b",map.get("a"));
                map.put("a","\"\"");
        }
        System.out.println("");
        System.out.println("After..");
        System.out.print(map);
        System.out.println("");
        Map<String, String>map2=new HashMap<>();
        map2.put("a","candy");
        System.out.println("Before..");
        System.out.print(map2);
        if(map2.containsKey("a")){
                map2.put("b",map2.get("a"));
                map2.put("a","\"\"");
        }
        System.out.println("");
        System.out.println("After..");
        System.out.print(map2);
        System.out.println("");
    }
}

