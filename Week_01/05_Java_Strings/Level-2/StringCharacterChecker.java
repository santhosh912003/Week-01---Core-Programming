import java.util.Scanner;

public class StringCharacterChecker {

    public static String checkCharacter(char ch) {
        ch = toLowerCase(ch);
        
        if (ch >= 'a' && ch <= 'z') {
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                return "Vowel";
            } else {
                return "Consonant";
            }
        } else {
            return "Not a Letter";
        }
    }

    static char toLowerCase(char s){
        if(s>='A' && s<='Z'){
            return (char) (s+32);
        }
        
        return s;
        
    }
    public static String[][] charEval(String str) {
        int vowels = 0, consonants = 0;
        String[][] data = new String[str.length()][2];
        
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            String result = checkCharacter(ch);
            
            if (result.equals("Vowel")) {
                data[i][0] = result;
                data[i][1] = String.valueOf(ch);
                
            } else if (result.equals("Consonant")) {
                data[i][0] = result;
                data[i][1] = String.valueOf(ch);
            }
            else{
                data[i][0] = result;
                data[i][1] = String.valueOf(ch);
            }
        }
        
        return data;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();
        
        String[][] data = charEval(input);
        
        for(int i=0;i<input.length();i++){
            System.out.printf("%-15s \t\t\t %s\n",data[i][0] ,data[i][1]);
        }
        
        scanner.close();
    }
}
