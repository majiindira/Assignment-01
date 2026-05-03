import java.util.*;

public class Problem1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        
        String t = s + s;
        int maxSum = 0, sum = 0;
        Set<Character> set = new HashSet<>();
        
        int left = 0;
        
        for (int right = 0; right < t.length(); right++) {
            while (set.contains(t.charAt(right)) || right - left >= s.length()) {
                set.remove(t.charAt(left));
                sum -= (t.charAt(left) - 'a' + 1);
                left++;
            }
            
            set.add(t.charAt(right));
            sum += (t.charAt(right) - 'a' + 1);
            maxSum = Math.max(maxSum, sum);
        }
        
        System.out.println(maxSum);
    }
}

