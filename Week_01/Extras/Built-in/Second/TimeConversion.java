import java.time.*;
import java.time.format.*;

public class TimeConversion{
  public static void main(String[] args){
    ZonedDateTime gmtTime = ZonedDateTime.now(ZoneId.of("GMT"));
    ZonedDateTime istTime = ZonedDateTime.now(ZoneId.of("Asia/Kolkata"));
    ZonedDateTime pstTime = ZonedDateTime.now(ZoneId.of("America/Los_Angeles"));
    
    
    DateTimeFormatter format = DateTimeFormatter.ofPattern("yyyy-MM-dd-HH:mm:ss z");
    
    System.out.println("The different times are: ");
    System.out.println("GMT Time : "+ gmtTime.format(format));
    System.out.println("IST Time : "+ istTime.format(format));
    System.out.println("PST Time : "+ pstTime.format(format));
  }
}