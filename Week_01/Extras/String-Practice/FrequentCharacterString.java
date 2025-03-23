import java.util.*;

public class FrequentCharacterString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string1: ");
        String s1 = sc.nextLine();
        String[] res = Frequent(s1);
        System.out.printf("Frequent Character is %s:  %s", res[0] , res[1]);
        sc.close(); 
        
       
    }
    static String[] Frequent(String s){
        HashMap<Character, Integer> map = new HashMap<>();
        int maxi = Integer.MIN_VALUE;
        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);
            map.put(ch, map.getOrDefault(ch,0)+1);
            maxi = Math.max(maxi, map.get(ch));
            
        }
        String val = "";
        for(Map.Entry<Character, Integer> it: map.entrySet()){
            if(it.getValue()==maxi){
                val += it.getKey();
                break;
            }
        }
        
        return new String[] {val,String.valueOf(maxi)};
        
        
    }
    
}
