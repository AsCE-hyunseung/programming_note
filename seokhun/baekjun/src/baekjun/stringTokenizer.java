package baekjun;

import java.util.Scanner;
import java.util.StringTokenizer;

public class stringTokenizer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		String str1 = sc.nextLine();
		String str2 = sc.nextLine();
		
		StringTokenizer st1 = new StringTokenizer(str1);
		StringTokenizer st2 = new StringTokenizer(str2, "/");
	
		System.out.println("st1 ���ڿ� �� :" + st1.countTokens());
		System.out.println("st2 ���ڿ� �� :" + st2.countTokens());
		
		while(st1.hasMoreTokens()) {
			System.out.println(st1.nextToken());
		}
		
		while(st2.hasMoreTokens()) {
			System.out.println(st2.nextToken());
		}
	}

}
