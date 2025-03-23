import java.util.*;
public class RandomMathProlems{

    static int RandomNumber() {
        return 100000 + (int) (Math.random() * 900000); 
    }

    static int[] generate(int count) {
        int[] otp = new int[count];
        for (int i = 0; i < count; i++) {
            otp[i] = RandomNumber();
        }
        return otp;
    }

    static boolean Unique(int[] otp) {
        HashSet<Integer> s = new HashSet<>();
        for (int p : otp) {
            s.add(p);
        }
        return s.size() == otp.length;
    }

    public static void main(String[] args) {
        int[] otps = generate(10); 
        System.out.println("Generated OTPs:");
        for (int otp : otps) {
            System.out.println(otp);
        }
        if (Unique(otps)) {
            System.out.println("All OTPs are unique.");
        } else {
            System.out.println("Duplicate OTPs found. Try generating again.");
        }
    }
}
