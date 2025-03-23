import java.util.Scanner;

public class ChocolatesChildren {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of childrens: ");
        int num1 = sc.nextInt();
        
       System.out.println("Enter the number of chocolates: ");
       int num2 = sc.nextInt();

       if(num1==0){
           System.out.println("Zero Division Error");
           return;
       }
       
       int[] arr = findRemainderAndQuotient(num1,num2);
       
       System.out.printf("Each children will get %d chocolates and the remainnig chocolates is %d for the given values",arr[1],arr[0]);
    }
	
	static int[] findRemainderAndQuotient(int num1, int num2){ 

	    int r = num2 % num1;
        int q = (int) (num2 / num1);
		return new int[] {r,q};
		

	}
}