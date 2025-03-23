
import java.util.*;


class Friends {
    public static void main(String[] args) {
        int size = 3;
        int[] ages = new int[size];
        int[] height = new int[size];
        String[] names = {"amar","akbar","anthony"};
        
        Scanner sc = new Scanner(System.in);
        
        for(int i=0;i<size;i++){
            System.out.println("Enter the age of the "+names[i]+" in years: ");
            ages[i] = sc.nextInt();
            System.out.println("Enter the height of the "+ names[i]+" in cm: ");
            height[i] = sc.nextInt();
        
        }
        
        String young_name = "amar";
        int young_age = ages[0];
        for(int i=0;i<size;i++){
            if(ages[i]<young_age){
                young_name = names[i];
                young_age = ages[i];
        
            }
        }
        
        String tallest_name = "amar";
        int tallest_height = height[0];
        for(int i=0;i<size;i++){
            if(height[i]>tallest_height){
                tallest_name = names[i];
                tallest_height = height[i];
        
            }
        }
        
        System.out.printf("The tallest friend is %s with height %d cm%n" , tallest_name,tallest_height);
        System.out.printf("The Youngest friend is %s with the age %d years%n",young_name,young_age);
        
        
        
        
    }
}