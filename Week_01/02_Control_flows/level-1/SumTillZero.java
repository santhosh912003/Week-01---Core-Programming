import java.util.*;


class SumTillZero{
    public static void main(String[] args){
        
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        while(true){
             System.out.println("Enter the  number : ");
            int m = sc.nextInt();
            if(m==0){
                break;
            }
            sum+=m;
            
        }
        sc.close();
        
        System.out.println("The sum until 0 is: "+ sum);
        
        
        
        
        
        
    }
}