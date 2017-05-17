/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab8;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
/**
 *
 * @author course009
 */
public class L8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        HashMap<Integer, String> ht = new HashMap<>();
        ht.put(23, "Hi");
        ht.put(200, "Bye");
        ht.put(32, "Hello");
        ht.put(445, "World");
        
        Iterator<Integer> keySetIterator = ht.keySet().iterator();
        while(keySetIterator.hasNext()) {
            int key = keySetIterator.next();
            String value = ht.get(key);
            System.out.println("key: "+key+" value: "+value);
        }
        
        String removed = ht.remove(200);
        System.out.println("Removed key: "+200+" Removed value: "+removed);
        
        keySetIterator = ht.keySet().iterator();  
        while(keySetIterator.hasNext()) {
            int key = keySetIterator.next();
            String value = ht.get(key);
            System.out.println("key: "+key+" value: "+value);
        }
        
        Student s1 = new Student(1, 2, "Woh", "WEA150016", "Jalan 123");
        Student s2 = new Student(2, 2, "Kew", "WEA150017", "Jalan 123");
        Student s3 = new Student(3, 2, "Kam", "WEA150018", "Jalan 123");
        Student s4 = new Student(4, 2, "Chia", "WEA150019", "Jalan 123");
        Student s5 = new Student(5, 2, "Sina", "WEA150020", "Jalan 123");
        Student s6 = new Student(6, 2, "Xuan", "WEA150021", "Jalan 123");
        
        HashMap<Integer, Student> students = new HashMap<>();
        students.put(1, s1);
        students.put(2, s2);
        students.put(3, s3);
        students.put(4, s4);
        students.put(5, s5);
        students.put(6, s6);
        
        keySetIterator = students.keySet().iterator();  
        while(keySetIterator.hasNext()) {
            int key = keySetIterator.next();
            Student value = students.get(key);
            System.out.println("key: "+key+" value: "+value);
        }
        
        HashMap<Integer, String> characters = new HashMap<>(); //use hash set
        String input = "teeksfoorthinkers";
        System.out.println("Input: "+input);
        for(int i=0;i<input.length();i++){
            String c = input.charAt(i) + "";
            int hashC = c.hashCode();
            if (characters.containsKey(hashC)){
                System.out.println("Output: "+c);
                System.out.println(c + " is the 1st repeat character");
                break;
            } else {
                characters.put(hashC, c);
            }
        }
        characters = new HashMap<>();
        input = "hello Teeks";
        System.out.println("Input: "+input);
        for(int i=0;i<input.length();i++){
            String c = input.charAt(i) + "";
            int hashC = c.hashCode();
            if (characters.containsKey(hashC)){
                System.out.println("Output: "+c);
                System.out.println(c + " is the 1st repeat character");
                break;
            } else {
                characters.put(hashC, c);
            }
        }
        
        HashSet<Character> h = new HashSet<>();
        input = "hello Teeks";
        char[] cArr = input.toCharArray();
        System.out.println("Input: "+input);
        for(char c: cArr) {
            if(h.contains(c)){
                System.out.println("Output: "+c);
                System.out.println(c +" is the 1st repeat character");
                break;
            } else {
                h.add(c);
            }
        }
    }
    
    public static class Student{
        int id, siblings;
        String name, matric_no, address;

        public Student(int id, int siblings, String name, String matric_no, String address) {
            this.id = id;
            this.siblings = siblings;
            this.name = name;
            this.matric_no = matric_no;
            this.address = address;
        }

        @Override
        public String toString() {
            String ret = "ID: "+id+"\n";
            ret += "Name: "+name+"\n";
            ret += "Matric No: "+matric_no+"\n";
            ret += "Address: "+address+"\n";
            ret += "Number of Siblings: "+siblings+"\n";
            return ret;
        }
    }
    
}