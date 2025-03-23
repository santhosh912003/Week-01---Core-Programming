import java.util.*;

public class StringOccurences {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string: ");
        String s = sc.nextLine();
        System.out.println("Enter the substring present in this string: ");
        String ss = sc.nextLine();
        sc.close(); 
        int val = Occurence(s,ss);
        System.out.println("The number of times the given substring occured in the given string is: " + val);
    }
    static int Occurence(String s, String ss){
        int count = 0;
        for(int i=0;i<s.length();i++){
            String temp = "";
            for(int j=i;j<s.length();j++){
                temp += s.charAt(j);
                
                if(temp.equals(ss)){
                    count++;
                }
            }
        }
        
        return count;
      
    }
}
