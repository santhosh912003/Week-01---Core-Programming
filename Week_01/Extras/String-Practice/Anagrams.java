import java.util.*;

public class Anagrams {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string1: ");
        String s1 = sc.nextLine();
        System.out.println("Enter the string2: ");
        String s2 = sc.nextLine();
        
        boolean val = anagram(s1,s2);
        
        
        System.out.printf("Both the strings are anagram ? "+val);
        sc.close(); 
        
       
    }
    static boolean anagram(String s,String c){
        if(s.length()!=c.length()) return false;
        HashMap<Character, Integer> map = new HashMap<>();
        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);
            map.put(ch,map.getOrDefault(ch,0)+1);
        }
        
        for(int i=0;i<s.length();i++){
            char ch = c.charAt(i);
            map.put(ch,map.getOrDefault(ch,0)-1);
        }
        
        for(Map.Entry<Character,Integer> it: map.entrySet()){
            if(it.getValue()!=0) return false;
        }
        
        return true;
        
        
        
    }
    
}
