import java.util.Scanner;

public class LargestSmallest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the 1st number: ");
        int num1 = sc.nextInt();

        System.out.print("Enter the 2nd number: ");
        int num2 = sc.nextInt();

        System.out.print("Enter the 3rd number: ");
        int num3 = sc.nextInt();

        int[] arr = findSmallestAndLargest(num1,num2,num3);
        
        System.out.println("The largest of the given 3 numbers is :"+ arr[1]);
        System.out.println("The smallest of the given 3 numbers is :"+ arr[0]);
    }
	
	
	
	static int[] findSmallestAndLargest(int num1, int num2, int num3){
		int smallest = Integer.MAX_VALUE;
		int largest = Integer.MIN_VALUE;
		
		int[] arr =  {num1,num2,num3};
		for(int num : arr){
		    smallest = Math.min(smallest,num);
		    largest  = Math.max(largest,num);
		}
		
		return new int[] {smallest,largest};
		

	}
}