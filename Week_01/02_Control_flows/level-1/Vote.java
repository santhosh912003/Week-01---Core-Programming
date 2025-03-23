import java.util.*;


class Vote{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the  number: ");
        int age = sc.nextInt();
        
        if(age<18){
            System.out.printf("The persons's age is %d and cannot vote",age);
            
        }
        else{
            
            
            System.out.printf("The person's age is %d and can vote%n",age);
        }
       
    }
}