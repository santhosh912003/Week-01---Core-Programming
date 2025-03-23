import java.util.*;
class DivisibleBy5{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int num = sc.nextInt();
        boolean flag = false;
        if(num%5==0){
             flag = true;
        }
        
        String ans = "is this number "+num+" divisible by 5? "+( flag ? "Yes" : "No");
        System.out.println(ans);
    }
}