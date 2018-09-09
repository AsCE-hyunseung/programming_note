package baekjun;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.concurrent.ArrayBlockingQueue;

public class baekjun10845 {
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		
		String s = null;
		arrayQueue queue = new arrayQueue(n);
		for(int i = 0; i < n; i++){
			s = br.readLine();
			String[] temp = s.split(" ");
			if(temp[0].equals("push")){
				queue.push(Integer.parseInt(temp[1]));
			}else if(temp[0].equals("pop")){
				System.out.println(queue.pop());
			}else if(temp[0].equals("size")){
				System.out.println(queue.size());
			}else if(temp[0].equals("empty")){
				System.out.println(queue.empty());
			}else if(temp[0].equals("front")){
				System.out.println(queue.front());
			}else if(temp[0].equals("back")){
				System.out.println(queue.back());
			}
		}
		br.close();
	}
}

class arrayQueue{
	
	private int[] que;
	private int rear = 0;
	private int temp;
	
	//ť �迭 ����
	public arrayQueue(int n){
		que = new int[n];
	}
	
	//ť�迭�� �ε����� �ø��鼭 �� �߰�
	public void push(int value){
		que[rear++] = value;
	}
	
	public int pop(){
		if(rear == 0){ //���� �����Ͱ� ���� 
			return -1;
		}else{ //���� ���� ���� ���
			temp = que[0];
			for(int i = 0; i < rear; i++){
				que[i] = que[i+1];
			}
			rear--;
			
			return temp;
		}
	}
	
	//������� rearũ�⸸ŭ
	public int size(){ 
		return rear;
	}
	
	public int empty(){
		if(rear == 0){
			return 1;
		}else{
			return 0;
		}
	}
	
	public int front(){
		if(rear == 0){
			return -1;
		}else{
			return que[0];
		}
	}
	
	public int back(){
		if(rear == 0){
			return -1;
		}else{ //size-1�� �ε���
			return que[rear-1];
		}
	}
	
}