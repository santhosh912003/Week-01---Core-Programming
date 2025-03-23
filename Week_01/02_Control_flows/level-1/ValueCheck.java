import java.util.*;


class ValueCheck{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the  number: ");
        int age = sc.nextInt();
        
        if(age<0){
            System.out.printf("Negative");
            
        }
        else if(age==0){
            System.out.println("Zero");
        }
        else{
            
            
            System.out.printf("Positive");
        }
       
    }
}