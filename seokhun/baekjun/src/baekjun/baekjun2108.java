package baekjun;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;

public class baekjun2108 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			
		int n = Integer.parseInt(br.readLine().trim());
		int num[] = new int[8001]; //���, ������ ������ �迭
		int min = 4000;
		int max = -4000;
		int sum = 0;
		int temp = 0;
		
		for(int i=0; i<n; i++) {
			temp = Integer.parseInt(br.readLine().trim());	
			sum = sum + temp;
			
			//�ϴ� ���� ����
			if(min > temp) min = temp;
				System.out.println("min : "+min);
			if(max < temp) max = temp;
				System.out.println("max : "+ max);
			num[temp + 4000]++; //����� 4000������ ���� ������ �� �Ʒ� ����
			System.out.println(Arrays.toString(num));
		}
		int avg = (int) Math.round((double) sum/n);
		
		int mid =0;
		int accumulate =0;
		boolean calcMid = false;
		
		int mode =0;
		
		ArrayList<Integer> modeList = new ArrayList<>();
		
		// &�� and������, 1���� �ԷµǾ������ �߾Ӱ��� n/2+1
		int half = (n & 1) == 1 ? n/2+1 : n/2;
		for(int i=0; i<8001; i++) {
			if(mode < num[i]) { //����� ��
				mode = num[i];
				modeList.clear(); //clear�� removeall�� ����� ������ �ӵ��� clear�� ����
				modeList.add(i);
			
			}else if(mode == num[i]) {
				modeList.add(i);
			}
			
			accumulate = accumulate + num[i];
			if(!calcMid && accumulate >= half) {
				mid = i - 4000;
				calcMid = true;
			}
		}
		
		if(modeList.size() == 1) {
			mode = modeList.get(0) - 4000;
		}else {
			mode = modeList.get(1) - 4000;
		}
		int range = max - min;
		
		System.out.println(avg);
		System.out.println(mid);
		System.out.println(mode);
		System.out.println(range);
		/*System.out.println("�ݿø�(ù° �ڸ�����): "+Math.round(sum));               //�Ҽ��� ù°�ڸ����� �ݿø�
		System.out.println("�ݿø� ����: "+Math.round((sum) * 10) / 10.0);      //�Ҽ��� ù��°�ڸ����� ǥ��
		System.out.println("�ݿø� ����: "+Math.round((sum) * 100) / 100.0);    //�Ҽ��� �ι�°�ڸ����� ǥ��
*/
	}
	
}
