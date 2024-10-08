package Baekjoon._13699;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    int n = Integer.parseInt(br.readLine());
    long[] dp = new long[n + 1];
    dp[0] = 1;

    for (int i = 1; i <= n; i++) {
      for (int j = 0; j <= i - 1; j++) {
        dp[i] += dp[j] * dp[i - 1 - j];
      }
    }

    System.out.println(dp[n]);
  }
}
