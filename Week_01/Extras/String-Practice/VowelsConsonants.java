import java.util.*;

public class VowelsConsonants {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the string: ");
        String s = sc.nextLine();
        sc.close(); 
        int[] val = getCount(s);
        System.out.println("Count of vowels and consonants in the given string: " + val[0] + " and " + val[1]);
    }

    static int[] getCount(String s) {
        int v = 0, c = 0;
        s = s.toLowerCase();
        for (char ch : s.toCharArray()) {
            if (Character.isLetter(ch)) {
                if ("aeiou".indexOf(ch) != -1) {
                    v++;
                } else {
                    c++;
                }
            }
        }
        return new int[]{v, c};
    }
}
