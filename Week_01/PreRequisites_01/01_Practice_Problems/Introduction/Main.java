
import java.util.*;


class Main{
    public static void main(String[] args) {
        System.out.println("Executing the assisted programs");
        getGreetings();
        addTwo();
        celciusToFahernheit();
        Area();
        Volume();

        System.out.println("Executing the Self programs");
        SimpleInterest();
        Perimeter();
        Power();
        Average();
        KmtoMiles();
    }

    // assited programs
//    1.
    static void  getGreetings(){
        System.out.println("Welcome to Bridgelabz!");
    }

//    2.
     static void addTwo(){
    Scanner scanner = new Scanner(System.in);

    System.out.println("Enter the number 1: ");
    int a   = scanner.nextInt();
    System.out.println("Enter the number 2: ");
    int b = scanner.nextInt();

    int c = a+b;

    System.out.print("The addition of two numbers you have entered is: ");
    System.out.println(c);
    }

//    3.

    static void celciusToFahernheit(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter your value in celcies: ");
        int cel = scanner.nextInt();

        int fah = (cel * (9/5)) + 32;
        System.out.print("THe value of the given celcius in fahrenheit is : ");
        System.out.println(fah);

    }

//    4.

    static void Area(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter your circle radius: ");
        int cel = scanner.nextInt();

        double fah = (cel * 3.14 * cel);
        System.out.print("The area of the : ");
        System.out.println(fah);

    }

//    5.

    static void Volume(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter your cyclinders radius: ");
        float r = scanner.nextFloat();
        System.out.println("enter your cyclinders height: ");
        float h = scanner.nextFloat();


        double fah = 3.14 * r * r* h ;
        System.out.print("THe volume of the cyclinder is: ");
        System.out.println(fah);

    }

//    Self problems

    //    1.
    static void SimpleInterest(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter your Principal Amount: ");
        float principal = scanner.nextFloat();
        System.out.println("enter your rate of Interest: ");
        float rate = scanner.nextFloat();
        System.out.println("enter your years: ");
        float time = scanner.nextFloat();


        double si  = (principal  * rate * time )/100;
        System.out.print("The calculated simple interest the given years is: ");
        System.out.println(si);

    }
//    2.

    static void Perimeter(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter the length of the rectangle ");
        float l = scanner.nextFloat();
        System.out.println("enter the breadth of the rectangle ");
        float b = scanner.nextFloat();


        double fah = 2 *(l+b) ;
        System.out.print("The perimeter of the reactangle is: ");
        System.out.println(fah);

    }

//    3.
    static void Power(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter the base value");
        float base = scanner.nextFloat();
        System.out.println("enter the exponent value ");
        float exp = scanner.nextFloat();


        double fah = Math.pow(base,exp);
        System.out.print("The power of the given base to the exponent is ");
        System.out.println(fah);

    }
//    4.
    static void Average(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter the first number ");
        float num1 = scanner.nextFloat();
        System.out.println("enter the second number ");
        float num2 = scanner.nextFloat();
        System.out.println("enter the third number ");
        float num3 = scanner.nextFloat();


        double fah = (num1+num2+num3)/3;
        System.out.print("The average of the given 3 numbers is: ");
        System.out.println(fah);

    }


    static void KmtoMiles(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter the Kilometer value");
        float km = scanner.nextFloat();


        double fah = km  * 0.621371;
        System.out.print("The given kilometer corresponds to this caculated miles ");
        System.out.println(fah);

    }




}