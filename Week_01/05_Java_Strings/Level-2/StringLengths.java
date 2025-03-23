import java.util.*;

public class StringLengths {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string value: ");
        String s = sc.nextLine();
       
        String[] words = extractWords(s);
        String[][] data = getMatrix(words);

      
        System.out.println("Words and their lengths:");
        System.out.println("---------------------------");
        System.out.printf("%-15s %s\n", "Word", "Length");
        System.out.println("---------------------------");
        for (String[] row : data) {
            System.out.printf("%-15s %d\n", row[0], Integer.parseInt(row[1]));
        }
        
   
        String[] val = getMinMax(data);
        
        System.out.println("\nThe largest word is  : " + val[0]);
        System.out.println("The smallest word is : " + val[1]);
        
        sc.close();
    }
    

    static String[] getMinMax(String[][] data) {
        if (data.length == 0) return new String[]{"", ""};

        String largest = data[0][0];
        String smallest = data[0][0];

        for (String[] row : data) {
            int length = Integer.parseInt(row[1]);
            if (length > largest.length()) {
                largest = row[0];
            }
            if (length < smallest.length()) {
                smallest = row[0];
            }
        }
        return new String[]{largest, smallest};
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
