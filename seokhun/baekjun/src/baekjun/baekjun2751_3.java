package baekjun;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class baekjun2751_3 {
	static int result[];
	private static void mergeSort(int left, int right, int[] arr) {
		// TODO Auto-generated method stub
		int mid;
		if(left<right) {
			mid = (left + right)/2;
			mergeSort(left,mid,arr);
			mergeSort(mid+1,right,arr);
			merge(left,mid,right,arr); //�� �ɰ� �� �ϳ��� ��ģ��.
		}
	}
	private static void merge(int left, int mid, int right, int[] arr) {
		// TODO Auto-generated method stub
		int l = left; //�ɰ��� ù ��° �迭�� ù �ε���
		int m = mid+1; //�ɰ��� �� ��° �迭�� ù �ε���
		int k = left; //���� ���Ե� �迭�� ù �ε���
		
		while(l<=mid || m<=right) { //�ɰ��� �� �迭�� ���Ҹ� ���ذ��鼭 ���ο� �迭�� ���� 
			if(l<=mid && m<=right) { // �� �迭 ��� �񱳰� �ʿ��� ���Ұ� �����ִٸ�
				if(arr[l]<=arr[m]) { //ù ��° �迭�� �� ��° �迭�� ���ؼ� ���� �� ����
					result[k] = arr[l++];
				}else {
					result[k] = arr[m++];
				}
			}else if(l<=mid && m > right) {//�� ��° �迭�� ���� ���Ұ� ���� ���� �������
				result[k] = arr[l++];
			}else {	//ù ��° �迭�� ���� ���Ұ� ���� ���� ���� ���
				result[k] = arr[m++];				
			}
			k++;			
		}
		for(int i=left; i<right+1; i++) {
			arr[i] = result[i];
		}
	}
	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuffer sb = new StringBuffer();
		
		int n = Integer.parseInt(br.readLine());
		result = new int[n];
		int arr[] = new int[n];
		for(int i=0; i<n; i++) {
			arr[i] = Integer.parseInt(br.readLine());
		}
		
		mergeSort(0,n-1,arr);
		
		for(int i=0; i<n; i++) {
			sb.append(result[i]+"\n");
			System.out.println(sb);
		}
	}
	

}
