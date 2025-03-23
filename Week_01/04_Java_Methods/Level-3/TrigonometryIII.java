import java.util.*;

public class TrigonometryIII{
    public static void main(String[] args){
        Scanner sc = new  Scanner(System.in);
        
        System.out.println("Enter the value of the x1: ");
        int x1 = sc.nextInt();
        System.out.println("Enter the value of the x2: ");
        int x2 = sc.nextInt();
        System.out.println("Enter the value of the y1: ");
        int y1 = sc.nextInt();
        System.out.println("Enter the value of the y2: ");
        int y2 = sc.nextInt();
        
        int dis = distance(x1,y1,x2,y2);
        System.out.printf("The distance between the two points is: %d%n", dis);
        
        

        int[] ans = params(x1,y1,x2,y2);
        line(ans[0],x1,y1,ans[1]);
    }
    
    static int distance(int x1,int y1,int x2,int y2){
        int distance = (int) Math.sqrt(Math.pow((x2-x1),2)+Math.pow((y2-y1),2));
        return distance;
    }
    
    static void line(int m, int x1, int y1, int b){
        System.out.printf("The equation of the line is y = %d*x + %d",m,b);
        return;
    }
    
    static int[] params(int x1,int y1,int x2, int y2){
        int m = slope(x1, y1, x2, y2);
        int b = intercept(m , x1, y1);
        return new int[] {m,b};
    }
    
    static int slope(int x1,int y1, int x2, int y2){
        int m =  (x2-x1)/(y2-y1);
        return m;
    }
    
    static int intercept(int m, int x1, int y1){
        int b = y1 - (m*x1);
        return b;
    }
    
}