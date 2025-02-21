import java.util.*;

public class Main {
    public static void main(String[] args) {
        String s = "leetcode";
        List<String> wordDict = Arrays.asList("leet", "code");

        boolean[] dp = new boolean[s.length() + 1];
        dp[0] = true;  // Start with empty string

        for (int i = 1; i <= s.length(); i++) {
            for (String word : wordDict) {
                if (i >= word.length() && dp[i - word.length()] && s.substring(i - word.length(), i).equals(word)) {
                    dp[i] = true;
                    break;
                }
            }
        }

        System.out.println(dp[s.length()]); 
    }
}
