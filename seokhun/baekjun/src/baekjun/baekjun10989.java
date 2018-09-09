package baekjun;

import java.io.*;
import java.util.*;

/**
 * ���� ���� 10989�� '�� �����ϱ� 3'
 * https://www.acmicpc.net/problem/10989
 */
public class baekjun10989 {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    int N = Integer.parseInt(br.readLine());
    int[] elems = new int[10001];

    for (int n = 0; n < N; n++) {
      int e = Integer.parseInt(br.readLine());
      
      elems[e]++;
      System.out.println("elems[e] : " + elems[e]);
    }

    for (int i = 0; i < elems.length; i++) {
      int count = elems[i];

      if (count > 0) {
        while (count-- > 0) {
          bw.write(i + "\n");
        }
      }
    }
    bw.close();
  }
}