import java.util.*;

public class StringExtractWords {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string value: ");
        String s = sc.nextLine();
       
        String[] words = extractWords(s);

        String[][] data = getMatrix(words);

       
        System.out.println("Words and their lengths:");
        System.out.println("---------------------------");
        System.out.printf("%-15s \t\t\t %s\n", "Word", "Length");
        System.out.println("---------------------------");
        for (String[] row : data) {
            System.out.printf("%-15s \t\t\t %d\n", row[0], Integer.parseInt(row[1]));
        }
        
        sc.close();
    }

    
    static String[] extractWords(String s) {
        List<String> wordList = new ArrayList<>();
        String temp = "";
        
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == ' ') {
                if (!temp.isEmpty()) {
                    wordList.add(temp);
                    temp = "";
                }
            } else {
                temp += s.charAt(i);
            }
        }
        if (!temp.isEmpty()) {
            wordList.add(temp);
        }
        
        return wordList.toArray(new String[0]);
    }

    static int getLength(String s) {
        int length = 0;
        try {
            while (true) {
                s.charAt(length);
                length++;
            }
        } catch (Exception e) {
            return length;
        }
    }


    static String[][] getMatrix(String[] words) {
        String[][] data = new String[words.length][2];
        for (int i = 0; i < words.length; i++) {
            data[i][0] = words[i];
            data[i][1] = String.valueOf(getLength(words[i]));
        }
        return data;
    }
}
