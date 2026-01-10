package DynamicProgramming;

public class EqualingStringWithMinimumCost {
    public static void main(String[] args){
        String s1 = "sea";
        String s2 = "eat";
        int m = s1.length();
        int n = s2.length();
        int dp[][] = new int[m+1][n+1];
        for(int i=m-1;i>=0;i--)
            dp[i][n] = dp[i+1][n]+s1.charAt(i);
        for(int j=n-1;j>=0;j--)
            dp[m][j] = dp[m][j+1]+s2.charAt(j);
        for(int i=m-1;i>=0;i--)
            for(int j=n-1;j>=0;j--)
                if(s1.charAt(i)==s2.charAt(j))
                    dp[i][j] = dp[i+1][j+1];
                else
                    dp[i][j] = Math.min(s1.charAt(i)+dp[i+1][j],s2.charAt(j)+dp[i][j+1]);
        System.out.println("Minimum Cost : "+dp[0][0]);
    }
}
