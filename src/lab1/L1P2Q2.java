
package lab1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
public class L1P2Q2 {
    public static void main(String[]args){
        ArrayList<String>hold1=new ArrayList<>();
        String[]arr={"c","b","a","c","b"};
        hold1.add(arr[0]);
        for(int i=0; i<arr.length; i++){
            if(hold1.contains(arr[i])==false){
               hold1.add(arr[i]);
            }
            else if(hold1.contains(arr[i])==false){
                break;
            }
        }
        Collections.sort(hold1);
        Map<String, Integer>map=new HashMap<>();
        for(int i=0; i<hold1.size(); i++){
            map.put(hold1.get(i), 0);
        }
        System.out.println("Result: " + map); 
    } 
}
