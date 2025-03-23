import java.time.*;
import java.time.format.DateTimeFormatter;
import java.util.*;

public class DateFormatterII{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the input date: yyyy-mm-dd ");
    String val = sc.nextLine();
    DateTimeFormatter inputFormatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
    DateTimeFormatter input_formatter1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
    DateTimeFormatter input_formatter2 = DateTimeFormatter.ofPattern("yyyy-MM-dd");
    DateTimeFormatter input_formatter3 = DateTimeFormatter.ofPattern("EEE, MMM dd, yyyy");
    
    
    try {
            LocalDate date = LocalDate.parse(val, inputFormatter);
            System.out.println("The date in the first format: " + date.format(input_formatter1));
            System.out.println("The date in the second format: " + date.format(input_formatter2));
            System.out.println("The date in the third format: " + date.format(input_formatter3));
        } 
    
    catch (Exception e) {
            System.out.println("Invalid date format! Please enter in dd/MM/yyyy format.");
        }

        sc.close();
    

  }
}
