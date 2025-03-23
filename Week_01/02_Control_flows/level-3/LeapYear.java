import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the base number: ");
        int year = sc.nextInt();

        

        if (year<1582) {
            System.out.println("The LeapYear program only works for year >= 1582, corresponding to a year in the Gregorian calendar");
        } else {
            if(year%4==0){
                if(year%100 == 0 ){
                    if(year %400==0){
                        System.out.printf("This year %d is a Leap Year",year);
                    }
                    else{
                        System.out.printf("This %d is not an Leap year",year);
                    }
                }
                else {
                    System.out.printf("This year %d is a Leap Year",year);
                }
                
               
            }
            else{
                System.out.printf("This %d is not an Leap year",year);
            }
        }

        sc.close();
    }
}
