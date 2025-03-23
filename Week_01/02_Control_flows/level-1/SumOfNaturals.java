import java.util.*;


class SumOfNaturals{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the  number: ");
        int a = sc.nextInt();
        
        if(a<0){
            System.out.printf("The number %d is not an natural number%n",a);
            
        }
        else{
            int val = (a *(a+1))/2;
            
            System.out.printf("The sum of %d natural numbers is %d%n",a,val);
        }
       
    }
}