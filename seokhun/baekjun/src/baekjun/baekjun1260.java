package baekjun;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class baekjun1260 {
	
	//n= �����ǰ���, m= �����ǰ���, v=������ ������ ��ȣ
	public static int n, m, v;
	//������ �����ϴ� �� ������ ��ȣ
	public static int x, y;
	
	public static int graph[][] = new int[1001][1001];
	public static boolean visited[] = new boolean[10001];
	
	public static void DFS(int v) {
		System.out.print(v + " "); //�湮�� �� ���
		visited[v] = true; //�湮������ true
		
		for(int i=1; i<=n; i++) {
			//���� v�� i�� ����Ǿ��ְ� ==1 , ���� �湮���� �ʾ����� visited==false
			if(graph[v][i] == 1 && visited[i] == false) {
				DFS(i); // ����Լ� ȣ��
			}
		}
		
	}
	
	public static void BFS(int v) {
		//���Ḯ��Ʈ�� ����� ť ����
		Queue<Integer> queue = new LinkedList<Integer>();
		int out;
		
		//ť�� ������ �߰�
		queue.offer(v);
		visited[v] = true; //�湮ǥ��
		
		
		//ť�� ���� ���������� ����
		while(!queue.isEmpty()) {
			//ť���� �� ������
			
			out = queue.poll();
			System.out.print(out + " ");
			for(int i=1; i<=n; i++) {
				if(graph[out][i] == 1 && visited[i] == false) {
					queue.offer(i); //�湮���� ���� ã���� ť�� ����
					visited[i]=true;					
				}
			}
			
		}
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		n = sc.nextInt();
		m = sc.nextInt();
		v = sc.nextInt();
		
		//�Է¹��� ������ ������ŭ
		for(int i=1; i<=m; i++) {
			x = sc.nextInt();
			y = sc.nextInt();
			//����� �̹Ƿ�
			graph[x][y] = graph[y][x] = 1;
		}
		
		DFS(v);
		
		//dfs�� ����� �� visited�� �ʱ�ȭ���Ѿ� bfs ����� ������ �Ȼ���
		for(int i=1; i<=n; i++) {
			visited[i] = false;
		}
		
		System.out.println();
		BFS(v);
		
		sc.close();
	}

}
