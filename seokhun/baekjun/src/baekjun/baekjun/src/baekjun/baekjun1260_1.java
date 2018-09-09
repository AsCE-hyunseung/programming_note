package baekjun;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class baekjun1260_1 {
		
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//�Է�
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(); //������ ����
		int m = sc.nextInt(); //������ ����
		int v = sc.nextInt(); //������ ������ ��ȣ
		
		//�迭�� 1�� �ʱ�ȭ
		int matrix[][] = new int [n+1][n+1];
		for(int i=1; i<=m; i++) {
			int x = sc.nextInt();
			int y = sc.nextInt();
			matrix[x][y]=1;
			matrix[y][x]=1;
		}
		
		//DFS and BFS
		int check[] = new int [matrix[0].length];
		System.out.println("matrix[0].length : " + matrix[0].length);
		DFS(matrix, check, v);
		System.out.println("");
		check = new int[matrix[0].length];
		BFS(matrix, check, v);
	}

	private static void BFS(int[][] matrix, int[] check, int m) {
		// TODO Auto-generated method stub
		//��������Ʈ�� ����� ������
		//�ӵ� ���鿡�� ����
		Queue<Integer> q = new LinkedList<Integer>();
		
		check[m]=1;
		q.add(m);
		
		while(!q.isEmpty()) {
			int node = q.poll();
			System.out.print(node+" ");
			for(int i=0; i<matrix[0].length; i++) {
				if(matrix[node][i]==1 && check[i]==0) {
				check[i]=1;
				q.add(i);
				}
			}
			
		}
		
	}

	private static void DFS(int[][] matrix, int[] check, int m) {
		// TODO Auto-generated method stub
		System.out.print(m+" "); //���ÿ� ��� ��带 ����ϰ�
		check[m]=1; //�湮������ 1��
		
		for(int i=1; i<matrix[0].length; i++) {
			//���� �ְ�, ���� �湮���� �ʾ�����
			if(matrix[m][i]==1 && check[i]==0) {
				//�ڽĳ�� ȣ��(����Լ�)
				DFS(matrix, check, i);
			}
		}
	}

}





