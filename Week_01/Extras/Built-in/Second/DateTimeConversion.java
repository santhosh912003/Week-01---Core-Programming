import java.time.*;
import java.time.format.DateTimeFormatter;
import java.util.*;

public class DateTimeConversion{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the input date1: yyyy-mm-dd ");
    String val1 = sc.nextLine();
    System.out.println("Enter the input date2: yyyy-mm-dd ");
    String val2 = sc.nextLine();
    DateTimeFormatter inputFormatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
    
    try {
            LocalDate date1 = LocalDate.parse(val1, inputFormatter);
            LocalDate date2 = LocalDate.parse(val2, inputFormatter);
            
            
            if (date1.isBefore(date2)) {
                System.out.println("The first date is [before] the second date.");
            } else if (date1.isAfter(date2)) {
                System.out.println("The first date is [after] the second date.");
            } else {
                System.out.println("Both dates are [the same].");
            }
        } 
    
    catch (Exception e) {
            System.out.println("Invalid date format! Please enter in dd/MM/yyyy format.");
        }

        sc.close();
    

  }
}
