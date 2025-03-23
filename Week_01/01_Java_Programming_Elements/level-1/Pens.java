import java.util.*;


public class Pens {
   public static void main(String[] args) {
       int total_pens = 14;
       int persons = 3;
       int undistributed = 14 % persons;
       int pens_per_person = (total_pens - undistributed)/persons;
       System.out.println("The Pen Per Student is " +pens_per_person+" and the remaining pen not distributed is " + undistributed);
   }
}
