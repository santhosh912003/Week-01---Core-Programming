import java.time.*;
import java.time.format.DateTimeFormatter;
import java.util.*;

public class DateConversion{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the input date: yyy-mm-dd ");
    String val = sc.nextLine();
    DateTimeFormatter input_formatter = DateTimeFormatter.ofPattern("yyy-MM-dd");
  
    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
    
    LocalDate date = LocalDate.parse(val,input_formatter);
    
    date  = date.plusMonths(1).plusYears(2).plusDays(7).minusWeeks(3);
    
    System.out.println("the modified date is: " + date.format(formatter));
  }
}
