import java.util.*;

public class LongestStringWord {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the string: ");
        String s = sc.nextLine();
        sc.close(); 
        String val = Longest(s);
        System.out.println("The Longest word in the given string: " + val);
    }
    static String Longest(String s){
        String[] words = s.split(" ");
        String largest = "";
        for(int i=0;i<words.length;i++){
            if(largest.length()<words[i].length()){
                largest = words[i];
            }
        }
        
        return largest;
    }
}
