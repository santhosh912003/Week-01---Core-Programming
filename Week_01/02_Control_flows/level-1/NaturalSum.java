import java.util.*;


class NaturalSum{
    public static void main(String[] args){
        
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        if(n<0){
            System.out.printf("This number %d is not an Natural Number",n);
        }
        else{
            int f_sum = (n*(n+1))/2;
            int sum = 0;
            int i = n;
            while(n>=0){
                sum+=n;
                n--;
            }
            if(sum==f_sum){
                System.out.printf("The sum of the %d natural numbers is %d",i,sum);
            }
            else{
                System.out.println("MisMatch found. Error in the calculation");
            }
        }
        
        
        
        
        
    }
}